package com.spring.hexagonal.application.service;

import com.spring.hexagonal.application.port.Mapper;
import com.spring.hexagonal.application.port.UserEventPublisher;
import com.spring.hexagonal.application.port.UserRepository;
import com.spring.hexagonal.application.port.UserService;
import com.spring.hexagonal.domain.dto.UserDto;
import com.spring.hexagonal.domain.entity.User;
import com.spring.hexagonal.domain.event.UserCreatedEvent;
import com.spring.hexagonal.domain.exception.UserNotFound;
import com.spring.hexagonal.domain.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;


public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    private final Mapper userMapper ;
    private final UserEventPublisher userEventPublisher;
    public UserServiceImpl(UserRepository userRepository, Mapper userMapper, UserEventPublisher userEventPublisher) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.userEventPublisher = userEventPublisher;
    }

    @Override
    public User saveUser(UserDto userDto) {
        logger.info("user with name {} created",userDto.getName());
        userEventPublisher.publishUserCreatedEvent(new UserCreatedEvent(this.userMapper.toEntity(userDto).getId()));
        return userRepository.save(this.userMapper.toEntity(userDto));
    }

    @Override
    public User updateUser(Long id, UserDto userDto) {
        logger.info("user with name {} and id {} updated",userDto.getName(),id);
        return userRepository.findById(id).map(user -> {
            user.setName(userDto.getName());
            return userRepository.save(user);
        }).orElseThrow(()-> new UserNotFound("User not found with id: "+id));
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
        logger.info("user with id {} deleted",id);
    }

    @Override
    public User getUser(Long id) {
        logger.info("get user with id {}",id);
        return userRepository.findById(id).get();
    }

    @Override
    public List getUsers() {
        logger.info("find all users");
        return userRepository.findAll();
    }
}

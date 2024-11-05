package com.spring.hexagonal.infrastructure.adapter.config;

import com.spring.hexagonal.application.port.Mapper;
import com.spring.hexagonal.application.port.UserEventPublisher;
import com.spring.hexagonal.application.port.UserRepository;
import com.spring.hexagonal.application.service.UserServiceImpl;
import com.spring.hexagonal.domain.mapper.UserMapper;
import com.spring.hexagonal.infrastructure.adapter.eventPublisher.UserEventPublisherAdapter;
import com.spring.hexagonal.infrastructure.adapter.persistence.UserPersistanceAdapter;
import com.spring.hexagonal.infrastructure.adapter.persistence.UserRepositoryAdapter;
import org.modelmapper.ModelMapper;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
    @Bean
    public UserServiceImpl userService(UserRepository userRepository, Mapper userMapper, final UserEventPublisher userEventPublisher){
        return new UserServiceImpl(userRepository,userMapper,userEventPublisher);
    }
    @Bean
    public UserRepositoryAdapter userRepositoryAdapter(UserPersistanceAdapter persistanceAdapter){
        return new UserRepositoryAdapter(persistanceAdapter);
    }
    @Bean
    public UserEventPublisherAdapter userEventPublisherAdapter(final ApplicationEventPublisher applicationEventPublisher){
        return new UserEventPublisherAdapter(applicationEventPublisher);
    }
}

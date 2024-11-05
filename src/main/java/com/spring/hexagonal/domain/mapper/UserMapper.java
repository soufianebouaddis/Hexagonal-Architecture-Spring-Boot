package com.spring.hexagonal.domain.mapper;

import com.spring.hexagonal.application.port.Mapper;
import com.spring.hexagonal.domain.dto.UserDto;
import com.spring.hexagonal.domain.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements Mapper<User, UserDto> {
    private ModelMapper modelMapper;

    public UserMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public User toEntity(UserDto userDto) {
        return this.modelMapper.map(userDto,User.class);
    }

    @Override
    public UserDto toDto(User user) {
        return this.modelMapper.map(user,UserDto.class);
    }
}

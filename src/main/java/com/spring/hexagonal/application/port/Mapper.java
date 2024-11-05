package com.spring.hexagonal.application.port;

public interface Mapper<User,UserDto> {
    public com.spring.hexagonal.domain.entity.User toEntity(UserDto userDto);
    public com.spring.hexagonal.domain.dto.UserDto toDto(User user);
}

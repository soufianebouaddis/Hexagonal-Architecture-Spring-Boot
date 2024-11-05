package com.spring.hexagonal.domain.dto;

public class UserDto{
    private String name;

    public UserDto(String name) {
        this.name = name;
    }

    public UserDto() {
    }

    public String getName() {
        return name;
    }
}

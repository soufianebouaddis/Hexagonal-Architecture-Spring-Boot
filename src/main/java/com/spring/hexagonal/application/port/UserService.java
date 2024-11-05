package com.spring.hexagonal.application.port;
import com.spring.hexagonal.domain.dto.UserDto;
import com.spring.hexagonal.domain.entity.User;

import java.util.List;

public interface UserService {
    public User saveUser(UserDto userDto);
    public User updateUser(Long id,UserDto userDto);
    public void deleteUser(Long id);
    public User getUser(Long id);
    public List<User> getUsers();

}

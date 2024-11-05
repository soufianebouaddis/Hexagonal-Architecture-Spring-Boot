package com.spring.hexagonal.infrastructure.adapter.persistence;

import com.spring.hexagonal.application.port.UserRepository;
import com.spring.hexagonal.application.service.UserServiceImpl;
import com.spring.hexagonal.domain.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public class UserRepositoryAdapter implements UserRepository {
    private final UserPersistanceAdapter persistanceAdapter;
    private static Logger logger = LoggerFactory.getLogger(UserRepositoryAdapter.class);
    public UserRepositoryAdapter(UserPersistanceAdapter persistanceAdapter) {
        this.persistanceAdapter = persistanceAdapter;
    }

    @Override
    public User save(User user) {
        logger.info("presiste user with name {}",user.getName());
        return persistanceAdapter.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return persistanceAdapter.findById(id);
    }

    @Override
    public List<User> findAll() {
        return persistanceAdapter.findAll();
    }

    @Override
    public void deleteById(Long id) {
        persistanceAdapter.deleteById(id);
    }
}

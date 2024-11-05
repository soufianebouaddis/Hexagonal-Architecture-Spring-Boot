package com.spring.hexagonal.infrastructure.adapter.persistence;

import com.spring.hexagonal.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPersistanceAdapter extends JpaRepository<User,Long> {
}

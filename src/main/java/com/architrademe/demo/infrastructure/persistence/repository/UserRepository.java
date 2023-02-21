package com.architrademe.demo.infrastructure.persistence.repository;

import com.architrademe.demo.domain.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository {
    List<User> findAll();

    Optional<User> findById(Long id);

    Optional<User> findByEmail(String email);

    void save(User user);

    void delete(User user);

    void deleteById(Long id);
}

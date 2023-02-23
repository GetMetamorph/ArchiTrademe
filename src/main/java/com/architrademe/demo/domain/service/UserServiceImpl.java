package com.architrademe.demo.domain.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.architrademe.demo.infrastructure.persistence.entity.UserEntity;
import org.springframework.stereotype.Service;

import com.architrademe.demo.domain.model.User;
import com.architrademe.demo.infrastructure.persistence.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        List<UserEntity> userEntities = userRepository.findAll();
        return userEntities.stream().map(UserEntity::toDomainModel).collect(Collectors.toList());
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id).map(UserEntity::toDomainModel);
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email).map(UserEntity::toDomainModel);
    }

    @Override
    public void addUser(User user) {
        UserEntity userEntity = UserEntity.fromDomainModel(user);
        userRepository.save(userEntity);
    }

    @Override
    public void updateUser(User user) {
        Optional<UserEntity> existingUserEntity = userRepository.findById(user.getId());
        if (existingUserEntity.isPresent()) {
            UserEntity updatedUserEntity = UserEntity.fromDomainModel(user);
            userRepository.save(updatedUserEntity);
        } else {
            throw new RuntimeException("User not found");
        }
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}


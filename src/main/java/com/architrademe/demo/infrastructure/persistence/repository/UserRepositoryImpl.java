package com.architrademe.demo.infrastructure.persistence.repository;

import com.architrademe.demo.domain.model.User;
import com.architrademe.demo.infrastructure.persistence.entity.UserEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> findAll() {
        TypedQuery<UserEntity> query = entityManager.createQuery("SELECT u FROM UserEntity u", UserEntity.class);
        List<UserEntity> userEntities = query.getResultList();
        return userEntities.stream().map(UserEntity::toDomainModel).collect(Collectors.toList());
    }

    @Override
    public Optional<User> findById(Long id) {
        UserEntity userEntity = entityManager.find(UserEntity.class, id);
        return Optional.ofNullable(userEntity).map(UserEntity::toDomainModel);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        TypedQuery<UserEntity> query = entityManager.createQuery("SELECT u FROM UserEntity u WHERE u.email = :email", UserEntity.class);
        query.setParameter("email", email);
        List<UserEntity> userEntities = query.getResultList();
        if (userEntities.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(userEntities.get(0).toDomainModel());
    }

    @Override
    @Transactional
    public void save(User user) {
        UserEntity userEntity = UserEntity.fromDomainModel(user);
        entityManager.persist(userEntity);
    }

    @Override
    @Transactional
    public void delete(User user) {
        UserEntity userEntity = entityManager.find(UserEntity.class, user.getId());
        if (userEntity != null) {
            entityManager.remove(userEntity);
        }
    }
}

package com.architrademe.demo.infrastructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.architrademe.demo.infrastructure.persistence.entity.ProjectEntity;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
    List<ProjectEntity> findAll();

    Optional<ProjectEntity> findById(Long id);

    ProjectEntity save(ProjectEntity project);

    void deleteById(Long id);
}

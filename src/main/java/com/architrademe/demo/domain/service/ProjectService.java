package com.architrademe.demo.domain.service;

import java.util.List;
import java.util.Optional;

import com.architrademe.demo.domain.model.Project;
import com.architrademe.demo.domain.model.User;

public interface ProjectService {
    List<Project> getAllProjects();

    Optional<Project> getProjectById(Long id);

    List<User> getUsersByProjectId(Long projectId);

    List<Project> getProjectsByClientId(Long clientId);

    List<Project> getProjectsByConsultantId(Long consultantId);

    void addProject(Project project);

    void updateProject(Project project);

    void deleteProject(Long id);
}

package com.architrademe.demo.domain.service;

import java.util.List;
import java.util.Optional;

import com.architrademe.demo.domain.model.Project;
import com.architrademe.demo.infrastructure.persistence.repository.ProjectRepository;

//Se servir de cette class Impl pour faire le lien entre le repository et le service
//Prendre modèle dessus pour faire les autres implémentations
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public List<Project> getAllProjects() {
        return null;
    }

    @Override
    public Optional<Project> getProjectById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Project> getProjectsByClientId(Long clientId) {
        return null;
    }

    @Override
    public List<Project> getProjectsByConsultantId(Long consultantId) {
        return null;
    }

    @Override
    public void addProject(Project project) {

    }

    @Override
    public void updateProject(Project project) {

    }

    @Override
    public void deleteProject(Long id) {

    }
}

package domain.services;

import java.util.List;
import java.util.Optional;

import domain.model.Project;

public interface ProjectService {
    List<Project> getAllProjects();

    Optional<Project> getProjectById(Long id);

    List<Project> getProjectsByClientId(Long clientId);

    List<Project> getProjectsByConsultantId(Long consultantId);

    void addProject(Project project);

    void updateProject(Project project);

    void deleteProject(Long id);
}

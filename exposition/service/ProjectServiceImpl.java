package domain.services;

import java.util.List;
import java.util.Optional;

import domain.model.Project;
import domain.repository.ProjectRepository;

//Se servir de cette class Impl pour faire le lien entre le repository et le service
//Prendre modèle dessus pour faire les autres implémentations
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.getAllProjects();
    }

    @Override
    public Optional<Project> getProjectById(Long id) {
        return projectRepository.getProjectById(id);
    }

    @Override
    public List<Project> getProjectsByClientId(Long clientId) {
        return projectRepository.getProjectsByClientId(clientId);
    }

    @Override
    public List<Project> getProjectsByConsultantId(Long consultantId) {
        return projectRepository.getProjectsByConsultantId(consultantId);
    }

    @Override
    public void addProject(Project project) {
        projectRepository.addProject(project);
    }

    @Override
    public void updateProject(Project project) {
        projectRepository.updateProject(project);
    }

    @Override
    public void deleteProject(Long id) {
        projectRepository.deleteProject(id);
    }
}

package com.architrademe.demo.infrastructure.persistence.entity;

import com.architrademe.demo.domain.model.Project;
import com.architrademe.demo.domain.model.User;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "projects")
public class ProjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Double budget;
    private Date deadline;
    private Long clientId;
    private Long consultantId;
    private Boolean accepted;

    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }

    @ManyToMany
    private List<UserEntity> users = new ArrayList<>();

    public ProjectEntity() {}

    public ProjectEntity(Long id, String name, String description, Double budget, Date deadline, Long clientId, Long consultantId, Boolean accepted) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.budget = budget;
        this.deadline = deadline;
        this.clientId = clientId;
        this.consultantId = consultantId;
        this.accepted = accepted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(Long consultantId) {
        this.consultantId = consultantId;
    }

    public Boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    public Project toDomainModel() {
        Project project = new Project();
        project.setId(this.getId());
        project.setName(this.getName());
        project.setDescription(this.getDescription());
        project.setBudget(this.getBudget());
        project.setDeadline(this.getDeadline());
        project.setClientId(this.getClientId());
        project.setConsultantId(this.getConsultantId());
        project.setAccepted(this.isAccepted());
        List<User> users = new ArrayList<>();
        for (UserEntity userEntity : this.getUsers()) {
            users.add(userEntity.toDomainModel());
        }
        project.setUsers(users);
        return project;
    }

    public static ProjectEntity fromDomainModel(Project project) {
        ProjectEntity entity = new ProjectEntity();
        entity.setId(project.getId());
        entity.setName(project.getName());
        entity.setDescription(project.getDescription());
        entity.setBudget(project.getBudget());
        entity.setDeadline(project.getDeadline());
        entity.setClientId(project.getClientId());
        entity.setConsultantId(project.getConsultantId());
        entity.setAccepted(project.isAccepted());
        List<UserEntity> userEntities = new ArrayList<>();
        for (User user : project.getUsers()) {
            userEntities.add(UserEntity.fromDomainModel(user));
        }
        entity.setUsers(userEntities);
        return entity;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", budget=" + budget + '\'' +
                ", deadline=" + deadline + '\'' +
                ", clientId=" + clientId + '\'' +
                ", consultantId=" + consultantId + '\'' +
                ", accepted=" + accepted + '\'' +
                '}';
    }


}

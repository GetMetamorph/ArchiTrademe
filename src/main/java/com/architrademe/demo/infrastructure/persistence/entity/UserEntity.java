package com.architrademe.demo.infrastructure.persistence.entity;

import com.architrademe.demo.domain.model.Project;
import com.architrademe.demo.domain.model.User;
import jakarta.persistence.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private String password;
    @ManyToMany(mappedBy = "users")
    @LazyCollection(LazyCollectionOption.EXTRA)
    private List<ProjectEntity> projects = new ArrayList<>();

    public UserEntity() {}

    public UserEntity(String name, String surname, String phone, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.password = password;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<ProjectEntity> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectEntity> projects) {
        this.projects = projects;
    }

    public void addProject(ProjectEntity project) {
        this.projects.add(project);
    }

    public void removeProject(ProjectEntity project) {
        this.projects.remove(project);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User toDomainModel() {
        User user = new User();
        user.setId(this.getId());
        user.setName(this.getName());
        user.setSurname(this.getSurname());
        user.setPhone(this.getPhone());
        user.setEmail(this.getEmail());
        user.setPassword(this.getPassword());
        for (ProjectEntity projectEntity : this.getProjects()) {
            user.addProject(projectEntity.toDomainModel());
        }
        return user;
    }

    public static UserEntity fromDomainModel(User user) {
        UserEntity entity = new UserEntity();
        entity.setId(user.getId());
        entity.setName(user.getName());
        entity.setSurname(user.getSurname());
        entity.setEmail(user.getEmail());
        entity.setPassword(user.getPassword());
        entity.setPhone(user.getPhone());
        for (Project project : user.getProjects()) {
            entity.addProject(ProjectEntity.fromDomainModel(project));
        }
        return entity;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserEntity user = (UserEntity) object;
        return id.equals(user.id) && name.equals(user.name) && surname.equals(user.surname) && java.util.Objects.equals(phone, user.phone) && email.equals(user.email) && java.util.Objects.equals(projects, user.projects);
    }

    public int hashCode() {
        return Objects.hash(id, name, surname, phone, email, projects);
    }
}
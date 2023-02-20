package com.architrademe.demo.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public abstract class User {
    private Long id;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private String password;
    private List<Project> projects = new ArrayList<>();

    public User() {}

    public User(String name, String surname, String phone, String email, String password) {
        this.id = Long.valueOf(UUID.randomUUID().toString());
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

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public void addProject(Project project) {
        this.projects.add(project);
    }

    public void removeProject(Project project) {
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        User user = (User) object;
        return id.equals(user.id) && name.equals(user.name) && surname.equals(user.surname) && java.util.Objects.equals(phone, user.phone) && email.equals(user.email) && java.util.Objects.equals(projects, user.projects);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), id, name, surname, phone, email, projects);
    }
}

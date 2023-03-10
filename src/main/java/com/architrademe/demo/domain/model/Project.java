package com.architrademe.demo.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    private Long id;
    private String name;
    private String description;
    private Double budget;
    private Date deadline;
    private Long clientId;
    private Long consultantId;
    private Boolean accepted;
    private List<User> users = new ArrayList<>();

    public Project() {}

    public Project(Long id, String name, String description, Double budget, Date deadline, Long clientId, Long consultantId, Boolean accepted) {
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

    // create method getUsers() that returns a list of users
    public List <User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
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

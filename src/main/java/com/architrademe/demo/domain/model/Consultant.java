package com.architrademe.demo.domain.model;

import java.util.List;

public class Consultant extends User {
    private List<Skill> skills;
    private Double hourlyRate;
    private Boolean available;
    private String paymentModality;

    public Consultant() {}

    public Consultant(String name, String surname, String phone, String email, String password, List<Skill> skills, Double hourlyRate, Boolean available, String paymentModality) {
        super(name, surname, phone, email, password);
        this.skills = skills;
        this.hourlyRate = hourlyRate;
        this.available = available;
        this.paymentModality = paymentModality;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Boolean isAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getPaymentModality() {
        return paymentModality;
    }

    public void setPaymentModality(String paymentModality) {
        this.paymentModality = paymentModality;
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "id=" + super.getId() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", phone='" + super.getPhone() + '\'' +
                ", skills=" + skills + '\'' +
                ", hourlyRate=" + hourlyRate + '\'' +
                ", available=" + available + '\'' +
                ", paymentModality='" + paymentModality + '\'' +
                ", projects=" + super.getProjects() + + '\'' +
                ", password='" + super.getPassword() + '\'' +
                '}';
    }
}

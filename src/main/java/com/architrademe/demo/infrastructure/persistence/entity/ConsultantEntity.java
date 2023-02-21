package com.architrademe.demo.infrastructure.persistence.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "consultant")
public class ConsultantEntity extends UserEntity {
    private Double hourlyRate;
    private Boolean available;
    private String paymentModality;

    @OneToMany(mappedBy = "consultant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SkillEntity> skills = new ArrayList<>();

    public ConsultantEntity() {}

    public ConsultantEntity(List<SkillEntity> skills, Double hourlyRate, Boolean available, String paymentModality) {

        this.skills = skills;
        this.hourlyRate = hourlyRate;
        this.available = available;
        this.paymentModality = paymentModality;
    }

    public void addSkill(SkillEntity skill) {
        skills.add(skill);
    }

    public void removeSkill(SkillEntity skill) {
        skills.remove(skill);
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
        return "ConsultantEntity{" +
                "hourlyRate=" + hourlyRate +
                ", available=" + available +
                ", paymentModality='" + paymentModality + '\'' +
                ", skills=" + skills +
                '}';
    }
}
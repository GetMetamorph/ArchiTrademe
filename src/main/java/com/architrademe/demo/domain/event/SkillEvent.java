package com.architrademe.demo.domain.event;

import com.architrademe.demo.domain.model.Skill;

public class SkillEvent {
    private Skill skill;
    private String eventType;

    public SkillEvent(Skill skill, String eventType) {
        this.skill = skill;
        this.eventType = eventType;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return "SkillEvent{" +
                "skill=" + skill +
                ", eventType='" + eventType + '\'' +
                '}';
    }
}
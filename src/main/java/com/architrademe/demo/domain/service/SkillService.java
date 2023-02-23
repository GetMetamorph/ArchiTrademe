package com.architrademe.demo.domain.service;

import java.util.List;
import com.architrademe.demo.domain.model.Skill;

public interface SkillService {

    /**
     * Retrieves all skills in the system.
     */
    List<Skill> getAllSkills();

    /**
     * Retrieves a skill by ID.
     * @param id The ID of the skill to retrieve.
     * @return The skill, or null if not found.
     */
    Skill getSkillById(Long id);

    /**
     * Adds a new skill to the system.
     * @param skill The skill to add.
     * @return The added skill.
     */
    Skill addSkill(Skill skill);

    /**
     * Updates an existing skill in the system.
     * @param id The ID of the skill to update.
     * @param skill The updated skill data.
     * @return The updated skill, or null if not found.
     */
    Skill updateSkill(Long id, Skill skill);

    /**
     * Deletes a skill from the system.
     * @param id The ID of the skill to delete.
     * @return True if the skill was deleted, false if not found.
     */
    boolean deleteSkill(Long id);

}

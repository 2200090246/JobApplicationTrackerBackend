package com.mahesh.jobApplicationTracker.service;

import java.util.List;

import com.mahesh.jobApplicationTracker.model.Skills;

public interface SkillsService {
	Skills createSkill(Skills skill);

	List<Skills> getAllSkills();

	Skills getSkillById(long id);

	Skills updateSkill(Skills skill, long id);

	void deleteSkill(long id);

	List<Skills> getBySkillName(String SkillName);
}

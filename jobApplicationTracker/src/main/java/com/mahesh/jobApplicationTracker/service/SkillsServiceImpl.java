package com.mahesh.jobApplicationTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahesh.jobApplicationTracker.model.Skills;
import com.mahesh.jobApplicationTracker.repo.SkillsRepo;

@Service
public class SkillsServiceImpl implements SkillsService {
	@Autowired
	SkillsRepo sr;

	@Override
	public Skills createSkill(Skills skill) {
		// TODO Auto-generated method stub
		return sr.save(skill);
	}

	@Override
	public List<Skills> getAllSkills() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public Skills getSkillById(long id) {
		// TODO Auto-generated method stub
		return sr.findById(id).get();
	}

	@Override
	public Skills updateSkill(Skills skill, long id) {
		// TODO Auto-generated method stub
		Skills s = getSkillById(id);
		s.setSkillName(skill.getSkillName());
		return sr.save(s);
	}

	@Override
	public void deleteSkill(long id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);

	}

	@Override
	public List<Skills> getBySkillName(String SkillName) {
		// TODO Auto-generated method stub
		return sr.findBySkillName(SkillName);
	}

}

package com.mahesh.jobApplicationTracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahesh.jobApplicationTracker.model.Skills;
import com.mahesh.jobApplicationTracker.service.SkillsService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class SkillsController {
	@Autowired
	SkillsService ss;

	@PostMapping("/skills")
	Skills createSkiklls(@RequestBody Skills s) {
		return ss.createSkill(s);
	}

	@GetMapping("/skills")
	List<Skills> getAllSkills() {
		return ss.getAllSkills();
	}

	@GetMapping("/skills/{id}")
	Skills getSkillById(@PathVariable long id) {
		return ss.getSkillById(id);
	}

	@GetMapping("/skills/name/{SkillName}")
	List<Skills> getBySkillName(@PathVariable String SkillName) {
		return ss.getBySkillName(SkillName);
	}

	@PutMapping("/skills/{id}")
	Skills updateSkill(@RequestBody Skills s, @PathVariable long id) {
		return ss.updateSkill(s, id);
	}

	@DeleteMapping("/skills/{id}")
	String deleterSkillsById(@PathVariable long id) {
		ss.deleteSkill(id);
		return "Skill Deleted Successfully";
	}
}

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

import com.mahesh.jobApplicationTracker.model.JobSkills;
import com.mahesh.jobApplicationTracker.service.JobsSkillService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class JobSkillsController {
	@Autowired
	JobsSkillService js;

	@PostMapping("/job-skills")
	JobSkills createJobSkill(@RequestBody JobSkills j) {
		return js.CreateJobSkill(j);
	}

	@GetMapping("/job-skills")
	List<JobSkills> getAllJobSkills() {
		return js.getAllJobSkills();
	}

	@GetMapping("/job-skills/{id}")
	JobSkills getJobSkillsById(@PathVariable long id) {
		return js.getJobSkillById(id);
	}

	@GetMapping("/job-skills/job/{id}")
	List<JobSkills> getJobSkillsByJobId(@PathVariable long id) {
		return js.getJobSkillsByjobId(id);
	}

	@PutMapping("/job-skills/{id}")
	JobSkills updateJobSkill(@RequestBody JobSkills j, @PathVariable long id) {
		return js.updateJobSkills(j, id);
	}

	@DeleteMapping("/job-skills/{id}")
	String deleteJobSkillsById(@PathVariable long id) {
		js.delteJobSkills(id);
		return "Job skill mapping deleted successfully";
	}

}

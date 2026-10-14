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

import com.mahesh.jobApplicationTracker.model.Jobs;
import com.mahesh.jobApplicationTracker.service.JobsService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class JobsController {
	@Autowired
	JobsService js;

	@PostMapping("/jobs")
	Jobs createJob(@RequestBody Jobs j) {
		return js.createJob(j);
	}

	@GetMapping("/jobs")
	List<Jobs> getAllJobs() {
		return js.getAllJobs();
	}

	@GetMapping("/jobs/{id}")
	Jobs getJobById(@PathVariable long id) {
		return js.getJobById(id);
	}

	@PutMapping("/jobs/{id}")
	Jobs updateJob(@RequestBody Jobs j, @PathVariable long id) {
		return js.updateJob(j, id);
	}

	@DeleteMapping("/jobs/{id}")
	String delteJob(@PathVariable long id) {
		js.deleteJob(id);
		return "Job deleted successfully";
	}

	@GetMapping("/jobs/company/{companyId}")
	List<Jobs> getJobsByCompany(@PathVariable long companyId) {
		return js.getJobsByCompanyId(companyId);
	}

	@GetMapping("/jobs/jobtype/{jobType}")
	List<Jobs> getJobsByJobType(@PathVariable String jobType) {
		return js.getJobsByJobType(jobType);
	}
}

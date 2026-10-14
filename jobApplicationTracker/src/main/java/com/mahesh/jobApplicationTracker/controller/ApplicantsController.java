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

import com.mahesh.jobApplicationTracker.model.Applicants;
import com.mahesh.jobApplicationTracker.service.ApplicantService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class ApplicantsController {
	@Autowired
	ApplicantService as;

	@PostMapping("/applicants")
	Applicants createApplicant(@RequestBody Applicants a) {
		return as.createApplicant(a);
	}

	@GetMapping("/applicants")
	List<Applicants> getAllApplicants() {
		return as.getAllApplicants();
	}

	@GetMapping("/applicants/{id}")
	Applicants getApplicantsById(@PathVariable long id) {
		return as.getApplicantById(id);
	}

	@PutMapping("/applicants/{id}")
	Applicants updateApplicants(@RequestBody Applicants a, @PathVariable long id) {
		return as.updateApplicant(a, id);
	}

	@DeleteMapping("/applicants/{id}")
	String deleteApplicant(@PathVariable long id) {
		as.deleteApplicant(id);
		return "Applicant Deleted Successfully";
	}
}

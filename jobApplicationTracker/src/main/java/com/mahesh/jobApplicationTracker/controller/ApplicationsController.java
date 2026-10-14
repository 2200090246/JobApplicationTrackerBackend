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

import com.mahesh.jobApplicationTracker.model.Applications;
import com.mahesh.jobApplicationTracker.service.ApplicationsService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class ApplicationsController {
	@Autowired
	ApplicationsService asr;

	@PostMapping("/applications")
	Applications createApplication(@RequestBody Applications a) {
		return asr.createApplication(a);
	}

	@GetMapping("/applications")
	List<Applications> getAllApplications() {
		return asr.getAllApplications();
	}

	@GetMapping("/applications/{id}")
	Applications getApplicationById(@PathVariable long id) {
		return asr.getApplicationById(id);
	}

	@PutMapping("/applications/{id}")
	Applications updateApplication(@RequestBody Applications a, @PathVariable long id) {
		return asr.updateApplication(a, id);
	}

	@DeleteMapping("/applications/{id}")
	String deleteApplicationById(@PathVariable long id) {
		asr.deleteApplication(id);
		return "Application Deleted Successfully";
	}
}

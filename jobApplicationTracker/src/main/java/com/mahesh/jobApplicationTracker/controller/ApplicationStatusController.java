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

import com.mahesh.jobApplicationTracker.model.ApplicationStatus;
import com.mahesh.jobApplicationTracker.service.ApplicationStatusService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ApplicationStatusController {
	@Autowired
	ApplicationStatusService ast;

	@PostMapping("/application-statuses")
	ApplicationStatus createApplicationStatus(@RequestBody ApplicationStatus a) {
		return ast.createStatus(a);
	}

	@GetMapping("/application-statuses")
	List<ApplicationStatus> getAllApplicationStatuses() {
		return ast.getAllStatuses();
	}

	@GetMapping("/application-statuses/{id}")
	ApplicationStatus getApplicationStatusById(@PathVariable long id) {
		return ast.getStatusById(id);
	}

	@PutMapping("/application-statuses/{id}")
	ApplicationStatus updateApplicationStatus(@RequestBody ApplicationStatus a, @PathVariable long id) {
		return ast.updateStatus(a, id);
	}

	@DeleteMapping("/application-statuses/{id}")
	String deleteApplicationStatus(@PathVariable long id) {
		ast.deleteStatus(id);
		return "Application status deleted successfully";
	}
}

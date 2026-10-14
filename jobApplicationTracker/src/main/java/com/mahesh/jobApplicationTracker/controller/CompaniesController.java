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

import com.mahesh.jobApplicationTracker.model.Companies;
import com.mahesh.jobApplicationTracker.service.CompaniesService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class CompaniesController {
	@Autowired
	CompaniesService cs;

	@PostMapping("/companies")
	Companies insertCompanies(@RequestBody Companies c) {
		return cs.createComapny(c);
	}

	@GetMapping("/companies")
	List<Companies> getAllCompanies() {
		return cs.getAllCompanies();
	}

	@GetMapping("/companies/{id}")
	Companies getComapnyById(@PathVariable long id) {
		return cs.getById(id);
	}

	@PutMapping("/companies/{id}")
	Companies updateCompany(@RequestBody Companies c, @PathVariable Long id) {
		return cs.updateCompany(c, id);
	}

	@DeleteMapping("/companies/{id}")
	String deleteCompanyById(@PathVariable Long id) {
		cs.deleteCompanies(id);
		return "Company Delted Successfully";
	}
}

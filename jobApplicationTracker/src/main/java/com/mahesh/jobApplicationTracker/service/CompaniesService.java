package com.mahesh.jobApplicationTracker.service;

import java.util.List;

import com.mahesh.jobApplicationTracker.model.Companies;

public interface CompaniesService {
	Companies createComapny(Companies c);

	List<Companies> getAllCompanies();

	Companies getById(long id);

	Companies updateCompany(Companies c,long id);

	void deleteCompanies(long id);
}

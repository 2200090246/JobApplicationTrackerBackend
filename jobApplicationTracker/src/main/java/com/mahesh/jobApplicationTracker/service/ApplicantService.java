package com.mahesh.jobApplicationTracker.service;

import java.util.List;

import com.mahesh.jobApplicationTracker.model.Applicants;

public interface ApplicantService {
	Applicants createApplicant(Applicants applicant);

	List<Applicants> getAllApplicants();

	Applicants getApplicantById(long id);

	Applicants updateApplicant(Applicants applicant, long id);

	void deleteApplicant(long id);
}

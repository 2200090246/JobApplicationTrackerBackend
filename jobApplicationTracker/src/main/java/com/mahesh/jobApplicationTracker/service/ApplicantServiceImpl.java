package com.mahesh.jobApplicationTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahesh.jobApplicationTracker.model.Applicants;
import com.mahesh.jobApplicationTracker.repo.ApplicantsRepo;

@Service
public class ApplicantServiceImpl implements ApplicantService {
	@Autowired
	ApplicantsRepo ar;

	@Override
	public Applicants createApplicant(Applicants applicant) {
		// TODO Auto-generated method stub
		return ar.save(applicant);
	}

	@Override
	public List<Applicants> getAllApplicants() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}

	@Override
	public Applicants getApplicantById(long id) {
		// TODO Auto-generated method stub
		return ar.findById(id).get();
	}

	@Override
	public Applicants updateApplicant(Applicants applicant, long id) {
		// TODO Auto-generated method stub
		Applicants a = getApplicantById(id);
		a.setApplicant_Email(applicant.getApplicant_Email());
		a.setApplicant_Name(applicant.getApplicant_Name());
		a.setApplicant_Phone(applicant.getApplicant_Phone());
		a.setResume_Url(applicant.getResume_Url());

		return ar.save(a);
	}

	@Override
	public void deleteApplicant(long id) {
		// TODO Auto-generated method stub
		ar.deleteById(id);

	}

}

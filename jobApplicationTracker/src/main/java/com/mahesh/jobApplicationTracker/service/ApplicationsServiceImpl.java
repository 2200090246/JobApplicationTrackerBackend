package com.mahesh.jobApplicationTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahesh.jobApplicationTracker.model.Applicants;
import com.mahesh.jobApplicationTracker.model.ApplicationStatus;
import com.mahesh.jobApplicationTracker.model.Applications;
import com.mahesh.jobApplicationTracker.model.Jobs;
import com.mahesh.jobApplicationTracker.repo.ApplicantsRepo;
import com.mahesh.jobApplicationTracker.repo.ApplicationStatusRepo;
import com.mahesh.jobApplicationTracker.repo.ApplicationsRepo;
import com.mahesh.jobApplicationTracker.repo.JobsRepo;

@Service
public class ApplicationsServiceImpl implements ApplicationsService {
	@Autowired
	ApplicationsRepo arp;
	@Autowired
	ApplicantsRepo applicantsRepo;

	@Autowired
	JobsRepo jobsRepo;

	@Autowired
	ApplicationStatusRepo statusRepo;

	@Override
	public Applications createApplication(Applications application) {
	    return arp.save(application);
	}
	@Override
	public List<Applications> getAllApplications() {
		// TODO Auto-generated method stub
		return arp.findAll();
	}

	@Override
	public Applications getApplicationById(long id) {
		// TODO Auto-generated method stub
		return arp.findById(id).get();
	}

	@Override
	public Applications updateApplication(Applications application, long id) {
		// TODO Auto-generated method stub
		Applications a = getApplicationById(id);
		a.setApplicant(application.getApplicant());
		a.setApplication_Date(application.getApplication_Date());
		a.setApplicationstatus(application.getApplicationstatus());
		a.setCover_Letter(application.getCover_Letter());
		a.setInterview_Date(application.getInterview_Date());
		a.setJob(application.getJob());
		a.setNotes(application.getNotes());
		return arp.save(a);
	}

	@Override
	public void deleteApplication(long id) {
		// TODO Auto-generated method stub
		arp.deleteById(id);

	}

}

package com.mahesh.jobApplicationTracker.service;

import java.util.List;

import com.mahesh.jobApplicationTracker.model.Jobs;

public interface JobsService {
	Jobs createJob(Jobs job);

	List<Jobs> getAllJobs();

	Jobs getJobById(long id);

	Jobs updateJob(Jobs job, long id);

	void deleteJob(long id);

	List<Jobs> getJobsByCompanyId(long companyId);

	List<Jobs> getJobsByJobType(String jobType);
}

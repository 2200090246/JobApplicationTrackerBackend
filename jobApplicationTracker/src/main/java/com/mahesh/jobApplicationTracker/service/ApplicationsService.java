package com.mahesh.jobApplicationTracker.service;

import java.util.List;

import com.mahesh.jobApplicationTracker.model.Applications;

public interface ApplicationsService {
	Applications createApplication(Applications application);

	List<Applications> getAllApplications();

	Applications getApplicationById(long id);

	Applications updateApplication(Applications application, long id);

	void deleteApplication(long id);
}

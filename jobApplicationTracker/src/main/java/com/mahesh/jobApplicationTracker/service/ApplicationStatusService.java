package com.mahesh.jobApplicationTracker.service;

import java.util.List;

import com.mahesh.jobApplicationTracker.model.ApplicationStatus;

public interface ApplicationStatusService {
	ApplicationStatus createStatus(ApplicationStatus status);

	List<ApplicationStatus> getAllStatuses();

	ApplicationStatus getStatusById(long id);

	ApplicationStatus updateStatus(ApplicationStatus status, long id);

	void deleteStatus(long id);
}

package com.mahesh.jobApplicationTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahesh.jobApplicationTracker.model.ApplicationStatus;
import com.mahesh.jobApplicationTracker.repo.ApplicationStatusRepo;

@Service
public class ApplicationStatusServiceImpl implements ApplicationStatusService {
	@Autowired
	ApplicationStatusRepo asr;

	@Override
	public ApplicationStatus createStatus(ApplicationStatus status) {
		// TODO Auto-generated method stub
		return asr.save(status);
	}

	@Override
	public List<ApplicationStatus> getAllStatuses() {
		// TODO Auto-generated method stub
		return asr.findAll();
	}

	@Override
	public ApplicationStatus getStatusById(long id) {
		// TODO Auto-generated method stub
		return asr.findById(id).get();
	}

	@Override
	public ApplicationStatus updateStatus(ApplicationStatus status, long id) {
		// TODO Auto-generated method stub
		ApplicationStatus as = getStatusById(id);
		as.setDescription(status.getDescription());
		as.setStatus_Name(status.getStatus_Name());
		return asr.save(as);
	}

	@Override
	public void deleteStatus(long id) {
		// TODO Auto-generated method stub
		asr.deleteById(id);

	}

}

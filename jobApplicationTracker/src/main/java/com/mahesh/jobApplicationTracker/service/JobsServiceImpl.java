package com.mahesh.jobApplicationTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahesh.jobApplicationTracker.model.Jobs;
import com.mahesh.jobApplicationTracker.repo.JobsRepo;

@Service
public class JobsServiceImpl implements JobsService {
	@Autowired
	JobsRepo jr;

	@Override
	public Jobs createJob(Jobs job) {
		// TODO Auto-generated method stub
		return jr.save(job);
	}

	@Override
	public List<Jobs> getAllJobs() {
		// TODO Auto-generated method stub
		return jr.findAll();
	}

	@Override
	public Jobs getJobById(long id) {
		// TODO Auto-generated method stub
		return jr.findById(id).get();
	}

	@Override
	public Jobs updateJob(Jobs job, long id) {
		// TODO Auto-generated method stub
		Jobs j = getJobById(id);
		j.setMin_Salary(job.getMin_Salary());
		j.setMax_Salary(job.getMax_Salary());
		j.setJob_Url(job.getJob_Url());
		j.setJobType(job.getJobType());
		j.setJob_Title(job.getJob_Title());
		j.setJob_Desription(job.getJob_Desription());
		j.setExperience_Required(job.getExperience_Required());
		j.setCompany(job.getCompany());
		j.setApplication_Deadline(job.getApplication_Deadline());
		return jr.save(j);
	}

	@Override
	public void deleteJob(long id) {
		// TODO Auto-generated method stub
		jr.deleteById(id);

	}

	@Override
	public List<Jobs> getJobsByCompanyId(long companyId) {
		// TODO Auto-generated method stub
		return jr.findByCompany_companyId(companyId);
	}

	@Override
	public List<Jobs> getJobsByJobType(String jobType) {
		// TODO Auto-generated method stub
		return jr.findByJobType(jobType);
	}

}

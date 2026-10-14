package com.mahesh.jobApplicationTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahesh.jobApplicationTracker.model.JobSkills;
import com.mahesh.jobApplicationTracker.repo.JobSkillsRepo;

@Service
public class JobSkillsServiceImpl implements JobsSkillService {
	@Autowired
	JobSkillsRepo jr;

	@Override
	public JobSkills CreateJobSkill(JobSkills j) {
		// TODO Auto-generated method stub
		return jr.save(j);
	}

	@Override
	public List<JobSkills> getAllJobSkills() {
		// TODO Auto-generated method stub
		return jr.findAll();
	}

	@Override
	public JobSkills getJobSkillById(long id) {
		// TODO Auto-generated method stub
		return jr.findById(id).get();
	}

	@Override
	public JobSkills updateJobSkills(JobSkills j, long id) {
		// TODO Auto-generated method stub
		JobSkills j1 = getJobSkillById(id);
		j1.setJob(j.getJob());
		j1.setSkill(j.getSkill());
		return jr.save(j1);
	}

	@Override
	public void delteJobSkills(long id) {
		// TODO Auto-generated method stub
		jr.deleteById(id);

	}

	@Override
	public List<JobSkills> getJobSkillsByjobId(long jobId) {
		// TODO Auto-generated method stub
		return jr.findByJob_JobId(jobId);
	}

}

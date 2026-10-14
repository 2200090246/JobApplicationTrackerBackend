package com.mahesh.jobApplicationTracker.service;

import java.util.List;

import com.mahesh.jobApplicationTracker.model.JobSkills;

public interface JobsSkillService {
	JobSkills CreateJobSkill(JobSkills j);

	List<JobSkills> getAllJobSkills();

	JobSkills getJobSkillById(long id);

	JobSkills updateJobSkills(JobSkills j, long id);

	void delteJobSkills(long id);

	List<JobSkills> getJobSkillsByjobId(long jobId);
}

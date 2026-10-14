package com.mahesh.jobApplicationTracker.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahesh.jobApplicationTracker.model.JobSkills;

@Repository
public interface JobSkillsRepo extends JpaRepository<JobSkills, Long> {
	List<JobSkills> findByJob_JobId(long jobId);
}

package com.mahesh.jobApplicationTracker.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahesh.jobApplicationTracker.model.Jobs;

@Repository
public interface JobsRepo extends JpaRepository<Jobs, Long> {
	List<Jobs> findByCompany_companyId(long companyId);

	List<Jobs> findByJobType(String jobType);
}

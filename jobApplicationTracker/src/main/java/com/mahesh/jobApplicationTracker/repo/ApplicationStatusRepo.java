package com.mahesh.jobApplicationTracker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahesh.jobApplicationTracker.model.ApplicationStatus;

@Repository
public interface ApplicationStatusRepo extends JpaRepository<ApplicationStatus, Long> {

}

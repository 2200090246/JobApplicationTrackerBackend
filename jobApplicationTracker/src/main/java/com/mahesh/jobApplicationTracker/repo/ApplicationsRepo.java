package com.mahesh.jobApplicationTracker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahesh.jobApplicationTracker.model.Applications;

@Repository
public interface ApplicationsRepo extends JpaRepository<Applications, Long> {

}

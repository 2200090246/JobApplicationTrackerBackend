package com.mahesh.jobApplicationTracker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahesh.jobApplicationTracker.model.Applicants;

@Repository
public interface ApplicantsRepo extends JpaRepository<Applicants, Long> {

}

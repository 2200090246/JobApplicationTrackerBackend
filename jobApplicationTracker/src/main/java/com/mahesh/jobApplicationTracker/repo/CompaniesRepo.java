package com.mahesh.jobApplicationTracker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahesh.jobApplicationTracker.model.Companies;

@Repository
public interface CompaniesRepo extends JpaRepository<Companies, Long> {

}

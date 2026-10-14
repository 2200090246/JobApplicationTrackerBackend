package com.mahesh.jobApplicationTracker.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahesh.jobApplicationTracker.model.Skills;

@Repository
public interface SkillsRepo extends JpaRepository<Skills, Long> {
	List<Skills> findBySkillName(String SkillName);
}

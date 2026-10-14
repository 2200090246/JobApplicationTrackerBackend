package com.mahesh.jobApplicationTracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "job_skills")
@Getter
@Setter
@NoArgsConstructor
public class JobSkills {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long job_Skill_id;
	@ManyToOne
	@JoinColumn(name = "job_id", referencedColumnName = "job_id", nullable = false)
	Jobs job;
	@ManyToOne
	@JoinColumn(name = "skill_id", referencedColumnName = "skill_id", nullable = false)
	Skills skill;

}

package com.mahesh.jobApplicationTracker.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
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
@Table(name = "applications")
@Getter
@Setter
@NoArgsConstructor
public class Applications {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long application_id;
	@ManyToOne
	@JoinColumn(name = "applicant_id", referencedColumnName = "applicant_id", nullable = false)
	Applicants applicant;
	@ManyToOne
	@JoinColumn(name = "job_id", referencedColumnName = "job_id", nullable = false)
	Jobs job;
	@Column(nullable = false)
	LocalDate application_Date;
	@ManyToOne
	@JoinColumn(name = "status_id", referencedColumnName = "status_id", nullable = false)
	ApplicationStatus applicationstatus;
	@Column(columnDefinition = "TEXT")
	String cover_Letter;
	LocalDateTime interview_Date;
	@Column(columnDefinition = "TEXT")
	String notes;

}

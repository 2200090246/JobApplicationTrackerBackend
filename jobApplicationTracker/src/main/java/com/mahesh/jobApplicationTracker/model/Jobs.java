package com.mahesh.jobApplicationTracker.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "jobs")
@Getter
@Setter
@NoArgsConstructor
public class Jobs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_id")
	long jobId;
	@ManyToOne
	@JoinColumn(name = "company_id", referencedColumnName = "company_id", nullable = false)
	private Companies company;
	@Column(nullable = false)
	String job_Title;
	@Column(columnDefinition = "TEXT")
	String job_Desription;
	@Column(nullable = false, name = "job_Type")
	String jobType;
	@Column(precision = 12, scale = 2)
	BigDecimal min_Salary;
	@Column(precision = 12, scale = 2)
	BigDecimal max_Salary;
	String experience_Required;
	LocalDate application_Deadline;
	String job_Url;
	LocalDateTime created_At;

	@PrePersist
	public void setCreatedAt() {
		if (created_At == null) {
			created_At = LocalDateTime.now();
		}
	}

}

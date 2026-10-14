package com.mahesh.jobApplicationTracker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "applicants")
@Getter
@Setter
@NoArgsConstructor
public class Applicants {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long applicant_id;
	@Column(nullable = false)
	String applicant_Name;
	@Column(nullable = false, unique = true)
	String applicant_Email;
	String applicant_Phone;
	String resume_Url;
}

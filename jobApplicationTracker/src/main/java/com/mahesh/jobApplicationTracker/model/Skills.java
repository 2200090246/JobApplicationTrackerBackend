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
@Table(name = "skills")
@Getter
@Setter
@NoArgsConstructor
public class Skills {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long skill_id;
	@Column(unique = true, nullable = false,name="skill_name")
	String skillName;

}

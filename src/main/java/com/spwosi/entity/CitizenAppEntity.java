package com.spwosi.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="CITIZEN_APPS")
@Data
public class CitizenAppEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer appId;
	private String fullName;
	private String email;
	private Long phNo;
	private String gender;
	private Long ssn;
	private String stateName;
	
	@CreationTimestamp
	private LocalDate createdDate;
	
	@UpdateTimestamp
	private LocalDate updatedDate;
	
	private String createdBy;
	private String updatedBy;
	
	
}

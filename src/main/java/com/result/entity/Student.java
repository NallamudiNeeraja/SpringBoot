package com.result.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Component
@Data
public class Student {
	
	@Id
	private String rollNo;
	private String name;
	private String mname;
	private String fname;
	private String dob;
	private int javaMarks;
	private int reactMarks;
	private int oracleMarks;
}
	
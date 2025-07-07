package com.result.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.result.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, String>{
	
	List<Student> findByRollNo(String  rollNo);

	List<Student> findByRollNoAndDob(String rollNo, String dob);
}

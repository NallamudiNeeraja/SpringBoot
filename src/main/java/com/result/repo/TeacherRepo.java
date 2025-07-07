package com.result.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.result.entity.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, String>{
	List<Teacher> findByIdAndPassword(String id, String password);
}

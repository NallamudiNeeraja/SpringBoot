package com.result.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.result.entity.Student;
import com.result.repo.StudentRepo;
@Controller
public class AdminBasedStudentController
{
	@Autowired
	public StudentRepo sr;
	
	
@PostMapping("/addStudent")	
public String addStudent(@RequestParam("stuid")String rollNo,@RequestParam("name")String name,@RequestParam("mname")String m_name,@RequestParam("fname")String f_name,@RequestParam("dob")String dob)
{
	Student s=new Student();
	
	s.setRollNo(rollNo);
	s.setFname(f_name);
	s.setMname(m_name);
	s.setName(name);
	s.setDob(dob);
	sr.save(s);
	return "success";
}

@PostMapping("/editStudent")	
public String editStudent(@RequestParam("stuid")String rollNo,@RequestParam("name")String name,@RequestParam("mname")String m_name,@RequestParam("fname")String f_name,@RequestParam("dob")String dob)
{
	Student s=new Student();
	
	s.setRollNo(rollNo);
    s.setFname(f_name);
    s.setMname(m_name);
	s.setName(name);
	s.setDob(dob);
	sr.save(s);
	return "success";
}

@PostMapping("/deleteStudent")
public String deleteStudent(@RequestParam("stuid")String rollNo)
{
	sr.deleteById(rollNo);
	return "success";
}

}



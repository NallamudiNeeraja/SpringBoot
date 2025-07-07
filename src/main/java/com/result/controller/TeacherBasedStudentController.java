package com.result.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.result.entity.Student;
import com.result.repo.StudentRepo;

import jakarta.servlet.http.HttpSession;

@Controller
public class TeacherBasedStudentController
{
	@Autowired
	private StudentRepo sr;
	@PostMapping("/findStudent")
	public String findstudent(@RequestParam("rollno")String rollno,@RequestParam("teacher_name")String t_name ,Model model,HttpSession session)
	{
		List<Student> list = sr.findByRollNo(rollno);
		if(list.size()==1)
		{
			model.addAttribute("student",list.get(0));
			model.addAttribute("teacher_name",t_name);
			return "add-marks";
		}
		else {
			return "Not-Found";
		}
	}
	@PostMapping("/submitStudentMarks")
	public String addMarks(@RequestParam("rollNo")String rollNo, @RequestParam("java") String java_marks, @RequestParam("react") String react_marks, @RequestParam("oracle") String oracle_marks,@RequestParam("teacher_name") String t_name,Model model,HttpSession session) {
		
		List<Student> list = sr.findByRollNo(rollNo);
	
		Student s = list.get(0);
		s.setJavaMarks(Integer.parseInt(java_marks));
		s.setReactMarks(Integer.parseInt(react_marks));
		s.setOracleMarks(Integer.parseInt(oracle_marks));

		sr.save(s);
	    model.addAttribute("teacher_name", t_name);
		return "WelcomeTeacher";
	}}




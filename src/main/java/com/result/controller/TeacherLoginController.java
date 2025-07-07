package com.result.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.result.entity.Teacher;
import com.result.repo.TeacherRepo;

import jakarta.servlet.http.HttpSession;
@Controller
public class TeacherLoginController 
{
	@Autowired
private TeacherRepo tr;
	@GetMapping("/teacherlogin")
	public String teacherlogin()
	{
		return "teacher-login";
	}
	@PostMapping("/validateTeacher")
	public String validateTeacher(@RequestParam("id") String id, @RequestParam("password")String password,HttpSession session,Model model) {
		
		List<Teacher> list = tr.findByIdAndPassword(id, password);
		
		int t = list.size();
		
		if(t==1) {	
			    model.addAttribute("teacher_name",list.get(0).getName());
			    session.setAttribute("teacher_name", list.get(0).getName());

		        
			return "WelcomeTeacher";
		}
		else {
			return "Not-Found";
		}
	}}

	

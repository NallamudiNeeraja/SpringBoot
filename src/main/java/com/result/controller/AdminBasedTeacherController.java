package com.result.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.result.entity.Teacher;
import com.result.repo.TeacherRepo;

@Controller
@ResponseBody
public class AdminBasedTeacherController
{
	
	@Autowired
	public TeacherRepo tr;
	@PostMapping("/addTeacher")	
	public String addTeacher(@RequestParam("name")String name,@RequestParam("id")String id,@RequestParam("password")String password)
	{
		Teacher t=new Teacher();
		t.setName(name);
		t.setId(id);
		t.setPassword(password);
		tr.save(t);
		return "Teacher Added sucessfully ";
	}
	@PostMapping("/editTeacher")	
	public String editTeacher(@RequestParam("name")String name,@RequestParam("id")String id,@RequestParam("password")String password)
	{
		Teacher t=new Teacher();
		t.setName(name);
		t.setId(id);
		t.setPassword(password);
		tr.save(t);
		return "Teacher Edited Sucessfully ";
	}
	@PostMapping("/deleteTeacher")
	public String deleteTeacher(@RequestParam("id")String id)
	{
		tr.deleteById(id);
		return "Teacher Deleted Successfully ";
	}
	
}

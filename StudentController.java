package com.gloify.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gloify.student.entity.Student;
import com.gloify.student.service.StudentService;

@RestController
@RequestMapping("/studentdetails")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	public Student addStudent(@RequestBody Student student) {
		return studentService.save(student);
		
	}
	@GetMapping
	public Student getStudent(@RequestParam(value="name")String name)
			//@RequestParam(value="id")int id)
	{
		return studentService.getStudent(name);
	}
	@PutMapping
	public Student update( @RequestBody Student student)
	{
		return studentService.update(student);
		
	}
	
	@DeleteMapping
	public String delete( @RequestParam(value="name")  String name)
	{
		return studentService.delete(name);
		
	}
//	
//	@GetMapping(path="/{name}")
//	public Student getStudent(@PathVariable String name)
//	{
//		return studentService.getStudent(name);
//		
//	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	

}

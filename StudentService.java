package com.gloify.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.gloify.student.entity.Student;
import com.gloify.student.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired//create an object for repository
	private StudentRepository studentRepository;
	
	//to  create an entity for database
	public Student save(Student student)
	{
		return studentRepository.save(student);
		
	}
	
	public Student getStudent(String name)
	{
		return studentRepository.findById(name).get();
		
	}
	public Student update(Student student)
	{
	 Student student2=studentRepository.findById(student.getName()).get();
	 student2.setFathername(student.getFathername());
	 student2.setMothername(student.getMothername());
	 student2.setClassname(student.getClassname());
	 student2.setId(student.getId());
	 student2.setSection(student.getSection());
	
	 return studentRepository.save(student2);
	 }
	
	public String delete(String name)
	{
		studentRepository.deleteById(name);
		return "entity deleted"+name;
		
	}
	

	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

}

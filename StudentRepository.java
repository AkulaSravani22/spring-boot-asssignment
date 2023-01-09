package com.gloify.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gloify.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String>{

}

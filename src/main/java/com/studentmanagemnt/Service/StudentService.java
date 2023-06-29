package com.studentmanagemnt.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagemnt.Entity.Student;
import com.studentmanagemnt.Repository.StudentRepo;

@Service

public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	
	public Student saveDetails(Student student) {
		
		return studentRepo.save(student);
		
	}
	
	

}

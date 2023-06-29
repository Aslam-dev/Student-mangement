package com.studentmanagemnt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanagemnt.Entity.Student;

public interface  StudentRepo extends JpaRepository<Student,Integer>{

	
}

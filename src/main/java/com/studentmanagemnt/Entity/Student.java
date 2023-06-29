package com.studentmanagemnt.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="STUDENT_DB")
@NoArgsConstructor
@AllArgsConstructor



public class Student {
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private int id;
	
	@Column(name="ST_MARK")
	private int mark;
	
	@Column (name="NAME")
	private String name;
	
}

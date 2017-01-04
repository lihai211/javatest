package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student" )
public class Student {
	 @Id
	  @Column(name="id")
	  @GeneratedValue(strategy=GenerationType.AUTO)  
	private int  id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="age")
	private int age;
	
	@Column(name="name")
	private String name;
	

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student(int id,int age,String name ){
		this.id =id;
		this.age=age;
		this.name=name;
	}
	
	public Student(int id ){
		this.id =id;
	
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
}

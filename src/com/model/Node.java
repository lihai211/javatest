package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "node" )
public class Node {
	
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
	
	  @Column(name="name")
	private String  name;
	
	  @Column(name="pid")
	private int pid;
	@Transient
     private List<Node>  children;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {

		this.pid = pid;
	}
	public List<Node> getChildren() {
		return children;
	}
	public void setChildren(List<Node> children) {
		this.children = children;
	}
	
	public boolean ischeck=false;  //是否叶子节点
	
	public int level; //层数
   
	
     
	
	
		
}

package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "class")
public class SClass {
	  @Id
	  @Column(name="atno")
	  @GeneratedValue(strategy=GenerationType.AUTO)  
		private int atno;
		private String name;
		@Column(name="atno")
		public int getAtno() {
			return atno;
		}
		public void setAtno(int atno) {
			this.atno = atno;
		}
		@Column(name="name")
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
}

package com.myhql;

import jakarta.persistence.*;
import jakarta.persistence.Id;


@Entity
@Table(name = "Student2")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SRollNo")
	private Integer roll;
	
	@Column(name="SName" ,length = 100)
	private String name;
	@Column(name="SPercent")
	private Double percent;
	
	
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPercent() {
		return percent;
	}
	public void setPercent(Double percent) {
		this.percent = percent;
	}
	
	
	

}

package com.mycompany;

import java.util.*;
import jakarta.persistence.*;
import jakarta.persistence.Id;


@Entity
@Table(name="majdoor")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer roll;
	
	@Column(name="emp" ,length = 100)
	private String name;
	
	private Double percent;
	
	@Transient
	private int x;
	
	@Temporal(TemporalType.DATE)
	Date date;
	
	@Lob
	@Column(name= "image", columnDefinition = "LONGBLOB")
	byte image[];
	 
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	boolean isOpen;
	
	
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
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

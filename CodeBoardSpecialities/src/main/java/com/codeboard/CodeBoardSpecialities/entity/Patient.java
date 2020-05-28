package com.codeboard.CodeBoardSpecialities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="Patient_Details")
public class Patient {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="Patient_ID")
	private int id;
	
	@Column(name="Patient_Name")
	private String name;
	
	@Column(name="is_Deleted")
	private String isDeleted;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", isDeleted=" + isDeleted + "]";
	}
	
	
 
}

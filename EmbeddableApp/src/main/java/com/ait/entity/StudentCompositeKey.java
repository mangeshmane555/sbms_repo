package com.ait.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentCompositeKey implements Serializable  // Serializable is a marker interface
{
	@Column(name="ROLLNO")
	private Integer rolNumber;
	
	@Column(name="SECTION")
	private String section;

	//
	public Integer getRolNumber() {
		return rolNumber;
	}

	public void setRolNumber(Integer rolNumber) {
		this.rolNumber = rolNumber;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
}

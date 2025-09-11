package com.ait.oto.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;

@Entity
@Table(name = "tbl_person")

public class Person 
{
	@Id
	@Column(name = "person_id")
	private Integer personId;
	
	@Column(name = "person_name")
	private String personName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="passport_id", unique = true, nullable = false)
	private Passport passport;

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	
}


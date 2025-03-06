package com.capgemini.Hospital.Managment.System.Dr_Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "appoinment")
public class Appoinment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;

	private String age;

	private String Symtopms;

	private String number;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSymtopms() {
		return Symtopms;
	}

	public void setSymtopms(String symtopms) {
		Symtopms = symtopms;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Appoinment(long id, String name, String age, String symtopms, String number) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Symtopms = symtopms;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Appoinment [id=" + id + ", name=" + name + ", age=" + age + ", Symtopms=" + Symtopms + ", number="
				+ number + "]";
	}

}

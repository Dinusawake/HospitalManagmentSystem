package com.capgemini.Hospital.Managment.System.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Patients")

public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "Name")
	private String Name;

	@Column(name = "Age")
	private int age;

	@Column(name = "Prescribtion")
	private String Prescribtion;

	@Column(name = "Blood_group")
	private String blood_group;

	@Column(name = "Doses")
	private String doses;

	@Column(name = "Fees")
	private String fees;

	@Column(name = "Urgency")
	private String urgency;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPrescribtion() {
		return Prescribtion;
	}

	public void setPrescribtion(String prescribtion) {
		Prescribtion = prescribtion;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getDoses() {
		return doses;
	}

	public void setDoses(String doses) {
		this.doses = doses;
	}

	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	public String getUrgency() {
		return urgency;
	}

	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(long id, String name, int age, String prescribtion, String blood_group, String doses, String fees,
			String urgency) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
		Prescribtion = prescribtion;
		this.blood_group = blood_group;
		this.doses = doses;
		this.fees = fees;
		this.urgency = urgency;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", Name=" + Name + ", age=" + age + ", Prescribtion=" + Prescribtion
				+ ", blood_group=" + blood_group + ", doses=" + doses + ", fees=" + fees + ", urgency=" + urgency
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getPrescribtion()=" + getPrescribtion() + ", getBlood_group()=" + getBlood_group()
				+ ", getDoses()=" + getDoses() + ", getFees()=" + getFees() + ", getUrgency()=" + getUrgency()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}

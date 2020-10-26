package com.healthcare.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PersonVO {
	private int id;
	private String firstName;
	private String lastName;
	private String middleName;
	private int age;
	private int dob;
	private int phoneno;
	private String address;
	private String city;
	private String state;
	private String country;
	private String typeofdiagnosis;
	private String consulationdept;
	private String doctorname;
	private String medications;
	private String reportsummary;
	private int nextconsulationdate;

	public PersonVO() {
		super();
	}

	public PersonVO(int id, String firstName, String lastName, String middleName, int age, int dob, int phoneno,
			String address, String city, String state, String country, String typeofdiagnosis, String consulationdept,
			String doctorname, String medications, String reportsummary, int nextconsulationdate) {
		super();
		this.id = id;
		// this logic take care
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.age = age;
		this.dob = dob;
		this.phoneno = phoneno;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.typeofdiagnosis = typeofdiagnosis;
		this.doctorname = doctorname;
		this.consulationdept = consulationdept;
		this.medications = medications;
		this.reportsummary = reportsummary;
		this.nextconsulationdate = nextconsulationdate;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTypeofdiagnosis() {
		return typeofdiagnosis;
	}

	public void setTypeofdiagnosis(String typeofdiagnosis) {
		this.typeofdiagnosis = typeofdiagnosis;
	}

	public String getConsulationdept() {
		return consulationdept;
	}

	public void setConsulationdept(String consulationdept) {
		this.consulationdept = consulationdept;
	}

	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	public String getMedications() {
		return medications;
	}

	public void setMedications(String medications) {
		this.medications = medications;
	}

	public String getReportsummary() {
		return reportsummary;
	}

	public void setReportsummary(String reportsummary) {
		this.reportsummary = reportsummary;
	}

	public int getNextconsulationdate() {
		return nextconsulationdate;
	}

	public void setNextconsulationdate(int nextconsulationdate) {
		this.nextconsulationdate = nextconsulationdate;
	}

}

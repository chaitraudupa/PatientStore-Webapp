package com.healthcare.vo;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "persondetails")
@Entity
@Table(name = "`HealthcareDetails`")
public class PersonDetailsVO {
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

	public PersonDetailsVO() {
		super();
	}

	public PersonDetailsVO(int id, String firstName, String lastName, String middleName, int age, int dob, int phoneno,
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

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "`id`")
	public int getId() {
		return id;
	}

	public void setId(int person_id) {
		this.id = id;
	}

	@Column(name = "`FirstName`")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "`LastName`")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "`MiddleName`")
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Column(name = "`Age`")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Column(name = "`DOB`")
	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	@Column(name = "`PhoneNo`")
	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	@Column(name = "`Address`")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "`City`")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "`State`")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "`Country`")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "`TypeOfDiagnosis`")
	public String getTypeofdiagnosis() {
		return typeofdiagnosis;
	}

	public void setTypeofdiagnosis(String typeofdiagnosis) {
		this.typeofdiagnosis = typeofdiagnosis;
	}

	@Column(name = "`DeptOfConsultation`")
	public String getConsulationdept() {
		return consulationdept;
	}

	public void setConsulationdept(String consulationdept) {
		this.consulationdept = consulationdept;
	}

	@Column(name = "`DoctorName`")
	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	@Column(name = "`Medications`")
	public String getMedications() {
		return medications;
	}

	public void setMedications(String medications) {
		this.medications = medications;
	}

	@Column(name = "`ReportSummary`")
	public String getReportsummary() {
		return reportsummary;
	}

	public void setReportsummary(String reportsummary) {
		this.reportsummary = reportsummary;
	}

	@Column(name = "`NextConsultationDate`")
	public int getNextconsulationdate() {
		return nextconsulationdate;
	}

	public void setNextconsulationdate(int nextconsulationdate) {
		this.nextconsulationdate = nextconsulationdate;
	}

}

package com.healthcare.bo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.healthcare.entity.PersonVO;

/**
 * Person client
 * 
 * @author chaitra
 *
 */
@Service
public class PersonClient {

	@Autowired
	RestTemplate restTemplate;

	final String ROOT_URI = "http://localhost:8080/HealthcareProject_Service/api/personaldetails/information";

	/**
	 * Get all person
	 * 
	 * @return
	 */
	public List<PersonVO> getAllPerson() {
		ResponseEntity<PersonVO[]> response2 = restTemplate.getForEntity(ROOT_URI, PersonVO[].class);
		return Arrays.asList(response2.getBody());

	}

	/**
	 * Get by id
	 * 
	 * @param id
	 * @return
	 */
	public PersonVO getById(int id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);
		ResponseEntity<PersonVO> response1 = restTemplate.getForEntity(ROOT_URI + "/" + id, PersonVO.class);
		return response1.getBody();
	}

	/**
	 * Create person
	 * 
	 * @param user
	 * @return
	 */
	public ResponseEntity<String> addPerson(PersonVO user) {
		String message = String.format(
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><user><person_id>%d</person_id><firstName>%s</firstName><middleName>%s</middleName><lastName>%s</lastName><age>%d</age><dob>%d</dob>"
						+ "<phoneno>%d</phoneno><address>%s</address><city>%s</city><state>%s</state><country>%s</country><typeofdiagnosis>%s</typeofdiagnosis><consulationdept>%s</consulationdept><doctorname>%s</doctorname><medications>%s</medications><reportsummary>%s</reportsummary><nextconsulationdate>%s<nextconsulationdate></user>",
				user.getId(), user.getFirstName(), user.getLastName(), user.getMiddleName(), user.getAge(),
				user.getDob(), user.getPhoneno(), user.getAddress(), user.getCity(), user.getState(), user.getCountry(),
				user.getTypeofdiagnosis(), user.getConsulationdept(), user.getDoctorname(), user.getMedications(),
				user.getReportsummary(), user.getNextconsulationdate());
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);
		HttpEntity<String> request = new HttpEntity<String>(message, headers);
		ResponseEntity<String> response = restTemplate.postForEntity(
				"http://localhost:8080/HealthcareProject_Service/api/personaldetails/information", request,
				String.class);
		return response;
	}

	/**
	 * Update person
	 * 
	 * @param user
	 */
	public void updatePerson(PersonVO user) {
		String message = String.format(
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><user><person_id>%d</person_id><firstName>%s</firstName><middleName>%s</middleName><lastName>%s</lastName><age>%d</age><dob>%d</dob>"
						+ "<phoneno>%d</phoneno><address>%s</address><city>%s</city><state>%s</state><country>%s</country><typeofdiagnosis>%s</typeofdiagnosis><consulationdept>%s</consulationdept><doctorname>%s</doctorname><medications>%s</medications><reportsummary>%s</reportsummary><nextconsulationdate>%s<nextconsulationdate></user>",
				user.getId(), user.getFirstName(), user.getLastName(), user.getMiddleName(), user.getAge(),
				user.getDob(), user.getPhoneno(), user.getAddress(), user.getCity(), user.getState(), user.getCountry(),
				user.getTypeofdiagnosis(), user.getConsulationdept(), user.getDoctorname(), user.getMedications(),
				user.getReportsummary(), user.getNextconsulationdate());
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);
		HttpEntity<String> request = new HttpEntity<String>(message, headers);
		restTemplate.put("http://localhost:8080/HealthcareProject_Service/api/personaldetails/information", request,
				String.class);
	}

	/**
	 * Delete person
	 * 
	 * @param id
	 */
	public void deletePerson(int id) {
		restTemplate.delete(ROOT_URI + "/" + id);

	}

}

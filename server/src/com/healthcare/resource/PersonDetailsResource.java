package com.healthcare.resource;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.healthcare.service.PersonDetailsService;
import com.healthcare.vo.PersonDetailsVO;

@Path("/personaldetails/information")
public class PersonDetailsResource {
	PersonDetailsService personDetailService = new PersonDetailsService();

	/**
	 * Create user
	 * 
	 * @param user
	 */
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public void addUser(PersonDetailsVO user) {
		try {
			personDetailService.addPerson(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Read user
	 * 
	 * @param id
	 * @return
	 * @throws NumberFormatException
	 * @throws Exception
	 */
	@GET
	@Path("/{personid}")
	@Produces(MediaType.APPLICATION_XML)
	public PersonDetailsVO getPerson(@PathParam("personid") String id) throws NumberFormatException, Exception {
		PersonDetailsVO person = personDetailService.getPerson(Integer.parseInt(id));
		return person;
	}

	/**
	 * Update user
	 * 
	 * @param user
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public void updatePerson(PersonDetailsVO user) {
		System.out.print("");
		personDetailService.updatePerson(user);
	}

	/**
	 * Delete user
	 * 
	 * @param id
	 */
	@DELETE
	@Path("/{personid}")
	@Produces(MediaType.APPLICATION_XML)
	public void deletePerson(@PathParam("personid") String id) {
		personDetailService.deletePerson(Integer.parseInt(id));
	}

	/**
	 * Get all users
	 * 
	 * @return
	 * @throws NumberFormatException
	 * @throws Exception
	 */
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<PersonDetailsVO> getAllUser() throws NumberFormatException, Exception {
		List<PersonDetailsVO> dbResults = personDetailService.getPersondetails();
		List<PersonDetailsVO> webResults = new ArrayList<>();
		for (int i = 0; i < dbResults.size(); i++) {
			PersonDetailsVO user = dbResults.get(i);
			PersonDetailsVO userVO = new PersonDetailsVO(user.getId(), user.getFirstName(), user.getLastName(),
					user.getMiddleName(), user.getAge(), user.getDob(), user.getPhoneno(), user.getAddress(),
					user.getCity(), user.getState(), user.getCountry(), user.getTypeofdiagnosis(),
					user.getConsulationdept(), user.getDoctorname(), user.getMedications(), user.getReportsummary(),
					user.getNextconsulationdate());
			webResults.add(userVO);

		}
		return webResults;
	}
}

package com.healthcare.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.healthcare.dao.PersonDetailsDAO;
import com.healthcare.vo.PersonDetailsVO;

/**
 * Business object for Person Details
 * 
 * @author chaitra
 *
 */
@Service
public class PersonDetailsService {
	private PersonDetailsDAO personDetailsDAO = new PersonDetailsDAO();

	/**
	 * Method to add person
	 * 
	 * @param user
	 * @throws Exception
	 */
	public void addPerson(PersonDetailsVO user) throws Exception {
		PersonDetailsDAO.addPerson(user);
	}

	/**
	 * Method to fetch person
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public PersonDetailsVO getPerson(int id) throws Exception {
		PersonDetailsVO user = personDetailsDAO.getPerson(id);
		return user;
	}

	/**
	 * Method to update person
	 * 
	 * @param user
	 */
	public void updatePerson(PersonDetailsVO user) {
		personDetailsDAO.updatePerson(user);
	}

	/**
	 * Method to delete person
	 * 
	 * @param id
	 */
	public void deletePerson(int id) {
		personDetailsDAO.deletePerson(id);
	}

	/**
	 * Method to get person details
	 * 
	 * @return
	 */
	public List<PersonDetailsVO> getPersondetails() {
		List<PersonDetailsVO> list = personDetailsDAO.getPersondetails();
		return list;
	}

}

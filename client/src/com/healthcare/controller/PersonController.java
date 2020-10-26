package com.healthcare.controller;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.healthcare.bo.PersonClient;
import com.healthcare.entity.PersonVO;

/**
 * Person controller
 */
@Controller
public class PersonController {
	@Autowired
	PersonClient client;

	@RequestMapping("/entryaddperson.do")
	public String entryAddUser(@ModelAttribute("user") PersonVO user) {
		return "person";
	}

	/**
	 * Add person details
	 * 
	 * @param user
	 * @param model
	 * @return
	 * @throws RemoteException
	 */
	@RequestMapping("/processaddperson.do")
	public String addPerson(@ModelAttribute("user") PersonVO user, Model model) throws RemoteException {
		client.addPerson(user);
		return "success";
	}

	/**
	 * View person details
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/persondetails")
	public String viewPerson(Model model) {
		List<PersonVO> list = client.getAllPerson();
		model.addAttribute("list", list);
		return "persondetails";
	}

	/**
	 * Edit person details
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/editperson/{id}")
	public String edit(@PathVariable int id, Model model) {
		PersonVO user = client.getById(id);
		model.addAttribute("command", user);
		return "personeditform";
	}

	/**
	 * Update details
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public String editsave(@ModelAttribute("user") PersonVO user) {
		client.updatePerson(user);
		return "redirect:/persondetails";
	}

	/**
	 * Delete details
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/deleteperson/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		client.deletePerson(id);
		return "redirect:/persondetails";
	}

}

package com.healthcare.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import com.healthcare.vo.PersonDetailsVO;

/**
 * DataAccess object for Person Details
 * 
 * @author chaitra
 *
 */
public class PersonDetailsDAO {
	@Autowired(required = true)
	private static SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	// Session factory
	private static SessionFactory buildSessionFactory() {
		// Creating Configuration Instance & Passing Hibernate Configuration File
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml");

		// Since Hibernate Version 4.x, ServiceRegistry Is Being Used
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
				.applySettings(configObj.getProperties()).build();

		// Creating Hibernate SessionFactory Instance
		sessionFactory = configObj.buildSessionFactory(serviceRegistryObj);
		return sessionFactory;
	}

	/**
	 * Method to add person
	 * @param personVO
	 */
	public static void addPerson(PersonDetailsVO personVO) {
		Session session = buildSessionFactory().openSession();
		session.beginTransaction();
		session.save(personVO);
		session.getTransaction().commit();
		session.close();
	}

	/**
	 * Method to return person details
	 * @return
	 */
	public List<PersonDetailsVO> getPersondetails() {
		Session session = buildSessionFactory().openSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<PersonDetailsVO> personsList = session.createQuery("from PersonDetailsVO").list();
		session.getTransaction().commit();
		session.close();
		return personsList;
	}

	/**
	 * Method to get person
	 * @param id
	 * @return
	 */
	public PersonDetailsVO getPerson(int id) {
		Session session = buildSessionFactory().openSession();
		session.beginTransaction();
		@SuppressWarnings("deprecation")
		PersonDetailsVO user = (PersonDetailsVO) session.get(PersonDetailsVO.class, new Integer(id));
		session.getTransaction().commit();
		session.close();
		return user;
	}

	/**
	 * Method to update person
	 * @param personVO
	 */
	public void updatePerson(PersonDetailsVO personVO) {
		Session session = buildSessionFactory().openSession();
		session.beginTransaction();
		session.update(personVO);
		session.getTransaction().commit();
		session.close();
	}

	/**
	 * Method to delete person
	 * @param id
	 */
	public void deletePerson(int id) {
		Session session = buildSessionFactory().openSession();
		session.beginTransaction();
		PersonDetailsVO personVO = (PersonDetailsVO) session.get(PersonDetailsVO.class, new Integer(id));
		if (null != personVO) {
			session.delete(personVO);
		}
		session.getTransaction().commit();
		session.close();
	}

}

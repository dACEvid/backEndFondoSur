package org.cuatrovientos.dam2.sge.backend.data.daoImpl;

import org.cuatrovientos.dam2.sge.backend.data.dao.CustomerDAO;
import org.cuatrovientos.dam2.sge.backend.data.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCustomerDAO implements CustomerDAO {
	// en esta clase implementaremos el CRUD
	public void createCustomer(Customer customerToCreate) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			// now use the session object
			System.out.println("Creating new customer object...");

			// start transaction
			session.beginTransaction();

			// save the customer
			session.save(customerToCreate);

			// commit the transaction: session closes
			session.getTransaction().commit();

			System.out.println("Customer inserted");
		} finally {
			factory.close();
		}
	}
}

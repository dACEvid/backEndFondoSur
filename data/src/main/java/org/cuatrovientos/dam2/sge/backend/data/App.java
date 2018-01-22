package org.cuatrovientos.dam2.sge.backend.data;

import org.cuatrovientos.dam2.sge.backend.data.dao.CustomerDAO;
import org.cuatrovientos.dam2.sge.backend.data.daoImpl.HibernateCustomerDAO;
import org.cuatrovientos.dam2.sge.backend.data.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello world!" );
        Customer newClient = new Customer("Miguel", "Goyena", "miguel.goyena@gmail.com");
        CustomerDAO myCustomerDAO = new HibernateCustomerDAO();
        myCustomerDAO.createCustomer(newClient);
        System.out.println("A new customer was created");
    }
}
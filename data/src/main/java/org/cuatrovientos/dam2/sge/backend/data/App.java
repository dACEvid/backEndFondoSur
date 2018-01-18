package org.cuatrovientos.dam2.sge.backend.data;

import org.cuatrovientos.dam2.sge.backend.data.model.Customer;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Customer myCustomer = new Customer("David", "Perez", "david@perez.com");
        
        //aquí tenemos que probar el método Create. Y esto es para hacer commit again
    }
}

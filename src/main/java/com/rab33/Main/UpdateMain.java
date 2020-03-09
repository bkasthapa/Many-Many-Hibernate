package com.rab33.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rab33.entity.CustomerEntity;
import com.rab33.repository.CustomerRepository;

public class UpdateMain {

	public static void main(String[] args) {

		ApplicationContext atc = new ClassPathXmlApplicationContext("application-context.xml");

		CustomerRepository csr = (CustomerRepository) atc.getBean("customerRepository");

		
		CustomerEntity cen1 = csr.getCustomerById(3);
		System.out.println("Customer is changing the name");

		cen1.setName("Donald Trump");

		csr.update(cen1);

		
		CustomerEntity cen2 = csr.getCustomerById(5);
		System.out.println("Customer is changing the name");

		cen2.setName("Barack Obama");

		csr.update(cen2);
		
		CustomerEntity cen3 = csr.getCustomerById(6);
		System.out.println("Customer is changing the name");

		cen3.setName("Bernie Sanders");

		csr.update(cen3);
		
		CustomerEntity cen4 = csr.getCustomerById(7);
		System.out.println("Customer is changing the name");

		cen4.setName("Gautam Buddha");

		csr.update(cen4);
	}

}

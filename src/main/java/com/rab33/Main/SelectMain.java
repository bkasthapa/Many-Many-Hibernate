package com.rab33.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rab33.entity.CustomerEntity;
import com.rab33.entity.OrdersEntity;
import com.rab33.repository.CustomerRepository;

public class SelectMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		CustomerRepository cr = (CustomerRepository) ctx.getBean("customerRepository");

		CustomerEntity ce1 = cr.getCustomerById(1);
		System.out.println(ce1.toString());

		for (OrdersEntity obj : ce1.getOrders()) {
			System.out.println(obj.toString());
		}

	}
}
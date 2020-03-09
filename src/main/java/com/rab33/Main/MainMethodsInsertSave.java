package com.rab33.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rab33.entity.CustomerEntity;
import com.rab33.entity.OrdersEntity;
import com.rab33.repository.CustomerRepository;
import com.rab33.repository.OrdersRepository;

public class MainMethodsInsertSave {

	public static void main(String[] args) {
		ApplicationContext atc = new ClassPathXmlApplicationContext("application-context.xml");
		OrdersRepository or = (OrdersRepository) atc.getBean("orderRepository");
		CustomerRepository cr = (CustomerRepository) atc.getBean("customerRepository");

		OrdersEntity o1 = or.getById(1);
		OrdersEntity o2 = or.getById(2);
		OrdersEntity o3 = or.getById(3);
		OrdersEntity o4 = or.getById(4);

		List<OrdersEntity> orders = new ArrayList<OrdersEntity>();
		orders.add(o1);
		orders.add(o2);
		orders.add(o3);
		orders.add(o4);

		CustomerEntity customers1 = new CustomerEntity();
		customers1.setName("Rajesh Hamal");
		customers1.setPhone_no("9779804123456");
		customers1.setTable_no("101");
		customers1.setOrderStatus("Waiting");
		customers1.setUuid(UUID.randomUUID().toString());

		CustomerEntity customers2 = new CustomerEntity();
		customers2.setName("Bhuwan K.C.");
		customers2.setPhone_no("9779846098078");
		customers2.setTable_no("111");
		customers2.setOrderStatus("Delivered");
		customers2.setUuid(UUID.randomUUID().toString());

		CustomerEntity customers3 = new CustomerEntity();
		customers3.setName("Saroj Khanal");
		customers3.setPhone_no("9779846578654");
		customers3.setTable_no("99");
		customers3.setOrderStatus("On The Way");
		customers3.setUuid(UUID.randomUUID().toString());

		customers1.setOrders(orders);
		cr.save(customers1);

		customers2.setOrders(orders);
		cr.save(customers2);

		customers3.setOrders(orders);
		cr.save(customers3);

	}

}

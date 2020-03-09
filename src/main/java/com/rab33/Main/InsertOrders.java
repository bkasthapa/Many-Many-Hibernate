package com.rab33.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rab33.entity.OrdersEntity;
import com.rab33.repository.OrdersRepository;

public class InsertOrders {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("application-context.xml");
		OrdersRepository orp = (OrdersRepository) ac.getBean("orderRepository");

		OrdersEntity oe1 = new OrdersEntity();
		oe1.setName("MoMo");
		oe1.setDescription("Spicy Chicken MoMo");
		oe1.setPrice("rs350perPlate");
		oe1.setCreated_at("2pm");

		OrdersEntity oe2 = new OrdersEntity();
		oe2.setName("Chowmin");
		oe2.setDescription("Buff Chowmin");
		oe2.setPrice("rs150perPlate");
		oe2.setCreated_at("2pm");

		OrdersEntity oe3 = new OrdersEntity();
		oe3.setName("DalBhaatThaali");
		oe3.setDescription("Nepali Style Special");
		oe3.setPrice("rs550perPlate");
		oe3.setCreated_at("2.30pm");

		OrdersEntity oe4 = new OrdersEntity();
		oe4.setName("Newari Plate");
		oe4.setDescription("Kathmandu Special");
		oe4.setPrice("rs450perPlate");
		oe4.setCreated_at("2.30pm");

		orp.save(oe1);
		orp.save(oe2);
		orp.save(oe3);
		orp.save(oe4);

	}

}

package com.rab33.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.rab33.entity.OrdersEntity;

public class OrdersRepository {

	private SessionFactory sessionFactory;

	public void save(OrdersEntity orders) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(orders);
		session.getTransaction().commit();
		session.close();
	}

	public OrdersEntity getById(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		OrdersEntity oe = (OrdersEntity) session.get(OrdersEntity.class, id);

		session.getTransaction().commit();
		session.close();

		return oe;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}

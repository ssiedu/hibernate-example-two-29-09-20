package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class QBCProjectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session=Utility.getSF().openSession();
		Criteria cr=session.createCriteria(Emp.class);
		
		Order order=Order.desc("eno");
		cr.addOrder(order);
		
		Criterion crt=Restrictions.between("eno", 1001, 1005);
		cr.add(crt);
		
		Projection proj=Projections.property("eno");
		cr.setProjection(proj);
		
		
		List<Integer> codes=cr.list();
		
		for(Integer code:codes) {
			System.out.println(code);
		}
		/*
		Projection proj=Projections.property("ename");
		cr.setProjection(proj);
		
		
		List<String> names=cr.list();
		
		for(String name:names) {
			System.out.println(name);
		}
		*/
		session.close();

	}

}

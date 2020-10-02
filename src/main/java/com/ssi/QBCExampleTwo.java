package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class QBCExampleTwo {
	public static void main(String[] args) {
		//here we are fetching all records from emp table using QBC
		
		Session session=Utility.getSF().openSession();
		Criteria cr=session.createCriteria(Emp.class);
		
		//Order order=Order.asc("sal");
		Order order1=Order.asc("sal");
		Order order2=Order.desc("ename");
		cr.addOrder(order1);
		cr.addOrder(order2);
		
		
		List<Emp> employees=cr.list();
	
	
		for(Emp employee: employees) {
			System.out.println(employee);
		}
		
		session.close();
	}
}

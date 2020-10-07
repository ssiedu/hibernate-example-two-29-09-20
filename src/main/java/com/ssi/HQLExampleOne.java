package com.ssi;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLExampleOne {

	public static void main(String[] args) {
		
		//fetching the data using HQL (Hibernate Query Language)
		
		String hql="from Emp";
		
		Session session=Utility.getSF().openSession();
		
		//to run an hql we need a Query object
		
		Query query=session.createQuery(hql);
		List<Emp> emps=query.list();
		
		for(Emp emp:emps) {
			System.out.println(emp);
		}
		
		
		
		
		session.close();
	}

}

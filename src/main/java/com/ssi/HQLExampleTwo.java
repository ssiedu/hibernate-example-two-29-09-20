package com.ssi;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLExampleTwo {
public static void main(String[] args) {
		
		//fetching the data using HQL (Hibernate Query Language)
		
		String hql="select ename,sal from Emp where sal>=50000 order by sal";
		
		Session session=Utility.getSF().openSession();
		
		//to run an hql we need a Query object
		
		Query query=session.createQuery(hql);
		List<Object[]> emps=query.list();
		
		for(Object emp[]:emps) {
			for(Object info:emp) {
				System.out.println(info);
			}
			System.out.println("_________________________________________________");
		}
		
		
		
		
		session.close();
	}
}

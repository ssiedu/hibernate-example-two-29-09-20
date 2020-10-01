package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class QBCExampleOne {

	public static void main(String[] args) {
		//here we are fetching all records from emp table using QBC
		
		Session session=Utility.getSF().openSession();
		Criteria cr=session.createCriteria(Emp.class);
		List<Emp> employees=cr.list();
	
		for(int i=0; i<employees.size(); i++) {
			Emp employee=employees.get(i);
			System.out.println(employee);
		}
		
		/*
		for(Emp employee: employees) {
			System.out.println(employee.getEno());
			System.out.println(employee.getEname());
			System.out.println(employee.getSal());
			System.out.println("__________________________________________________________");
		}
		*/
		session.close();
	}
	

}

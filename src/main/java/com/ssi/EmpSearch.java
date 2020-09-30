package com.ssi;

import org.hibernate.Session;

public class EmpSearch {

	public static void main(String[] args) {
		
		//fetching the details of emp on the basis of its eno.
		
		Session session=Utility.getSF().openSession();
		
		Emp emp=session.get(Emp.class, 113);
		System.out.println(emp);
		//System.out.println(emp.getEno());
		//System.out.println(emp.getEname());
		//System.out.println(emp.getSal());
		session.close();

	}

}

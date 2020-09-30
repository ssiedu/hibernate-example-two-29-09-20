package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpUpdate {

	public static void main(String[] args) {

		//we need to set the salary of eno 113 to 75000
		
		Emp emp=new Emp();
		emp.setEno(113);		//id of the record which needs to be changed
		emp.setSal(75000);		//the new salary 
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.update(emp);		//hibernate will generate an update command and will run it
		tr.commit();
		session.close();

		System.out.println("Record Modifed Successfully...");
	}

}

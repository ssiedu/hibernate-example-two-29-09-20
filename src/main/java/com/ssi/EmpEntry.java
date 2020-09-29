package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpEntry {

	public static void main(String[] args) {

		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Code : ");
		int code=sc.nextInt();
		System.out.println("Enter Name : ");
		String name=sc.next();
		System.out.println("Enter Salary : ");
		int sal=sc.nextInt();
		Emp emp=new Emp(code,name,sal);
		*/
		//SessionFactory sf=Utility.getSF();
		//Session session=sf.openSession();
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(new Emp(111,"AAA",50000));
		session.save(new Emp(112,"BBB",60000));
		session.save(new Emp(113,"CCC",70000));
		tr.commit();
		session.close();
		System.out.println("Record Stored Successfully..................");

	}

}

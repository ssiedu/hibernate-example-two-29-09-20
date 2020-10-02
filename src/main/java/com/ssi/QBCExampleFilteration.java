package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class QBCExampleFilteration {
	public static void main(String[] args) {
		
		Session session=Utility.getSF().openSession();
		Criteria cr=session.createCriteria(Emp.class);
		
		//Criterion crt1=Restrictions.gt("sal", 55000);		//sal>55000
		//Criterion crt1=Restrictions.ge("sal", 55000);
		//Criterion crt1=Restrictions.lt("sal", 55000);
		//Criterion crt1=Restrictions.le("sal", 55000);
		//Criterion crt1=Restrictions.eq("sal", 55000);
		//Criterion crt1=Restrictions.between("sal", 50000, 60000);
		
		Criterion crt1=Restrictions.like("ename", "S%");
		Criterion crt2=Restrictions.gt("sal", 55000);
		//Criterion crt3=Restrictions.or(crt1,crt2);
		Criterion crt3=Restrictions.and(crt1,crt2);
		Criterion crt4=Restrictions.eq("eno", 1001);
		Criterion crt5=Restrictions.or(crt3,crt4);
		cr.add(crt5);	//result of crt1,crt2 using and operator
		
		//cr.add(crt1);
		//cr.add(crt2);
		
		List<Emp> employees=cr.list();
	
	
		for(Emp employee: employees) {
			System.out.println(employee);
		}
		
		session.close();
	}
}

package com.ssi;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HQLExampleThreeDML {

	public static void main(String[] args) {

		//String hql = "update Emp set sal=sal+500";
		String hql="delete from Emp where eno=5555";
		Session session = Utility.getSF().openSession();
		Query query = session.createQuery(hql);
		Transaction tr=session.beginTransaction();
		int n=query.executeUpdate();
		tr.commit();
		System.out.println("Rows Affected : "+n);

	}

}

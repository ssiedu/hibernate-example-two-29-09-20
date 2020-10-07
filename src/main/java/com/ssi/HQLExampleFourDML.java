package com.ssi;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HQLExampleFourDML {
	public static void main(String[] args) {

		String hql = "update Emp set sal=sal+:amt where eno=:id";

		Session session = Utility.getSF().openSession();
		Query query = session.createQuery(hql);
		query.setParameter("amt", 1000);
		query.setParameter("id", 1150);
		Transaction tr=session.beginTransaction();
		int n=query.executeUpdate();
		tr.commit();
		System.out.println("Rows Affected : "+n);

	}

}

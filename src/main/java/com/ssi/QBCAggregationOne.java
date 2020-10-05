package com.ssi;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class QBCAggregationOne {

	public static void main(String[] args) {
		Session session=Utility.getSF().openSession();
		Criteria cr=session.createCriteria(Emp.class);
		
		
		Projection proj1=Projections.sum("sal");
		Projection proj2=Projections.avg("sal");
		Projection proj3=Projections.max("sal");
		Projection proj4=Projections.min("sal");
		ProjectionList pList=Projections.projectionList();
		pList.add(proj1); pList.add(proj2); pList.add(proj3); pList.add(proj4);
		
		cr.setProjection(pList);
		
		Object ar[]=(Object[])cr.uniqueResult();
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		
		/*
		Projection proj=Projections.avg("sal");
		cr.setProjection(proj);
		Double d=(Double)cr.uniqueResult();
		System.out.println(d);
		*/
		/*
		//finding sum of salaries.
		Projection proj=Projections.sum("sal");
		cr.setProjection(proj);
		Long result=(Long)cr.uniqueResult();
		System.out.println(result);
		*/
		
		session.close();
		
	}

}

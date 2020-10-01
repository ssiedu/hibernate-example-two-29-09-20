package com.ssi;


public class GDemo<E> {

	public void show(E p) {
		System.out.println(p);
	}
	
	
	
	public static void main(String args[]) {
		
		GDemo<String> ob1=new GDemo<String>();
		ob1.show("abc");
		
		
		GDemo<Integer> ob2=new GDemo<Integer>();
		ob2.show(10);
		
		
	}
}

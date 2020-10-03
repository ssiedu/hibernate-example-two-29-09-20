package com.ssi;

import java.util.ArrayList;
import java.util.List;

public class ObjectArrayListExample {

	public static void main(String[] args) {
		

		//suppose we need to store eno and name both for some employees in a list.
		
		Object ar1[]= {1001,"ab"};
		Object ar2[]= {1002,"cd"};
		Object ar3[]= {1003,"ef"};
		
		List<Object[]> info=new ArrayList<Object[]>();
		info.add(ar1); info.add(ar2); info.add(ar3);
		
		for(Object data[]:info) {
			
			for(Object element:data) {
				System.out.println(element);
			}
			System.out.println("_________________________________");
		}
		
		
		
		
		
		/*
		//suppose you wish to store enos in list
		
		List<Integer> info=new ArrayList<Integer>();
		info.add(1001);
		info.add(1002);
		info.add(1003);
		for(Integer code:info) {
			System.out.println(code);
		}
		*/
		
		/*
		//suppose you wish to store names of employees in a list.
		List<String> info=new ArrayList<String>();
		info.add("ab");
		info.add("cd");
		info.add("ef");
		
		
		for(String name:info) {
			System.out.println(name);
		}
		*/

	}

}

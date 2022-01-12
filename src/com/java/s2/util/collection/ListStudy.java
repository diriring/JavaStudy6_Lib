package com.java.s2.util.collection;

import java.util.ArrayList;

public class ListStudy {
	
	private final int NUM = 1;
	
	public void study3() {
		//ArrayList<E> 변수명 = new ArrayList<E>();
		//E -> 모을 변수 타입
		//ArrayList는 object type을 모은다
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(1);
		
		ArrayList<String> ar3 = new ArrayList<String>();
		
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
//		ar.add('b');
//		ar.add(3.12);
//		ar.add("abc");
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		int num = ar.get(0) ;
		//String name = (String)ar.get(3);
	}
	
	public void study1() {
		ArrayList ar = new ArrayList(); //기본 10칸 추가하면 계속 늘어남
		
		ar.add(1); //object type(reference type)만 들어갈 수 있는데 autoBoxing 된 것
		ar.add(2);
		ar.add(3);
		ar.add(1, 100);
		ar.add("name");
		
		//System.out.println(ar.get(0));
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}

}

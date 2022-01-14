package com.java.s4.calender;

import java.util.Calendar;

public class CalendarStudy4 {

	public static void main(String[] args) {
		//현재시간
		//내가 태어난 날
		//태어난지 몇일이 흘렀는지, 나이 계산
		
		Calendar ca = Calendar.getInstance();
		long now =  ca.getTimeInMillis();
		
		Calendar ca2 = Calendar.getInstance();
		ca2.set(1997, 10, 3);
		//System.out.println(ca2.getTime());
		long birth = ca2.getTimeInMillis();
		
		long result = now - birth;
		int days = (int)(result/(1000*60*60*24));
		System.out.println(days);
		double age =days/365.25;
		System.out.println(age);

	}

}

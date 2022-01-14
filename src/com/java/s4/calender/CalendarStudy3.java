package com.java.s4.calender;

import java.util.Calendar;

public class CalendarStudy3 {

	public static void main(String[] args) {
		//현재 시간 -> 밀리세컨즈
		Calendar ca = Calendar.getInstance();
		long now =  ca.getTimeInMillis();
		//2시간 뒤 시간 -> 밀리세컨즈
		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.HOUR_OF_DAY, 17);
		long future = ca2.getTimeInMillis();
		
		long result = future - now;
		//둘의 시간차 출력
		System.out.println(result);
		System.out.println(result/(1000*60*60));;
		
		
	}

}

package com.java.s4.calender;

import java.util.Calendar;

public class CalendarStudy2 {

	public static void main(String[] args) {
		//현재 시간
		Calendar ca = Calendar.getInstance(); //추상클래스이기때문에 생성자 x, getinstance method 사용
		System.out.println(ca.getTime());
		//시간 변경
		Calendar ca2 = Calendar.getInstance();
		System.out.println(ca2.getTime());
		
		ca2.set(Calendar.YEAR, 2023);
		ca2.set(Calendar.DATE, 15);
		ca2.set(Calendar.MONTH, 1); //주의
		System.out.println(ca2.getTime());
	}

}

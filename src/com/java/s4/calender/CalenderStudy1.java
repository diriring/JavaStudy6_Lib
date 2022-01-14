package com.java.s4.calender;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalenderStudy1 {

	public static void main(String[] args) {
		// Calendar는 추상클래스
		// GregorianCalendar 가 Calendar 클래스 상속
		// Calendar에 있는 메서드는 GregorianCalendar에 있다
		
		//현재 날짜와 시간정보를 가지는 객체를 생성
		GregorianCalendar gc = new GregorianCalendar();
		Calendar calendar = new GregorianCalendar();
		
		Calendar ca = Calendar.getInstance();
		//getInstance() : 자기 자신의 객체를 return
		
		
		int y = ca.get(Calendar.YEAR);
		int m = ca.get(Calendar.MONTH);
		int d = ca.get(Calendar.DATE);
		int h = ca.get(Calendar.HOUR);
		int hh = ca.get(Calendar.HOUR_OF_DAY);
		int min = ca.get(Calendar.MINUTE);
		int s = ca.get(Calendar.SECOND);
		int ms = ca.get(Calendar.MILLISECOND);
		
		long millis = ca.getTimeInMillis();
		
		Date date = ca.getTime();
		
		
		System.out.println("Y : " + y);
		System.out.println("M : " + (m+1)); //주의
		System.out.println("D : " + d);
		System.out.println("H : " + h);
		System.out.println("H : " + hh);
		System.out.println("Min : " + min);
		System.out.println("S : " + s);
		System.out.println("MS : " + ms);
		System.out.println("Millis : " + millis);
		
		System.out.println(date);
		
		
//		System.out.println(gc);
//		System.out.println(calendar);
//		System.out.println(ca);
		
	}

}

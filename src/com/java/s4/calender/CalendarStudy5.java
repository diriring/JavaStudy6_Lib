package com.java.s4.calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarStudy5 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		//카카오 택시 30분 소요 예정 -> 도착 예정 시간은?
		long time = ca.getTimeInMillis();
		time = time + (1000*60*30);
		ca.setTimeInMillis(time);
		System.out.println(ca.getTime());
		
		ca.roll(Calendar.MINUTE, 30);
		//지정된 것만 넘어감, ex) 분을 70 돌려도 시간 바뀌지 않고 분만 돌아감
		System.out.println(ca.getTime());
		
		ca.add(Calendar.MINUTE, 70);
		System.out.println(ca.getTime());
		
		String pattern = "yyyy년MM월dd일 - HH:mm:ss";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		String r = sd.format(ca.getTime());
		System.out.println(r);
		
		pattern = "yyyy-MM-dd (E)";
		sd.applyPattern(pattern);
		System.out.println(sd.format(ca.getTime()));

	}

}

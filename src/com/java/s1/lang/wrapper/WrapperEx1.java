package com.java.s1.lang.wrapper;

import java.util.Scanner;

public class WrapperEx1 {
	
	private Scanner sc;

	public void ex2() {
		this.sc = new Scanner(System.in);
		System.out.println("주민번호를 입력해주세요");
		String idNum = sc.next();
		String [] nums = idNum.split("-");
		String ver = "234567892345";
		
		int t1 = 0;
		int count = 0;
		for(int i=0;i<nums[0].length();i++) {
			count = Integer.parseInt(nums[0].substring(i,i+1)) * Integer.parseInt(ver.substring(i,i+1));
			t1 = t1 + count;
		}
		int t2 = 0;
		for(int i=0;i<6;i++) {
			count = Integer.parseInt(nums[1].substring(i,i+1)) * Integer.parseInt(ver.substring(i+6,i+7));
			t2 = t2 + count;
		}

		int result = 11 - ((t1 + t2)%11);
		if(result>=10) {
			result = result/10;
		}
		
		if(result == Integer.parseInt(nums[1].substring(6, 7))) {
			System.out.println("유효한 주민번호입니다");
		}else {
			System.out.println("잘못된 주민번호입니다");
		}
		
		

	}
	public void ex1() {
		this.sc = new Scanner(System.in);
		System.out.println("주민번호를 입력해주세요");
		String idNum = sc.next();
		String [] nums = idNum.split("-");
		
		int birth = Integer.parseInt(nums[0].substring(0,2));
		int month = Integer.parseInt(nums[0].substring(2, 4));
		int gender = Integer.parseInt(nums[1].substring(0, 1));
		
//		System.out.println(birth);
//		System.out.println(gender);
		
		if(gender <= 2) {
			System.out.println("만 " + (2022 - (1900 + birth)) + "세");	
		}
		
		if(gender >= 3) {
			System.out.println("만 " + (2022 - (2000 + birth)) + "세");
		}
		
		
		if(gender%2 == 1) {
			
			System.out.println("남성");
			
		}else if(gender%2 == 0) {
			
			System.out.println("여성");
			
			}
		
		switch (month) {
        case 1, 2, 12:  System.out.println("겨울 출생");
                 break;
        case 3, 4, 5:  System.out.println("봄 출생");
                 break;
        case 6, 7, 8:  System.out.println("여름 출생");
                 break;
        case 9, 10, 11:  System.out.println("가을 출생");
                 break;
		
		}

	}

}

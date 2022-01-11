package com.java.s1.lang.wrapper;

import java.util.Scanner;

public class WrapperEx1 {
	
	Scanner sc = new Scanner(System.in);

	public void ex2() {
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
		System.out.println("주민번호를 입력해주세요");
		String idNum = sc.next();
		String [] nums = idNum.split("-");
		
		int birth = Integer.parseInt(nums[0].substring(2, 4));
		int gender = Integer.parseInt(nums[1].substring(0, 1));
		
//		System.out.println(birth);
//		System.out.println(gender);
		
		if(gender == 1 || gender == 3) {
			
			System.out.println("남성");
			
			switch (birth) {
            case 1:  System.out.println("1월 : 겨울 출생");
                     break;
            case 2:  System.out.println("2월 : 겨울 출생");
                     break;
            case 3:  System.out.println("3월 : 봄 출생");
                     break;
            case 4:  System.out.println("4월 : 봄 출생");
                     break;
            case 5:  System.out.println("5월 : 봄 출생");
                     break;
            case 6:  System.out.println("6월 : 여름 출생");
                     break;
            case 7:  System.out.println("7월 : 여름 출생");
                     break;
            case 8:  System.out.println("8월 : 여름 출생");
                     break;
            case 9:  System.out.println("9월 : 가을 출생");
                     break;
            case 10: System.out.println("10월 : 가을 출생");
                     break;
            case 11: System.out.println("11월 : 가을 출생");
                     break;
            case 12: System.out.println("12월 : 겨울 출생");
                     break;
			}
			
		}else if(gender == 2 || gender == 4) {
			
			System.out.println("여성");
			
			switch (birth) {
            case 1:  System.out.println("1월 : 겨울 출생");
                     break;
            case 2:  System.out.println("2월 : 겨울 출생");
                     break;
            case 3:  System.out.println("3월 : 봄 출생");
                     break;
            case 4:  System.out.println("4월 : 봄 출생");
                     break;
            case 5:  System.out.println("5월 : 봄 출생");
                     break;
            case 6:  System.out.println("6월 : 여름 출생");
                     break;
            case 7:  System.out.println("7월 : 여름 출생");
                     break;
            case 8:  System.out.println("8월 : 여름 출생");
                     break;
            case 9:  System.out.println("9월 : 가을 출생");
                     break;
            case 10: System.out.println("10월 : 가을 출생");
                     break;
            case 11: System.out.println("11월 : 가을 출생");
                     break;
            case 12: System.out.println("12월 : 겨울 출생");
                     break;
			}
		
		}

	}

}

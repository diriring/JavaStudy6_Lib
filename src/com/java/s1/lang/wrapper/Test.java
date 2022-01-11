package com.java.s1.lang.wrapper;

public class Test {

	public static void main(String[] args) {
	
			String idNum = "971103-1234567";
			String [] nums = idNum.split("-");
			String ver = "234567892345";
			
			int t1 = 0;
			int count = 0;
			for(int i=0;i<nums[0].length();i++) {
				count = Integer.parseInt(nums[0].substring(i,i+1)) * Integer.parseInt(ver.substring(i,i+1));
				
				t1 = t1 + count;
				System.out.println(Integer.parseInt(nums[0].substring(i,i+1)));
				System.out.println(Integer.parseInt(ver.substring(i,i+1)));
				System.out.println(count);
				System.out.println(t1);
			}
			int t2 = 0;
			for(int i=0;i<6;i++) {
				count = Integer.parseInt(nums[1].substring(i,i+1)) * Integer.parseInt(ver.substring(i+6,i+7));
				t2 = t2 + count;
				
				System.out.println(Integer.parseInt(nums[1].substring(i,i+1)));
				System.out.println(Integer.parseInt(ver.substring(i+6,i+7)));
				System.out.println(count);
				System.out.println(t2);
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

}

package com.java.s4.exception;

public class ExceptionMain2 {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 10;
		int result = 0;
		try {
			result = num2/num1;
		}catch(Exception exception) {
			//세부적인 컨트롤 작성은 어려움; 모든 예외를 한꺼번에 받기 때문
			
			exception.printStackTrace();
			
			System.out.println("cannot devided by 0;");
			num1 = 1;
		}
		
		result = num2/num1;
		System.out.println(result);

	}

}

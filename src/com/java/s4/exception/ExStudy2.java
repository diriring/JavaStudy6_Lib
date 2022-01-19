package com.java.s4.exception;

public class ExStudy2 {
	
	public void ex1() throws ChildException {
		int num = 70;
		int num2 = 50;
		int num3 = num + num2;
		int num4 = num2 - num;
		try {
			if(num3 > 99) {
			throw new ChildException("3자리수 안됨");
			}
			
			if(num4 < 0) {
				throw new ChildException("음수 안됨");
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Message : " + e.getMessage());
		}
//		catch(ChildException childexception) {
//			
//		}
		
	}

}

package com.java.s4.exception;

import java.util.InputMismatchException;

public class ExceptionMain3 {

	public static void main(String[] args) {
		ExStudy1 e1 = new ExStudy1();
		try {
			e1.ex1();	
		}catch(InputMismatchException e) {
			
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

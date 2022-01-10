package com.java.s1.lang.object;

public class ObjectMain {

	public static void main(String[] args) {
		ObjectStudy1 os1 = new ObjectStudy1();
		os1.study1();
		
		Car car = new Car();
		car.toString(); //object 타입이다
		
		FireCar fc = new FireCar();
		fc.hashCode(); //object 타입이다
		
		boolean check = car.equals(fc);
		System.out.println(check);
	}

}

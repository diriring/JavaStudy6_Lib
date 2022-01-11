package com.java.s1.lang.stringBuffer;

public class StringBufferMain {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("iu");
		sb.append("Lee");
		System.out.println(sb.toString());
		
		String name = "iu";
		String name2 = "lee";
		name = name+name2;
		System.out.println(name);
		
		//name = sb; //타입이 다르기 때문
		name = sb.toString();

	}

}

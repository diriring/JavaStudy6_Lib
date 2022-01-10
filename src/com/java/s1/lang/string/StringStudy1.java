package com.java.s1.lang.string;

import java.util.Scanner;

public class StringStudy1 {
	Scanner sc = new Scanner(System.in);
	public void subStringEx1() {
		//키보드로부터 업로드할 파일명을 입력
		//a.txt, b.pdf, iu.jpg
		//jpg, gif, png -> 이미지 파일입니다 출력
		//mp3, wav, ogg -> 음원 파일입니다 출력
		//나머지는 알 수 없는 파일입니다 출력
		System.out.println("파일명을 입력하세요");
		String file = sc.next();
		
		String str = file.substring(file.lastIndexOf(".")+1);
		System.out.println(str);
		
		if(str.equals("jpg") || str.equals("gif") || str.equals("png")) {
			System.out.println("이미지 파일입니다");
		}else if(str.equals("mp3") || str.equals("wav") || str.equals("ogg")) {
			System.out.println("음원 파일입니다");
		}else if(str.equals("pdf") || str.equals("txt") || str.equals("hwp")) {
			System.out.println("문서 파일입니다");
		}else {
			System.out.println("알 수 없는 파일입니다");
		}
		
		
	}
	
	public void subStringTest() {
		String title = "West Side Story";
		String result = title.substring(5);
		System.out.println(result);
		result = title.substring(5, 9);
		System.out.println(result);
	}
	
	public void lengthTest() {
		String title = "West Side Story";
		int len = title.length();
		//System.out.println(len);
		
		String find = "S";
		
		int count = 0;
		for(int i=0; i<title.length(); i++) {
			int index = title.indexOf(find, i);
			if(index >= 0 ) {
				count++;
				i = index;
			}else {
				break;
			}
			
		}
		
		System.out.println(count);
		
	
//		for(int i=0; i<len; i++) {
//			System.out.println(title.charAt(i));
		
//		}
		
		
	}
	
	public void indexOfTest() {
		String msg = "Hello World";
		//indexOf 호출
		
		System.out.println(msg.indexOf('W'));
		System.out.println(msg.indexOf("o", 8));
	}
	
	public void equalTest() {
		
		//문자열 선언의 두가지 방법
		String str = "nell";
		String str2 = "nell";
		String str3 = new String("nell");
		String str4 = new String("nell");
		
		System.out.println("str : " + str);
		System.out.println("str2 : " + str2);
		//주소를 비교
		System.out.println(str == str2); //
		System.out.println(str3 == str4);
		System.out.println(str == str3);
		System.out.println();
		//객체의 실제값을 비교
		System.out.println(str.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str.equals(str3));
		
	}
	
	public void study1() {
		String name = "hello";
		String name2 = new String("hello2");
		
		System.out.println(name);
		int i = 1;
		System.out.println(name.charAt(i));
	}

}

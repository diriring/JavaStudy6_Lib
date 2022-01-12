package com.java.s3.ex1;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {
		//test, 프로그램 실행
		MemberData memberData = new MemberData();
		ArrayList<MemberDTO> arr = new ArrayList<>();
		arr = memberData.init();

	}

}

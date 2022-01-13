package com.java.s3.ex1.member;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {
		//test, 프로그램 실행
		MemberData memberData = new MemberData();
		
		ArrayList<MemberDTO> arr = new ArrayList<>();
		
		arr = memberData.init();
		//memberData.addMember(arr);
		MemberDTO memberDTO = memberData.RemoveMember(arr);
		if(memberDTO != null) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
		
		for(int i=0;i<arr.size();i++) {
			System.out.println("아이디 : " + arr.get(i).getId());
			System.out.println("패스워드 : " + arr.get(i).getPw());
			System.out.println("이름 : " + arr.get(i).getName());
			System.out.println("이메일 : " + arr.get(i).getEmail());
			System.out.println("나이 : " + arr.get(i).getAge());
			
			System.out.println("========================================");
		}
	}

}

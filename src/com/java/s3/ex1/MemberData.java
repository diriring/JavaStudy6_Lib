package com.java.s3.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberData {
	
	private String data;
	private Scanner sc;
	
	//기본생성자 선언
	public MemberData() {
		this.sc = new Scanner(System.in);
		this.data = "id1-pw1-name1-id1@gmail.com-20-";
		this.data = this.data + "id2 - pw2 - name2 - name2@naver.com-42-";
		this.data = this.data + "id3 - pw3 - name3 - name3@naver.com-36-";
		this.data = this.data + "id4 - pw4 - name4 - name4@naver.com-17";
		System.out.println(this.data);
	}
	
	public MemberDTO RemoveMember(ArrayList<MemberDTO> arr) {
		//삭제하고싶은 id를 입력받음
		//ArrayList에서 똑같은 id를 가진 MemberDTO를 찾아 삭제
		//
		MemberDTO memberDTO = null;
		
		System.out.println("삭제할 학생의 id 입력");
		String delId = sc.next();
		
		for(int i=0;i<arr.size();i++) {
			if(delId.equals(arr.get(i).getId())) {
				memberDTO = arr.remove(i);
				break;
			}
		}
		
		return memberDTO;
	}
	
	public void addMember(ArrayList<MemberDTO> arr) {
		
		//키보드로부터 새로 추가할 MemberDTO 생성
		//키보드로부터 id, pw, name, email, age 입력받아서
		//MemberDTO의 멤버변수 값으로 대입
		//매개변수로 받은 arr에 MemberDTO 추가
		MemberDTO newMember = new MemberDTO();
		System.out.println("id 입력");
		newMember.setId(sc.next());
		System.out.println("pw 입력");
		newMember.setPw(sc.next());
		System.out.println("name 입력");
		newMember.setName(sc.next());
		System.out.println("email 입력");
		newMember.setEmail(sc.next());
		System.out.println("나이 입력");
		newMember.setAge(sc.nextInt());
		
		arr.add(newMember);
		
	}
	
	public ArrayList<MemberDTO> init() {
		//Data에 있는 문자열을 StringTokenizer로 파싱해서
		//MemberDTO를 생성해서 멤버변수값으로 대입
		//MemberDTO를 ArrayList에 담아서 리턴
		
		System.out.println(this.data);
		StringTokenizer st = new StringTokenizer(this.data, "-");
		
		ArrayList<MemberDTO> arr = new ArrayList<MemberDTO>();
		
		while(st.hasMoreTokens()) {
			
			MemberDTO memberDTO = new MemberDTO();
			
			String token = st.nextToken();
			memberDTO.setId(token.trim());
			
			token = st.nextToken();
			memberDTO.setPw(token.trim());
			
			token = st.nextToken();
			memberDTO.setName(token.trim());
			
			token = st.nextToken();
			memberDTO.setEmail(token.trim());
			
			token = st.nextToken();
			memberDTO.setAge(Integer.parseInt(token.trim()));
			
			arr.add(memberDTO);
			
		}


		return arr;	
	}
	
}

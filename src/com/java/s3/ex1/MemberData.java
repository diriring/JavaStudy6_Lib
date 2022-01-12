package com.java.s3.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MemberData {
	
	private String data;
	
	//기본생성자 선언
	public MemberData() {
		this.data = "id1-pw1-name1-id1@gmail.com-20-";
		this.data = this.data + "id2 - pw2 - name2 - name2@naver.com-42-";
		this.data = this.data + "id3 - pw3 - name3 - name3@naver.com-36-";
		this.data = this.data + "id4 - pw4 - name4 - name4@naver.com-17";
		System.out.println(this.data);
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

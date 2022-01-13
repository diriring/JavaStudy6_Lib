package com.java.s3.ex1.student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.java.s3.ex1.member.MemberDTO;

public class StudentData {
	
	Scanner sc;
	
	public StudentData() {
		sc = new Scanner(System.in);
	}
	
	public Map<String, StudentDTO> addStudent(List<MemberDTO> ar) {
		//멤버의 수만큼 성적 정보 입력
		//이 정보들을 StudentDTO에 대입
		//map의 키는 id
		
		HashMap<String, StudentDTO> map = new HashMap<>();	
		
		
		
		for(int i=0;i<ar.size();i++) {
			
			StudentDTO studentDTO = new StudentDTO();
			
			System.out.println("국어 점수 입력");
			studentDTO.setKor(sc.nextInt());
			System.out.println("영어 점수 입력");
			studentDTO.setEng(sc.nextInt());
			System.out.println("수학 점수 입력");
			studentDTO.setMath(sc.nextInt());
			studentDTO.setTotal();
			studentDTO.setAvg();
			studentDTO.setName(ar.get(i).getName());
			studentDTO.setId(ar.get(i).getId());
			
//			System.out.println(studentDTO.getName());
//			System.out.println(studentDTO.getId());
//			System.out.println(studentDTO.getKor());
//			System.out.println(studentDTO.getMath());
//			System.out.println(studentDTO.getEng());
			
			map.put(studentDTO.getId(), studentDTO);
		}
		
		return map;
		
	}

}

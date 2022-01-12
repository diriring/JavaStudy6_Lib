package com.java.s3.ex2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentData {
	
	private String info;
	private Scanner sc;
	
	public StudentData() {
		
		this.sc = new Scanner(System.in);
		this.info = "name1, 1, 15, 50, 60,";
		this.info = this.info + "name2, 2, 52,68, 40,";
		this.info = this.info + "name3, 3, 8, 87, 75,";
		
	}
	
	//학생들의 정보를 파싱해서 총점과 평균도 계산 후 전체 출력
	//학생의 정보를 추가
	//학생의 정보를 삭제
	
	public ArrayList<StudentDTO> makeStudent() {
		ArrayList<StudentDTO> arr = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(info, ",");
		
		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			
			studentDTO.setName(st.nextToken().trim());
			studentDTO.setNum(Integer.parseInt(st.nextToken().trim()));
			studentDTO.setKor(Integer.parseInt(st.nextToken().trim()));
			studentDTO.setEng(Integer.parseInt(st.nextToken().trim()));
			studentDTO.setMath(Integer.parseInt(st.nextToken().trim()));
			studentDTO.setTotal();
			studentDTO.setAvg();
			
			arr.add(studentDTO);
		}
				
		return arr;
	}
	
	public void viewStudent(ArrayList<StudentDTO> arr) {
		
		System.out.println("학생 정보를 출력합니다");
		
		for(int i=0;i<arr.size();i++) {
			System.out.println("이름 : " + arr.get(i).getName());
			System.out.println("번호 : " + arr.get(i).getNum());
			System.out.println("국어 : " + arr.get(i).getKor());
			System.out.println("영어 : " + arr.get(i).getEng());
			System.out.println("수학 : " + arr.get(i).getMath());
			System.out.println("총점 : " + arr.get(i).getTotal());
			System.out.println("평균 : " + arr.get(i).getAvg());
			System.out.println("========================================");
		}
	}
	
	public void addStudent(ArrayList<StudentDTO> arr) {
		StudentDTO newStudent = new StudentDTO();
		
		System.out.println("이름 입력");
		newStudent.setName(sc.next());
		System.out.println("번호 입력");
		newStudent.setNum(sc.nextInt());
		System.out.println("국어점수 입력");
		newStudent.setKor(sc.nextInt());
		System.out.println("영어점수 입력");
		newStudent.setEng(sc.nextInt());
		System.out.println("수학점수 입력");
		newStudent.setMath(sc.nextInt());
		newStudent.setTotal();
		newStudent.setAvg();
		
		arr.add(newStudent);
		
	}
	
	public StudentDTO removeStudent(ArrayList<StudentDTO> arr) {
		
		StudentDTO studentDTO = new StudentDTO();
		
		System.out.println("삭제할 학생의 번호를 입력하세요");
		int delNum = sc.nextInt();
		
		for(int i=0;i<arr.size();i++) {
			if(delNum == arr.get(i).getNum()) {
				studentDTO = arr.remove(i);
				System.out.println("삭제성공");
				break;
			}
		}
		
		return studentDTO;
	}

}

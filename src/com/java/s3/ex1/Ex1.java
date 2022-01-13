package com.java.s3.ex1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.java.s3.ex1.member.MemberDTO;
import com.java.s3.ex1.member.MemberData;
import com.java.s3.ex1.student.StudentDTO;
import com.java.s3.ex1.student.StudentData;


public class Ex1 {

	public static void main(String[] args) {

		MemberData memberData = new MemberData();
		StudentData studentData = new StudentData();
		
		ArrayList<MemberDTO> ar = memberData.init();
		
		Map<String, StudentDTO> map = studentData.addStudent(ar);
		
		Set<String> keys = map.keySet();
		Iterator<String> k = keys.iterator();

		while(k.hasNext()) {
			String key = k.next();
			StudentDTO studentDTO = map.get(key);
			System.out.println("key : " + key);
			System.out.println("id : " + studentDTO.getId()); 
			System.out.println("name : " + studentDTO.getName());
			System.out.println("kor : " + studentDTO.getKor());
			System.out.println("eng : " + studentDTO.getEng());
			System.out.println("math : " + studentDTO.getMath());
			System.out.println("total : " + studentDTO.getTotal());
			System.out.println("avg : " + studentDTO.getAvg());
		}
	}

}

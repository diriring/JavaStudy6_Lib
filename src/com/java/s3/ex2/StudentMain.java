package com.java.s3.ex2;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		StudentData sd = new StudentData();
		
		ArrayList<StudentDTO> arr = new ArrayList<>();
		
		arr = sd.makeStudent();
		sd.viewStudent(arr);

	}

}

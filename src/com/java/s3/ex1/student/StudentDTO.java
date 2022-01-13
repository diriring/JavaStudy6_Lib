package com.java.s3.ex1.student;

public class StudentDTO {
	
	private String id;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = kor + eng + math;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = total/3.0;
	}
	
	

}

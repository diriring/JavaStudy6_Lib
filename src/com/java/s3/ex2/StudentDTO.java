package com.java.s3.ex2;

public class StudentDTO {
	
	private String name;
	private int num;
	private int kor;
	private int eng;
	private int math;
	private int total = kor + eng + math;
	private double avg = total/3.0;
	
	public void setTotal() {
		this.total = kor + eng + math;
	}
	public int getTotal() {
		return total;
	}
	public void setAvg() {
		this.avg = this.total/3.0;
	}
	public double getAvg() {
		return avg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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

}

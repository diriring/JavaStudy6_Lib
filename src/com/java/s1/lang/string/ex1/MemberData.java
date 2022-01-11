package com.java.s1.lang.string.ex1;

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
	
	public MemberDTO [] init() {
		String [] str = this.data.split("-");
		MemberDTO [] members = new MemberDTO[str.length/5];
		
		for(int i=0;i<members.length;i++) {
			
			MemberDTO mem = new MemberDTO();
			
			mem.setId(str[0 + 5*i].trim());
			mem.setPw(str[1 + 5*i].trim());
			mem.setName(str[2 + 5*i].trim());
			mem.setEmail(str[3 + 5*i].trim());
			mem.setAge(Integer.parseInt(str[4 + 5*i].trim()));
			
			members[i] = mem;
		}
		for(int i=0;i<members.length;i++) {
			System.out.println("name : " + members[i].getName());
			System.out.println("id : " + members[i].getId());
			System.out.println("pw : " + members[i].getPw());
			System.out.println("email : " + members[i].getEmail());
			System.out.println("age : " + members[i].getAge());
			System.out.println("=======================================");
		}
		return members;	
	}
	
}

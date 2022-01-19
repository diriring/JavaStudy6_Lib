package com.java.s5.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		System.out.println("Client 입니다");
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket("172.30.1.59", 8282);
			System.out.println("서버와 접속이 성공");
			System.out.println("서버로 보낼 메세지 입력");
			String message = sc.nextLine();
			System.out.println(message);
			
			//1.output Stream을 구해오기
			OutputStream os = socket.getOutputStream(); //byte(bit)처리
			OutputStreamWriter osw = new OutputStreamWriter(os); //char 처리
			BufferedWriter bw = new BufferedWriter(osw);
			//전송 준비 끝
			
			//2. 전송
			bw.write(message + "\r\n");
			//강제로 버퍼 비우기
			bw.flush();
			
			System.out.println("Server에서 message 입력 중 ...");
			
			InputStream is = socket.getInputStream(); //0,1처리
			InputStreamReader isr = new InputStreamReader(is); //char
			BufferedReader br = new BufferedReader(isr); //String
			
			message = br.readLine();
			
			System.out.println("Server : " + message);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

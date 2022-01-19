package com.java.s5.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) {
		System.out.println("Server 입니다");
		ServerSocket serverSocket = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("접속을 기다리는 중 ...");
			serverSocket = new ServerSocket(8282); //접속준비
			socket = serverSocket.accept(); //client
			System.out.println("접속한 Client와 1:1 연결 완료");
			
			//
			InputStream is = socket.getInputStream(); //0,1처리
			InputStreamReader isr = new InputStreamReader(is); //char
			BufferedReader br = new BufferedReader(isr); //String
			
			String message = br.readLine();
			
			System.out.println("Client : " + message);
			
			System.out.println("Client로 보낼 message 입력");
			
			message = sc.nextLine();
			//System.out.println(message);
			
			//1.output Stream을 구해오기
			OutputStream os = socket.getOutputStream(); //byte(bit)처리
			OutputStreamWriter osw = new OutputStreamWriter(os); //char 처리
			BufferedWriter bw = new BufferedWriter(osw);
			//2. 전송
			bw.write(message + "\r\n");
			//강제로 버퍼 비우기
			bw.flush();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

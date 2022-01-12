package com.java.s2.util.token;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		String str = "봄, 16, 여름, 32, 가을, 20, 겨울, -15";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		ArrayList<SeasonDTO> arr = new ArrayList<SeasonDTO>();
		
		while(st.hasMoreTokens()) {
			SeasonDTO seasonDTO = new SeasonDTO();
			String token = st.nextToken();
			seasonDTO.setName(token.trim());
			
			token = st.nextToken();
			seasonDTO.setTemp(Integer.parseInt(token.trim()));
			
			arr.add(seasonDTO);
			
//			System.out.println(seasonDTO.getName());
//			System.out.println(seasonDTO.getTemp());
		}
		
		for(int i=0;i<arr.size();i++) {
			System.out.println("계절 : " + arr.get(i).getName());
			System.out.println("기온 : " + arr.get(i).getTemp());
		}

	}

}

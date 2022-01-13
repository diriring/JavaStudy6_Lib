package com.java.s2.util.collection;

import java.util.HashMap;

public class MapStudy {
	public void study1() {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("f1", 1);
		map.put("f2",2);
		map.put("f3", 1);
		
		System.out.println(map);
		int num = map.get("f1");
		System.out.println(num);
		//없는 키로 꺼내면 null이 출력
		map.remove("f3");
		System.out.println(map);
	}

}

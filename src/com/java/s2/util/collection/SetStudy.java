package com.java.s2.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetStudy {
	
	public void study4() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		//hs.get 불가능
		
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext()) {
			int num = it.next();
			System.out.println(num);
			
		}
		
	}
	
	public void study3() {
		Random random = new Random();
		
		HashSet<Integer> lotto = new HashSet<>();
		
		while (lotto.size()<6) {
			lotto.add(random.nextInt(44)+1);
		}

		System.out.println(lotto);
	}
	
	public void study2() {
		//Random
		Random random = new Random();
		int num = random.nextInt(10); //0~10미만의 랜덤한 정수
		
		//lotto 번호 생성
		//랜덤 1-45 6개를 모두 뽑고 List에 담아 한꺼번에 출력
		//ArrayList를 사용하면서도 중복된 번호가 나오지않게 하려면?
		ArrayList<Integer> lotto = new ArrayList<>();
		
		for(int i=0;i<6;i++) {
			lotto.add(random.nextInt(44)+1);
		}

		System.out.println(lotto);
	
	}
	
	public void study1() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(1); //중복 허용 x
		hs.remove(2);
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(100);
		ar.add(200);
		ar.add(100); //중복 허용
		
		System.out.println(ar);
		System.out.println(hs);
		System.out.println(hs.size());
	}

}

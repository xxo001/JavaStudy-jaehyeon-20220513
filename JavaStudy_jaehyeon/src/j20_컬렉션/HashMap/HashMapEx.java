package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

import lombok.val;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
		
		//값 추가
		studentMap.put(1, "김재현1");
		studentMap.put(2, "김재현2");
		studentMap.put(3, "김재현3");
		studentMap.put(4, "김재현4");
		studentMap.put(5, "김재현5");
		studentMap.put(6, "김재현6");
		studentMap.put(7, "김재현7");
			
		System.out.println(studentMap);
		
		//key로 값 가져오기
		System.out.println(studentMap.get(1));
		
		
		//값 수정하기
		studentMap.put(1, "김재현10"); //값이없으면, 추가해버림
		studentMap.replace(1,"김재현10"); //값이없으면, 수정하지않음
		
		//값 삭제하기
		studentMap.remove(1);
		
		//값이 들어있는지 확인 하기
		System.out.println(studentMap.containsKey(2));
		System.out.println(studentMap.containsValue("김재현2"));
		
		//조건에 맞는 값 가져오기
		Iterator<Integer> iterator = studentMap.keySet().iterator();
		while(iterator.hasNext()){
			int key = iterator.next();
			String value = studentMap.get(key);
//			if(value.equals("김재현7")) {
//				System.out.println(studentMap.get(key));
//			}
			System.out.println(value);
		}
				
		//조건에 맞는 값 가져오기 2  **람다식**
		studentMap.forEach((k, v) -> {
			System.out.println("key : " + k );
			System.out.println("value : " + v);
			});
		
		
	}
}

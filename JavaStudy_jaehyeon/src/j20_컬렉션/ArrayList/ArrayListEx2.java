package j20_컬렉션.ArrayList;

import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> nameList2 = new ArrayList<String>();
		
		//리스트에 값 추가 add()
		nameList.add("김재현");
		nameList.add("김재현1");
		nameList.add("김재현2");
		nameList.add("김재현3");
		nameList.add("김재현4");
		nameList.add("김재현5");
		nameList.add("김재현6");
		nameList.add("김재현7");
		nameList.add("김재현8");
		nameList.add("김재현9");
		
		//리스트 중간에 값 추가 add()
		nameList.add(0, "김재현10");
		
		//리스트 내의 해당 인덱스 값 수정
		nameList.set(1, "수정");
		
		//리스트 내에서 인덱스로 값 삭제
		nameList.remove(3);
		
		//리스트 내에서 값을 바로 삭제
		nameList.remove("김재현9");
		
		//리스트1에서 리스트2로 값 옮기기
		nameList2.addAll(nameList);
		
		//리스트의 모든 값 확인 toString()  --> 모든 컬렉션에 Override되어 있음
		System.out.println(nameList);
		System.out.println(nameList2);
		
		//리스트의 특정 값 가져오기 get(index)
		System.out.println(nameList.get(3));
		
		//리스트 내에서 원하는 값이 있는지 확인
		System.out.println(nameList.contains("김재현"));
		
		//리스트 내에 값이 하나라도 있으면 비우기
		if(!nameList.isEmpty()) {
			nameList.clear();			
		}
		System.out.println(nameList);
		System.out.println(nameList2);
		
		//리스트를 배열로 변환  --> Object로 반환되기에, Object로 받고 다운캐스팅 해주어야 함
		Object[] objs= nameList2.toArray();
		for(Object obj : objs) {
			System.out.println((String)obj);
		}
		
		
		
		
		
	}
}

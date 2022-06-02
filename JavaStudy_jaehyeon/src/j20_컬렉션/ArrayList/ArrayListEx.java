package j20_컬렉션.ArrayList;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		String[] strArray = new String[5];
		strArray[0] = "a";
		strArray[1] = "a1";
		strArray[2] = "a2";
		strArray[3] = "a3";
		strArray[4] = "a4";
		
		//배열 foreach
		for(String str : strArray) {
			System.out.println(str);
		}
		//배열 index사용
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		
		ArrayList<String> strArrayList = new ArrayList<String>();
		strArrayList.add("b1");
		strArrayList.add("b2");
		strArrayList.add("b3");
		strArrayList.add("b4");
		strArrayList.add("b5");
		System.out.println(strArrayList.size());
		strArrayList.remove("b1");
		strArrayList.remove(0);
		
		//List foreach
		for(String str : strArrayList) {
			System.out.println(str);
		}
		//List index 사용
		for (int i = 0; i < strArrayList.size(); i++) {
			System.out.println(strArrayList.get(i));
		}
	}
}

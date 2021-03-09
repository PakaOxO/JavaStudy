package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Ex01 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		// 정렬하는 메소드 Collections.sort()
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		// containsAll은 boolean타입을 결과를 반환
		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));
		System.out.println();
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // 뒤의 요소들은 밀려남(작업에 부하가 생김)
		print(list1, list2);
		
		list2.set(3, "AA"); // 3번 인덱스의 요소를 "AA"로 치환
		print(list1, list2);
		
		list1.add(0, "1");
		print(list1, list2);
		System.out.println("index= " + list1.indexOf(new Integer(1))); // indexOf는 요소의 데이터 타입을 인식
		System.out.println();
		
		list1.remove(new Integer(1)); // Integer 1이 삭제됨
		// list1.remove(1) -> 이것은 1을 삭제하는 것이 아니라, 인덱스 1의 요소를 삭제함을 의미
		print(list1, list2);
		
		// list2와 중복된 요소들을 list1에서 삭제(차집합)
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
		print(list1, list2);
		
		// list1의 요소에 포함된 요소가 list2에 있을 경우, 해당 요소 삭제
		// 뒤에서부터 삭제하는 이유,,, 앞에서 삭제하면 인덱스에 영향이 발생!!
		for (int i=list1.size()-1; i>=0; i--) {
			if (list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1, list2);
		
		System.out.println(list2.size());
	}

	// 현재 list1, list2의 내용을 보여주기 위한 메소드 작성
	public static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	}
}

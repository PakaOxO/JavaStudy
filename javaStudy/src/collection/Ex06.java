package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// HashSet에 대한 예제
public class Ex06 {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2", "3", "4", "3"};
		Set set = new HashSet();
		
		for (int i=0; i<objArr.length; i++) {
			// add메소드는 추가에 대한 결과로 boolean을 반환
			// "3"은 이미 앞에서 추가되었기 때문에 뒤의 "3"추가시 false반환
			System.out.println(set.add(objArr[i]));
		}
		// set에 저장된 내용 출력
		System.out.println("set = " + set);
		
		// iterator객체 생성, Collection객체의 내용을 하나씩 반환, 1회용
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set set2 = new HashSet();
		// set2의 size가 6보다 될 때까지 임의의 수를 set2에 저장
		for (int i=0; set2.size() < 6; i++) {
			int num = (int)(Math.random() * 9+1);
			System.out.println(num + ", " + set2.add(num));
		}
		System.out.println("set2 = " + set2);
		// HashSet은 정렬이 불가, LinkedList로 변환한 뒤 정렬
		// List list = new LinkedList(set2);
		//Collections.sort(list);
		// System.out.println(list);
		
		// 업데이트의 영향인지 add메소드 사용시 자동으로 정렬되어 저장이 되고 있음을 확인
	}
}

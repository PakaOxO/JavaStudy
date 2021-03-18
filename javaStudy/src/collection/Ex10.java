package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashMap에 저장된 키와 값을 가져오는 메소드 관련 예제
public class Ex10 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("학생1", new Integer(100));
		map.put("학생2", new Integer(80));
		map.put("학생3", new Integer(66));
		map.put("학생4", new Integer(95));
		map.put("학생5", new Integer(49));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		
		Collection values = map.values();
		
		int total = 0;
		it = values.iterator();
		while(it.hasNext()) {
			total += (int)it.next();
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + total/values.size());
	}
}

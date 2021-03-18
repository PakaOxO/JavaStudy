package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex11 {
	public static void main(String[] args) {
		String[] data = {"A", "B", "C", "D", "A", "C", "D"};
		
		HashMap map = new HashMap();
		
		for (int i=0; i<data.length; i++) {
			// map에 key가 없으면 추가
			if (!map.containsKey(data[i])) {
				map.put(data[i], 1);
			// 있으면 value에 +1
			} else {
				int value = (int)map.get(data[i])+1;
				map.put(data[i], value);
			}
		}
		
		// iterator메소드 사용을 위해 entrySet으로 변환
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry entry  = (Map.Entry)it.next();
			int value = (int)entry.getValue();
			System.out.println(entry.getKey() + " : " + value);
		}
	}
}

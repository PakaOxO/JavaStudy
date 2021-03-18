package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashMap�� ����� Ű�� ���� �������� �޼ҵ� ���� ����
public class Ex10 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("�л�1", new Integer(100));
		map.put("�л�2", new Integer(80));
		map.put("�л�3", new Integer(66));
		map.put("�л�4", new Integer(95));
		map.put("�л�5", new Integer(49));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸� : " + e.getKey() + ", ���� : " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("������ ��� : " + set);
		
		Collection values = map.values();
		
		int total = 0;
		it = values.iterator();
		while(it.hasNext()) {
			total += (int)it.next();
		}
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + total/values.size());
	}
}

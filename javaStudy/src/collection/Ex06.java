package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// HashSet�� ���� ����
public class Ex06 {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2", "3", "4", "3"};
		Set set = new HashSet();
		
		for (int i=0; i<objArr.length; i++) {
			// add�޼ҵ�� �߰��� ���� ����� boolean�� ��ȯ
			// "3"�� �̹� �տ��� �߰��Ǿ��� ������ ���� "3"�߰��� false��ȯ
			System.out.println(set.add(objArr[i]));
		}
		// set�� ����� ���� ���
		System.out.println("set = " + set);
		
		// iterator��ü ����, Collection��ü�� ������ �ϳ��� ��ȯ, 1ȸ��
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set set2 = new HashSet();
		// set2�� size�� 6���� �� ������ ������ ���� set2�� ����
		for (int i=0; set2.size() < 6; i++) {
			int num = (int)(Math.random() * 9+1);
			System.out.println(num + ", " + set2.add(num));
		}
		System.out.println("set2 = " + set2);
		// HashSet�� ������ �Ұ�, LinkedList�� ��ȯ�� �� ����
		// List list = new LinkedList(set2);
		//Collections.sort(list);
		// System.out.println(list);
		
		// ������Ʈ�� �������� add�޼ҵ� ���� �ڵ����� ���ĵǾ� ������ �ǰ� ������ Ȯ��
	}
}

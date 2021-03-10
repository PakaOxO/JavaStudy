package collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex04 {

	public static void main(String[] args) {
		Collection c = new TreeSet();
		c.add(new Integer("1"));
		c.add(new Integer("2"));
		c.add(new Integer("3"));
		c.add(new Integer("4"));
		
		Iterator it = c.iterator();
		
		// �� ���������� Collection ��ü�� ��ҵ��� �������� next() �޼��带 �����⿡ LinkedList�� ����ȯ ��, get�޼ҵ� ���
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Map���� iterator()�� ���� ������ keySet(), entrySet(), values()�� ����� ��ȯ�� ��, iterator() ���
	}

}

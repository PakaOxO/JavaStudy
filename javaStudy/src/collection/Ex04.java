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
		
		// 앞 예제에서는 Collection 객체의 요소들을 가져오는 next() 메서드를 몰랐기에 LinkedList로 형변환 후, get메소드 사용
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Map에는 iterator()가 없기 때문에 keySet(), entrySet(), values()를 사용해 변환한 후, iterator() 사용
	}

}

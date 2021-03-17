package collection;

import java.util.HashSet;
import java.util.Iterator;

// HashSet 관련 예제2
// HashSet은 순서무관, 중복허용x
public class Ex07 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc"); // 중복이라 저장x
		set.add(new Person("kevin", 12));
		// equals를 오버라이딩 했기 때문에 추가x
		// 기존의 equals를 사용할 경우, 서로 다르게 인식되므로 오버라이딩 하는 것이 좋음
		set.add(new Person("kevin", 12));
		
		System.out.println(set);
		
		
		// 두 HashSet의 합집합, 교집합, 차집합을 구하는 예제
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1"); setA.add("2"); setA.add("3");
		setA.add("4"); setA.add("5");
		System.out.println("A = " + setA);
		
		setB.add("4"); setB.add("5"); setB.add("6");
		setB.add("7"); setB.add("8");
		System.out.println("B = " + setB);
		
		// 합집합
		Iterator it = setA.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		it = setB.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		// HashSet의 특성상 중복값은 자동으로 추가가 되지 않음
		System.out.println("합집합 = " + setHab);
		
		// 차집합
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			// B가 가지고 있지 않는 A의 요소만 추가
			if (!setB.contains(tmp)) {
				setCha.add(tmp);
			}
		}
		System.out.println("차집합 = " + setCha);
		
		// 교집합
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			// B와 중복되는 A의 요소만 추가
			if (setB.contains(tmp)) {
				setKyo.add(tmp);
			}
		}
		System.out.println("교집합 = " + setKyo);
		
		
		// 합,차,교집합을 직접 구하기
//		setA.addAll(setB);
//		System.out.println("setA = " + setA);
//		setA.removeAll(setB);
//		System.out.println("setA = " + setA);
//		setA.retainAll(setB);
//		System.out.println("setA = " + setA);
	}
}

// HashSet에 삽입될 임의의 클래스 생성
class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + ":" + age;
	}
	
	// equals()를 오버라이딩하기 위해서는 hashCode 또한 오버라이딩 하는 것이 좋음
	@Override
	public int hashCode() {
		return (name + age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) {
			return false;
		}
		Person p = (Person)obj;
		return this.name.equals(p.name) && this.age==p.age;
	}
}
package collection;

import java.util.HashSet;
import java.util.Iterator;

// HashSet ���� ����2
// HashSet�� ��������, �ߺ����x
public class Ex07 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc"); // �ߺ��̶� ����x
		set.add(new Person("kevin", 12));
		// equals�� �������̵� �߱� ������ �߰�x
		// ������ equals�� ����� ���, ���� �ٸ��� �νĵǹǷ� �������̵� �ϴ� ���� ����
		set.add(new Person("kevin", 12));
		
		System.out.println(set);
		
		
		// �� HashSet�� ������, ������, �������� ���ϴ� ����
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
		
		// ������
		Iterator it = setA.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		it = setB.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		// HashSet�� Ư���� �ߺ����� �ڵ����� �߰��� ���� ����
		System.out.println("������ = " + setHab);
		
		// ������
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			// B�� ������ ���� �ʴ� A�� ��Ҹ� �߰�
			if (!setB.contains(tmp)) {
				setCha.add(tmp);
			}
		}
		System.out.println("������ = " + setCha);
		
		// ������
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			// B�� �ߺ��Ǵ� A�� ��Ҹ� �߰�
			if (setB.contains(tmp)) {
				setKyo.add(tmp);
			}
		}
		System.out.println("������ = " + setKyo);
		
		
		// ��,��,�������� ���� ���ϱ�
//		setA.addAll(setB);
//		System.out.println("setA = " + setA);
//		setA.removeAll(setB);
//		System.out.println("setA = " + setA);
//		setA.retainAll(setB);
//		System.out.println("setA = " + setA);
	}
}

// HashSet�� ���Ե� ������ Ŭ���� ����
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
	
	// equals()�� �������̵��ϱ� ���ؼ��� hashCode ���� �������̵� �ϴ� ���� ����
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
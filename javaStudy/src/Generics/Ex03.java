package Generics;

import java.util.ArrayList;

class Fruit {
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}

class Banana extends Fruit {
	public String toString() {
		return "Banana";
	}
}

// Fruit�� Fruit�� ��ӹ��� Ÿ�Ը� Ÿ�Ժ����� �� �� ����
class FruitBox<E extends Fruit> {
	ArrayList<E> list = new ArrayList<E>();
	void add(E item) {
		list.add(item);
	}
	
	E get(int index) {
		return list.get(index);
	}
}

class Toy {};

// ���ѵ� ���׸�Ŭ����
public class Ex03 {
	public static void main(String[] args) {
		FruitBox<Apple> appleBox = new FruitBox<>();
		appleBox.add(new Apple());
//		appleBox.add(new Banana()); // Ÿ�� ����ġ�� ���� ����
		
//		FruitBox<Toy> toyBox = new FruitBox<>(); // Toy�� Fruit�� ��ӹ��� �ʾ� ����
	}

}
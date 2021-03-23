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

// Fruit와 Fruit를 상속받은 타입만 타입변수로 올 수 있음
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

// 제한된 지네릭클래스
public class Ex03 {
	public static void main(String[] args) {
		FruitBox<Apple> appleBox = new FruitBox<>();
		appleBox.add(new Apple());
//		appleBox.add(new Banana()); // 타입 불일치로 인한 에러
		
//		FruitBox<Toy> toyBox = new FruitBox<>(); // Toy는 Fruit를 상속받지 않아 에러
	}

}
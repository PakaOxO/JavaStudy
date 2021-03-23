package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Iterator, HashMap과 Generics
public class Ex02 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("김자바", 1, 1));
		list.add(new Student("이자바", 1, 4));
		list.add(new Student("박자바", 1, 7));
		
//		Iterator it = list.iterator();
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
//			Student student = (Student)it.next(); // 이전에는 객체가 Object타입으로 호출되기 때문에 형변환이 필요했지만
			System.out.println(it.next().name); // 지네릭스 사용으로 형변환이 불필요하게 바뀌어 코드의 단순화가 가능
		}
		
//		HashMap<String, Student> map = new HashMap<String, Student>();
		// <>는 다이아몬드 연산자, 변수선언 시 이미 타입변수 또한 정의되었기 때문에 생성자에서 타입변수 생략가능
		HashMap<String, Student> map = new HashMap<>(); // 여러 타입변수가 필요한 경우 ,(콤마)로 구분
		map.put("최우수상", new Student("김우수", 2, 1)); // key와 value가 서로 다른 타입일 경우...
	}

}

class Student {
	String name = "";
	int classNo = 0;
	int stdNo = 0;
	
	Student(String name, int classNo, int stdNo) {
		this.name = name;
		this.classNo = classNo;
		this.stdNo = stdNo;
	}
}
package Generics;

import java.util.ArrayList;

// Generics : Collection객체에 담을 수 있는 데이터 타입객체에 대한 정보를 부여
// 객체 타입 안정성을 높이고, 타입체크와 형변환의 번거로움을 줄여줌
// 타입변수<E> : 기존의 Object객체를 대신하는 지네릭스 변수
//(객체 생성시 타입변수 대신 실제 타입을 지정)
public class Ex01 {
	public static void main(String[] args) {
		// 
		ArrayList<TV> list = new ArrayList<>();
		list.add(new TV());
//		list.add(new Audio()); // TV객체 이외의 객체는 저장 불가
		
//		TV t = (TV)list.get(0);
		TV t = list.get(0);
		// 이전에는 위와 같이 get메소드로 객체를 꺼낼때
		// Object타입으로 반환이 되어 형변환이 필요했지만 지네릭스 사용 이후 형변환 필요x
	}
}

class TV {}

class Audio {}
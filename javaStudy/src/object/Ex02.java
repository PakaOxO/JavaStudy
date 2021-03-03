package object;
// equals()를 오버라이딩하면 객체의 주소값을 반환하는 OS메서드(native) hashCode()메서드도
// 오버라이딩 해야한다.

import java.util.Objects;

// toString()메서드, 객체를 문자열(String)으로 반환하는 메서드
// 객체(Object)는 iv(인스턴스변수)의 집합이므로 toString()메서드의 오버라이딩의 경우 iv들을 문자열로 변환시켜준다
class Card {
	String kind;
	int number;
	
	Card() {
		this("SPADE", 1);
	}
	
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	// equals()를 오버라이딩하기 위해서는 hashCode()메서드도 오버라이딩 해야한다.
	@Override
	public int hashCode() {
		return Objects.hash(kind, number);
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Card)) { return false; }
		
		Card c = (Card)obj;
		return this.kind==c.kind && this.number==c.number;
	}
	// toString()메서드 오버라이딩
	@Override
	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("HEART", 1);
		Card c3 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		System.out.println(c1.equals(c2)); // False
		System.out.println(c1.equals(c3)); // True
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode()); // c1.hashCode()와 동일한 결과
	}
}

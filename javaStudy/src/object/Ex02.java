package object;
// equals()�� �������̵��ϸ� ��ü�� �ּҰ��� ��ȯ�ϴ� OS�޼���(native) hashCode()�޼��嵵
// �������̵� �ؾ��Ѵ�.

import java.util.Objects;

// toString()�޼���, ��ü�� ���ڿ�(String)���� ��ȯ�ϴ� �޼���
// ��ü(Object)�� iv(�ν��Ͻ�����)�� �����̹Ƿ� toString()�޼����� �������̵��� ��� iv���� ���ڿ��� ��ȯ�����ش�
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
	// equals()�� �������̵��ϱ� ���ؼ��� hashCode()�޼��嵵 �������̵� �ؾ��Ѵ�.
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
	// toString()�޼��� �������̵�
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
		System.out.println(c3.hashCode()); // c1.hashCode()�� ������ ���
	}
}

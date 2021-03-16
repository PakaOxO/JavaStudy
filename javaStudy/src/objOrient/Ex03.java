package objOrient;

public class Ex03 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("현재 d.x의 값은 " +d.x);
		
		change1(d.x);
		System.out.println("change1 메서드 호출 후 d.x의 값은" +d.x); // 기본형 매개변수는 ReadOnly!!
		
		change2(d);
		System.out.println("change1 메서드 호출 후 d.x의 값은" +d.x); // 참조형 매개변수는 Read & Write 가능
	}
	
	static void change1(int x) {
		x = 1000;
		System.out.println("기본형 매개변수로 받은 x의 현재 값은 " +x);
	}

	static void change2(Data d) {
		d.x = 1000;
		System.out.println("참조형 매개변수로 받은 x의 현재 값은 " +d.x);
	}
}

class Data {
	int x;
}
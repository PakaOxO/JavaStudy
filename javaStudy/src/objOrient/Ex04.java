package objOrient;

public class Ex04 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println("mm.cal(3, 3) 결과: " + mm.cal(3, 3));
		System.out.println("mm.cal(3L, 3L) 결과: " + mm.cal(3L, 3L));
	}

}

class MyMath {
	int cal (int a, int b) {
		System.out.println("int cal(int a, int b)");
		return a + b;
	}
	// 매개변수의 타입이 다름 : 오버로딩
	// 반환 타입은 오버로딩과는 무관!!
	long cal (long a, long b) {
		System.out.println("int cal(long a, long b)");
		return a * b;
	}
}

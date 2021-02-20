package objOrient;

public class Ex02 {
	public static void main(String[] args) {
		long a = 10L;
		long b = 6L;
		Cal c = new Cal(); // Cal 클래스 객체 생성
		System.out.println("add(a, b) = " + c.add(a, b)); // Cal 클래스의 메서드들을 호출
		System.out.println("sub(a, b) = " + c.sub(a, b));
		System.out.println("mul(a, b) = " + c.mul(a, b));
		System.out.println("div(a, b) = " + c.div(a, b));
		System.out.println("max(a, b) = " + c.max(a, b));
		System.out.println("min(a, b) = " + c.min(a, b));
		
		c.printGugudan(2); 
	}

}

class Cal {
	// 사칙연산 메서드
	long add(long a, long b) {
		return a + b;
	}
	
	long sub(long a, long b) {
		return a - b;
	}
	
	long mul(long a, long b) {
		return a * b;
	}
	
	double div(double a, double b) {
		return a / b;
	}
	
	// 최대, 최소값을 구하는 메서드
	long max(long a, long b) {
		return a >= b ? a : b;
	}
	
	long min(long a, long b) {
		return a >= b ? b : a;
	}
	
	// 구구단을 출력하는 메서드
	void printGugudan(int dan) {
		if (!(2<=dan && dan<=9)) {
			System.out.println("구구단은 2~9단까지만 실행할 수 있습니다.");
		}
		System.out.println("구구단 " +dan+ "단을 실행...");
		for (int i=1; i<10; i++) {
			System.out.println(dan +" * "+ i + " = " +(dan*i));
		}
	}
}
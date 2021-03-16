package objOrient;

public class Ex02 {
	public static void main(String[] args) {
		long a = 10L;
		long b = 6L;
		Cal c = new Cal(); // Cal Ŭ���� ��ü ����
		System.out.println("add(a, b) = " + c.add(a, b)); // Cal Ŭ������ �޼������ ȣ��
		System.out.println("sub(a, b) = " + c.sub(a, b));
		System.out.println("mul(a, b) = " + c.mul(a, b));
		System.out.println("div(a, b) = " + c.div(a, b));
		System.out.println("max(a, b) = " + c.max(a, b));
		System.out.println("min(a, b) = " + c.min(a, b));
		
		c.printGugudan(2); 
	}

}

class Cal {
	// ��Ģ���� �޼���
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
	
	// �ִ�, �ּҰ��� ���ϴ� �޼���
	long max(long a, long b) {
		return a >= b ? a : b;
	}
	
	long min(long a, long b) {
		return a >= b ? b : a;
	}
	
	// �������� ����ϴ� �޼���
	void printGugudan(int dan) {
		if (!(2<=dan && dan<=9)) {
			System.out.println("�������� 2~9�ܱ����� ������ �� �ֽ��ϴ�.");
		}
		System.out.println("������ " +dan+ "���� ����...");
		for (int i=1; i<10; i++) {
			System.out.println(dan +" * "+ i + " = " +(dan*i));
		}
	}
}
package objOrient;

public class Ex04 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println("mm.cal(3, 3) ���: " + mm.cal(3, 3));
		System.out.println("mm.cal(3L, 3L) ���: " + mm.cal(3L, 3L));
	}

}

class MyMath {
	int cal (int a, int b) {
		System.out.println("int cal(int a, int b)");
		return a + b;
	}
	// �Ű������� Ÿ���� �ٸ� : �����ε�
	// ��ȯ Ÿ���� �����ε����� ����!!
	long cal (long a, long b) {
		System.out.println("int cal(long a, long b)");
		return a * b;
	}
}

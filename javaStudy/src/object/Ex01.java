package object;

public class Ex01 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		Value v3 = new Value(20);
		
		if (v1.equals(v3)) {
			System.out.println("v1�� v3�� �����ϴ�.");
		} else {
			System.out.println("v1�� v3�� �ٸ��ϴ�.");
		}
	}

}

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
	
	// �Ϲ������� equals() �޼ҵ�� ��ü�� �ּҰ��� ���ϹǷ� ��ü�� �� ��ü�� ���ϱ� ���� overriding�� �ؾ��Ѵ�.
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Value)) { return false; } // instanceof�� ����ȯ ���ɿ��� ���� Ȯ��
		
		Value v = (Value)obj;
		return this.value == v.value;
	}
}
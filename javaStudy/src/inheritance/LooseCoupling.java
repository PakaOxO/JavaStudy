package inheritance;

interface I {
	void method();
}

class A {
	void methodA(I i) {
		i.method();
	}
}

class B implements I {
	public void method() { System.out.println("B�� �޼��带 ȣ��"); }
}

class C implements I {
	public void method() { System.out.println("C�� �޼��带 ȣ��"); }
}

public class LooseCoupling {
	public static void main(String[] args) {
		A a = new A();
		// ��ü A�� ���� ���� �������̽� I�� ������ ��ü���� �޼��� ȣ�� ����
		a.methodA(new B());
		a.methodA(new C());
	}

}

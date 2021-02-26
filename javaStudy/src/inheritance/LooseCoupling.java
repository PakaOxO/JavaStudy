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
	public void method() { System.out.println("B의 메서드를 호출"); }
}

class C implements I {
	public void method() { System.out.println("C의 메서드를 호출"); }
}

public class LooseCoupling {
	public static void main(String[] args) {
		A a = new A();
		// 객체 A의 수정 없이 인터페이스 I를 구현한 객체들의 메서드 호출 가능
		a.methodA(new B());
		a.methodA(new C());
	}

}

package inheritance;


// ���� Ŭ������ ����Ǵ� ���������ڴ� public(��� Ŭ���� ���ٰ���)�� default(���� ��Ű���� ���ٰ���)
// ���� Ŭ������ Ŭ�������(����, �޼���)�� �����ϰ� �����ϱ� ������ ���� �� ���������� �ܿ��� protected, private ���������� ��밡��
class OuterClass {
	int iv = 100; // �ν��Ͻ� ����
	private int piv = 110; // ���������ڰ� private�� ����, ���� Ŭ���������� ���� ����
	static int cv = 200; // Ŭ���� ����
	void outerMethod() {
		// �޼��� ���� ���ǵ� �������� ��������(lv)�̱� ������ �����ֱⰡ ª��(�޼��� ����� ���ÿ� �Ҹ�)
		int lv = 222;
		final int CONST2 = 111;
		// ������ �޼��� ���� ���ǵ� Ŭ������ �޼����� ���������� ���� ���� �߻�(Ŭ���� ����� ������ ���� �޼��尡 ����, ���� ���ٺҰ�)
		// �׷��⿡ ������ ������Ǯ�� ����Ǵ� ������� �޼��� ����ÿ��� ����ֱ� ������ �޼��� ���� Ŭ������ �޼����� ��������� ���ٰ���)
		// JDK1.8���� �޼��� ����Ŭ������ �޼����� �������� ���� �ڵ����� ����� �ν�(lv�� ���游 ���ٸ� �ڵ����� ����� ����)
		class methodInnerClass {
			int lv2 = lv; // JDK1.8 �������� ����!!, ����� lv�� ���� ������� ������ ����� ��޵Ǿ ok
			int lv3 = CONST2;
		}
	}
	
	// ���� Ŭ������ �ܺ� Ŭ������ ���� ���� ����
	// Instance InnerClass(static InnerClass�� ���� ����, Ŭ��������(cv)�� �����ϰ� ����
	class InstanceInnerClass {
		int ivInner = 300;
		// static cvInner = 400; ����!!, ����Ŭ������ static class�� �ƴϱ� ������ cv�� ���� �� ����
		final static int CONST = 111; // ����� ok
		void method() {
			System.out.println("--- InstanceInnerClass�� method() ���� ---");
			// iv, cv ��� ��ü �������� ���� ȣ�� ����
			System.out.println("OuterClass�� �ν��Ͻ� ����(iv) ȣ�� : " + iv);
			System.out.println("OuterClass�� Ŭ���� ����(cv) ȣ�� : " + cv);
			// InnerClass�� OuterClass�� Ŭ���� ���ο� �����ϹǷ� private ����� ���� ����
			System.out.println("OuterClass�� private �ν��Ͻ� ����(piv) ȣ�� : " + piv);
			// ��ü �������� OuterClass�� �޼��带 ���� ȣ��
			outerMethod();
		}
	} // InstanceInnerClass ����
	
	static class StaticInnerClass {} // StaticInnerClass ���� �� ����
} // OuterClass ����


public class InnerClassExam {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		// �ν��Ͻ� ����Ŭ������ ȣ��
		OuterClass.InstanceInnerClass inner = outer.new InstanceInnerClass();
		// static ����Ŭ������ ȣ��
		OuterClass.StaticInnerClass inner2 = new OuterClass.StaticInnerClass();
		
		inner.method();
		
		System.out.println("--- �ٸ� �ܺ�Ŭ�������� OuterClass ��� ��� ---");
		System.out.println("OuterClass�� �ν��Ͻ� ����(iv) ȣ�� : " + outer.iv);
		// cv�� OuterClass�� ��ü �������� ȣ�� ����
		System.out.println("OuterClass�� Ŭ���� ����(cv) ȣ�� : " + OuterClass.cv);
		// OuterClass�� private������� ���� �Ұ� (private ����� ���� Ŭ���� �������� ���ٰ���)
		// System.out.println("OuterClass�� �ν��Ͻ� ����(piv) ȣ�� : " + outer.piv);
		// �������� outer�� ���� OuterClass�� �޼��� ȣ��
		outer.outerMethod();
	}
}

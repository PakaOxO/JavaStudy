package inheritance;


// 원래 클래스에 적용되는 접근제어자는 public(모든 클래스 접근가능)과 default(같은 패키지내 접근가능)
// 내부 클래스는 클래스멤버(변수, 메서드)와 동일하게 동작하기 때문에 위의 두 접근제어자 외에도 protected, private 접근제어자 사용가능
class OuterClass {
	int iv = 100; // 인스턴스 변수
	private int piv = 110; // 접근제어자가 private인 변수, 같은 클래스에서만 접근 가능
	static int cv = 200; // 클래스 변수
	void outerMethod() {
		// 메서드 내에 정의된 변수들은 지역변수(lv)이기 때문에 생명주기가 짧음(메서드 종료와 동시에 소멸)
		int lv = 222;
		final int CONST2 = 111;
		// 때문에 메서드 내에 정의된 클래스가 메서드의 지역변수를 사용시 문제 발생(클래스 사용이 끝나기 전에 메서드가 종료, 변수 접근불가)
		// 그렇기에 별도의 데이터풀에 저장되는 상수만이 메서드 종료시에도 살아있기 때문에 메서드 내부 클래스는 메서드의 상수변수만 접근가능)
		// JDK1.8부터 메서드 내부클래스가 메서드의 지역변수 사용시 자동으로 상수로 인식(lv의 변경만 없다면 자동으로 상수로 간주)
		class methodInnerClass {
			int lv2 = lv; // JDK1.8 이전에는 에러!!, 현재는 lv의 값이 변경되지 않으면 상수로 취급되어서 ok
			int lv3 = CONST2;
		}
	}
	
	// 내부 클래스는 외부 클래스에 쉽게 접근 가능
	// Instance InnerClass(static InnerClass도 선언 가능, 클래스변수(cv)와 동일하게 동작
	class InstanceInnerClass {
		int ivInner = 300;
		// static cvInner = 400; 에러!!, 내부클래스가 static class가 아니기 때문에 cv를 가질 수 없음
		final static int CONST = 111; // 상수는 ok
		void method() {
			System.out.println("--- InstanceInnerClass의 method() 실행 ---");
			// iv, cv 모두 객체 생성없이 직접 호출 가능
			System.out.println("OuterClass의 인스턴스 변수(iv) 호출 : " + iv);
			System.out.println("OuterClass의 클래스 변수(cv) 호출 : " + cv);
			// InnerClass도 OuterClass의 클래스 내부에 존재하므로 private 멤버에 접근 가능
			System.out.println("OuterClass의 private 인스턴스 변수(piv) 호출 : " + piv);
			// 객체 생성없이 OuterClass의 메서드를 직접 호출
			outerMethod();
		}
	} // InstanceInnerClass 종료
	
	static class StaticInnerClass {} // StaticInnerClass 선언 및 종료
} // OuterClass 종료


public class InnerClassExam {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		// 인스턴스 내부클래스의 호출
		OuterClass.InstanceInnerClass inner = outer.new InstanceInnerClass();
		// static 내부클래스의 호출
		OuterClass.StaticInnerClass inner2 = new OuterClass.StaticInnerClass();
		
		inner.method();
		
		System.out.println("--- 다른 외부클래스에서 OuterClass 멤버 사용 ---");
		System.out.println("OuterClass의 인스턴스 변수(iv) 호출 : " + outer.iv);
		// cv는 OuterClass의 객체 생성없이 호출 가능
		System.out.println("OuterClass의 클래스 변수(cv) 호출 : " + OuterClass.cv);
		// OuterClass의 private멤버에는 접근 불가 (private 멤버는 같은 클래스 내에서만 접근가능)
		// System.out.println("OuterClass의 인스턴스 변수(piv) 호출 : " + outer.piv);
		// 참조변수 outer를 통한 OuterClass의 메서드 호출
		outer.outerMethod();
	}
}

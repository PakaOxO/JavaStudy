package object;

// StringBuffer클래스(String과 다르게 문자배열내 요소들을 추가, 삭제할 수 있다)
public class Ex03 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("01");
		StringBuffer sb2 = sb.append(23);
		sb.append('4').append(56);
		
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0);
		
		// StringBuffer클래스의 append메소드는 StringBuffer자신의 참조변수를 리턴하므로
		// sb, sb2, sb3의 결과값이 모두 동일하게 나온다
		System.out.println("sb = " + sb);
		System.out.println("sb2 = " + sb2);
		System.out.println("sb3 = " + sb3);
		
		// StringBuffer클래스의 다른 메소드들
		System.out.println("sb = " + sb.deleteCharAt(10));
		System.out.println("sb = " + sb.delete(3, 6));
		System.out.println("sb = " + sb.insert(3, "abc"));
		System.out.println("sb = " + sb.replace(6, sb.length(), "END"));
		
		// capacity는 StringBuffer의 전체 크기, length는 담긴 내용의 길이
		System.out.println("capacity = " + sb.capacity());
		System.out.println("length = " + sb.length());
	}
}

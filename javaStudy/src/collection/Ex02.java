package collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex02 {
	// 스택활용 예시 : 연산에서 괄호 일치여부 확인
	public static void main(String[] args) {
		// 연산에서 열고 닫는 괄호가 서로 일치하는지 확인(스택의 push, pop메소드 사용)
		Stack st = new Stack();
		String expression = "((3+5) *2))";
		
		System.out.println("expression : " + expression);
		
		try {
			for (int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if (ch=='(') {
					st.push(ch+"");
				} else if (ch==')') {
					st.pop();
				}
			}
			
			if (st.empty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
		} catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.2");
		}
	}

}

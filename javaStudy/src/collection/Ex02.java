package collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex02 {
	// ����Ȱ�� ���� : ���꿡�� ��ȣ ��ġ���� Ȯ��
	public static void main(String[] args) {
		// ���꿡�� ���� �ݴ� ��ȣ�� ���� ��ġ�ϴ��� Ȯ��(������ push, pop�޼ҵ� ���)
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
				System.out.println("��ȣ�� ��ġ�մϴ�.");
			} else {
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} catch (EmptyStackException e) {
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.2");
		}
	}

}

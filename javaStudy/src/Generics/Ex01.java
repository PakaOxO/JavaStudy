package Generics;

import java.util.ArrayList;

// Generics : Collection��ü�� ���� �� �ִ� ������ Ÿ�԰�ü�� ���� ������ �ο�
// ��ü Ÿ�� �������� ���̰�, Ÿ��üũ�� ����ȯ�� ���ŷο��� �ٿ���
// Ÿ�Ժ���<E> : ������ Object��ü�� ����ϴ� ���׸��� ����
//(��ü ������ Ÿ�Ժ��� ��� ���� Ÿ���� ����)
public class Ex01 {
	public static void main(String[] args) {
		// 
		ArrayList<TV> list = new ArrayList<>();
		list.add(new TV());
//		list.add(new Audio()); // TV��ü �̿��� ��ü�� ���� �Ұ�
		
//		TV t = (TV)list.get(0);
		TV t = list.get(0);
		// �������� ���� ���� get�޼ҵ�� ��ü�� ������
		// ObjectŸ������ ��ȯ�� �Ǿ� ����ȯ�� �ʿ������� ���׸��� ��� ���� ����ȯ �ʿ�x
	}
}

class TV {}

class Audio {}
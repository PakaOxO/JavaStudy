package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Iterator, HashMap�� Generics
public class Ex02 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("���ڹ�", 1, 1));
		list.add(new Student("���ڹ�", 1, 4));
		list.add(new Student("���ڹ�", 1, 7));
		
//		Iterator it = list.iterator();
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
//			Student student = (Student)it.next(); // �������� ��ü�� ObjectŸ������ ȣ��Ǳ� ������ ����ȯ�� �ʿ�������
			System.out.println(it.next().name); // ���׸��� ������� ����ȯ�� ���ʿ��ϰ� �ٲ�� �ڵ��� �ܼ�ȭ�� ����
		}
		
//		HashMap<String, Student> map = new HashMap<String, Student>();
		// <>�� ���̾Ƹ�� ������, �������� �� �̹� Ÿ�Ժ��� ���� ���ǵǾ��� ������ �����ڿ��� Ÿ�Ժ��� ��������
		HashMap<String, Student> map = new HashMap<>(); // ���� Ÿ�Ժ����� �ʿ��� ��� ,(�޸�)�� ����
		map.put("�ֿ����", new Student("����", 2, 1)); // key�� value�� ���� �ٸ� Ÿ���� ���...
	}

}

class Student {
	String name = "";
	int classNo = 0;
	int stdNo = 0;
	
	Student(String name, int classNo, int stdNo) {
		this.name = name;
		this.classNo = classNo;
		this.stdNo = stdNo;
	}
}
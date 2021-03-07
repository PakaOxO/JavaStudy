package calendar;

import java.util.Calendar;

public class Ex03 {
	public static void main(String[] args) {
		// Calendar add, roll �޼ҵ�
		Calendar date = Calendar.getInstance();
		date.set(2020, 3, 1);
		Calendar date2 = Calendar.getInstance();
		date2.set(2020, 3, 1);
		
		System.out.println(toString(date));
		System.out.println("-- 1����(add) --");
		date.add(Calendar.DATE, -1);
		System.out.println(toString(date)); // ��� : 2�� 31��? -> �ٸ� �ʵ�(��)�� ����
		
		System.out.println(toString(date2));
		System.out.println("-- 1����(roll) --");
		date2.roll(Calendar.DATE, -1);
		System.out.println(toString(date2)); // ��� : 3�� 31�� -> �ٸ� �ʵ�(��)�� ����x
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "�� " + date.get(Calendar.MONTH) + "�� " + date.get(Calendar.DATE) + "��"; 
	}
}

package calendar;

import java.util.Calendar;

public class Ex03 {
	public static void main(String[] args) {
		// Calendar add, roll 메소드
		Calendar date = Calendar.getInstance();
		date.set(2020, 3, 1);
		Calendar date2 = Calendar.getInstance();
		date2.set(2020, 3, 1);
		
		System.out.println(toString(date));
		System.out.println("-- 1일전(add) --");
		date.add(Calendar.DATE, -1);
		System.out.println(toString(date)); // 결과 : 2월 31일? -> 다른 필드(월)에 영향
		
		System.out.println(toString(date2));
		System.out.println("-- 1일전(roll) --");
		date2.roll(Calendar.DATE, -1);
		System.out.println(toString(date2)); // 결과 : 3월 31일 -> 다른 필드(월)에 영향x
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + date.get(Calendar.MONTH) + "월 " + date.get(Calendar.DATE) + "일"; 
	}
}

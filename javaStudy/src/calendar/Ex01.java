package calendar;

import java.util.Calendar;

public class Ex01 {
	public static void main(String[] args) {
		String[] day_of_week = {"", "일", "월", "화", "수", "목", "금", "토"};
		
		// Calendar객체의 메소드들...
		Calendar today = Calendar.getInstance();
		System.out.println("올해년도 : " + today.get(Calendar.YEAR));
		System.out.println("이번 달(0~11 + 1) : " + (today.get(Calendar.MONTH)+1) + "월");
		System.out.println("올해의 몇 번째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이번 달의 몇 번째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		// DATE 메소드와 DAY_OF_MONTH 메소드의 결과는 동일
		System.out.println("이번 달의 몇 일 : " + today.get(Calendar.DATE));
		System.out.println("이번 달의 몇 일 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("올해의 몇 일 : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1~7, 1: 일요일) : " + day_of_week[today.get(Calendar.DAY_OF_WEEK)] + "요일");
		System.out.println("이번 달의 몇 번째 요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전/오후(오전: 0, 오후: 1) : " + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
		System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59) : " + today.get(Calendar.MINUTE));
		System.out.println("초(0~59) : " + today.get(Calendar.SECOND));
		System.out.println("밀리초(0~999) : " + today.get(Calendar.MILLISECOND));
		System.out.println("TIMEZONE(-12~12) : " + today.get(Calendar.ZONE_OFFSET));
		System.out.println("이번 달의 마지막 일 : " + today.getActualMaximum(Calendar.DATE));
	}

}

package calendar;

import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
		// 시간 설정(set메소드)과 현재시간과의 차이 계산
		Calendar today = Calendar.getInstance();
		final int[] timeUnit = {3600, 60, 1};
		final String[] timeUnitName = {"시", "분", "초"};
		
		Calendar time2 = Calendar.getInstance();
		time2.set(Calendar.HOUR_OF_DAY, 10);
		time2.set(Calendar.MINUTE, 10);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println("지정된 시간은 "
			+ time2.get(Calendar.HOUR_OF_DAY) + timeUnitName[0]
			+ time2.get(Calendar.MINUTE) + timeUnitName[1]
			+ time2.get(Calendar.SECOND) + timeUnitName[2] + "입니다.");
		System.out.println("현재 시간은 "
			+ today.get(Calendar.HOUR_OF_DAY) + timeUnitName[0]
			+ today.get(Calendar.MINUTE) + timeUnitName[1]
			+ today.get(Calendar.SECOND) + timeUnitName[2] + "입니다.");
		
		long difference = Math.abs(today.getTimeInMillis() - time2.getTimeInMillis()) / 1000;
		String tmp = "";
		System.out.println("지정된 시간과 현재시간의 차이는 " + difference + "밀리초이고, 시분초로는");
		for (int i=0; i<timeUnit.length; i++) {
			tmp += (difference / timeUnit[i] + timeUnitName[i]);
			difference %= timeUnit[i];
		}
		System.out.println(tmp + "만큼 차이가 납니다.");
		
		Calendar today2 = Calendar.getInstance();
		today2.clear();
		// 날짜를 가져온 뒤에 초기화를 하는 것이 좋음(날짜, 시간차이 연산시 연산 중 초,밀리초 차이에 의해 오차가 발생가능)
	}

}

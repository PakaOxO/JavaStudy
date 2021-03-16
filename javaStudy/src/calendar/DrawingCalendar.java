package calendar;

import java.util.Calendar;

public class DrawingCalendar {
	public static void main(String[] args) {
		// 입력된 연도, 월 값이 오류가 있을 경우, return
		if (args.length != 2) {
			System.out.println("입력값에 오류가 있습니다.");
			return;
		}
		
		// 입력 월 체크
		if (!(1 <= Integer.parseInt(args[1]) && Integer.parseInt(args[1]) <= 12)) {
			System.out.println("입력 월은 1이상 12이하의 숫자로 해야합니다.");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance(); 
		
		// sDay는 입력된 월의 1일, eDay는 입력 월의 다음 월의 1일로 설정
		sDay.set(year, month-1, 1);
		eDay.set(year, month, 1);
		
		// eDay에 add()메소드를 이용 입력 월의 마지막 날짜로 수정
		eDay.add(Calendar.DATE, -1);
		
		// 시작 요일, 입력 월의 마지막 일 변수에 저장
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("      " + year + "년 " + month + "월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		// 만일 첫 요일이 수요일(3)이라면 2회만큼 공백(3칸) 입력
		for (int i=1; i<START_DAY_OF_WEEK; i++) {
			System.out.print("   ");
		}
		
		for (int i=1, n=START_DAY_OF_WEEK; i<=END_DAY; i++, n++) {
			System.out.print((i<10)? "  " + i : " " + i);
			if (n%7==0) { System.out.println(); } // 토요일(7) 날짜 입력 종료 후, 줄바꿈
		}
	}
}

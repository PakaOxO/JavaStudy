package inheritance;

public class TimeTest {
	public static void main(String[] args) {
		Time time = new Time();
		//time.hour = 25; // 직접 객체의 인스턴스 변수에 접근에 데이터를 수정하는 것을 제한
		time.setHour(25); // 유효하지 않은 시간 범위는 적용이 안됨
		System.out.println("현재 시간은 " +time.getHour()+ "시 " +time.getMinute()+ "분 " +time.getSecond()+ "초입니다.");
		
		time.setHour(23);
		System.out.println("현재 시간은 " +time.getHour()+ "시 " +time.getMinute()+ "분 " +time.getSecond()+ "초입니다.");
		
		Time watch = new Watch(); // 자손 객체는 조상의 객체 타입으로 참조변수 선언이 가능(다형성, Polymorphism)
		// watch.setTime(); // 다형성, Time객체에서는 setTime() 메서드가 정의되어 있지 않기 때문에 오류
		
		Watch watch2 = new Watch();
		watch2.SetTime(1, 1, 1);
		System.out.println("현재 시간은 " +watch2.getHour()+ "시 " +watch2.getMinute()+ "분 " +watch2.getSecond()+ "초입니다.");
	}

}

class Time {
	// 객체와 접근제어자를 이용한 캡슐화(Incapsulation)
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		// 유효한 시간범위일 때만 인스턴스 변수에 입력값 적용
		if (!(0<=hour && hour<24)) {
			return;
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if (!(0<=minute && minute<60)) {
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if (!(0<=second && second<60)) {
			return;
		}
		this.second = second;
	}
}

class Watch extends Time {
	void SetTime() {
		setHour(0);
		setMinute(0);
		setSecond(0);
	}
	
	void SetTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
}
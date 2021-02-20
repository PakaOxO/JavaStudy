package objOrient;

public class Ex05 {

	public static void main(String[] args) {
		// 매개변수 없는 생성자
		Time time = new Time();
		System.out.printf("현재 시간은 %d시 %d분 %d초입니다.", time.getHour(), time.getMinute(), time.getSecond());
		System.out.println("");
		
		// 매개변수가 담긴 생성자로 초기화
		Time time2 = new Time(3, 3, 3);
		System.out.printf("현재 시간은 %d시 %d분 %d초입니다.", time2.getHour(), time2.getMinute(), time2.getSecond());
	}

}

class Time {
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	// 기본 생성자, 별도로 생성자를 만들어 주지 않는다면 컴파일러가 기본 생성자는 자동으로 추가해줌
	Time() {
		// 생성자 안에서 다른 생성자 호출 시, 첫 줄에서만 사용 가능
		this(0, 0, 0); // this 생성자, 같은 클래스 내 다른 생성자 호출
	}
	
	// 매개변수가 있는 생성자, 만일 기본 생성자를 생성해주지 않고 이 생성자만 넣었을 경우, 기본 생성자는
	// 컴파일러에 의해 자동 생성되지 않기 때문에 매개변수가 없이 초기화는 불가능
	// 기본 생성자를 오버로딩 한 것.
	Time(int hour, int minute, int second) {
		this.hour = hour; // 참조변수 this, 지역변수(lv)와 인스턴스 변수(iv)를 비교할 때 사용
		this.minute = minute; // 인스턴스 메서드(생성자) 내에서만 사용가능
		this.second = second; // this는 인스턴스 자신(class)를 가리킴
	}
}
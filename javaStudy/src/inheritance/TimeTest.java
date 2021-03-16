package inheritance;

public class TimeTest {
	public static void main(String[] args) {
		Time time = new Time();
		//time.hour = 25; // ���� ��ü�� �ν��Ͻ� ������ ���ٿ� �����͸� �����ϴ� ���� ����
		time.setHour(25); // ��ȿ���� ���� �ð� ������ ������ �ȵ�
		System.out.println("���� �ð��� " +time.getHour()+ "�� " +time.getMinute()+ "�� " +time.getSecond()+ "���Դϴ�.");
		
		time.setHour(23);
		System.out.println("���� �ð��� " +time.getHour()+ "�� " +time.getMinute()+ "�� " +time.getSecond()+ "���Դϴ�.");
		
		Time watch = new Watch(); // �ڼ� ��ü�� ������ ��ü Ÿ������ �������� ������ ����(������, Polymorphism)
		// watch.setTime(); // ������, Time��ü������ setTime() �޼��尡 ���ǵǾ� ���� �ʱ� ������ ����
		
		Watch watch2 = new Watch();
		watch2.SetTime(1, 1, 1);
		System.out.println("���� �ð��� " +watch2.getHour()+ "�� " +watch2.getMinute()+ "�� " +watch2.getSecond()+ "���Դϴ�.");
	}

}

class Time {
	// ��ü�� ���������ڸ� �̿��� ĸ��ȭ(Incapsulation)
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		// ��ȿ�� �ð������� ���� �ν��Ͻ� ������ �Է°� ����
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
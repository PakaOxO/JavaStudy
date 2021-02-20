package objOrient;

public class Ex05 {

	public static void main(String[] args) {
		// �Ű����� ���� ������
		Time time = new Time();
		System.out.printf("���� �ð��� %d�� %d�� %d���Դϴ�.", time.getHour(), time.getMinute(), time.getSecond());
		System.out.println("");
		
		// �Ű������� ��� �����ڷ� �ʱ�ȭ
		Time time2 = new Time(3, 3, 3);
		System.out.printf("���� �ð��� %d�� %d�� %d���Դϴ�.", time2.getHour(), time2.getMinute(), time2.getSecond());
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

	// �⺻ ������, ������ �����ڸ� ����� ���� �ʴ´ٸ� �����Ϸ��� �⺻ �����ڴ� �ڵ����� �߰�����
	Time() {
		// ������ �ȿ��� �ٸ� ������ ȣ�� ��, ù �ٿ����� ��� ����
		this(0, 0, 0); // this ������, ���� Ŭ���� �� �ٸ� ������ ȣ��
	}
	
	// �Ű������� �ִ� ������, ���� �⺻ �����ڸ� ���������� �ʰ� �� �����ڸ� �־��� ���, �⺻ �����ڴ�
	// �����Ϸ��� ���� �ڵ� �������� �ʱ� ������ �Ű������� ���� �ʱ�ȭ�� �Ұ���
	// �⺻ �����ڸ� �����ε� �� ��.
	Time(int hour, int minute, int second) {
		this.hour = hour; // �������� this, ��������(lv)�� �ν��Ͻ� ����(iv)�� ���� �� ���
		this.minute = minute; // �ν��Ͻ� �޼���(������) �������� ��밡��
		this.second = second; // this�� �ν��Ͻ� �ڽ�(class)�� ����Ŵ
	}
}
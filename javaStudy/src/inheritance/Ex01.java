package inheritance;

public class Ex01 {

	public static void main(String[] args) {
		SmartTV smartTV = new SmartTV();
		
		smartTV.pSwitch(); // ���� ��ü�� TV�� �޼��带 ȣ��
		smartTV.mute(); // TV��ü�� ���Ե� Speaker��ü�� �޼��� ȣ��
		smartTV.iotSwitch(); // SmartTV��ü�� �޼��� ȣ��
		
		System.out.println(smartTV.toString());
		System.out.println(smartTV);
		smartTV.getModel();
		
		Point3D p3 = new Point3D();
		Point3D p3_2 = new Point3D(1, 2, 3);
		
		System.out.println(p3.toString());
		System.out.println(p3_2.toString());
	}

}

class TV {
	private boolean power;
	int channel;
	String modelName = "TV";
	
	// �������̵� ����
	// 1. ��ȯŸ���� ��ġ�ؾ���
	// 2. ���������ڴ� ���󺸴� ���� ������ ������ �� ����
	// 3. ���ܴ� ������ �޼��庸�� ���� ������ �� ����
	@Override // Object��ü�� toString�޼��� �������̵�
	public String toString() {
		return "���� ä���� " +channel+ "�� �Դϴ�.";
	}
	
	void pSwitch() {
		this.power = !power;
		if (power) {
			System.out.println("TV�� �������ϴ�.");
		}
		else {
			System.out.println("TV�� �������ϴ�.");
		}
	}
	
	void cUp() { this.channel++; }
	void cDown() { this.channel--; }
	
	Speaker speaker = new Speaker(); // Speaker ��ü�� ����
	// ���Ե� ��ü�� Speaker�� volume�� �����ϴ� �޼����
	void vUp() { speaker.volume++; }
	void vDown() { speaker.volume--; }
	void mute() {
		speaker.volume = 0;
		System.out.println("���Ұ� �Ǿ����ϴ�.");
	}
}

class SmartTV extends TV { // TV ��ü�� ���
	private boolean iotPower;
	String modelName = "Smart TV";
	
	void iotSwitch() {
		this.iotPower = !iotPower;
		if (iotPower) {
			System.out.println("IOT ����� �������ϴ�.");
		}
		else {
			System.out.println("IOT ����� �������ϴ�.");
		}
	}
	
	void getModel() {
		// ������ �ν��Ͻ� �������� ������ ��, super�� ���� ��ü�� ����� ���,
		// this�� ���� ��ü�� ����� ������� �Ѵ�
		System.out.println("�� �𵨸��� " +this.modelName+ "�̸�, ");
		System.out.println("���� �𵨸��� " +super.modelName+ "�Դϴ�.");
	}
}

class Speaker {
	int volume;
}

class Point {
	int x;
	int y;
	
	Point() {
		this(0, 0);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "���� ��ǥ�� " +x+ ", " +y+ "�Դϴ�.";
	}
}

class Point3D extends Point {
	int z;
	
	Point3D() {
		super(); // ������ �⺻ ������ Point()�� ȣ��
	}
	
	Point3D(int x, int y, int z) {
		// ���������� �������� ù �ٿ��� �����ڰ� �;���
		// ���� �����ڰ� ���ٸ� �⺻ �����ڸ� �����Ϸ��� ȣ���ϰ� �Ǿ�����
		// super(); ������ �⺻ ������ ����x -> �����߻�
		super(x, y); // ������ ������ Point(int x, int y)�� ȣ��
		
		// this.x = x;
		// this.y = y; ���� ������ �⺻ �����ڰ� ���� �ȵǾ� �ְ�
		// ���� ������ super ���� �ʱ�ȭ�� �Ϸ��� �� ��� �����߻�
		// �����Ϸ��� ���� ������ �������� super()�� ȣ��Ǵµ� ������ �⺻ �����ڰ� ���� ����
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "���� ��ǥ�� " +x+ ", " +y+ ", " +z+ "�Դϴ�.";
	}
}
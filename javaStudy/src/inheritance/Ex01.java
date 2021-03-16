package inheritance;

public class Ex01 {

	public static void main(String[] args) {
		SmartTV smartTV = new SmartTV();
		
		smartTV.pSwitch(); // 조상 객체인 TV의 메서드를 호출
		smartTV.mute(); // TV객체에 포함된 Speaker객체의 메서드 호출
		smartTV.iotSwitch(); // SmartTV객체의 메서드 호출
		
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
	
	// 오버라이딩 조건
	// 1. 반환타입이 일치해야함
	// 2. 접근제어자는 조상보다 좁은 범위로 변경할 수 없다
	// 3. 예외는 조상의 메서드보다 많이 선언할 수 없다
	@Override // Object객체의 toString메서드 오버라이딩
	public String toString() {
		return "현재 채널은 " +channel+ "번 입니다.";
	}
	
	void pSwitch() {
		this.power = !power;
		if (power) {
			System.out.println("TV가 켜졌습니다.");
		}
		else {
			System.out.println("TV가 꺼졌습니다.");
		}
	}
	
	void cUp() { this.channel++; }
	void cDown() { this.channel--; }
	
	Speaker speaker = new Speaker(); // Speaker 객체를 포함
	// 포함된 객체인 Speaker의 volume을 조절하는 메서드들
	void vUp() { speaker.volume++; }
	void vDown() { speaker.volume--; }
	void mute() {
		speaker.volume = 0;
		System.out.println("음소거 되었습니다.");
	}
}

class SmartTV extends TV { // TV 객체를 상속
	private boolean iotPower;
	String modelName = "Smart TV";
	
	void iotSwitch() {
		this.iotPower = !iotPower;
		if (iotPower) {
			System.out.println("IOT 기능이 켜졌습니다.");
		}
		else {
			System.out.println("IOT 기능이 꺼졌습니다.");
		}
	}
	
	void getModel() {
		// 동일한 인스턴스 변수명이 존재할 때, super는 조상 객체의 멤버를 대상,
		// this는 현재 객체의 멤버를 대상으로 한다
		System.out.println("이 모델명은 " +this.modelName+ "이며, ");
		System.out.println("상위 모델명은 " +super.modelName+ "입니다.");
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
		return "현재 좌표는 " +x+ ", " +y+ "입니다.";
	}
}

class Point3D extends Point {
	int z;
	
	Point3D() {
		super(); // 조상의 기본 생성자 Point()를 호출
	}
	
	Point3D(int x, int y, int z) {
		// 마찬가지로 생성자의 첫 줄에는 생성자가 와야함
		// 만약 생성자가 없다면 기본 생성자를 컴파일러가 호출하게 되어있음
		// super(); 조상의 기본 생성자 정의x -> 에러발생
		super(x, y); // 조상의 생성자 Point(int x, int y)를 호출
		
		// this.x = x;
		// this.y = y; 만약 조상의 기본 생성자가 정의 안되어 있고
		// 조상 생성자 super 없이 초기화를 하려고 할 경우 에러발생
		// 컴파일러에 의해 조상의 생성자인 super()가 호출되는데 조상은 기본 생성자가 없기 때문
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "현재 좌표는 " +x+ ", " +y+ ", " +z+ "입니다.";
	}
}
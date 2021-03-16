package inheritance;

public class Ext03 {
	public static void main(String[] args) {
		Unit[] group = new Unit[10];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new DropShip();
		// 각 유닛들은 타입이 Unit이므로 조상에서 구현된 변수나, 메서드만 사용이 가능
		// group[0].stimPack(); 미구현된 메서드라고 오류발생
		for (int i=0; i<group.length; i++) {
			if (group[i] == null) {
				break;
			}
			group[i].move(10, 15); // 각 객체에서 구현된 move() 메서드 실행
			System.out.println(i);
		}
		for (int i=0; i<group.length; i++) {
			if (group[i] == null) {
				return;
			}
			group[i].stop(); // 조상 객체의 stop() 메서드 실행
		}
	}

}

abstract class Unit {
	int x, y;
	int speed;
	abstract void move(int x, int y);
	void stop() {
		this.speed = 0;
		System.out.println("현재 위치에 정지!!");
	}
}

class Marine extends Unit { // 보병
	int speed = 10;
	void move(int x, int y) { // 추상메서드 Unit을 구현
		System.out.println(speed+" 속력으로, ["+x+", "+y+"] 위치로 이동합니다.");
	}
	void stimPack() {
		System.out.println("스팀팩 사용");
	}
	
}

class Tank extends Unit { // 탱크
	int speed = 20;
	void move(int x, int y) {
		System.out.println(speed+" 속력으로, ["+x+", "+y+"] 위치로 이동합니다.");
	}
	void changeMode() {
		System.out.println("탱크의 모드를 변환합니다.");
	}
}

class DropShip extends Unit { // 수송선
	int speed = 25;
	void move(int x, int y) {
		System.out.println(speed+" 속력으로, ["+x+", "+y+"] 위치로 이동합니다.");
	}
	void loading() {
		System.out.println("수송을 실시합니다.");
	}
	void unloading() {
		System.out.println("수송을 실시합니다.");
	}
}
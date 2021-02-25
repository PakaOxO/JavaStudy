package inheritance;

public class Ext03 {
	public static void main(String[] args) {
		Unit[] group = new Unit[10];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new DropShip();
		// �� ���ֵ��� Ÿ���� Unit�̹Ƿ� ���󿡼� ������ ������, �޼��常 ����� ����
		// group[0].stimPack(); �̱����� �޼����� �����߻�
		for (int i=0; i<group.length; i++) {
			if (group[i] == null) {
				break;
			}
			group[i].move(10, 15); // �� ��ü���� ������ move() �޼��� ����
			System.out.println(i);
		}
		for (int i=0; i<group.length; i++) {
			if (group[i] == null) {
				return;
			}
			group[i].stop(); // ���� ��ü�� stop() �޼��� ����
		}
	}

}

abstract class Unit {
	int x, y;
	int speed;
	abstract void move(int x, int y);
	void stop() {
		this.speed = 0;
		System.out.println("���� ��ġ�� ����!!");
	}
}

class Marine extends Unit { // ����
	int speed = 10;
	void move(int x, int y) { // �߻�޼��� Unit�� ����
		System.out.println(speed+" �ӷ�����, ["+x+", "+y+"] ��ġ�� �̵��մϴ�.");
	}
	void stimPack() {
		System.out.println("������ ���");
	}
	
}

class Tank extends Unit { // ��ũ
	int speed = 20;
	void move(int x, int y) {
		System.out.println(speed+" �ӷ�����, ["+x+", "+y+"] ��ġ�� �̵��մϴ�.");
	}
	void changeMode() {
		System.out.println("��ũ�� ��带 ��ȯ�մϴ�.");
	}
}

class DropShip extends Unit { // ���ۼ�
	int speed = 25;
	void move(int x, int y) {
		System.out.println(speed+" �ӷ�����, ["+x+", "+y+"] ��ġ�� �̵��մϴ�.");
	}
	void loading() {
		System.out.println("������ �ǽ��մϴ�.");
	}
	void unloading() {
		System.out.println("������ �ǽ��մϴ�.");
	}
}
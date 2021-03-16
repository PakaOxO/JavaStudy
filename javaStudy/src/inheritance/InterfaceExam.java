package inheritance;

abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() { System.out.println("����ϴ�."); }
}

interface Fightable {
	void move(int x, int y); // public abstract ����
	void attack(Fightable f); // public abstract ����
}

class Fighter extends Unit2 implements Fightable {
	public void move(int x, int y) { System.out.println("["+x+","+y+"] ���� �̵�"); }
	public void attack(Fightable f) {
		System.out.println(f+"��(��) ����");
	}
	Fightable getFightable() { // �ο� �� �ִ� ��ü�� ��ȯ
		Fighter f = new Fighter();
		return f;
	}
}

public class InterfaceExam {
	public static void main(String[] args) {
		Unit2 u = new Fighter();
		Fightable f = new Fighter();
		
		u.move(100, 200);
		// u.attack() // Unit2���� attack() �޼��尡 ��� ȣ�� �Ұ�
		
		f.move(100, 200);
		f.attack(new Fighter());
		// f.stop() // Fightable���� stop() �޼��尡 ��� ȣ�� �Ұ�
		
		Fighter f2 = new Fighter();
		Fightable f3 = f2.getFightable();
		f.attack(f3); // Fighter f�� f2�� Fightable f3�� ���� ����
	}
}
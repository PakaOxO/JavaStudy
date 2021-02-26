package inheritance;

abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() { System.out.println("멈춥니다."); }
}

interface Fightable {
	void move(int x, int y); // public abstract 생략
	void attack(Fightable f); // public abstract 생략
}

class Fighter extends Unit2 implements Fightable {
	public void move(int x, int y) { System.out.println("["+x+","+y+"] 으로 이동"); }
	public void attack(Fightable f) {
		System.out.println(f+"을(를) 공격");
	}
	Fightable getFightable() { // 싸울 수 있는 객체를 반환
		Fighter f = new Fighter();
		return f;
	}
}

public class InterfaceExam {
	public static void main(String[] args) {
		Unit2 u = new Fighter();
		Fightable f = new Fighter();
		
		u.move(100, 200);
		// u.attack() // Unit2에는 attack() 메서드가 없어서 호출 불가
		
		f.move(100, 200);
		f.attack(new Fighter());
		// f.stop() // Fightable에는 stop() 메서드가 없어서 호출 불가
		
		Fighter f2 = new Fighter();
		Fightable f3 = f2.getFightable();
		f.attack(f3); // Fighter f가 f2를 Fightable f3로 공격 가능
	}
}
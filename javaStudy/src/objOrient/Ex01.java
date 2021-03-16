package objOrient;

// Ŭ���� ������ �ν��Ͻ� ���� ��
public class Ex01 {

	public static void main(String[] args) {
		System.out.println("Card.width = " +Card.width); // Ŭ���� ������ ��ü���� �ʿ�x
		System.out.println("Card.height = " +Card.height);
		
		Card c1 = new Card();
		c1.kind = "Spade";
		c1.number = 4;
		
		Card c2 = new Card();
		c2.kind = "Heart";
		c2.number = 2;
		
		System.out.println("c1�� " +c1.kind+ ", " +c1.number+ "�̰�, ũ��� ��: " +Card.width+ ", ����: " +Card.height+ "�Դϴ�.");
		System.out.println("c2�� " +c2.kind+ ", " +c2.number+ "�̰�, ũ��� ��: " +Card.width+ ", ����: " +Card.height+ "�Դϴ�.");
		System.out.println("���� 150���� ���̸� 350���� ����...");
		
		Card.width = 150;
		Card.height = 350;
		System.out.println("c1�� " +c1.kind+ ", " +c1.number+ "�̰�, ũ��� ��: " +Card.width+ ", ����: " +Card.height+ "�Դϴ�.");
		System.out.println("c2�� " +c2.kind+ ", " +c2.number+ "�̰�, ũ��� ��: " +Card.width+ ", ����: " +Card.height+ "�Դϴ�.");
	}

}

class Card {
	String kind; // Instance variable
	int number;
	
	static int width = 100; // Class variable
	static int height = 250;
}
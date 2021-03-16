package objOrient;

// 클래스 변수와 인스턴스 변수 비교
public class Ex01 {

	public static void main(String[] args) {
		System.out.println("Card.width = " +Card.width); // 클래스 변수는 객체생성 필요x
		System.out.println("Card.height = " +Card.height);
		
		Card c1 = new Card();
		c1.kind = "Spade";
		c1.number = 4;
		
		Card c2 = new Card();
		c2.kind = "Heart";
		c2.number = 2;
		
		System.out.println("c1은 " +c1.kind+ ", " +c1.number+ "이고, 크기는 폭: " +Card.width+ ", 높이: " +Card.height+ "입니다.");
		System.out.println("c2은 " +c2.kind+ ", " +c2.number+ "이고, 크기는 폭: " +Card.width+ ", 높이: " +Card.height+ "입니다.");
		System.out.println("폭을 150으로 높이를 350으로 변경...");
		
		Card.width = 150;
		Card.height = 350;
		System.out.println("c1은 " +c1.kind+ ", " +c1.number+ "이고, 크기는 폭: " +Card.width+ ", 높이: " +Card.height+ "입니다.");
		System.out.println("c2은 " +c2.kind+ ", " +c2.number+ "이고, 크기는 폭: " +Card.width+ ", 높이: " +Card.height+ "입니다.");
	}

}

class Card {
	String kind; // Instance variable
	int number;
	
	static int width = 100; // Class variable
	static int height = 250;
}
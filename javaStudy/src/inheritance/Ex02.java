package inheritance;

public class Ex02 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv2());
		b.buy(new Computer());
		b.getSum();
	}

}

class Buyer {
	private int money = 1000;
	private int bonusPoint = 0;
	
	// Product의 자손객체들을 담을 배열 생성
	Product[] cart = new Product[10];
	
	int i = 0;
	
	// Product의 자손객체들이 모두 들어올 수 있음(매개변수의 다형성)
	void buy(Product product) {
		if (money < product.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		cart[i] = product;
		i++;
	}
	
	void getSum() {
		int sum = 0;
		int point = 0;
		String itemList = "";
		for (int i=0; i<cart.length; i++) {
			if (cart[i] != null) {
				sum += cart[i].price;
				point += cart[i].bonusPoint;
				itemList += cart[i].toString() +" ";
			}
		}
		System.out.println("구매한 품목의 전체 금액은 " +sum+ "입니다.");
		System.out.println("현재 적립된 포인트는 " +point+ "입니다.");
		System.out.println("구매한 품목은 " +itemList+ "입니다.");
	}
}

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		this.bonusPoint = price / 10;
	}
}

class Tv2 extends Product {
	Tv2() {
		super(100); // 조상객체 생성자 호출, Product(int price)
	}
	
	@Override
	public String toString() {
		return "Tv"; // toString() 메서드 overriding
	}
}

class Computer extends Product {
	Computer() {
		super(150); // 조상객체 생성자 호출, Product(int price)
	}
	
	@Override
	public String toString() {
		return "Computer "; // toString() 메서드 overriding
	}
}
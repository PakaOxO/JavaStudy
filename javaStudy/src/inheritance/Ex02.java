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
	
	// Product�� �ڼհ�ü���� ���� �迭 ����
	Product[] cart = new Product[10];
	
	int i = 0;
	
	// Product�� �ڼհ�ü���� ��� ���� �� ����(�Ű������� ������)
	void buy(Product product) {
		if (money < product.price) {
			System.out.println("�ܾ��� �����մϴ�.");
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
		System.out.println("������ ǰ���� ��ü �ݾ��� " +sum+ "�Դϴ�.");
		System.out.println("���� ������ ����Ʈ�� " +point+ "�Դϴ�.");
		System.out.println("������ ǰ���� " +itemList+ "�Դϴ�.");
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
		super(100); // ����ü ������ ȣ��, Product(int price)
	}
	
	@Override
	public String toString() {
		return "Tv"; // toString() �޼��� overriding
	}
}

class Computer extends Product {
	Computer() {
		super(150); // ����ü ������ ȣ��, Product(int price)
	}
	
	@Override
	public String toString() {
		return "Computer "; // toString() �޼��� overriding
	}
}
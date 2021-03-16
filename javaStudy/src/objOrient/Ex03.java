package objOrient;

public class Ex03 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("���� d.x�� ���� " +d.x);
		
		change1(d.x);
		System.out.println("change1 �޼��� ȣ�� �� d.x�� ����" +d.x); // �⺻�� �Ű������� ReadOnly!!
		
		change2(d);
		System.out.println("change1 �޼��� ȣ�� �� d.x�� ����" +d.x); // ������ �Ű������� Read & Write ����
	}
	
	static void change1(int x) {
		x = 1000;
		System.out.println("�⺻�� �Ű������� ���� x�� ���� ���� " +x);
	}

	static void change2(Data d) {
		d.x = 1000;
		System.out.println("������ �Ű������� ���� x�� ���� ���� " +d.x);
	}
}

class Data {
	int x;
}
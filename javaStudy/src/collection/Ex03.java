package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex03 {
	// ť�� Ȱ���� ���� : ����ũ�⸦ ������ �� �ִ� �����Ϳ� �ʰ����� ������ �Է½� �� ó�� �Էµ� �����ͺ��� ����..
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // ť�� 5�������� ����
	
	public static void main(String[] args) {
		
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		
		while(true) {
			System.out.print(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				// �ƹ��͵� �Էµ��� ������ �ٸ� ������..
				if ("".equals(input)) continue; // input�� null�ϼ��� �ֱ� ������ input.equals("")��� ���
				
				if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - ������ �����ݴϴ�.");
					System.out.println(" q �Ǵ� Q - ���α׷��� �����մϴ�.");
					System.out.println(" history - ������� �Էµ� �����͸� " + MAX_SIZE + "������ �����ݴϴ�.");
				} else if (input.equalsIgnoreCase("q")) {
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
				} else if (input.equalsIgnoreCase("history")) {
					save(input);
					
					// ������ ��Ұ��� �о���� ���� LinkedList�� get()�޼ҵ� ����� ���� ����ȯ
					LinkedList list = (LinkedList)q;
					final int SIZE = list.size();
					for (int i=0; i<SIZE; i++) {
						System.out.println((i+1)+"."+list.get(i));
					}
				} else {
					save(input);
				}
				
			} catch(Exception e) {
				System.out.println("�Է¿����Դϴ�.");
			}
		}
	}

	public static void save(String input) {
		// ť�� �Էµ� ������ ����
		if (!"".equals(input)) {
			q.offer(input);
		}
		// ������ ����� �ִ�ũ�⸦ �Ѿ�� �� ó�� ������ ����
		if (q.size() > MAX_SIZE) {
			q.remove();
		}
	}
}

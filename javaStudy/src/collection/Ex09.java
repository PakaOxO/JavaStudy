package collection;

import java.util.HashMap;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		System.out.println(map);
		// �̹� ������ key�� �ٽ� put�� �߻��Ѵٸ� value���� ������ ������ ����
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("id�� password�� �Է����ּ���");
			System.out.print("id : ");
			String id = scanner.nextLine().trim();
			System.out.print("password : ");
			String password = scanner.nextLine().trim();
			
			if (!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�.");
				continue;
			}
			if (!map.get(id).equals(password)) {
				System.out.println("�н����尡 Ʋ���ϴ�.");
				continue;
			}
			
			System.out.println("����� Ȯ�� �Ϸ�...");
			break;
		}
	}
}

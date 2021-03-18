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
		// 이미 저정된 key에 다시 put이 발생한다면 value값을 마지막 값으로 변경
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("id와 password를 입력해주세요");
			System.out.print("id : ");
			String id = scanner.nextLine().trim();
			System.out.print("password : ");
			String password = scanner.nextLine().trim();
			
			if (!map.containsKey(id)) {
				System.out.println("입력하신 id가 존재하지 않습니다.");
				continue;
			}
			if (!map.get(id).equals(password)) {
				System.out.println("패스워드가 틀립니다.");
				continue;
			}
			
			System.out.println("사용자 확인 완료...");
			break;
		}
	}
}

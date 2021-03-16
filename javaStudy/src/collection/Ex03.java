package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex03 {
	// 큐를 활용한 예시 : 일정크기를 저장할 수 있는 데이터에 초과분의 데이터 입력시 맨 처음 입력된 데이터부터 삭제..
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // 큐에 5개까지만 저장
	
	public static void main(String[] args) {
		
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.print(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				// 아무것도 입력되지 않으면 다름 루프로..
				if ("".equals(input)) continue; // input이 null일수도 있기 때문에 input.equals("")대신 사용
				
				if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 현재까지 입력된 데이터를 " + MAX_SIZE + "개까지 보여줍니다.");
				} else if (input.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				} else if (input.equalsIgnoreCase("history")) {
					save(input);
					
					// 각각의 요소값을 읽어오기 위해 LinkedList의 get()메소드 사용을 위한 형변환
					LinkedList list = (LinkedList)q;
					final int SIZE = list.size();
					for (int i=0; i<SIZE; i++) {
						System.out.println((i+1)+"."+list.get(i));
					}
				} else {
					save(input);
				}
				
			} catch(Exception e) {
				System.out.println("입력오류입니다.");
			}
		}
	}

	public static void save(String input) {
		// 큐에 입력된 데이터 저장
		if (!"".equals(input)) {
			q.offer(input);
		}
		// 데이터 저장시 최대크기를 넘어가면 맨 처음 데이터 삭제
		if (q.size() > MAX_SIZE) {
			q.remove();
		}
	}
}

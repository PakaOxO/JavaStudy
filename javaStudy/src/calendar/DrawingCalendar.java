package calendar;

import java.util.Calendar;

public class DrawingCalendar {
	public static void main(String[] args) {
		// �Էµ� ����, �� ���� ������ ���� ���, return
		if (args.length != 2) {
			System.out.println("�Է°��� ������ �ֽ��ϴ�.");
			return;
		}
		
		// �Է� �� üũ
		if (!(1 <= Integer.parseInt(args[1]) && Integer.parseInt(args[1]) <= 12)) {
			System.out.println("�Է� ���� 1�̻� 12������ ���ڷ� �ؾ��մϴ�.");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance(); 
		
		// sDay�� �Էµ� ���� 1��, eDay�� �Է� ���� ���� ���� 1�Ϸ� ����
		sDay.set(year, month-1, 1);
		eDay.set(year, month, 1);
		
		// eDay�� add()�޼ҵ带 �̿� �Է� ���� ������ ��¥�� ����
		eDay.add(Calendar.DATE, -1);
		
		// ���� ����, �Է� ���� ������ �� ������ ����
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("      " + year + "�� " + month + "��");
		System.out.println(" SU MO TU WE TH FR SA");
		
		// ���� ù ������ ������(3)�̶�� 2ȸ��ŭ ����(3ĭ) �Է�
		for (int i=1; i<START_DAY_OF_WEEK; i++) {
			System.out.print("   ");
		}
		
		for (int i=1, n=START_DAY_OF_WEEK; i<=END_DAY; i++, n++) {
			System.out.print((i<10)? "  " + i : " " + i);
			if (n%7==0) { System.out.println(); } // �����(7) ��¥ �Է� ���� ��, �ٹٲ�
		}
	}
}

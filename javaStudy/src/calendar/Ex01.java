package calendar;

import java.util.Calendar;

public class Ex01 {
	public static void main(String[] args) {
		String[] day_of_week = {"", "��", "��", "ȭ", "��", "��", "��", "��"};
		
		// Calendar��ü�� �޼ҵ��...
		Calendar today = Calendar.getInstance();
		System.out.println("���س⵵ : " + today.get(Calendar.YEAR));
		System.out.println("�̹� ��(0~11 + 1) : " + (today.get(Calendar.MONTH)+1) + "��");
		System.out.println("������ �� ��° �� : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�̹� ���� �� ��° �� : " + today.get(Calendar.WEEK_OF_MONTH));
		// DATE �޼ҵ�� DAY_OF_MONTH �޼ҵ��� ����� ����
		System.out.println("�̹� ���� �� �� : " + today.get(Calendar.DATE));
		System.out.println("�̹� ���� �� �� : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("������ �� �� : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("����(1~7, 1: �Ͽ���) : " + day_of_week[today.get(Calendar.DAY_OF_WEEK)] + "����");
		System.out.println("�̹� ���� �� ��° ���� : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("����/����(����: 0, ����: 1) : " + today.get(Calendar.AM_PM));
		System.out.println("�ð�(0~11) : " + today.get(Calendar.HOUR));
		System.out.println("�ð�(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("��(0~59) : " + today.get(Calendar.MINUTE));
		System.out.println("��(0~59) : " + today.get(Calendar.SECOND));
		System.out.println("�и���(0~999) : " + today.get(Calendar.MILLISECOND));
		System.out.println("TIMEZONE(-12~12) : " + today.get(Calendar.ZONE_OFFSET));
		System.out.println("�̹� ���� ������ �� : " + today.getActualMaximum(Calendar.DATE));
	}

}

package calendar;

import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
		// �ð� ����(set�޼ҵ�)�� ����ð����� ���� ���
		Calendar today = Calendar.getInstance();
		final int[] timeUnit = {3600, 60, 1};
		final String[] timeUnitName = {"��", "��", "��"};
		
		Calendar time2 = Calendar.getInstance();
		time2.set(Calendar.HOUR_OF_DAY, 10);
		time2.set(Calendar.MINUTE, 10);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println("������ �ð��� "
			+ time2.get(Calendar.HOUR_OF_DAY) + timeUnitName[0]
			+ time2.get(Calendar.MINUTE) + timeUnitName[1]
			+ time2.get(Calendar.SECOND) + timeUnitName[2] + "�Դϴ�.");
		System.out.println("���� �ð��� "
			+ today.get(Calendar.HOUR_OF_DAY) + timeUnitName[0]
			+ today.get(Calendar.MINUTE) + timeUnitName[1]
			+ today.get(Calendar.SECOND) + timeUnitName[2] + "�Դϴ�.");
		
		long difference = Math.abs(today.getTimeInMillis() - time2.getTimeInMillis()) / 1000;
		String tmp = "";
		System.out.println("������ �ð��� ����ð��� ���̴� " + difference + "�и����̰�, �ú��ʷδ�");
		for (int i=0; i<timeUnit.length; i++) {
			tmp += (difference / timeUnit[i] + timeUnitName[i]);
			difference %= timeUnit[i];
		}
		System.out.println(tmp + "��ŭ ���̰� ���ϴ�.");
		
		Calendar today2 = Calendar.getInstance();
		today2.clear();
		// ��¥�� ������ �ڿ� �ʱ�ȭ�� �ϴ� ���� ����(��¥, �ð����� ����� ���� �� ��,�и��� ���̿� ���� ������ �߻�����)
	}

}

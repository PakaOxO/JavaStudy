package calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex05 {
	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date today = new Date();
		
		String result = df.format(today);
		System.out.println(result);
		
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm�� ss��");
		try {
			Date date = df.parse("2020-10-10");
			String result2 = df2.format(date);
			System.out.println("2020�� 20�� 20�� : " + result2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("now : " + df2.format(today));
	}

}

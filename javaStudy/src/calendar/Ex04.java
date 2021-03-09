package calendar;

import java.text.DecimalFormat;

public class Ex04 {
	public static void main(String[] args) {
		// #은 10진수 형식, 0은 값이 없으면 0으로 채움, E는 지수형태로 변환하는 포맷
		DecimalFormat df = new DecimalFormat("#,###.####");
		DecimalFormat df2 = new DecimalFormat("#,###.0000");
		
		try {
			Number num = df.parse("1,234,567.89");
			double d = num.doubleValue();
			System.out.println("1,234,567.89 -> " + d);
			System.out.println(df.format(d)); // df형식의 문자열로 변환
			Number num2 = df2.parse("1,234,567.89");
			double d2 = num2.doubleValue();
			System.out.println("1,234,567.89 -> " + d2);
			System.out.println(df2.format(d2));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

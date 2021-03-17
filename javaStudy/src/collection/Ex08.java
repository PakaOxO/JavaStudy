package collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// TreeSet객체, 이진트리 형태, 큰 값은 왼쪽/작은 값은 오른쪽에 저장
// 자료의 저장, 삭제에 많은 시간 소요
public class Ex08 {
	public static void main(String[] args) {
		Set set = new TreeSet(new TestComp());
//		Set set = new HashSet(); // 원래 자동정렬이 안돼야 하는데 뭔가 자동정렬이 된다..
		
		// 1~9중 랜덤한 값을 set의 크기가 6이 될때 까지 저장
//		for (int i=0; set.size() < 6; i++) {
//			int num = (int)(Math.random()*9 + 1);
//			set.add(num);
//		}
		
//		set.add(new Test()); // 객체의 정렬 기준이 없어 error
		
		set.add(new Test());
		set.add(new Test());
		set.add(new Test());
		set.add(new Test());
		System.out.println(set);
		
		// TreeSet subSet메소드
		TreeSet set2 = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set2.add("abc"); set2.add("alien"); set2.add("bat");
		set2.add("car"); set2.add("Car"); set2.add("disc");
		set2.add("dance"); set2.add("dZZZ"); set2.add("dzzz");
		set2.add("elepant"); set2.add("elevator"); set2.add("fan");
		set2.add("flower");
		
		System.out.println(set2); // 글자 순서대로 정렬(대문자는 앞으로)
		System.out.println("range from : " + from + ", to : " + to);
		// b와 d사이의 단어를 설정
		System.out.println("result1 : " + set2.subSet(from, to));
		// b와 d로 시작하는 단어를 찾기 위해서는 to에 zzz 같은 단어를 붙여 도출 가능
		System.out.println("result2 : " + set2.subSet(from, to + "zzz"));
	
	
		// TreeSet의 메소드 예제
		TreeSet set3 = new TreeSet();
		int[] nums = {30, 45, 60, 80, 100, 10, 35, 50};
		for (int i=0; i<nums.length; i++) {
			set3.add(nums[i]);
		}
		System.out.println(set3);
		
		System.out.println("50보다 작은 값 : " + set3.headSet(50));
		System.out.println("50보다 큰 값 : " + set3.tailSet(50));
		System.out.println("45과 80사이의 값 : " + set3.subSet(45, 80));
	}
}

class Test implements Comparable{
	// 객체 정렬기준을 compareTo메소드 오버라이딩을 통해 설정가능
	@Override
	public int compareTo(Object o) {
		return -1;
	}
}

// 비교객체인 Comparator의 compare 오버라이딩
class TestComp implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		return -1;
//		return 0; // 무조건 비교 대상이 같다고 할 경우, TreeSet에는 한개의 Test객체만 저장되게 된다
	}
}
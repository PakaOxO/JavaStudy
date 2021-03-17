package collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// TreeSet��ü, ����Ʈ�� ����, ū ���� ����/���� ���� �����ʿ� ����
// �ڷ��� ����, ������ ���� �ð� �ҿ�
public class Ex08 {
	public static void main(String[] args) {
		Set set = new TreeSet(new TestComp());
//		Set set = new HashSet(); // ���� �ڵ������� �ȵž� �ϴµ� ���� �ڵ������� �ȴ�..
		
		// 1~9�� ������ ���� set�� ũ�Ⱑ 6�� �ɶ� ���� ����
//		for (int i=0; set.size() < 6; i++) {
//			int num = (int)(Math.random()*9 + 1);
//			set.add(num);
//		}
		
//		set.add(new Test()); // ��ü�� ���� ������ ���� error
		
		set.add(new Test());
		set.add(new Test());
		set.add(new Test());
		set.add(new Test());
		System.out.println(set);
		
		// TreeSet subSet�޼ҵ�
		TreeSet set2 = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set2.add("abc"); set2.add("alien"); set2.add("bat");
		set2.add("car"); set2.add("Car"); set2.add("disc");
		set2.add("dance"); set2.add("dZZZ"); set2.add("dzzz");
		set2.add("elepant"); set2.add("elevator"); set2.add("fan");
		set2.add("flower");
		
		System.out.println(set2); // ���� ������� ����(�빮�ڴ� ������)
		System.out.println("range from : " + from + ", to : " + to);
		// b�� d������ �ܾ ����
		System.out.println("result1 : " + set2.subSet(from, to));
		// b�� d�� �����ϴ� �ܾ ã�� ���ؼ��� to�� zzz ���� �ܾ �ٿ� ���� ����
		System.out.println("result2 : " + set2.subSet(from, to + "zzz"));
	
	
		// TreeSet�� �޼ҵ� ����
		TreeSet set3 = new TreeSet();
		int[] nums = {30, 45, 60, 80, 100, 10, 35, 50};
		for (int i=0; i<nums.length; i++) {
			set3.add(nums[i]);
		}
		System.out.println(set3);
		
		System.out.println("50���� ���� �� : " + set3.headSet(50));
		System.out.println("50���� ū �� : " + set3.tailSet(50));
		System.out.println("45�� 80������ �� : " + set3.subSet(45, 80));
	}
}

class Test implements Comparable{
	// ��ü ���ı����� compareTo�޼ҵ� �������̵��� ���� ��������
	@Override
	public int compareTo(Object o) {
		return -1;
	}
}

// �񱳰�ü�� Comparator�� compare �������̵�
class TestComp implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		return -1;
//		return 0; // ������ �� ����� ���ٰ� �� ���, TreeSet���� �Ѱ��� Test��ü�� ����ǰ� �ȴ�
	}
}
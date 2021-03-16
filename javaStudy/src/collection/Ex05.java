package collection;

import java.util.Arrays;
import java.util.Comparator;

public class Ex05 {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12,13},{21,22,23}};
		
		System.out.println("arr = " +Arrays.toString(arr));
		System.out.println("arr2D = " +Arrays.deepToString(arr2D));
		
		// copyOf�� ������ �迭�� ������ ����, copyOfRange�� ������ �迭�� ���۰� �� index�� �Է�
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOfRange(arr, 1, 3);
		
		System.out.println("arr2 =" + Arrays.toString(arr2));
		System.out.println("arr3 =" + Arrays.toString(arr3));
		System.out.println("arr4 =" + Arrays.toString(arr4));
		
		// �� �迭�� ���ϴ� �޼ҵ�, 2���� �迭�� ��� deepEquals ���
		System.out.println("(arr1 == arr2) = " + Arrays.equals(arr, arr2));
		
		// Ư�� �迭�� �ڿ� �Էµ� ������ ä��� �޼ҵ�
		int[] arr5 = new int[5];
		Arrays.fill(arr5, 9);
		System.out.println("arr5 = " + Arrays.toString(arr5));
		
		// setAll�� �ش� �迭�� �ڿ� �Էµ� ���ٽĿ� ���� ����� ������ ä���ִ� �޼ҵ�
		int[] arr6 = new int[5];
		Arrays.setAll(arr6, (i) -> (int)(Math.random()*9+1));
		System.out.println("arr6 = " + Arrays.toString(arr6));
		
		// sort�޼ҵ�� binaraySearch�޼ҵ�, ����Ž���� sorting ���Ŀ� �ǽ��ؾ� ��
		int[] arr7 = {4, 2, 1, 3, 0};
		System.out.println("before sorting = " + Arrays.toString(arr7));
		System.out.println("index of 2 = " + Arrays.binarySearch(arr7, 2));
		Arrays.sort(arr7);
		System.out.println("after sorting = " + Arrays.toString(arr7));
		System.out.println("index of 2 = " + Arrays.binarySearch(arr7, 2));
	
		String[] strArr = {"lion", "cat", "Dog", "tiger"};
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		// ��ҹ��� �������ϴ� sorting
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		// ���� �������� sorting
		Arrays.sort(strArr, new Descending());
		System.out.println("strArr = " + Arrays.toString(strArr));
	}
}

// �������� �����ϱ� ���� ���ο� Ŭ���� ����
// Comparator�� compareTo �޼ҵ� ����� ���� �������̽��� ����
class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			// �Է¹��� Object��ü�� ����ȯ
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1; // �⺻ ���Ĺ���� compareTo�� �������� ����
		}
		return -1;
	}
}

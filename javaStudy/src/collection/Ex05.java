package collection;

import java.util.Arrays;
import java.util.Comparator;

public class Ex05 {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12,13},{21,22,23}};
		
		System.out.println("arr = " +Arrays.toString(arr));
		System.out.println("arr2D = " +Arrays.deepToString(arr2D));
		
		// copyOf는 복제할 배열과 복제할 길이, copyOfRange는 복제할 배열의 시작과 끝 index를 입력
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOfRange(arr, 1, 3);
		
		System.out.println("arr2 =" + Arrays.toString(arr2));
		System.out.println("arr3 =" + Arrays.toString(arr3));
		System.out.println("arr4 =" + Arrays.toString(arr4));
		
		// 두 배열을 비교하는 메소드, 2차원 배열일 경우 deepEquals 사용
		System.out.println("(arr1 == arr2) = " + Arrays.equals(arr, arr2));
		
		// 특정 배열을 뒤에 입력된 값으로 채우는 메소드
		int[] arr5 = new int[5];
		Arrays.fill(arr5, 9);
		System.out.println("arr5 = " + Arrays.toString(arr5));
		
		// setAll는 해당 배열을 뒤에 입력된 람다식에 의해 도출된 값으로 채워넣는 메소드
		int[] arr6 = new int[5];
		Arrays.setAll(arr6, (i) -> (int)(Math.random()*9+1));
		System.out.println("arr6 = " + Arrays.toString(arr6));
		
		// sort메소드와 binaraySearch메소드, 이진탐색은 sorting 이후에 실시해야 함
		int[] arr7 = {4, 2, 1, 3, 0};
		System.out.println("before sorting = " + Arrays.toString(arr7));
		System.out.println("index of 2 = " + Arrays.binarySearch(arr7, 2));
		Arrays.sort(arr7);
		System.out.println("after sorting = " + Arrays.toString(arr7));
		System.out.println("index of 2 = " + Arrays.binarySearch(arr7, 2));
	
		String[] strArr = {"lion", "cat", "Dog", "tiger"};
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		// 대소문자 구별안하는 sorting
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		// 사전 역순으로 sorting
		Arrays.sort(strArr, new Descending());
		System.out.println("strArr = " + Arrays.toString(strArr));
	}
}

// 역순으로 정렬하기 위해 새로운 클래스 생성
// Comparator의 compareTo 메소드 사용을 위해 인터페이스를 받음
class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			// 입력받은 Object객체를 형변환
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1; // 기본 정렬방식인 compareTo의 역순으로 정렬
		}
		return -1;
	}
}

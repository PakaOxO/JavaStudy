package object;

public class Ex01 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		Value v3 = new Value(20);
		
		if (v1.equals(v3)) {
			System.out.println("v1과 v3는 같습니다.");
		} else {
			System.out.println("v1과 v3는 다릅니다.");
		}
	}

}

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
	
	// 일반적으로 equals() 메소드는 객체의 주소값을 비교하므로 객체의 값 자체를 비교하기 위해 overriding을 해야한다.
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Value)) { return false; } // instanceof로 형변환 가능여부 먼저 확인
		
		Value v = (Value)obj;
		return this.value == v.value;
	}
}
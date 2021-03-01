package exeption;

public class Ex01 {
	public static void main(String[] args) {
		// try-catch line start
		try {
			File f = createFile("text.txt");
			System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
		} finally {
			System.out.println("try-catch문 종료시 무조건적으로 실행되는 구문");
			// 프로그램 설치 성공/실패 두 경우 모두 설치/캐시파일들을 제거해야 한다면 finally 구문을 사용할 수 있음
		}
	} // main method finished
	
	// createFile를 호출한 메서드로 Exception throws(예외 떠넘기기)
	static File createFile(String fileName) throws Exception {
		if (fileName == null || fileName.equals("")) {
			throw new Exception("파일 이름이 유효하지 않습니다.");
		}
		File f = new File(fileName);
		f.createNewFile();
		return f; // 생성된 객체의 참조변수를 반환
	} // createFile method finished
} // Ex01 class finished

class File {
	String fileName;
	
	String getName() {
		return fileName;
	}
	
	void createNewFile() {
		System.out.println("createNewFile() method executed");
	} // createNewFile method finished
	
	// File object constructor
	File() { this.fileName = ""; }
	File(String fileName) {
		this.fileName = fileName;
	}
} // File class finished

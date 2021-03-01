package exeption;

public class Ex01 {
	public static void main(String[] args) {
		// try-catch line start
		try {
			File f = createFile("text.txt");
			System.out.println(f.getName() + " ������ ���������� �����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " �ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
		} finally {
			System.out.println("try-catch�� ����� ������������ ����Ǵ� ����");
			// ���α׷� ��ġ ����/���� �� ��� ��� ��ġ/ĳ�����ϵ��� �����ؾ� �Ѵٸ� finally ������ ����� �� ����
		}
	} // main method finished
	
	// createFile�� ȣ���� �޼���� Exception throws(���� ���ѱ��)
	static File createFile(String fileName) throws Exception {
		if (fileName == null || fileName.equals("")) {
			throw new Exception("���� �̸��� ��ȿ���� �ʽ��ϴ�.");
		}
		File f = new File(fileName);
		f.createNewFile();
		return f; // ������ ��ü�� ���������� ��ȯ
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

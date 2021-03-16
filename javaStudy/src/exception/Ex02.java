package exception;

// chained exception(연결된 예외)
// 1. exception grouping
// 2. checked exception -> unchecked exception

// Exception grouping 예제
public class Ex02 {
	public static void main(String[] args) {
		try {
			install();
		} catch (InstallException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void install() throws InstallException  {
		try {
			throw new SpaceException("공간 부족");
		} catch (SpaceException e) {
			// 설치중 발생하는 여러 에러를 InstallException으로 묶어 예외처리
			InstallException ie = new InstallException("설치중 예외발생");
			ie.initCause(e);
			throw ie;
		} // catch (MemoryException e) {
			// 설치중 발생하는 여러 에러를 InstallException으로 묶어 예외처리
//			InstallException ie = new InstallException("설치중 예외발생");
//			ie.initCause(e);
//			throw ie;
		//}
	}
}

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}

class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}
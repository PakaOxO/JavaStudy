package exception;

// chained exception(����� ����)
// 1. exception grouping
// 2. checked exception -> unchecked exception

// Exception grouping ����
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
			throw new SpaceException("���� ����");
		} catch (SpaceException e) {
			// ��ġ�� �߻��ϴ� ���� ������ InstallException���� ���� ����ó��
			InstallException ie = new InstallException("��ġ�� ���ܹ߻�");
			ie.initCause(e);
			throw ie;
		} // catch (MemoryException e) {
			// ��ġ�� �߻��ϴ� ���� ������ InstallException���� ���� ����ó��
//			InstallException ie = new InstallException("��ġ�� ���ܹ߻�");
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
class localInner {

	private int data = 30;	// �ν��Ͻ� ����

	void display() {
		final String msg = "������ �����Ͱ��� ";
		
		class Local {
			void printMsg() {
				System.out.println(msg + data);
			}
		}
		Local obj = new Local();
		obj.printMsg();
	}
}

public class localInnerTest {
	public static void main(String args[]) {
		localInner obj = new localInner();
		obj.display();
	}
}
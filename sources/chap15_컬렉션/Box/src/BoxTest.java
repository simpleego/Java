
public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box();

		b.set("Hello World!");   		// �� ���ڿ� ��ü�� ����
		String s = (String)b.get();	// �� Object Ÿ���� String Ÿ������ ����ȯ

		b.set(new Integer(10));   		// �� ���� ��ü�� ����
		Integer i = (Integer)b.get( );	//  �� Object Ÿ���� Integer Ÿ������ ����ȯ

	}

}

import java.util.*; 	// Scanner Ŭ������ �����Ѵ�.

public class CircleArea {
	public static void main(String args[]) {

		double radius; // ���� ������
		double area; // ���� ����
		Scanner input = new Scanner(System.in);
		System.out.print("��������  �Է��Ͻÿ�: "); // �Է� �ȳ� ���
		radius = input.nextDouble();
		area = 3.14 * radius * radius;

		System.out.println(area);
	}

}
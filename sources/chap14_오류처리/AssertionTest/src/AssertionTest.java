import java.util.Scanner;

public class AssertionTest {

	public static void main(String argv[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("��¥�� �Է��Ͻÿ�: ");
		int date = input.nextInt();

		// ��¥�� 1 �̻��̰� 31 ���������� �����Ѵ�.
		assert(date >= 1 && date <= 31) : "�߸��� ��¥: " + date;
		System.out.printf("�Էµ� ��¥�� %d�Դϴ�.\n", date);
	}
}
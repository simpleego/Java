public class Employee {
	private String name;
	private double salary;

	private static int count = 0; // ���� ����

	// ������
	public Employee(String n, double s) {
		name = n;
		salary = s;
		count++; // ���� ������ count�� ����
	}

	// ��ü�� �Ҹ�� �� ȣ��ȴ�.
	protected void finalize() {
		count--; // ������ �ϳ� �پ��� ���̹Ƿ� count�� �ϳ� ����
	}

	// ���� �޼ҵ�
	public static int getCount() {
		return count;
	}
}
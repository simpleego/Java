public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1, e2, e3;
		e1 = new Employee("��ö��", 35000);
		e2 = new Employee("�ּ�ö", 50000);
		e3 = new Employee("��öȣ", 20000);

		int n = Employee.getCount();
		System.out.println("������ ������=" + n);
	}
}
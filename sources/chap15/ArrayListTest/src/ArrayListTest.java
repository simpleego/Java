import java.util.*;

public class ArrayListTest {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1, "APPLE"); // �ε��� 1�� ��APPLE"�� ����
		list.set(2, "GRAPE"); // �ε��� 2�� ���Ҹ� ��GRAPE"�� ��ü
		list.remove(3); // �ε��� 3�� ���Ҹ� �����Ѵ�.

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		for (String s : list)
			System.out.println(s);
	}
}
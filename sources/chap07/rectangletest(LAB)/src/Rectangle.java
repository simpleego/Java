public class Rectangle extends Shape {
	int width;
	int height;

	double area() {
		return (double)width * height;
	}
	void draw() {
		System.out.println("(" + x + "," + y + ") ��ġ�� " + "����: " + width
				+ " ����: " + height);
	}
}
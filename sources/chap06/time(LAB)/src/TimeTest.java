public class TimeTest {
       public static void main(String args[]) {
             // Time ��ü�� �����ϰ� �ʱ�ȭ�Ѵ�. 
             Time time = new Time(); 
             System.out.println("�⺻ ������ ȣ�� �� �ð�:  "+time.toString());
 
             // �� ��° ������ ȣ��
             Time time2 = new Time(13, 27, 6);
             System.out.print("�ι�° ������ ȣ�� �� �ð�: "+time2.toString());
 
             // �ùٸ��� ���� �ð����� �����غ���.
             Time time3 = new Time(99, 66, 77);
             System.out.print("�ùٸ��� ���� �ð� ���� �� �ð�: "+time3.toString());
       } 
} 
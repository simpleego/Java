public class CalTime {

	public static void main(String[] args) {
		final double light_speed = 30e4;
		double distance = 40e12;

		double secs;

		secs = distance/light_speed;
		
		double light_year = secs/(60.0*60.0*24.0*365.0);
		System.out.println("�ɸ��� �ð��� " + light_year + "�����Դϴ�.");
	}
}
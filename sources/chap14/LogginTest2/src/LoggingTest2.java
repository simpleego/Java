import java.util.logging.*;

public class LoggingTest2 {
	private static final Logger logger = Logger.getLogger("kr.co.compant.app");

	public static void main(String[] args) {
		logger.info("�α��� ���۵˴ϴ�...");
		try {
			throw new Exception("���������� ���ܸ� �߻���Ų��.");
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		}
		logger.info("�Ϸ�Ǿ���...");
	}
}

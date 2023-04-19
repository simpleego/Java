import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�. 

public class ByteStreamsLab {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� �̸��� �Է��Ͻÿ�: ");

//try ��� �ȿ��� ��Ʈ���� �����ϰ� �ʱ�ȭ�ϸ� �̰͵��� ���� �ʿ䰡 ����. ���� Ŭ������ ���ؼ��� ����� �� ������ Closable �������̽��� ������ Ŭ�����̾�� �Ѵ�. 
		String inputFileName = scan.next();

		System.out.print("���� ���� �̸��� �Է��Ͻÿ�: ");
		String outputFileName = scan.next();

		try (InputStream inputStream = new FileInputStream(inputFileName);
				OutputStream outputStream = new FileOutputStream(outputFileName)) {

//������ ������  �б⸦ ����Ѵ�. 
			int c;

			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		}
		System.out.println(inputFileName + "�� " + outputFileName + "�� �����Ͽ����ϴ�. ");
	}
}
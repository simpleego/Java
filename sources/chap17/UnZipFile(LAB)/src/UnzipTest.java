import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�. 

public class UnzipTest {
	public static void main(String[] args) throws Exception {

//FileInputStream�� ZipInputStream�� ���� �����Ѵ�. 

		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �̸��� �Է��Ͻÿ�: ");
		String inname = sc.next();
		System.out.println("���� ���� �̸��� �Է��Ͻÿ�: ");
		String outname = sc.next();
		ZipInputStream inStream = new ZipInputStream(
				new FileInputStream(inname));

//�ܼ��� ZIP ��Ʈ������ �о ��� ��Ʈ���� ����. 
		OutputStream outStream = new FileOutputStream(outname);

		byte[] buffer = new byte[1024];
		int read;
		ZipEntry entry;
		if ((entry = inStream.getNextEntry()) != null) {
			while ((read = inStream.read(buffer)) > 0) {
				outStream.write(buffer, 0, read);
			}
		}
		outStream.close();
		inStream.close();
	}
}
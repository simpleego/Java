import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�. 

public class DataStreamTest {
	public static void main(String[] args) throws IOException {
		DataInputStream in = null;
		DataOutputStream out = null;
		try {
			int c;

			out = new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream("data.bin")));
			out.writeDouble(3.14);

//DataOutputStream�� ������ ����Ʈ ��Ʈ�� ��ü�� ���� Ŭ�����θ� ������ �� �ֱ� ������  ���� ���۵� ���� ��� ����Ʈ ��Ʈ���� �����ϰ� �̰��� �������� �Ű� ������ �����Ѵ�. 

			out.writeInt(100);
			out.writeUTF("�ڽ��� ������ �ٲ��� ���ϴ� ����� ���� ������ �ٲ� �� ����.");

			out.flush();
			in = new DataInputStream(new BufferedInputStream(

//writeUTF() �޼ҵ�� ���ڿ��� UTF-8�� ������ �������� ����Ѵ�. UTF-8�� �Ϲ����� �����ڸ� �ϳ��� ����Ʈ�� ǥ���ϴ� ���� ���� ���� ���ڵ��̴�. 
					new FileInputStream("data.bin")));

			System.out.println(in.readDouble());
			System.out.println(in.readInt());
			System.out.println(in.readUTF());

		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
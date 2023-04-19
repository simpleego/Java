import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�. 

public class ObjectStreamTest {
	public static void main(String[] args) throws IOException {
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		try {
			int c;

			out = new ObjectOutputStream(new FileOutputStream("object.dat"));
			out.writeObject(new Date());

			out.flush();
			in = new ObjectInputStream(new FileInputStream("object.dat"));
			Date d = (Date) in.readObject();
			System.out.println(d);

		} catch (ClassNotFoundException e) {
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
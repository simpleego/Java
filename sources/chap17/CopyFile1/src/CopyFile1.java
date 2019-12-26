import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�. 
public class CopyFile1 {
    public static void main(String[] args) throws IOException {

//input.txt ���Ͽ� ����� ���� �Է� ��Ʈ���� �����Ѵ�. 

        FileInputStream in = null;
        FileOutputStream out = null;


//output.txt ���Ͽ� ����� ���� ��� ��Ʈ���� �����Ѵ�. 
        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

//�ϳ��� ����Ʈ�� ���� ���� read()�� ����ϰ� �ϳ��� ����Ʈ�� �� ���� write()
//�� ����Ѵ�. 
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) 
                in.close();
            if (out != null) 
                out.close();
        }
    }
}
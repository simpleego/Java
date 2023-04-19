import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�. 
public class CopyFile2 {

//input.txt ���Ͽ� ����� ���� �Է� ��Ʈ���� �����Ѵ�. 
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;

//output.txt ���Ͽ� ����� ���� ��� ��Ʈ���� �����Ѵ�. 
        FileWriter outputStream = null;

        try {

//�ϳ��� ���ڸ� ���� ���� read()�� ����ϰ� �ϳ��� ���ڸ� �� ���� write()
//�� ����Ѵ�. 
            inputStream = new FileReader("input.txt");
            outputStream = new FileWriter("output.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

// 소스를 입력하고 Ctrl+Shift+O를 눌러서 필요한 파일을 포함한다. 
 
public class Receiver {
       public static void main(String[] args) throws IOException {
 
             byte[] buf = new byte[256];
 
             DatagramSocket socket = new DatagramSocket(5000);  // 포트 번호: 5000
             DatagramPacket packet = new DatagramPacket(buf, buf.length);
             socket.receive(packet);
             System.out.println(new String(buf));
       }
}
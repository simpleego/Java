import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class Sender {
       public static void main(String[] args) throws IOException {
 
             DatagramSocket socket = null;
             socket = new DatagramSocket();
             String s = "�츮�� ������ �츮 ����� �����̴�.";
             byte[] buf = s.getBytes();
 
             // "address"�� ��port"�� �ִ� Ŭ���̾�Ʈ���� �����͸� ������.
             InetAddress address = InetAddress.getByName("127.0.0.1"); // ���� ȣ��Ʈ
             DatagramPacket packet = new DatagramPacket(buf, buf.length, address,
                           5000);
             socket.send(packet);
             socket.close();
       }
}
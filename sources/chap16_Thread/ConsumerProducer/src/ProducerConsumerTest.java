class Buffer {
	private int data;
	private boolean empty = true;

	public synchronized int get() {
		while (empty) {

//������ ����� ������ ��ٸ���.
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}

//���¸� ����Ѵ�.
		empty = true;

//�����ڸ� �����.
		notifyAll();
		return data;
	}

	public synchronized void put(int data) {
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = false;
		this.data = data;
		notifyAll();
	}
}
class Producer implements Runnable {
	private Buffer buffer;

	public Producer(Buffer buffer) {

//���� ���� ������ �����Ѵ�. 
		this.buffer= buffer;
	}


//���ۿ� ������ ������ ���´�. 
	public void run() {
		for (int i = 0; i < 10; i++) {
			buffer.put(i);
			System.out.println("������: " + i + "�� ������ �����Ͽ����ϴ�.");
			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}
class Consumer implements Runnable {
	private Buffer buffer;

//���� ���� ������ �����Ѵ�. 

	public Consumer(Buffer drop) {

//���ۿ��� ������ �����´�. 
		this.buffer= drop;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			int data = buffer.get();
			System.out.println("�Һ���: " + data + "�� ������ �Һ��Ͽ����ϴ�.");
			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}
public class ProducerConsumerTest {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		(new Thread(new Producer(buffer))).start();
		(new Thread(new Consumer(buffer))).start();
	}
}
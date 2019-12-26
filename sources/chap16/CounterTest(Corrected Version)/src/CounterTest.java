class Counter {
	private int value = 0;
	public synchronized  void increment() {   value++;	}
	public synchronized  void decrement() {   value--;	}
	public synchronized  void printCounter() {		System.out.println(value);	}
}

//�������� ��ǻ�Ϳ� ��Ȳ�� ���� ����� �޶�����.
//������ ������ ���ٸ� ��� 0�� ��µǾ�� �Ѵ�.  

class MyThread extends Thread {

//������ Counter ��ü�� �������� �����Ѵ�. 
	Counter sharedCounter;

	public MyThread(Counter c) {
		this.sharedCounter = c;
	}

//�������ٰ� ���ҽ�Ű�� ������ ī������ ���� ��ȭ�� ����� �Ѵ�. 

	public void run() {
		int i = 0;
		while (i < 20000) {

//���� ī������ ���� ����Ͽ� ����. 
			sharedCounter.increment();
			sharedCounter.decrement();
			if (i % 40 == 0)
				sharedCounter.printCounter();
			try {
				sleep((int) (Math.random() * 2));

//���� �ð���ŭ �����带 �����Ѵ�. 
			} catch (InterruptedException e) {	}
			i++;
		}
	}
}

public class CounterTest {
	public static void main(String[] args) {

//���� ī���� ��ü�� �����Ѵ�.
		Counter c = new Counter();
		new MyThread(c).start();

//Ȯ���ϰ� �߸��� ����� ���� ���Ͽ� �����带 4���� �����Ͽ� �����Ѵ�.
		new MyThread(c).start();
		new MyThread(c).start();
		new MyThread(c).start();
	}
}
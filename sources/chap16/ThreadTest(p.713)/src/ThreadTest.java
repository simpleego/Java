import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadTest {
	public static void main(String args[]) {
		    Runnable r1 = () -> {
		        for (int i = 10; i >=0 ; i--)
		            System.out.println("ù ��° ������: " + i);
		    };
		    Runnable r2 = () -> {
		        for (int i = 10; i >=0 ; i--)
		            System.out.println("�� ��° ������: " + i);
		    };


		    Executor executor = Executors.newCachedThreadPool();
		    executor.execute(r1);
		    executor.execute(r2);
	}
}
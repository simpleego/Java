import java.awt.*;
import javax.swing.*;

//���� Ball Ŭ������ �𵨸��Ѵ�. 

class Ball {

//���� �Ӽ��� ��ġ, ũ��, �ӵ��̴�. 
	private int x = 100;
	private int y = 100;
	private int size = 30;
	private int xSpeed = 10;
	private int ySpeed = 10;

//���� ȭ�鿡 �׷��ִ� �޼ҵ��̴�. 

	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x, y, size, size);
	}

	public void update() {
		x += xSpeed;
		y += ySpeed;
		if ((x + size) > MyPanel.BOARD_WIDTH - size || x < 0) {
			xSpeed = -xSpeed;
		}
		if ((y + size) > MyPanel.BOARD_HEIGHT - size || y < 0) {
			ySpeed = -ySpeed;
		}
	}
}

//���� ���ο� ��ġ�� ����Ѵ�. ���� ���� �ε�ġ�� �ݻ�ǵ��� �Ѵ�. 

public class MyPanel extends JPanel {
	static final int BOARD_WIDTH = 600;
	static final int BOARD_HEIGHT = 300;
	private Ball ball = new Ball();

	public MyPanel() {
		this.setBackground(Color.YELLOW);
		Runnable task = () -> {
			while (true) {
				ball.update();

//���ٽ��� �̿��Ͽ��� Runnable ��ü�� �����Ѵ�. ���ѷ����� ���鼭 ���� ��ġ�� �����ϰ� ȭ�鿡 �ٽ� �׸���. 50 �и��ʵ��� ����. 
				repaint();
				try {
					Thread.sleep(50);
				} catch (InterruptedException ignore) {
				}
			}
		};
		new Thread(task).start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		ball.draw(g);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(MyPanel.BOARD_WIDTH, MyPanel.BOARD_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(new MyPanel());
	}
}
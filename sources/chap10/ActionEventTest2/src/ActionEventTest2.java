import javax.swing.*;
import java.awt.event.*;	//이벤트 처리를 위한 패키지 

class MyFrame extends JFrame {
	private JButton button;
	private JLabel label;

	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");

		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다");
		button.addActionListener(new MyListener());	
		panel.add(button);
		panel.add(label);

		this.add(panel);
		this.setVisible(true);
	}


	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				label.setText("마침내 버튼이 눌려졌습니다.");
			}
		}
	}

}
public class ActionEventTest2 {
	public static void main(String[] args) {
		MyFrame t = new MyFrame();
	}
}
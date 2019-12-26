import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�.
public class TextConverter extends JFrame {
	JButton converter;
	JButton canceler;
	JTextArea textIn;
	JTextArea textOut;

	public TextConverter() {
		super("�ؽ�Ʈ ��ȯ");

		// �ؽ�Ʈ ����
		textIn = new JTextArea(10, 14);
		textOut = new JTextArea(10, 14);
		textIn.setLineWrap(true);// �ڵ� �ٹٲ�
		textOut.setLineWrap(true);
		textOut.setEnabled(false);// ��Ȱ��ȭ

		// �ؽ�Ʈ ������ ������ �г�
		JPanel textAreaPanel = new JPanel(new GridLayout(1, 2, 20, 20));
		textAreaPanel.add(textIn);
		textAreaPanel.add(textOut);

		// ��ư
		converter = new JButton("��ȯ");
		canceler = new JButton("���");
		converter.addActionListener(new ButtonActionListener());
		canceler.addActionListener(new ButtonActionListener());

		// ��ư �г�
		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.add(converter);
		buttonPanel.add(canceler);

		// ���� �г�
		JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
		mainPanel.add(BorderLayout.CENTER, textAreaPanel);
		mainPanel.add(BorderLayout.SOUTH, buttonPanel);

		// ������ ����
		setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		add(mainPanel);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	// ��ư�� �׼� �̺�Ʈ�� ó�� �� ��ư �׼� ������ Ŭ����
	private class ButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == converter) {
				textOut.setText("");
				String result = toEnglish(textIn.getText());
				textOut.append(result);
			}
			if (e.getSource() == canceler) {
				textOut.setText("");
			}
		}

		// ��� �ѱ���� ��ȯ�ϴ� �޼ҵ�
		private String toEnglish(String korean) {
			String result = korean;
			result = result.replace("�ؽ�Ʈ", "Text");
			result = result.replace("����", "English");
			return result;
		}
	}

	public static void main(String[] args) {
		TextConverter t = new TextConverter();
	}
}
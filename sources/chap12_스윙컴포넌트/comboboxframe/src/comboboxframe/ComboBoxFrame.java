package comboboxframe;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�. 
 
public class ComboBoxFrame extends JFrame implements ActionListener {
       JLabel label;
 
       public ComboBoxFrame() {
             setTitle("�޺� �ڽ�");
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             setSize(300, 200);
 
             String[] animals = { "dog", "lion", "tiger" };
             JComboBox animalList = new JComboBox(animals);
             animalList.setSelectedIndex(0);
             animalList.addActionListener(this);
 
             label = new JLabel();
             label.setHorizontalAlignment(JLabel.CENTER);
             changePicture(animals[animalList.getSelectedIndex()]);
             add(animalList, BorderLayout.PAGE_START);
             add(label, BorderLayout.PAGE_END);
             setVisible(true);
       }
 
       public void actionPerformed(ActionEvent e) {
             JComboBox cb = (JComboBox) e.getSource();
             String name = (String) cb.getSelectedItem();
             changePicture(name);
       }
 
       protected void changePicture(String name) {
             ImageIcon icon = new ImageIcon(name + ".gif");
             label.setIcon(icon);
             if (icon != null) {
                    label.setText(null);
             } else {
                    label.setText("�̹����� �߰ߵ��� �ʾҽ��ϴ�.");
             }
       }
 
       public static void main(String[] args) {
             ComboBoxFrame frame=new ComboBoxFrame();
       }
}
package java已学知识点4;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class lianxi2 {

	
	public static void main(String[] args) {
		JFrame win = new JFrame();
		win.setLayout(new GridLayout(3, 1));
		win.setVisible(true);
		win.setBounds(100,100,300,300);
		
		JPanel p1 = new JPanel(new GridLayout(2, 2));
		p1.add(new JLabel("标签1"));
		p1.add(new JButton("按钮1"));
		p1.add(new JLabel("标签2"));
		p1.add(new JTextField());
		
		JPanel p2 =new JPanel();
		p2.add(new JLabel("单击确定按钮:"));
		p2.add(new JButton("按钮2"));
		
		JPanel p3 = new JPanel();
		p3.add(new JLabel("标签3"));
		
		win.add(p1);
		win.add(p2);
		win.add(p3);
		
		win.validate();
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
}

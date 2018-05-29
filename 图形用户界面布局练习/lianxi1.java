package java已学知识点4;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class lianxi1 {

	
	public static void main(String[] args) {
		JFrame win = new JFrame("窗体");
		win.setVisible(true);
		win.setBounds(100,100,300,300);
		JLabel l1 = new JLabel("请输入文本:");
		JLabel l2 = new JLabel("请输入文本:");
		
		JTextField t1 = new JTextField();
		JTextField t2 =new JTextField();
	   
		JButton b1 = new JButton("确定");
		
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(3,2));
		
		jp.add(l1);
		jp.add(t1);
		jp.add(l2);
		jp.add(t2);
		jp.add(b1);
		
		JTextArea  textArea = new JTextArea();
		JScrollPane scrollPane = new  JScrollPane(textArea);  //滚动条
		
		win.add(jp,BorderLayout.NORTH);
		win.add(scrollPane,BorderLayout.CENTER);
		win.validate();
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

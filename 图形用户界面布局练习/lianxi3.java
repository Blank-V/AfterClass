package java已学知识点4;

import java.awt.BorderLayout;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class lianxi3 {

	public static void main(String[] args) {
		JFrame win =new JFrame();
		win.setVisible(true);
		win.setBounds(200,200,300,300);
		
		JPanel p = new JPanel(new GridLayout(4,3));
		for(int i=0;i<13;i++)
		{
			if(i==10)continue;
			p.add(new JButton(""+i));	
		}
		
		win.add(new JButton("清空"),BorderLayout.NORTH);
		win.add(p, BorderLayout.CENTER);
		
		win.validate();
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

package javaswing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestForm {
	
	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		
		jf.setTitle("TestForm");
		jf.setSize(500, 500);
		jf.getContentPane().setBackground(Color.GREEN);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//jlabel
		JLabel jl = new JLabel("Welcome");
		jl.setBounds(150, 100, 100, 20);
		jf.add(jl);
		
		jf.setVisible(true);
	}

}

package javaswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;
	private JLabel lblHomePage;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomePage() {
		setTitle("Home Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 273);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblHomePage());
		contentPane.add(getBtnBack());
		
		setVisible(true);
	}
	private JLabel getLblHomePage() {
		if (lblHomePage == null) {
			lblHomePage = new JLabel("Home Page");
			lblHomePage.setFont(new Font("Sitka Text", Font.BOLD, 30));
			lblHomePage.setBounds(97, 37, 215, 31);
		}
		return lblHomePage;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Logout");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
				new LoginForm();
					dispose();
				}
			});
			btnBack.setBounds(179, 117, 89, 23);
		}
		return btnBack;
	}
}

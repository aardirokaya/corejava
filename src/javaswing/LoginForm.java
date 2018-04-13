package javaswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblUsername;
	private JTextField textField;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JButton btnLogin;
	private JCheckBox chckbxShowPsw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setTitle("Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblUsername());
		contentPane.add(getTextField());
		contentPane.add(getLblPassword());
		contentPane.add(getPasswordField());
		contentPane.add(getBtnLogin());
		contentPane.add(getChckbxShowPsw());

		setVisible(true);
	}

	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("UserName");
			lblUsername.setBounds(75, 60, 72, 14);
		}
		return lblUsername;
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(184, 57, 152, 20);
			textField.setColumns(10);
		}
		return textField;
	}

	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setBounds(75, 96, 72, 14);
		}
		return lblPassword;
	}

	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setBounds(184, 93, 152, 20);
			passwordField.setEchoChar('*');
		}
		return passwordField;
	}

	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Login");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					String un = textField.getText();
					String psw = passwordField.getText();

					if (un.equals("admin") && psw.equals("123")) {

						// JOptionPane.showMessageDialog(null, "login
						// success!!");
						new HomePage();
						dispose();

					} else {

						JOptionPane.showMessageDialog(null, "login failed!!");
					}

				}
			});
			btnLogin.setBounds(211, 146, 89, 23);
		}
		return btnLogin;
	}

	private JCheckBox getChckbxShowPsw() {
		if (chckbxShowPsw == null) {
			chckbxShowPsw = new JCheckBox("show");
			chckbxShowPsw.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						passwordField.setEchoChar((char) 0);
					} else {
						passwordField.setEchoChar('*');
					}
				}
			});
			chckbxShowPsw.setBounds(194, 116, 97, 23);
		}
		return chckbxShowPsw;
	}
}

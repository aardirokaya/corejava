package javaswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TableForm extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblName;
	private JTextField nameTxt;
	private JLabel lblAddress;
	private JTextField addressTxt;
	private JLabel lblPhone;
	private JTextField phoneTxt;
	private JButton btnSave;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnClearTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableForm frame = new TableForm();
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
	public TableForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnClearTable());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "InputPanel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 11, 446, 122);
			panel.setLayout(null);
			panel.add(getLblName());
			panel.add(getNameTxt());
			panel.add(getLblAddress());
			panel.add(getAddressTxt());
			panel.add(getLblPhone());
			panel.add(getPhoneTxt());
			panel.add(getBtnSave());
		}
		return panel;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name");
			lblName.setBounds(10, 31, 46, 14);
		}
		return lblName;
	}
	private JTextField getNameTxt() {
		if (nameTxt == null) {
			nameTxt = new JTextField();
			nameTxt.setBounds(66, 28, 113, 20);
			nameTxt.setColumns(10);
		}
		return nameTxt;
	}
	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setBounds(206, 31, 46, 14);
		}
		return lblAddress;
	}
	private JTextField getAddressTxt() {
		if (addressTxt == null) {
			addressTxt = new JTextField();
			addressTxt.setBounds(264, 28, 113, 20);
			addressTxt.setColumns(10);
		}
		return addressTxt;
	}
	private JLabel getLblPhone() {
		if (lblPhone == null) {
			lblPhone = new JLabel("Phone");
			lblPhone.setBounds(10, 78, 46, 14);
		}
		return lblPhone;
	}
	private JTextField getPhoneTxt() {
		if (phoneTxt == null) {
			phoneTxt = new JTextField();
			phoneTxt.setBounds(66, 75, 113, 20);
			phoneTxt.setColumns(10);
		}
		return phoneTxt;
	}
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("Save");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					DefaultTableModel  model  =  (DefaultTableModel) table.getModel();
					model.addRow(new Object[]{nameTxt.getText(), addressTxt.getText(), phoneTxt.getText()});
					
				}
			});
			btnSave.setBounds(275, 74, 89, 23);
		}
		return btnSave;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 158, 446, 191);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Name", "Address", "Phone"
				}
			));
		}
		return table;
	}
	private JButton getBtnClearTable() {
		if (btnClearTable == null) {
			btnClearTable = new JButton("Clear Table");
			btnClearTable.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					DefaultTableModel model =  (DefaultTableModel) table.getModel();
					
					model.setRowCount(0);
				}
			});
			btnClearTable.setBounds(321, 360, 106, 23);
		}
		return btnClearTable;
	}
}

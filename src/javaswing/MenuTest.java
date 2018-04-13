package javaswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuTest extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmOpen;
	private JMenuItem mntmClose;
	private JMenu mnMomo;
	private JMenuItem mntmBuff;
	private JMenuItem mntmChicken;
	private JMenuItem mntmVeg;
	private JMenu mnDrinks;
	private JMenu mnHard;
	private JMenu mnSoft;
	private JMenu mnCold;
	private JMenuItem mntmRedLabel;
	private JMenuItem mntmBlackLabel;
	private JMenuItem mntmSignature;
	private JMenuItem mntmWine;
	private JMenuItem mntmBeer;
	private JMenuItem mntmCoke;
	private JMenuItem mntmFanta;
	private JMenuItem mntmRedbull;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuTest frame = new MenuTest();
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
	public MenuTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 364, 235);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnMomo());
			menuBar.add(getMenu_1());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmClose());
		}
		return mnFile;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("open");
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				   new LoginForm();
				}
			});
		}
		return mntmOpen;
	}
	private JMenuItem getMntmClose() {
		if (mntmClose == null) {
			mntmClose = new JMenuItem("close");
		}
		return mntmClose;
	}
	private JMenu getMnMomo() {
		if (mnMomo == null) {
			mnMomo = new JMenu("MoMo");
			mnMomo.add(getMntmBuff());
			mnMomo.add(getMntmChicken());
			mnMomo.add(getMntmVeg());
		}
		return mnMomo;
	}
	private JMenuItem getMntmBuff() {
		if (mntmBuff == null) {
			mntmBuff = new JMenuItem("buff");
		}
		return mntmBuff;
	}
	private JMenuItem getMntmChicken() {
		if (mntmChicken == null) {
			mntmChicken = new JMenuItem("chicken");
		}
		return mntmChicken;
	}
	private JMenuItem getMntmVeg() {
		if (mntmVeg == null) {
			mntmVeg = new JMenuItem("veg");
		}
		return mntmVeg;
	}
	private JMenu getMenu_1() {
		if (mnDrinks == null) {
			mnDrinks = new JMenu("Drinks");
			mnDrinks.add(getMenu_2());
			mnDrinks.add(getMenu_3());
			mnDrinks.add(getMenu_4());
		}
		return mnDrinks;
	}
	private JMenu getMenu_2() {
		if (mnHard == null) {
			mnHard = new JMenu("Hard");
			mnHard.add(getMntmRedLabel());
			mnHard.add(getMntmBlackLabel());
			mnHard.add(getMntmSignature());
		}
		return mnHard;
	}
	private JMenu getMenu_3() {
		if (mnSoft == null) {
			mnSoft = new JMenu("Soft");
			mnSoft.add(getMntmWine());
			mnSoft.add(getMntmBeer());
		}
		return mnSoft;
	}
	private JMenu getMenu_4() {
		if (mnCold == null) {
			mnCold = new JMenu("Cold");
			mnCold.add(getMntmCoke());
			mnCold.add(getMntmFanta());
			mnCold.add(getMntmRedbull());
		}
		return mnCold;
	}
	private JMenuItem getMntmRedLabel() {
		if (mntmRedLabel == null) {
			mntmRedLabel = new JMenuItem("Red Label");
		}
		return mntmRedLabel;
	}
	private JMenuItem getMntmBlackLabel() {
		if (mntmBlackLabel == null) {
			mntmBlackLabel = new JMenuItem("Black Label");
		}
		return mntmBlackLabel;
	}
	private JMenuItem getMntmSignature() {
		if (mntmSignature == null) {
			mntmSignature = new JMenuItem("Signature");
		}
		return mntmSignature;
	}
	private JMenuItem getMntmWine() {
		if (mntmWine == null) {
			mntmWine = new JMenuItem("Wine");
		}
		return mntmWine;
	}
	private JMenuItem getMntmBeer() {
		if (mntmBeer == null) {
			mntmBeer = new JMenuItem("Beer");
		}
		return mntmBeer;
	}
	private JMenuItem getMntmCoke() {
		if (mntmCoke == null) {
			mntmCoke = new JMenuItem("Coke");
		}
		return mntmCoke;
	}
	private JMenuItem getMntmFanta() {
		if (mntmFanta == null) {
			mntmFanta = new JMenuItem("Fanta");
		}
		return mntmFanta;
	}
	private JMenuItem getMntmRedbull() {
		if (mntmRedbull == null) {
			mntmRedbull = new JMenuItem("RedBull");
		}
		return mntmRedbull;
	}
}

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

public class IndexPage extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmOpen;
	private JMenuItem mntmClose;
	private JMenuItem mntmExit;
	private JMenuItem mntmTest;
	private JMenu mnMomo;
	private JMenuItem mntmBuff;
	private JMenuItem mntmVeg;
	private JMenuItem mntmCMomo;
	private JMenu mnHelp;
	private JMenuItem mntmSearch;
	private JMenuItem mntmGo;
	private JMenuItem mntmInstall;
	private JMenu mnColddrink;
	private JMenuItem mntmCoke;
	private JMenuItem mntmSprite;
	private JMenuItem mntmSlice;
	private JMenu mnPhotos;
	private JMenuItem mntmOpen_1;
	private JMenuItem mntmClose_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IndexPage frame = new IndexPage();
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
	public IndexPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 274);
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
			menuBar.add(getMnHelp());
			menuBar.add(getMnPhotos());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmClose());
			mnFile.add(getMntmExit());
			mnFile.add(getMntmTest());
			mnFile.add(getMnColddrink());
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
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("exit");
		}
		return mntmExit;
	}
	private JMenuItem getMntmTest() {
		if (mntmTest == null) {
			mntmTest = new JMenuItem("test");
		}
		return mntmTest;
	}
	private JMenu getMnMomo() {
		if (mnMomo == null) {
			mnMomo = new JMenu("MoMo");
			mnMomo.add(getMntmBuff());
			mnMomo.add(getMntmVeg());
			mnMomo.add(getMntmCMomo());
		}
		return mnMomo;
	}
	private JMenuItem getMntmBuff() {
		if (mntmBuff == null) {
			mntmBuff = new JMenuItem("buff");
		}
		return mntmBuff;
	}
	private JMenuItem getMntmVeg() {
		if (mntmVeg == null) {
			mntmVeg = new JMenuItem("veg");
		}
		return mntmVeg;
	}
	private JMenuItem getMntmCMomo() {
		if (mntmCMomo == null) {
			mntmCMomo = new JMenuItem("c momo");
		}
		return mntmCMomo;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmSearch());
			mnHelp.add(getMntmGo());
			mnHelp.add(getMntmInstall());
		}
		return mnHelp;
	}
	private JMenuItem getMntmSearch() {
		if (mntmSearch == null) {
			mntmSearch = new JMenuItem("search");
		}
		return mntmSearch;
	}
	private JMenuItem getMntmGo() {
		if (mntmGo == null) {
			mntmGo = new JMenuItem("go");
		}
		return mntmGo;
	}
	private JMenuItem getMntmInstall() {
		if (mntmInstall == null) {
			mntmInstall = new JMenuItem("install");
		}
		return mntmInstall;
	}
	private JMenu getMnColddrink() {
		if (mnColddrink == null) {
			mnColddrink = new JMenu("ColdDrink");
			mnColddrink.add(getMntmCoke());
			mnColddrink.add(getMntmSprite());
			mnColddrink.add(getMntmSlice());
		}
		return mnColddrink;
	}
	private JMenuItem getMntmCoke() {
		if (mntmCoke == null) {
			mntmCoke = new JMenuItem("Coke");
		}
		return mntmCoke;
	}
	private JMenuItem getMntmSprite() {
		if (mntmSprite == null) {
			mntmSprite = new JMenuItem("Sprite");
		}
		return mntmSprite;
	}
	private JMenuItem getMntmSlice() {
		if (mntmSlice == null) {
			mntmSlice = new JMenuItem("slice");
		}
		return mntmSlice;
	}
	private JMenu getMnPhotos() {
		if (mnPhotos == null) {
			mnPhotos = new JMenu("photos");
			mnPhotos.add(getMntmOpen_1());
			mnPhotos.add(getMntmClose_1());
		}
		return mnPhotos;
	}
	private JMenuItem getMntmOpen_1() {
		if (mntmOpen_1 == null) {
			mntmOpen_1 = new JMenuItem("open");
			mntmOpen_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					new ImageForm();
				}
			});
		}
		return mntmOpen_1;
	}
	private JMenuItem getMntmClose_1() {
		if (mntmClose_1 == null) {
			mntmClose_1 = new JMenuItem("close");
		}
		return mntmClose_1;
	}
}

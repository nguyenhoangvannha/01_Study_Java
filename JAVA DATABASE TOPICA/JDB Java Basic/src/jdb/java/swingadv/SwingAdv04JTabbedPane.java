package jdb.java.swingadv;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SwingAdv04JTabbedPane extends JFrame {
	public SwingAdv04JTabbedPane(String title) {
		super(title);
		initComponets();
		addEvents();
	}
	
	JTabbedPane tbpnMain;
	private void initComponets() {
		// TODO Auto-generated method stub
		
		//
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//
		Container ctn = getContentPane();
		tbpnMain = new JTabbedPane();
		ctn.add(tbpnMain);
		
		JPanel pnTab1 = new JPanel();
		pnTab1.setName("Main");
		pnTab1.setBackground(Color.lightGray);
		JPanel pnTab2 = new JPanel();
		pnTab2.setName("Setting");
		pnTab2.setBackground(Color.CYAN);
		JPanel pnTab3 = new JPanel();
		pnTab3.setName("About");
		pnTab3.setBackground(Color.white);
		
		tbpnMain.add(pnTab1);
		tbpnMain.add("ISetting", pnTab2);
		tbpnMain.add("About", pnTab3);
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		
	}
	
}

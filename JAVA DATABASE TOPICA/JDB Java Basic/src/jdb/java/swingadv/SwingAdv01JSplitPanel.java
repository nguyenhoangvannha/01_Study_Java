package jdb.java.swingadv;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SwingAdv01JSplitPanel extends JFrame {
	public SwingAdv01JSplitPanel(String title) {
		super(title);
		initComponents();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
		//Get OS UI
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Create Frame
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Get container
		Container ctn = getContentPane();
		
		//Set JSplitPanel
		JPanel pnLeft = new JPanel();
		pnLeft.setForeground(Color.RED);
		pnLeft.setPreferredSize(new Dimension(222,0));
		JPanel pnRight = new JPanel();
		pnRight.setForeground(Color.BLUE);
		JSplitPane spn = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,pnLeft,pnRight);
		spn.setOneTouchExpandable(true);
		ctn.add(spn);
	}
}

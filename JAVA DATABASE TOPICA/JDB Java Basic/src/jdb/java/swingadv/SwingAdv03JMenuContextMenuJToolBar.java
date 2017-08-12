package jdb.java.swingadv;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class SwingAdv03JMenuContextMenuJToolBar extends JFrame {
	public SwingAdv03JMenuContextMenuJToolBar(String title) {
		super(title);
		initComponents();
		addEvents();
	}
	//MenuBar
	JMenuBar mnuBar;
	JMenu mnuFile;
	JMenu mnuEdit;
	JMenu mnuHelp;
	JMenuItem mnuOpen;
	JMenuItem mnuSave;
	JMenuItem mnuClose;
	JMenuItem mnuExit;
	
	
	//ContextMenu
	JButton btnMouse;
	JButton btnMouse2;
	JButton btnLast;
	PopUpDemo newPopUp = new PopUpDemo();
	
	//ToolBar
	JButton btnTool1, btnTool2, btnTool3;
	JCheckBox chkTool1,chkTool2;
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
		
		//Set Frame
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Get container
		Container ctn = getContentPane();
		ctn.setLayout(new BorderLayout());
		
		JPanel pnMain = new JPanel();
		ctn.add(pnMain, BorderLayout.CENTER);
		pnMain.setLayout(new FlowLayout());
		
		//Create Menu
		mnuBar = new JMenuBar();
		setJMenuBar(mnuBar);
		mnuFile = new JMenu("File");
		mnuBar.add(mnuFile);
		mnuOpen = new JMenuItem("Open");
		mnuFile.add(mnuOpen);
		mnuSave = new JMenuItem("Save");
		mnuFile.add(mnuSave);
		mnuClose = new JMenuItem("Close");
		mnuFile.add(mnuClose);
		mnuFile.addSeparator();
		mnuExit = new JMenuItem("Exit");
		mnuExit.setIcon(new ImageIcon("imagesMenu/exit.png"));
		mnuFile.add(mnuExit);
		
		mnuEdit = new JMenu("Edit");
		mnuBar.add(mnuEdit);
		
		mnuHelp = new JMenu("Help");
		mnuBar.add(mnuHelp);
		
		//Study PopupMenu
		btnMouse = new JButton("Click Right Mouse");
		pnMain.add(btnMouse);
		btnMouse2 = new JButton("Button 2");
		pnMain.add("Bt2",btnMouse2);
		
		//ToolBar
		JToolBar tbMe = new JToolBar();
		btnTool1 = new JButton("Show");
		btnTool2 = new JButton("Edit");
		btnTool3 = new JButton("Content");
		tbMe.add(btnTool1);
		tbMe.add(btnTool2);
		tbMe.add(btnTool3);
		chkTool1 = new JCheckBox("Auto save");
		chkTool2 = new JCheckBox("Aligt");
		tbMe.addSeparator();
		tbMe.add(chkTool1);
		tbMe.add(chkTool2);
		
		ctn.add(tbMe, BorderLayout.NORTH);
	}

	class PopUpDemo extends JPopupMenu {
		JMenuItem itemRed = new JMenuItem("Red");
		JMenuItem itemGreen = new JMenuItem("Green");
		JMenuItem itemYellow = new JMenuItem("Yellow");
		public PopUpDemo() {
			add(itemRed);
			add(itemGreen);
			add(itemYellow);
			itemRed.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					btnLast.setForeground(Color.red);
				}
			});
			itemGreen.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					btnLast.setForeground(Color.green);
				}
			});
			itemYellow.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					btnMouse.setForeground(Color.yellow);
				}
			});
		}
	}
	class popClickListener extends MouseAdapter{
		public void mousePressed(java.awt.event.MouseEvent e) {
			if(e.isPopupTrigger()) {
				doPopUp(e);
			}
		}
		public void mouseReleased(java.awt.event.MouseEvent e) {
			if(e.isPopupTrigger()) {
				doPopUp(e);
			}
		}
		private void doPopUp(MouseEvent e) {
			// TODO Auto-generated method stub
			btnLast = (JButton) e.getComponent();
			newPopUp.show(e.getComponent(), e.getX(), e.getY());
		}
	}
	private void addEvents() {
		// TODO Auto-generated method stub
		mnuOpen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, e.getSource());
			}
		});
		mnuExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		//Study PopupMenu
		btnMouse.addMouseListener(new popClickListener());
		btnMouse2.addMouseListener(new popClickListener());
	}
}

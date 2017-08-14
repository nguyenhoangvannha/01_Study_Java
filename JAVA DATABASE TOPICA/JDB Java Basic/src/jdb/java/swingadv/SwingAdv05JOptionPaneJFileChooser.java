package jdb.java.swingadv;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileFilter;

public class SwingAdv05JOptionPaneJFileChooser extends JFrame {
	private JMenuBar mnuBar;
	private JMenu mnuFile;
	private JMenuItem mnuFileOpen;
	private JMenuItem mnuFileSave;
	private JMenuItem mnuFileExit;
	
	private JTextArea txtInfo;
	private String path;
	public SwingAdv05JOptionPaneJFileChooser(String title) {
		super(title);
		initComponents();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		mnuFileExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int choose = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Confirm", 
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(choose == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		mnuFileSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Luu vao ");
				int result = fileChooser.showSaveDialog(null);
				if(result == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					path = file.getAbsolutePath();
					saveFile(path);
				}
				
			}
		});
		mnuFileOpen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Open a file ");
				fileChooser.setFileFilter(new FileFilter() {
					
					@Override
					public String getDescription() {
						// TODO Auto-generated method stub
						return ".txt";
					}
					
					@Override
					public boolean accept(File f) {
						// TODO Auto-generated method stub
						return f.getAbsolutePath().endsWith(".txt");
					}
				});
				fileChooser.setFileFilter(new FileFilter() {
					
					@Override
					public String getDescription() {
						// TODO Auto-generated method stub
						return "Folder";
					}
					
					@Override
					public boolean accept(File f) {
						// TODO Auto-generated method stub
						return f.isDirectory();
					}
				});
				int result = fileChooser.showOpenDialog(null);
				if(result == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					path = file.getAbsolutePath();
					readFile(path);
				}
			}
		});
	}

	protected void saveFile(String path2) {
		// TODO Auto-generated method stub
		
	}

	protected void readFile(String path2) {
		// TODO Auto-generated method stub
		try {
//			FileInputStream fis = new FileInputStream(path2);
//			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			FileReader frd = new FileReader(path2 );
			BufferedReader brd = new BufferedReader(frd);
			//BufferedReader brd = new BufferedReader(isr);
//			
			StringBuilder result = new StringBuilder();
			String line = brd.readLine();
			do {
				result.append(line + "\n");
				line = brd.readLine();
			} while(line != null);
			txtInfo.setText(result.toString());
//			brd.close();
//			isr.close();
//			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void initComponents() {
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
		this.setSize(600, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//
		Container ctn = getContentPane();
		ctn.setLayout(new BorderLayout());
		//
		mnuBar = new JMenuBar();
		setJMenuBar(mnuBar);
		mnuFile = new JMenu("File");
		mnuBar.add(mnuFile);
		mnuFileOpen = new JMenuItem("Open");
		mnuFileSave = new JMenuItem("Save");
		mnuFileExit = new JMenuItem("Exit");
		mnuFile.add(mnuFileOpen);
		mnuFile.add(mnuFileSave);
		mnuFile.addSeparator();
		mnuFile.add(mnuFileExit);
		
		//
		
		txtInfo = new JTextArea();
		txtInfo.setWrapStyleWord(true);
		txtInfo.setLineWrap(true);
		ctn.add(txtInfo, BorderLayout.CENTER);
	}
}

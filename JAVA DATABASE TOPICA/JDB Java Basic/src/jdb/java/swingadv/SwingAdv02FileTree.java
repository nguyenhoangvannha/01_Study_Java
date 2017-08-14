package jdb.java.swingadv;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.TitledBorder;
import javax.swing.tree.DefaultMutableTreeNode;

public class SwingAdv02FileTree extends JFrame{
	public SwingAdv02FileTree(String title) {
		super(title);
		initComponents();
		addEvents();
	}

	private JLabel lblFileChooser;
	private JTextField txtFileChooser;
	private JButton btnFileChooser;
	
	private JButton btnShow;
	private String sourcePath;
	DefaultMutableTreeNode root = new DefaultMutableTreeNode("List File And Directory");
	private JTree tree;
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
		
		//Get Frame Container
		Container ctn = getContentPane();
		
		//Set Frame
		this.setSize(700, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		ctn.add(pnMain);
		
		//Line File Chooser
		JPanel pnFileChooser = new JPanel();
		pnFileChooser.setLayout(new FlowLayout());
		lblFileChooser = new JLabel("Choose a directory");
		txtFileChooser = new JTextField(40);
		btnFileChooser = new JButton("Choose");
		pnFileChooser.add(lblFileChooser);
		pnFileChooser.add(txtFileChooser);
		pnFileChooser.add(btnFileChooser);
		pnMain.add(pnFileChooser);
		
		//Line Tree List
		JPanel pnTreeList = new JPanel();
		pnTreeList.setLayout(new BorderLayout());
		pnTreeList.setPreferredSize(new Dimension(0, 350));
		javax.swing.border.Border bdrTreeList = BorderFactory.createLineBorder(Color.GREEN);
		TitledBorder tbdrTreeList = BorderFactory.createTitledBorder(bdrTreeList, "Directory Tree");
		tree = new JTree(root);
		JScrollPane scp = new JScrollPane(tree, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnTreeList.setBorder(tbdrTreeList);
		
		pnTreeList.add(scp ,BorderLayout.CENTER);
		pnMain.add(pnTreeList);
		
		
		//Line Button
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		btnShow = new JButton("Show");
		pnButton.add(btnShow);
		pnMain.add(pnButton);
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		txtFileChooser.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				txtFileChooserKeyTyped(arg0);
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		btnFileChooser.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				btnFileChooserActionListener(arg0);
			}
		});
		btnShow.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				btnShowActionPerformed(arg0);
			}
		});
//		DefaultMutableTreeNode item = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
//		String kq = (String)item.getUserObject() ;
	}

	protected void btnShowActionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		File file = new File(sourcePath);
		if(!file.exists() || !file.isDirectory()) {
			JOptionPane.showMessageDialog(null, "Wrong Directiory" + sourcePath, "Error", JOptionPane.WARNING_MESSAGE);
			return;
		} else {
			//JOptionPane.showMessageDialog(null, "Almost Success");
			root.removeAllChildren();
			getFileTree(sourcePath, root);
			//JOptionPane.showMessageDialog(null, "Success");
		}
	}

	protected void btnFileChooserActionListener(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JFileChooser fileChooser = new JFileChooser(sourcePath);
		fileChooser.setDialogTitle("Choose a Directory");
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fileChooser.setMultiSelectionEnabled(false);
		fileChooser.setAcceptAllFileFilterUsed(false);
		
		int choice = fileChooser.showOpenDialog(null);
		if(choice == JFileChooser.APPROVE_OPTION) {
			sourcePath = fileChooser.getSelectedFile().getAbsolutePath();
			txtFileChooser.setText(sourcePath);
		}
	}

	private void getFileTree(String path, DefaultMutableTreeNode node) {
		File file = new File(path);
		File[] arrFile = file.listFiles();
		for(File item: arrFile) {
			if(item.isDirectory()) {
				DefaultMutableTreeNode subNode = new DefaultMutableTreeNode(item.getName());
				node.add(subNode);
				getFileTree(item.getAbsolutePath(), subNode);
			}
		}
		for(File item: arrFile) {
			if(item.isFile()) {
				DefaultMutableTreeNode subNode = new DefaultMutableTreeNode(item.getName());
				node.add(subNode);
			}
		}
	}
	protected void txtFileChooserKeyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		sourcePath = txtFileChooser.getText();
	}
	
}

package autorename;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.filechooser.FileFilter;

public class AutoRenameRebuildUI extends JFrame {
	private JLabel lblDirectory;
	private JTextField txtDirectory;
	private JButton btnDirectory, btnGetListFiles;
	private JTextArea txtListFiles;
	private JLabel lblOldString, lblNewString;
	private JTextField txtOldString, txtNewString;
	private JComboBox<String> cboReplaceType;
	private DefaultComboBoxModel<String> dcmReplaceType;
	private JButton btnReplace;
	
	private String strDirectory;
	private String strOld, strNew;
	private String strReplaceType = "Normal";
	
	public AutoRenameRebuildUI(String title) {
		super(title);
		initComponents();
		addEvents();
	}
	
	private void initComponents() {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.setSize(860, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container ctn = getContentPane();
		
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BorderLayout());
		ctn.add(pnMain);
		
		JPanel pnChoose = new JPanel();
		pnChoose.setLayout(new FlowLayout(FlowLayout.LEFT));
		lblDirectory = new JLabel("Input Directory");
		txtDirectory = new JTextField(45);
		btnDirectory = new JButton("...");
		btnGetListFiles = new JButton("Get List Files");
		pnChoose.add(lblDirectory);
		pnChoose.add(txtDirectory);
		pnChoose.add(btnDirectory);
		pnChoose.add(btnGetListFiles);
		Border bdrChooser = BorderFactory.createEtchedBorder();
		pnChoose.setBorder(bdrChooser);;
		pnMain.add(pnChoose, BorderLayout.NORTH);
		
		JPanel pnInput = new JPanel();
		pnInput.setLayout(new FlowLayout(FlowLayout.LEFT));
		Border bdrInput = BorderFactory.createEtchedBorder();
		pnInput.setBorder(bdrInput);
		lblOldString = new JLabel("Replace String");
		lblNewString = new JLabel("Replace With");
		txtOldString = new JTextField(17);
		txtNewString = new JTextField(17);
		dcmReplaceType = new DefaultComboBoxModel<String>();
		dcmReplaceType.addElement("Normal");
		dcmReplaceType.addElement("Regex");
		cboReplaceType = new JComboBox<String>();
		cboReplaceType.setModel(dcmReplaceType);
		btnReplace = new JButton("Replace");
		pnInput.add(lblOldString);
		pnInput.add(txtOldString);
		pnInput.add(lblNewString);
		pnInput.add(txtNewString);
		pnInput.add(cboReplaceType);
		pnInput.add(btnReplace);
		pnMain.add(pnInput, BorderLayout.CENTER);
		
		JPanel pnListFiles = new JPanel();
		pnListFiles.setPreferredSize(new Dimension(0, 510));
		pnListFiles.setLayout(new BorderLayout());
		txtListFiles = new JTextArea();
		JScrollPane scpListFiles = new JScrollPane(txtListFiles, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnListFiles.add(scpListFiles, BorderLayout.CENTER);
		pnMain.add(pnListFiles, BorderLayout.SOUTH);
		
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		txtDirectory.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				txtDirectoryKeyReleased(arg0);
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});;
		
		btnDirectory.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				btnDirectoryActionPerformed(arg0);
			}
		});
		
		txtOldString.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				txtOldKeyReleased(arg0);
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		txtNewString.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				txtNewKeyReleased(arg0);
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		cboReplaceType.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				cboReplaceTypeItemStateChanged(arg0);
			}
		});
	
		btnGetListFiles.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				btnGetListFileActionPerFormed(arg0);
			}
		});
		
		btnReplace.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				btnReplaceActionPerformed(arg0);
			}
		});

	}
	
	
	private void btnGetListFileActionPerFormed(ActionEvent arg0) {
		txtListFiles.setText(FileFactory.getListFiles(strDirectory));
	}
	
	private void btnReplaceActionPerformed(ActionEvent arg0) {
		printStackTrade();
		if(strOld == null || strNew == null || strReplaceType == null) {
			JOptionPane.showMessageDialog(null, "Please fill all input", "Warning", JOptionPane.WARNING_MESSAGE);
			return;
		}
		boolean result = FileFactory.renameFiles(strDirectory, strReplaceType, strNew, strOld);
		if(result) {
			JOptionPane.showMessageDialog(null, "Success!");
			txtListFiles.setText(FileFactory.getListFiles(strDirectory));
		} else {
			JOptionPane.showMessageDialog(null, "Error");
		}
	}
	
	public void cboReplaceTypeItemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		strReplaceType = (String) cboReplaceType.getSelectedItem();
	}
	
	private void txtNewKeyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		strNew = txtNewString.getText();
	}
	
	private void txtOldKeyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		strOld = txtOldString.getText();
	}
	
	private void btnDirectoryActionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JFileChooser fcs = new JFileChooser();
		fcs.setDialogTitle("Choose a folder");
		fcs.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fcs.setAcceptAllFileFilterUsed(false);
		if(fcs.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			strDirectory = fcs.getSelectedFile().getAbsolutePath();
			txtDirectory.setText(strDirectory);
		}
	}
	
	private void txtDirectoryKeyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		strDirectory = txtDirectory.getText();
	}
	
	private void printStackTrade() {
		// TODO Auto-generated method stub
		System.out.println("Directory: " + strDirectory);
		System.out.println("Old String: " + strOld);
		System.out.println("New String: " + strNew);
		System.out.println("Replace Type: " + strReplaceType);
	}
	
	public static void main(String[] args) {
		AutoRenameRebuildUI frm = new AutoRenameRebuildUI("Auto Rename (Rebuild)");
		frm.setVisible(true);
	}
}

package quanlycongvan.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import quanlycongvan.controler.MSAccessConnection;
import quanlycongvan.controler.UserService;
import quanlycongvan.model.NguoiDung;

public class LoginUI extends JFrame {
	public LoginUI(String title) {
		super(title);
		initComponents();
		UserService.connection = MSAccessConnection.getConnection("DataBase/QuanLyCongVan.accdb");
		addEvents();
	}

	private JLabel lblUserName, lblPassWord, lblCreateAnAccount;
	private JTextField txtUserName;
	private JPasswordField txtPassWord;
	private JButton btnLogin, btnExit;
	
	private void initComponents() {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.setSize(300, 160);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		Container ctn = getContentPane();
		
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		ctn.add(pnMain);
		
		JPanel pnUserName = new JPanel();
		pnUserName.setLayout(new FlowLayout());
		pnMain.add(pnUserName);
		
		lblUserName = new JLabel("Username");
		txtUserName = new JTextField(20);
		pnUserName.add(lblUserName);
		pnUserName.add(txtUserName);
		
		JPanel pnPassWord = new JPanel();
		pnPassWord.setLayout(new FlowLayout());
		pnMain.add(pnPassWord);
		
		lblPassWord = new JLabel("Password");
		txtPassWord = new JPasswordField(20);
		pnPassWord.add(lblPassWord);
		pnPassWord.add(txtPassWord);
		
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout());
		pnMain.add(pnButton);
		
		lblCreateAnAccount = new JLabel("Create an account");
		lblCreateAnAccount.setForeground(Color.DARK_GRAY);
		btnLogin = new JButton("Login");
		btnExit = new JButton("Exit");
		pnButton.add(lblCreateAnAccount);
		pnButton.add(btnLogin);
		pnButton.add(btnExit);
	}
	private void addEvents() {
		// TODO Auto-generated method stub
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btnLoginActionPerformed(e);
			}
		});
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int result = JOptionPane.showConfirmDialog(null, "Exit ?", "Confirm", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		lblCreateAnAccount.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Updating");
			}
		});
	}
	protected void btnLoginActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		NguoiDung user = UserService.getUser(txtUserName.getText(), txtPassWord.getText());
		if(user == null) {
			JOptionPane.showMessageDialog(null, "User does not exist", "Login error", JOptionPane.ERROR_MESSAGE);
			
		} else {
			JOptionPane.showMessageDialog(null, "Login successful");
			this.dispose();
			QuanLyCongVanUI quanLyCongVanUI = new QuanLyCongVanUI("Quan ly cong van cua ban");
			quanLyCongVanUI.setVisible(true);
		}
	}

}

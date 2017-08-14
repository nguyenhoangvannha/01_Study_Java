package bai33preparedstatement;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class NhanVienUI extends JFrame {
	public NhanVienUI(String title) {
		super(title);
		initComponents();
		addEvents();
		connection = getConnectionTo(dataBasePath);
		readDataBase();
	}

	private JLabel lblPhongBan;
	JComboBox cbPhongBan;
	
	private final String strDefault = "jdbc:ucanaccess://";
	private String dataBasePath = "DataBase//NhanVien.accdb";
	
	private Connection connection;
	private PreparedStatement perStatement;
	
	JList<String> lstNhanVien;
	
	private void addEvents() {
		// TODO Auto-generated method stub
		cbPhongBan.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				if(cbPhongBan.getSelectedIndex() == -1) return;
				String[] arr = ((String) cbPhongBan.getSelectedItem()).split("-");
				String ma = arr[0];
				readTableNhanVien(ma);
			}
		});
	}
	protected void readTableNhanVien(String maPB) {
		// TODO Auto-generated method stub
		try {
			perStatement = connection.prepareStatement("select * from NhanVien where MaPhongBan=?");
			perStatement.setString(1,maPB);
			ResultSet rss = perStatement.executeQuery();
			Vector<String> vector = new Vector<String>();
			while(rss.next()) {
				vector.add(rss.getString("Ma") + "-" + rss.getString("Ten"));
			}
			lstNhanVien.setListData(vector);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container ctn = getContentPane();
		
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BorderLayout());
		ctn.add(pnMain);
		
		JPanel pnPhongBan = new JPanel();
		pnPhongBan.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnMain.add(pnPhongBan, BorderLayout.NORTH);
		lblPhongBan = new JLabel("Phong ban");
		cbPhongBan = new JComboBox();
		pnPhongBan.add(lblPhongBan);
		pnPhongBan.add(cbPhongBan);
		
		JPanel pnNhanVien = new JPanel();
		pnNhanVien.setLayout(new BorderLayout());
		
		lstNhanVien = new JList<String>();
		JScrollPane scpNhanVien = new JScrollPane(lstNhanVien, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnMain.add(scpNhanVien, BorderLayout.CENTER);
		
	}
	
	private  boolean readDataBase() {
		try {
			perStatement = connection.prepareStatement("select * from PhongBan");
			ResultSet rss = perStatement.executeQuery();
			cbPhongBan.removeAllItems();
			while(rss.next()) {
				String pb = rss.getString("Ma") + "-" + rss.getString("Ten");
				cbPhongBan.addItem(pb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
 	private Connection getConnectionTo(String dbPath) {
		Connection cnt = null;
		try {
			cnt = DriverManager.getConnection(strDefault + dbPath);
			if(cnt != null) return cnt;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
}

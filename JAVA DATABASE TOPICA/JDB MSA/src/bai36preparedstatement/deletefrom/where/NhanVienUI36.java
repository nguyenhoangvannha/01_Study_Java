package bai36preparedstatement.deletefrom.where;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class NhanVienUI36 extends JFrame {
	public NhanVienUI36(String title) {
		super(title);
		initComponents();
		addEvents();
		connection = getConnectionTo(dataBasePath);
		readDataBase();
	}

	private JLabel lblPhongBan;
	JComboBox cbPhongBan;
	JTextField txtMa, txtTen;
	JLabel lblMa, lblTen;
	JButton btnLuu, btnCapNhat, btnXoaNhanVien;
	
	private final String strDefault = "jdbc:ucanaccess://";
	private String dataBasePath = "DataBase//NhanVien.accdb";
	
	private Connection connection;
	private PreparedStatement preStatement;
	private String maPB;
	
	JList<String> lstNhanVien;
	
	private void addEvents() {
		// TODO Auto-generated method stub
		cbPhongBan.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				if(cbPhongBan.getSelectedIndex() == -1) return;
				String[] arr = ((String) cbPhongBan.getSelectedItem()).split("-");
				maPB = arr[0];
				readTableNhanVien(maPB);
			}
		});
	
		btnLuu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				saveToDataBase();
			}
		});
		lstNhanVien.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub
				String result = lstNhanVien.getSelectedValue();
				txtMa.setText(result.split("-")[0]);
				txtTen.setText(result.split("-")[1]);
			}
		});
		btnCapNhat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				updateDataBase();
			}
		});
		btnXoaNhanVien.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				deleteFromDataBase();
			}
		});
	}
	
	protected void deleteFromDataBase() {
		// TODO Auto-generated method stub
		String ma = txtMa.getText();
		if(ma.equals("")) {
			return;
		} else {
			String sqlCMD = "delete from NhanVien where Ma=?";
			try {
				preStatement = connection.prepareStatement(sqlCMD);
				preStatement.setString(1, ma);
				int result = preStatement.executeUpdate();
				readDataBase();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	protected void updateDataBase() {
		// TODO Auto-generated method stub
		String sqlCMD = "update NhanVien set Ten=? where Ma=?";
		try {
			preStatement = connection.prepareStatement(sqlCMD);
			preStatement.setString(1, txtTen.getText());
			preStatement.setString(2, txtMa.getText());
			int result = preStatement.executeUpdate();
			readDataBase();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected boolean saveToDataBase() {
		// TODO Auto-generated method stub
		try {
			String sqlCMD = "insert into NhanVien values(?,?,?)";
			
			preStatement = connection.prepareStatement(sqlCMD);
			preStatement.setString(1, txtMa.getText());
			preStatement.setString(2, txtTen.getText());
			preStatement.setString(3, maPB);
			int x = preStatement.executeUpdate();
			if(x > 0) {
				readDataBase();
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	protected void readTableNhanVien(String maPB) {
		// TODO Auto-generated method stub
		lstNhanVien.removeAll();
		try {
			preStatement = connection.prepareStatement("select * from NhanVien where MaPhongBan=?");
			preStatement.setString(1,maPB);
			ResultSet rss = preStatement.executeQuery();
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
		
		lstNhanVien = new JList<String>();
		JScrollPane scpNhanVien = new JScrollPane(lstNhanVien, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scpNhanVien.setPreferredSize(new Dimension(0, 350));
		pnMain.add(scpNhanVien, BorderLayout.CENTER);
		
		JPanel  pnChiTiet = new JPanel();
		pnChiTiet.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnMain.add(pnChiTiet, BorderLayout.SOUTH);
		
		lblMa = new JLabel("Ma");
		lblTen = new JLabel("Ten");
		txtMa = new JTextField(10);
		txtTen = new JTextField(20);
		btnLuu = new JButton("Luu");
		btnCapNhat = new JButton("Cap Nhat");
		btnXoaNhanVien = new JButton("Xoa Nhan Vien");
		pnChiTiet.add(lblMa);
		pnChiTiet.add(txtMa);
		pnChiTiet.add(lblTen);
		pnChiTiet.add(txtTen);
		pnChiTiet.add(btnLuu);
		pnChiTiet.add(btnCapNhat);
		pnChiTiet.add(btnXoaNhanVien);
	}
	
	private  boolean readDataBase() {
		try {
			preStatement = connection.prepareStatement("select * from PhongBan");
			ResultSet rss = preStatement.executeQuery();
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

package bai29statement;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class SinhVienUI extends JFrame {
	private DefaultTableModel tbModel;
	private JTable table;
	
	private String dataBasePath = "DataBase\\SinhVien.accdb";
	private String strDefault = "jdbc:ucanaccess://";
	
	JButton btnGetConnect;
	
	public SinhVienUI(String title) {
		super(title);
		initComponents();
		addEvents();
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
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//
		Container ctn = getContentPane();
		
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BorderLayout());
		ctn.add(pnMain);
		
		tbModel = new DefaultTableModel();
		tbModel.addColumn("Ma");
		tbModel.addColumn("Ten");
		tbModel.addColumn("Tuoi");
		table = new JTable(tbModel);
		JScrollPane scpTable = new JScrollPane(table);
		pnMain.add(scpTable, BorderLayout.CENTER);
		
		btnGetConnect = new JButton("Get Connect");
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pnButton.add(btnGetConnect);
		pnMain.add(pnButton, BorderLayout.SOUTH);
	}

	public Connection getConnection(String path) {
		String strConnection = strDefault + path;
		try {
			Connection cnt = DriverManager.getConnection(strConnection);
			if(cnt != null) {
				JOptionPane.showMessageDialog(null, "Success");
				return cnt;
			} else {
				JOptionPane.showMessageDialog(null, "Connect error");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void readData() {
		Connection cnt = getConnection(dataBasePath);
		Statement stm;
		try {
			stm = cnt.createStatement();
			ResultSet rss = stm.executeQuery("select * from SinhVien");
			tbModel.setRowCount(0);
			while(rss.next()) {
				String ma = rss.getString("Ma");
				String ten = rss.getString("Ten");
				int tuoi = rss.getInt("Tuoi");
				tbModel.addRow(new String[] {ma, ten, tuoi + ""});
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void addEvents() {
		// TODO Auto-generated method stub
		btnGetConnect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				readData();
			}
		});
	}
}

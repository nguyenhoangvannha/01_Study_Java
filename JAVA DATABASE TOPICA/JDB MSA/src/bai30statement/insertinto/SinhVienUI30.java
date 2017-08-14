package bai30statement.insertinto;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class SinhVienUI30 extends JFrame {
	public SinhVienUI30(String title) {
		super(title);
		initComponents();
		addEvents();
	}

	private String strDefault = "jdbc:ucanaccess://";
	
	DefaultTableModel tbModel;
	JTable tblData;
	
	JLabel lblMa, lblTen, lblTuoi;
	JTextField txtMa, txtTen, txtTuoi;
	
	JButton btnThem;
	JButton btnRead;
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

		tbModel = new DefaultTableModel();
		tbModel.addColumn("Ma");
		tbModel.addColumn("Ten");
		tbModel.addColumn("Tuoi");
		tblData = new JTable(tbModel);
		JScrollPane scpTable = new JScrollPane(tblData, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scpTable.setPreferredSize(new Dimension(0, 350));
		pnMain.add(scpTable, BorderLayout.CENTER);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setLayout(new BoxLayout(pnSouth, BoxLayout.Y_AXIS));
		pnMain.add(pnSouth, BorderLayout.SOUTH);
		
		JPanel pnThongTin = new JPanel();
		pnThongTin.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnSouth.add(pnThongTin);
		lblMa = new JLabel("Ma");
		txtMa = new JTextField(20);
		pnThongTin.add(lblMa);
		pnThongTin.add(txtMa);
		lblTen = new JLabel("Ten");
		txtTen = new JTextField(20);
		pnThongTin.add(lblTen);
		pnThongTin.add(txtTen);
		lblTuoi = new JLabel("Tuoi");
		txtTuoi = new JTextField(20);
		pnThongTin.add(lblTuoi);
		pnThongTin.add(txtTuoi);
		
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pnSouth.add(pnButton);
		btnRead = new JButton("Doc du lieu");
		btnThem = new JButton("Them");
		pnButton.add(btnRead);
		pnButton.add(btnThem);
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnRead.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				readDataToTable();
			}
		});
		btnThem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				addData();
				
			}
		});
	}
	private Connection getConnectionTo(String dbPath) {
		Connection cnt = null;
		try {
			cnt = DriverManager.getConnection(strDefault + dbPath);
			return cnt;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}
	private void readDataToTable() {
		String path = "DataBase//SinhVien.accdb";
		Connection cnt = getConnectionTo(path);
		if(cnt == null) {
			JOptionPane.showMessageDialog(null, "Cannot connect to data base.");
			return;
		} else {
			tbModel.setRowCount(0);
			try {
				Statement stm = cnt.createStatement();
				ResultSet rss = stm.executeQuery("select * from SinhVien");
				while(rss.next()) {
					String ma = rss.getString("Ma");
					String ten = rss.getString("Ten");
					int tuoi = rss.getInt("Tuoi");
					Object arr[] = {ma, ten, tuoi};
					tbModel.addRow(arr);
				}
				JOptionPane.showMessageDialog(null, "Success!");
				cnt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Error while read data from data base");
			}
		}
	}
	private void addData() {
		String path = "DataBase//SinhVien.accdb";
		Connection cnt = getConnectionTo(path);
		if(cnt == null) {
			JOptionPane.showMessageDialog(null, "Cannot connect to data base.");
			return;
		} else {
			try {
				Statement stm = cnt.createStatement();
				String ma = txtMa.getText();
				String ten = txtTen.getText();
				int tuoi = Integer.parseInt(txtTuoi.getText());
				String newData = "insert into SinhVien values('"+ma+"', '"+ten+"', "+tuoi+")";
				//insert to SinhVien values('ma','ten',tuoi);
				int kq = stm.executeUpdate(newData);
				if(kq == 0) {
					JOptionPane.showMessageDialog(null, "Add error");
				} else {
					JOptionPane.showMessageDialog(null, "Success: " + kq);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Error");
			}
		}
	}
}

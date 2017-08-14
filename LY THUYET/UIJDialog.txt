package tooltest;

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

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SinhVienTimKiemUI extends JDialog {
	public SinhVienTimKiemUI(String title) {
		this.setTitle(title);
		initComponents();
		addEvents();
	}

	private JTextField txtTim;
	private JButton btnTimTheoTuoi, btnTimTheoTen;
	private DefaultTableModel tbModel;
	private JTable tblResult;
	
	private String strDefault = "jdbc:ucanaccess://";
	private String dataBasePath = "DataBase//SinhVien.accdb";
	private void addEvents() {
		// TODO Auto-generated method stub
		btnTimTheoTuoi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				searchIntoDataBaseByAge(dataBasePath);
			}
		});
		btnTimTheoTen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				searchIntoDataBaseByName(dataBasePath);
			}
		});
	}

	protected boolean searchIntoDataBaseByName(String dbPath) {
		// TODO Auto-generated method stub
		String keyWord = txtTim.getText();
		if(keyWord.equals("")) {
			return false;
		}
		Connection cnt = getConnectionTo(dbPath);
		if(cnt == null) {
			return false;
		} else {
			try {
				Statement stm = cnt.createStatement();
				ResultSet rss = stm.executeQuery("select * from SinhVien where Ten like '%"+keyWord+"%' or Ma like '%"+keyWord+"%'");
				while(rss.next()) {
					int tuoiResult = rss.getInt("Tuoi");
					String ma = rss.getString("Ma");
					String ten = rss.getString("Ten");
					Object[] arr = {ma, ten, tuoiResult};
					tbModel.addRow(arr);
				}
				cnt.close();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			cnt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	protected boolean searchIntoDataBaseByAge(String dbPath) {
		// TODO Auto-generated method stub
		int tuoi = -1;
		try {
			tuoi = Integer.parseInt(txtTim.getText());
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		if(tuoi < 0) {
			return false;
		}
		
		Connection cnt = getConnectionTo(dbPath);
		if(cnt == null) {
			return false;
		} else {
			try {
				tbModel.setRowCount(0);
				Statement stm = cnt.createStatement();
				ResultSet rss = stm.executeQuery("select * from SinhVien");
				while(rss.next()) {
					int tuoiResult = rss.getInt("Tuoi");
					if(tuoiResult <= tuoi) {
						String ma = rss.getString("Ma");
						String ten = rss.getString("Ten");
						Object[] arr = {ma, ten, tuoiResult};
						tbModel.addRow(arr);
					}
				}
				cnt.close();
				JOptionPane.showMessageDialog(null, "Success");
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			cnt.close();
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
			return cnt;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	private void initComponents() {
		// TODO Auto-generated method stub
		this.setSize(600, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setModal(true); // show as dialog
		
		Container ctn = getContentPane();
		
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BorderLayout());
		ctn.add(pnMain);
		
		JPanel pnTim = new JPanel();
		pnTim.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnMain.add(pnTim, BorderLayout.NORTH);
		JLabel lblTim = new JLabel("Do tuoi toi da");
		txtTim = new JTextField(20);
		btnTimTheoTuoi = new JButton("Tim Theo Tuoi");
		btnTimTheoTen = new JButton("Tim Theo Ten");
		pnTim.add(lblTim);
		pnTim.add(txtTim);
		pnTim.add(btnTimTheoTen);
		pnTim.add(btnTimTheoTuoi);
		
		tbModel = new DefaultTableModel();
		tbModel.addColumn("Ma");
		tbModel.addColumn("Ten");
		tbModel.addColumn("Tuoi");
		tblResult = new JTable(tbModel);
		JScrollPane scpResult = new JScrollPane(tblResult, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scpResult.setPreferredSize(new Dimension(0, 200));
		pnMain.add(scpResult, BorderLayout.CENTER);
	}
	
	
	
}

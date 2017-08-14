package bai32statement.delete;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

import tooltest.SinhVienTimKiemUI;

public class SinhVienUI32 extends JFrame{
	public SinhVienUI32(String title) {
		super(title);
		initComponents();
		addEvents();
	}

	DefaultTableModel tbModel;
	JTable tblThongTin;
	JLabel lblMa, lblTen, lblTuoi;
	JTextField txtMa, txtTen, txtTuoi;
	JButton btnThem, btnSua, btnDocDuLieu, btnXoa, btnTim;
	
	private String strDefault = "jdbc:ucanaccess://";
	private String dataBasePath = "DataBase//SinhVien.accdb";
	
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
		
		tbModel= new DefaultTableModel();
		tbModel.addColumn("Ma");
		tbModel.addColumn("Ten");
		tbModel.addColumn("Tuoi");
		tblThongTin = new JTable(tbModel);
		JScrollPane scp = new JScrollPane(tblThongTin, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scp.setPreferredSize(new Dimension(0, 350));
		pnMain.add(scp, BorderLayout.CENTER);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setLayout(new BoxLayout(pnSouth, BoxLayout.Y_AXIS));
		pnMain.add(pnSouth, BorderLayout.SOUTH);
		
		JPanel pnChiTiet = new JPanel();
		pnChiTiet.setLayout(new FlowLayout());
		pnSouth.add(pnChiTiet);
		lblMa = new JLabel("Ma");
		lblTen = new JLabel("Ten");
		lblTuoi = new JLabel("Tuoi");
		txtMa = new JTextField(20);
		txtTen = new JTextField(20);
		txtTuoi = new JTextField(20);
		pnChiTiet.add(lblMa);
		pnChiTiet.add(txtMa);
		pnChiTiet.add(lblTen);
		pnChiTiet.add(txtTen);
		pnChiTiet.add(lblTuoi);
		pnChiTiet.add(txtTuoi);
		
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pnSouth.add(pnButton);
		btnDocDuLieu = new JButton("Doc DataBase");
		btnThem = new JButton("Them");
		btnSua = new JButton("Sua");
		btnXoa = new JButton("Xoa");
		btnTim = new JButton("Tim Kiem");
		pnButton.add(btnDocDuLieu);
		pnButton.add(btnTim);
		pnButton.add(btnThem);
		pnButton.add(btnSua);
		pnButton.add(btnXoa);
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnDocDuLieu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				readDataBase(dataBasePath);
			}
		});
		btnThem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				addToDataBase(dataBasePath);
			}
			
		});
		btnSua.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				editDataBase(dataBasePath);
			}
		});
		tblThongTin.addMouseListener(new MouseListener() {
			
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
				int row = tblThongTin.getSelectedRow();
				txtMa.setText((String)tbModel.getValueAt(row, 0));
				txtTen.setText((String)tbModel.getValueAt(row, 1));
				txtTuoi.setText((int)tbModel.getValueAt(row, 2) + "");
			}
		});
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				deleteIntoDataBase(dataBasePath);
			}
		});
		btnTim.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				searchSudents(dataBasePath);
			}
		});
	}
	
	protected void searchSudents(String dbPath) {
		// TODO Auto-generated method stub
		SinhVienTimKiemUI timkiem = new SinhVienTimKiemUI("Tim Thong Tin");
		timkiem.setVisible(true);
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
	
	private boolean readDataBase(String dbPath) {
		Connection cnt = getConnectionTo(dbPath);
		if(cnt == null) {
			JOptionPane.showMessageDialog(null, "Connect to database error.");
			return false;
		} else {
			tbModel.setRowCount(0);
			try {
				Statement stm = cnt.createStatement();
				ResultSet rss = stm.executeQuery("select * from SinhVien");
				String ma;
				String ten;
				int tuoi;
				while(rss.next()) {
					ma = rss.getString("Ma");
					ten = rss.getString("Ten");
					tuoi = rss.getInt("Tuoi");
					Object[] arr = {ma, ten, tuoi};
					tbModel.addRow(arr);
				}
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
	
	private boolean addToDataBase(String dbPath) {
		Connection cnt = getConnectionTo(dbPath);
		
		try {
			Statement stm = cnt.createStatement();
			String ma = txtMa.getText();
			String ten = txtTen.getText();
			int tuoi = Integer.parseInt(txtTuoi.getText());
			String strCMD = "insert into SinhVien values('"+ma+"','"+ten+"',"+tuoi+")";
			int kq = stm.executeUpdate(strCMD);
			if(kq == 0) {
				JOptionPane.showMessageDialog(null, "Adding error");
			} else {
				JOptionPane.showMessageDialog(null, "Success: " + kq);
				cnt.close();
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			cnt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	private boolean editDataBase(String dbPath) {
		Connection cnt = getConnectionTo(dbPath);
		
		try {
			Statement stm = cnt.createStatement();
			String sqlCMD = "update SinhVien set Ten='"+txtTen.getText()+"', Tuoi="+txtTuoi.getText()+" where Ma='"+txtMa.getText()+"'";
			int kq = stm.executeUpdate(sqlCMD);
			if(kq == 0) {
				JOptionPane.showMessageDialog(null, "Update error");
				return false;
			} else {
				JOptionPane.showMessageDialog(null, "Update Succesful: " + kq);
				readDataBase(dbPath);
				cnt.close();
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			cnt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	private boolean deleteIntoDataBase(String dbPath) {
		
		int choose = JOptionPane.showConfirmDialog(null, "Xac nhan xoa sinh vien " + txtTen.getText(),"Xac nhan",JOptionPane.YES_NO_OPTION);
		if(choose != JOptionPane.YES_OPTION) {
			return false;
		}
		Connection cnt = getConnectionTo(dbPath);
		if(cnt == null) {
			return false;
		} else {
			try {
				Statement stm = cnt.createStatement();
				String sqlCMD = "delete from SinhVien where Ma='"+txtMa.getText()+"'";
				int kq = stm.executeUpdate(sqlCMD);
				if(kq == 0) {
					JOptionPane.showMessageDialog(null, "Error");
				} else {
					JOptionPane.showMessageDialog(null, "Success: " + kq);
				}
				cnt.close();
				readDataBase(dbPath);
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
}

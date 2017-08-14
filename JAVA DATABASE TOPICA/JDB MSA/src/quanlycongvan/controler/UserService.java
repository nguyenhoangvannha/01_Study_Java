package quanlycongvan.controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import quanlycongvan.model.NguoiDung;

public class UserService {
	public static Connection connection;
	
	public static NguoiDung getUser(String userName, String passWord) {
		NguoiDung user = null;
		String cmd = "select * from NguoiDung where TenDangNhap = ? and MatKhau = ?";
		try {
			PreparedStatement preSta = connection.prepareStatement(cmd);
			preSta.setString(1, userName);
			preSta.setString(2, passWord);
			ResultSet rss =  preSta.executeQuery();
				if(rss.next()) {
					user = new NguoiDung(rss.getInt("ID"), rss.getString("TenDangNhap"),
							rss.getString("MatKhau"), rss.getString("HoTen"));
					System.out.println("one user found");
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	public static ArrayList<NguoiDung> getUsersList(){
		ArrayList<NguoiDung> userList = new ArrayList<NguoiDung>();
		String cmd =  "select * from NguoiDung";
		try {
			PreparedStatement preSta = connection.prepareStatement(cmd);
			ResultSet rss = preSta.executeQuery();
			while(rss.next()) {
				userList.add(new NguoiDung(rss.getInt("ID"), rss.getString("TenDangNhap"),
								rss.getString("MatKhau"), rss.getString("HoTen")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
	}

}

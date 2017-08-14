package quanlycongvan.controler;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import quanlycongvan.model.CongVan;

public class CongVanService {
	public ArrayList<CongVan> getByUser(int ID){
		ArrayList<CongVan> listCongVan = null;
		String cmd = "select * from CongVan where IDNguoiNhan = ?";
		try {
			PreparedStatement preSta = UserService.connection.prepareStatement(cmd);
			preSta.setInt(1, ID);
			ResultSet rss = preSta.executeQuery();
			listCongVan = new ArrayList<CongVan>();
			while(rss.next()) {
				CongVan cv = new CongVan();
				cv.setCoQuanID(rss.getInt("IDCoQuan"));
				cv.setGhiChu(rss.getString("GhiChu"));
				cv.setLoaiCongVanID(rss.getInt("IDLoaiCongVan"));
				cv.setNgayThangVaoSo(rss.getDate("NgayThangVaoSo"));
				cv.setNgayVanBan(rss.getDate("NgayVanBan"));
				cv.setID(rss.getInt("ID"));
				cv.setSoVanBan(rss.getString("SoVanBan"));
				listCongVan.add(cv);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listCongVan;
	}
} 

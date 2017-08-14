package quanlycongvan.controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MSAccessConnection {
	private static final String STR_UCAN = "jdbc:ucanaccess://";
	public static Connection getConnection(String dataBase) {
		try {
			return DriverManager.getConnection(STR_UCAN + dataBase);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

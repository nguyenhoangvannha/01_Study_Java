package microsoft.access;

import java.sql.Connection;
import java.sql.DriverManager;

public class MSA_Test {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			//String strConnection = "jdbc:ucanaccess://" + "E:\\a.accdb";
			String strConnection = "jdbc:ucanaccess://" + "DataBase\\Bai27.accdb";
			connection = DriverManager.getConnection(strConnection);
			if(connection != null) {
				System.out.println("Cussess");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

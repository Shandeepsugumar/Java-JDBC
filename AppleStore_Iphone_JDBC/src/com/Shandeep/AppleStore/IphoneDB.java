package com.Shandeep.AppleStore;

import java.sql.Connection;
import java.sql.DriverManager;

public class IphoneDB {
	public Connection getDBConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/applestore","shandeep","shandeep4621");
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
}

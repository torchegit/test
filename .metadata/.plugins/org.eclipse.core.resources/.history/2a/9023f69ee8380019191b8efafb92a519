package com.internousdev.template.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver";
<<<<<<< HEAD
	private static String url = "jdbc:mysql://localhost/ecsite_kamei";
=======
	private static String url = "jdbc:mysql://localhost/ecsite";
>>>>>>> f7a47b02654efad3020cce9b44a9c32e926ebc8a

	private static String user = "root";
	private static String password = "mysql";

	 public Connection getConnection() {
	Connection con = null;

	try{
		Class.forName(driverName);
		con = (Connection) DriverManager.getConnection(url,user,password);
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e){
		e.printStackTrace();
	}

	return con;
	 }
}

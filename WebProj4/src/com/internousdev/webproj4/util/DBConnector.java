package com.internousdev.webproj4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnector {
	/**
	 * JDBC ドライバー名
	 */
	private static String driverName = "com.mysql.jdbc.Driver";
	/**
	 * データベース接続 URL
	 */
<<<<<<< HEAD
	private static String url = "jdbc:mysql://localhost/testdb_k";
=======
	private static String url = "jdbc:mysql://localhost/testdb";
>>>>>>> b75be0697fd0b0f682678325a0f904de0b51b1dc
	/**
	 * データベース接続ユーザ名
	 */
	private static String user = "root";
	/**
	 * データベース接続パスワード
	 */
	private static String password = "mysql";

public Connection getConnection() {
	Connection con = null;
	try {
	Class.forName(driverName);
	con = DriverManager.getConnection(url, user, password);
	} catch (ClassNotFoundException e) {
	e.printStackTrace();
	} catch (SQLException e) {
	e.printStackTrace();
	}
	return con;
}
}

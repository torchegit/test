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
	private static String url = "jdbc:mysql://localhost/testdb_kk";
=======
<<<<<<< HEAD
	private static String url = "jdbc:mysql://localhost/testdb_kk";
=======
<<<<<<< HEAD
	private static String url = "jdbc:mysql://localhost/testdb_kk";
=======
<<<<<<< HEAD
	private static String url = "jdbc:mysql://localhost/testdb_k";
=======
	private static String url = "jdbc:mysql://localhost/testdb";
>>>>>>> b75be0697fd0b0f682678325a0f904de0b51b1dc
>>>>>>> 2c89a72b1dd336a7665736b003c83f03b4a106a9
>>>>>>> 7ee33564aa18078133ae73c7015b9ce16c3cf728
>>>>>>> 8f26d54d721b2735f584208d3a8d591d1b0c1c58
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

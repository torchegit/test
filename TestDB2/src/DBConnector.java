import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * <p>MySQLに接続する為のユーティリティクラスです。<br>
 * ルートアカウントにてDBに接続されます。</p>
 */

/**
 * @author testuser
 *
 */
public class DBConnector {
/**
 * JDBC ドライバー名
 */
  private static String driverName = "com.mysql.jdbc.Driver";
/**
 * データベース接続 URL
 */
  private static String url =
"jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";

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
	try{
		Class.forName(driverName);
		con = DriverManager.getConnection(url,user,password);
	} catch (ClassNotFoundException e) {
	e.printStackTrace();
	} catch (SQLException e) {
	e.printStackTrace() ;
	}
	return con ;
}
}


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TestUserDAO{
	String name = "";
	String password = "";
public void select(String name,String password) {
	DBConnector db = new DBConnector();
	Connection con = db.getConection();


	String sql = "select * from test_table wher user_name=? and password=?";
	try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		if (rs.next()) {
			System.out.println(rs.getString("user_name"));
			System.out.println(rs.getString("password"));
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	try {
		con.close() ;
	}catch (SQLException e) {
		e.printStackTrace();
	}
}
}


public class Test {
	public static void main(String[] args) {
		TestUserDAO dao = new TestUserDAO();
		dao.select("taro", "123");
	}
}

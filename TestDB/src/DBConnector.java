/**
 *
 */

/**
 * @author testuser
 *
 */

/**
	 * <p>MySQLに接続する為のユーティリティクラスです。<br>
	 * ルートアカウントにてDBに接続されます。</p>
	 */
public class DBConnector {

	/**
	 * JDBC ドライバー名
	 */
	private static String driverName = "com.mysql.Driver";
	/**
	 * データベース接続 URL
	 */
	private static String url = "jdbc:mysql://localhost/testdb?autoReconnect=true&userSSL=false";

}

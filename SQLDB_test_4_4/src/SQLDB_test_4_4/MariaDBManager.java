package SQLDB_test_4_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MariaDBManager {
	// コネクションの定義
	Connection connection = null;

	/**
	 * コンストラクタ
	 * @param jdbcUrl JDBC接続先情報(URL)
	 * @param userName 接続ユーザ名
	 * @param password 接続ユーザのパスワード
	 * @throws SQLException 
	 */
	public MariaDBManager(String jdbcUrl, String userName, String password) throws SQLException {
		// 接続情報をもとにMariaDBに接続
		connection = DriverManager.getConnection(jdbcUrl, userName, password);
		// 文字コードを指定する
		connection.createStatement().execute("SET NAMES 'utf8'");
	}

	/**
	 * コネクション情報を取得する
	 * @return
	 */
	public Connection getConnection() {
		return connection;
	}

	/**
	 * コネクション情報をクローズする
	 */
	public void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// リソースのクローズ
				connection.close();
				// クローズ時のSQL実行時エラーを補足
			} catch (SQLException e) {
				// 例外情報を出力する
				e.printStackTrace();
			}
		}
	}

	/**
	 * 引数で受け取ったクエリを実行する
	 * @param sqlQuery SQL文
	 * @return 実行結果
	 */
	public ResultSet executeQuery(String sqlQuery) {
		// ResultSet(実行結果)の定義
		ResultSet resultSet = null;
		// Statementの定義
		try (Statement statement = connection.createStatement()) {
			// SQLクエリを実行する
			resultSet = statement.executeQuery(sqlQuery);
			// SQL実行時エラーを補足
		} catch (SQLException e) {
			// 例外情報を出力する
			e.printStackTrace();
			// エラー有無にかかわらず処理を実行
		} finally {
			try {
				// リソースのクローズ
				resultSet.close();
				// クローズ時のSQL実行時エラーを補足
			} catch (SQLException e) {
				// 例外情報を出力する
				e.printStackTrace();
			}
		}
		return resultSet;
	}

	/**
	 * 引数で受け取ったクエリを実行する
	 * @param sqlQuery SQL文
	 * @return 実行結果
	 */
	public int executeUpdateQuery(String sqlQuery) {
		// ResultSet(実行結果)の定義
		int result = -1;
		// Statementの定義
		try (Statement statement = connection.createStatement()) {
			// SQLクエリを実行する
			result = statement.executeUpdate(sqlQuery);

			// SQL実行時エラーを補足
		} catch (SQLException e) {
			// 例外情報を出力する
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 引数で受け取ったクエリを実行する(条件指定版)
	 * @param statement 可変に条件の設定されたSQL文
	 * @return 実行結果
	 */
	public ResultSet executeQueryWithPreparedStatement(PreparedStatement statement) {
		// ResultSet(実行結果)の定義
		ResultSet resultSet = null;
		try {
			// SQLクエリを実行する
			resultSet = statement.executeQuery();

			// SQL実行時エラーを補足
		} catch (SQLException e) {
			// 例外情報を出力する
			e.printStackTrace();
			// エラー有無にかかわらず処理を実行
		} finally {
			try {
				// リソースのクローズ
				resultSet.close();
				statement.close();
				// クローズ時のSQL実行時エラーを補足
			} catch (SQLException e) {
				// 例外情報を出力する
				e.printStackTrace();
			}
		}
		return resultSet;
	}
}
package SQLDB_test_4_5;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
/*
 * クラス名            :SQLDB_test_4_3
 * 概要                :特定ディーラーの保有する車の情報を削除する
 * 					　 :整数値以外が入力された場合は出来ないことを表示する
 * @author             :中西輝
 * 作成日              :2026.6.15
 */
public class SQLDB_test_4_3 {

	public static void delete() {

		// DBに接続するための設定情報を用意
		String url = "jdbc:mariadb://localhost:3306/workbook"; 
		String user = "workusr";
		String password = "workpass";
		//managerを空白にする
		MariaDBManager manager = null;
		/* * 例外処理
		 * キーボードで入力した値を入れる変数を作る
		 */
		try (Scanner standardInput = new Scanner(System.in)) {
			//MariaDBManagerのインスタンスを生成
			manager = new MariaDBManager(url, user, password);
			//削除前の現在のデータを一覧表示
			selectQuery(manager);
			//""の中の文字を表示して改行
			System.out.println("-----------------------------------------\n");

			//""の中の文字を表示して改行
			System.out.println("DELETEする情報は？");

			System.out.print("代理id：");
			//""文字を入力
			String secondHandId = standardInput.next();

			// DB接続と実行（入力された値を引数として渡す）
			deleteQuery(manager, secondHandId);
			//""の中の文字を表示して改行
			System.out.println("データの削除が完了しました。\n");
			//削除後の現在のデータを一覧表示
			selectQuery(manager);
			//""の中の文字を表示して改行
			System.out.println("-----------------------------------------");

			//入力に例外がある場合
		} catch (SQLException e) {
			//""の中の文字を表示して改行
			System.err.println("データベースエラーが発生しました。");
			//エラーの原因を表示
			e.printStackTrace();
		}
	}
	/*
	 * 関数名　　：selectQuery
	 * メソッド　：main処理から受け取った引数を、データベース用の命令（SQL）に組み立てて実行する
	 * 			　エラーが発生した場合はmainのcatchに処理を任せる
	 * @param    ： manager       MariaDBの接続管理オブジェクト
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.6.15
	 */

	private static void selectQuery(MariaDBManager manager) throws SQLException {
		// 前後で全データを見比べられるように、シンプルな全件検索に修正しました。
		String sqlQuery = "select second_hand_id, dealear_id, type_id, car_model_id, use_sale from use_car";
		// SQLを実行する
		ResultSet resultSet = manager.executeQuery(sqlQuery);
		// 実行結果を表示する
		showResultset(resultSet);
	}

	/*
	 * 関数名　　：deleteQuery
	 * メソッド　：main処理から受け取った引数を、データベース用の命令（SQL）に組み立てて実行する
	 * 			　エラーが発生した場合はmainのcatchに処理を任せる
	 * @param    ： manager       MariaDBの接続管理オブジェクト
	 * @param    ：secondHandId 代理キー
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.6.15
	 */
	private static void deleteQuery(MariaDBManager manager, String secondHandId) throws SQLException {

		// クエリ(SQL文)を作成する
		String sqlQuery = "DELETE FROM use_car WHERE second_hand_id = " + secondHandId ;
		// SQL文を実行する
		manager.executeUpdateQuery(sqlQuery);
	}


	/*
	 * 関数名　　：showResultset
	 * メソッド　：データベースから取得した検索結果（ResultSet）を、コンソールに表示する
       		 			エラーが発生した場合はmainのcatchに処理を任せる
	 * @param    ： resultSet　       MariaDBの接続管理オブジェクト
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.6.15
	 */
	private static void showResultset(ResultSet resultSet) throws SQLException {
		//""の中の文字を表示して改行
		System.out.println("代理ID, ディーラーID, タイプID, 車種ID, 中古販売額");
		//""の中の文字を表示して改行
		System.out.println("------------------------------------------------");

		// データがる限り繰り返す
		while (resultSet.next()) {
			// 列のデータを取得
			String secondHandId = resultSet.getString("second_hand_id");
			// 列のデータを取得
			String dealearId = resultSet.getString("dealear_id");
			// 列のデータを取得
			String typeId = resultSet.getString("type_id");
			// 列のデータを取得
			String carModelId = resultSet.getString("car_model_id");
			// 列のデータを取得
			int useSale = resultSet.getInt("use_sale");

			// 取得した情報を出力
			System.out.println(secondHandId + " , " + dealearId + " , " + typeId + " , " + carModelId + " , " + useSale + "円");
		}
	}

}

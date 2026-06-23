package SQLDB_test_4_5;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
/*
 * クラス名            :SQLDB_test_4_2
 * 概要                :特定ディーラーの保有する車の情報を修正する
 * 					　 :整数値以外が入力された場合は出来ないことを表示する
 * @author             :中西輝
 * 作成日              :2026.6.15
 */
public class SQLDB_test_4_2 {

	/*
	 * 関数名　　：update
	 * メソッド　：修正する内容を各自入力し	 DBに接続する
	 * @param    ：なし
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.6.15
	 */
	public static void update() {

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

			selectQuery(manager);
			System.out.println("-----------------------------------------\n");

			//""の中の文字を表示して改行
			System.out.println("UPDATEする内容を入力してください");
			//""の中の文字を表示
			System.out.print("タイプid：");
			//""文字を入力
			String type_id = standardInput.next();
			//""の中の文字を表示
			System.out.print("車種id：");
			//""文字を入力
			String car_model_id = standardInput.next();
			//""の中の文字を表示
			System.out.print("ディーラーid：");
			//""文字を入力
			String dealear_id = standardInput.next();
			//""の中の文字を表示
			System.out.print("代理id：");
			//""文字を入力
			String second_hand_id = standardInput.next();
			//use_saleの初期化
			int use_sale = 0;
			//繰り返し
			do {
				//""の中の文字を表示
				System.out.print("中古販売額：");
				//値を入力
				use_sale = standardInput.nextInt();
				//use_saleが0以下の場合繰り返し
			} while(use_sale <= 0);

			// DB接続と実行（入力された値を引数として渡す）
			updateQuery(manager, type_id, car_model_id, dealear_id, second_hand_id, use_sale);
			//""の中の文字を表示して改行
			System.out.println("データの更新が完了しました。\n");

			selectQuery(manager);
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
	 * 作成日    ：2026.6.12
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
	 * 関数名　　：updateQuery
	 * メソッド　：main処理から受け取った引数を、データベース用の命令（SQL）に組み立てて実行する
	 * 			　エラーが発生した場合はmainのcatchに処理を任せる
	 * @param    ： manager       MariaDBの接続管理オブジェクト
	 * @param    ：type_id       タイプid
	 * @param    ：dealear_id    ディーラーid
	 * @param    ：car_model_id  車種ID
	 * @param    ：second_hand_id 代理キー
	 * @param    ：use_sale      中古
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.6.12
	 */

	private static void updateQuery(MariaDBManager manager,
			String type_id,
			String car_model_id,
			String dealear_id,
			String second_hand_id,
			int use_sale) throws SQLException {

		// 受け取った変数を使ってSQLを組み立てる
		String sqlQuery = "UPDATE use_car SET type_id = '"+ type_id 
				+ "',car_model_id = "+ "'" + car_model_id 
				+ "', use_sale =  " + use_sale 
				+ " WHERE second_hand_id = " + second_hand_id ;

		//""の中の文字と組み立てたSQLを表示して改行
		System.out.println("実行SQL: " + sqlQuery);

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
	 * 作成日    ：2026.6.12
	 */
	private static void showResultset(ResultSet resultSet) throws SQLException {
		//""の中の文字を表示して改行
		System.out.println("代理ID, ディーラーID, タイプID, 車種ID, 中古販売額");
		//""の中の文字を表示して改行
		System.out.println("------------------------------------------------");

		// データがる限り繰り返す
		while (resultSet.next()) {
			// 各列のデータを取得
			String secondHandId = resultSet.getString("second_hand_id");
			String dealearId = resultSet.getString("dealear_id");
			String typeId = resultSet.getString("type_id");
			String carModelId = resultSet.getString("car_model_id");
			int useSale = resultSet.getInt("use_sale");

			// 取得した情報を出力
			System.out.println(secondHandId + " , " + dealearId + " , " + typeId + " , " + carModelId + " , " + useSale + "円");
		}
	}
}
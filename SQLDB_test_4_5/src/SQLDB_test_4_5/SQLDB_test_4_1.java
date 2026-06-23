package SQLDB_test_4_5;


import java.sql.SQLException;
import java.util.Scanner;

/*
 * クラス名            :SQLDB_test_4_1
 * 概要                :特定ディーラーの保有する車の情報を登録する
 * 					　 :整数値以外が入力された場合は出来ないことを表示する
 * @author             :中西輝
 * 作成日              :2026.6.15
 */
public class SQLDB_test_4_1 {

	/*
	 * 関数名　　：insert
	 * メソッド　：登録する内容を各自入力し	 DBに接続する
	 * @param    ：なし
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.6.15
	 */
	public static void insert() {

		// DBに接続するための設定情報を用意
		String url = "jdbc:mariadb://localhost:3306/workbook"; 
		String user = "workusr";
		String password = "workpass";
		//managerを空白にする
		MariaDBManager manager = null;
		/* 
		 * 例外処理
		 * キーボードで入力した値を入れる変数を作る
		 */
		try (Scanner standardInput = new Scanner(System.in)) {
			//MariaDBManagerのインスタンスを生成
			manager = new MariaDBManager(url, user, password);
			//""の中の文字を表示して改行
			System.out.println("INSERTする内容を入力してください");
			//""の中の文字を表示
			System.out.print("都道府県コード：");
			//""文字を入力
			String prefecture_id = standardInput.next();
			//""の中の文字を表示
			System.out.print("ディーラーid：");
			//""文字を入力
			String dealear_id = standardInput.next();
			//""の中の文字を表示
			System.out.print("タイプid：");
			//""文字を入力
			String type_id = standardInput.next();
			//""の中の文字を表示
			System.out.print("車種id：");
			//""文字を入力
			String car_model_id = standardInput.next();
			//""の中の文字を表示
			System.out.print("元所有者id：");
			//""文字を入力
			String owner_id = standardInput.next();
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
			insertQuery(manager, prefecture_id, dealear_id, type_id, car_model_id, owner_id, use_sale);
			//""の中の文字を表示して改行
			System.out.println("データの追加が完了しました。");
			//入力に例外がある場合
		} catch (SQLException e) {
			//""の中の文字を表示して改行
			System.err.println("データベースエラーが発生しました。");
			//エラーの原因を表示
			e.printStackTrace();
		}
	}

	/*
	 * 関数名　　：insertQuery
	 * メソッド　：main処理から受け取った引数を、データベース用の命令（SQL）に組み立てて実行する
	 * 			　エラーが発生した場合はmainのcatchに処理を任せる
	 * @param    ： manager       MariaDBの接続管理オブジェクト
	 * @param    ：prefecture_id 都道府県コード
	 * @param    ：dealear_id    ディーラーid
	 * @param    ：type_id       タイプid
	 * @param    ：car_model_id  車種ID
	 * @param    ：owner_id      所有者id
	 * @param    ：use_sale      中古
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.6.12
	 */

	private static void insertQuery(MariaDBManager manager, 
			String prefecture_id, 
			String dealear_id, 
			String type_id, 
			String car_model_id, 
			String owner_id, 
			int use_sale) throws SQLException {

		// 受け取った変数を使ってSQLを組み立てる
		String sqlQuery = "INSERT INTO use_car (prefecture_id, dealear_id, type_id, car_model_id, owner_id, use_sale) VALUES(" 
				+ "'" + prefecture_id + "', "
				+ "'" + dealear_id + "', " 
				+ "'" + type_id + "', " 
				+ "'" + car_model_id + "', "
				+ "'" + owner_id + "', " 
				+ use_sale + ")";
		//""の中の文字と組み立てたSQLを表示して改行
		System.out.println("実行SQL: " + sqlQuery);

		// SQL文を実行する
		manager.executeUpdateQuery(sqlQuery);
	}
}
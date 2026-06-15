package SQLDB_test_4_4;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * クラス名            :SQLDB_test_4_4
 * 概要                :検索機能として、販売されている車の情報一覧を取得する。
 * @author             :中西輝
 * 作成日              :2026.6.15
 */
public class SQLDB_test_4_4 {

	/*
	 * 関数名　　：main
	 * メソッド　：検索する内容を各自入力し	 DBに接続する
	 * @param    ：なし
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.6.15
	 */
	public static void search() {

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
			System.out.println("検索機能\n検索候補にしない場合Enterの入力");
			//""の中の文字を表示
			System.out.print("ディーラー：");
			//""文字を入力
			String dealearName = standardInput.nextLine();
			//""の中の文字を表示
			System.out.print("メーカー：");
			//""文字を入力
			String manufactureNameName = standardInput.nextLine();
			//""の中の文字を表示
			System.out.print("タイプ：");
			//""文字を入力
			String typeNameName = standardInput.nextLine();
			//""の中の文字を表示
			System.out.print("車種：");
			//""文字を入力
			String carModelNameName = standardInput.nextLine();
			//priceFromの初期化
			int priceFrom = 0;
			//priceToの初期化
			int priceTo= 0;
			//繰り返し
			do {
				//""の中の文字を表示
				System.out.print("中古販売額いくらから？：");
				//値を入力
				priceFrom = standardInput.nextInt();
				//priceFromが0以下の場合繰り返し
			} while(priceFrom <= 0);
			//繰り返し
			do {
				//""の中の文字を表示
				System.out.print("中古販売額いくらまで？：");
				//値を入力
				priceTo = standardInput.nextInt();
				//priceToが0以下,priceFrom以下の場合繰り返し
			} while(priceTo <= 0 || priceFrom > priceTo);

			// DB接続と実行（入力された値を引数として渡す）
			selectQuery(manager, dealearName, manufactureNameName, typeNameName, carModelNameName, priceFrom, priceTo);
			//""の中の文字を表示して改行
			System.out.println("検索完了しました。");
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
	 * 			   空白の場合追加しない
	 * 			　エラーが発生した場合はmainのcatchに処理を任せる
	 * @param    ：manager　MariaDBの接続管理オブジェクト
	 * @param    ：dealearName　ディーラー
	 * @param    ：manufactureName　メーカー
	 * @param    ：typeName　タイプ
	 * @param    ：carModelName　車種
	 * @param    ：priceFrom　中古販売額
	 * @param    ：priceTo　中古販売額
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.6.15
	 */
	private static void selectQuery(MariaDBManager manager, String dealearName, String manufactureName, String typeName, String carModelName, int priceFrom, int priceTo) throws SQLException {

		//ベースとなるSQL
		String sqlQuery = "SELECT d.dealears, m.manufactures, t.types, c.car_models, u.use_sale " +
				"FROM use_car u " +
				"INNER JOIN dealear d ON u.prefecture_id = d.prefecture_id AND u.dealear_id = d.dealear_id " +
				"INNER JOIN car_model c ON u.type_id = c.type_id AND u.car_model_id = c.car_model_id " +
				"INNER JOIN manufacture m ON c.manufacture_id = m.manufacture_id " +
				"INNER JOIN type t ON u.type_id = t.type_id " +
				"WHERE 1=1 "; 

		//文字が入力されている条件だけ SQL に AND で追加していく
		if (dealearName != null && !dealearName.isEmpty()) {
			//追加するSQL
			sqlQuery += " AND d.dealears LIKE ? ";
		}
		//文字が入力されている条件だけ SQL に AND で追加していく
		if (manufactureName != null && !manufactureName.isEmpty()) {
			//追加するSQL
			sqlQuery += " AND m.manufactures LIKE ? ";
		}
		//文字が入力されている条件だけ SQL に AND で追加していく
		if (typeName != null && !typeName.isEmpty()) {
			//追加するSQL
			sqlQuery += " AND t.types LIKE ? ";
		}
		//文字が入力されている条件だけ SQL に AND で追加していく
		if (carModelName != null && !carModelName.isEmpty()) {
			//追加するSQL
			sqlQuery += " AND c.car_models LIKE ? ";
		}
		//金額は必ず入力されているのでそのまま追加
		sqlQuery += " AND u.use_sale >= ? AND u.use_sale <= ? ";

		//? に値をセットする
		PreparedStatement statement = manager.getConnection().prepareStatement(sqlQuery);
		//paramIndexの初期化
		int paramIndex = 1;
		//null,空白ではないとき
		if (dealearName != null && !dealearName.isEmpty()) {
			//入力した文字をセットする（%[変数]%で部分一致）
			statement.setString(paramIndex++, "%" + dealearName + "%"); 
		}
		//null,空白ではないとき
		if (manufactureName != null && !manufactureName.isEmpty()) {
			//入力した文字をセットする
			statement.setString(paramIndex++, "%" + manufactureName + "%");
		}
		//null,空白ではないとき
		if (typeName != null && !typeName.isEmpty()) {
			//入力した文字をセットする
			statement.setString(paramIndex++, "%" + typeName + "%");
		}
		//null,空白ではないとき
		if (carModelName != null && !carModelName.isEmpty()) {
			//入力した文字をセットする
			statement.setString(paramIndex++, "%" + carModelName + "%");
		}
		//入力した値をセットする
		statement.setInt(paramIndex++, priceFrom);
		//入力した値をセットする
		statement.setInt(paramIndex++, priceTo);
		//実行する
		ResultSet resultSet = manager.executeQueryWithPreparedStatement(statement);
		//実行結果を表示する
		showResultset(resultSet);
	}

	/*
	 * 関数名　　：showResultset
	 * メソッド　：データベースから取得した検索結果（ResultSet）を、コンソールに表示する
       		 			エラーが発生した場合はmainのcatchに処理を任せる
	 * @param    ：resultSet　       MariaDBの接続管理オブジェクト
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.6.15
	 */
	private static void showResultset(ResultSet resultSet) throws SQLException {
		//""の中の文字を表示して改行
		System.out.println("ディーラー, メーカー, タイプ, 車種, 中古販売額");
		//""の中の文字を表示して改行
		System.out.println("------------------------------------------------");

		// データがある限り繰り返す
		while (resultSet.next()) {
			// 列のデータを取得
			String carDealears = resultSet.getString("d.dealears");
			// 列のデータを取得
			String carManufactures = resultSet.getString("m.manufactures");
			// 列のデータを取得
			String carTypes = resultSet.getString("t.types");
			// 列のデータを取得
			String carModels = resultSet.getString("c.car_models");
			// 列のデータを取得
			int useSale = resultSet.getInt("u.use_sale");

			// 取得した情報を出力
			System.out.println(carDealears + " , " + carManufactures + " , " + carTypes + " , " + carModels + " , " + useSale + "円");
		}
	}
}

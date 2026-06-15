package SQLDB_test_4_5;

import java.util.Scanner;
/*
 * クラス名            :SQLDB_test_4_5
 * 概要                :１～４をキーボードから入力し、それぞれの機能を使用できるようにする
 * 						1:登録 2:修正 3:削除 4:検索
 * @author             :中西輝
 * 作成日              :2026.6.15
 */
public class SQLDB_test_4_5 {
	/*
	 * 関数名　　：main
	 * メソッド　：１～４をキーボードから入力し、入力した値に沿って処理が行われる
	 * @param    ：なし
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.6.15
	 */
	public static void main(String[] args) {
		/* 
		 * 例外処理
		 * キーボードで入力した値を入れる変数を作る
		 */
		try (Scanner standardInput = new Scanner(System.in)) {
			//""の中の文字を表示して改行
			System.out.print("使用する機能を選択してください。\n 1:登録 2:修正 3:削除 4:検索 > ");
			//入力
			int selectNumber = standardInput.nextInt();
			//入力した値に沿ってcase文を行う
			switch(selectNumber) {
			//1のとき
			case 1:
				//""の中の文字を表示して改行
				System.out.println("登録を実行");
				//SQLDB_test_4_1クラスのコードを実行
				SQLDB_test_4_1.insert();
				//抜け出す
				break;
				//2のとき
			case 2:
				//""の中の文字を表示して改行
				System.out.println("修正を実行");
				//SQLDB_test_4_2クラスのコードを実行
				SQLDB_test_4_2.update();
				//抜け出す
				break;
				//3のとき
			case 3:
				//""の中の文字を表示して改行
				System.out.println("削除を実行");
				//SQLDB_test_4_3クラスのコードを実行
				SQLDB_test_4_3.delete();
				//抜け出す
				break;
				//4のとき
			case 4:
				//""の中の文字を表示して改行
				System.out.println("検索を実行");
				//SQLDB_test_4_4クラスのコードを実行
				SQLDB_test_4_4.search();
				//抜け出す
				break;
				//それ以外
			default:
				//""の中の文字を表示して改行
				System.out.println("1〜4の数値を入力してください。");
				//抜け出す
				break;
			}
			//入力に例外がある場合
		} catch (Exception e) {
			//""の中の文字を表示して改行
			System.out.println("エラーが発生しました。");
			//エラーの原因を表示
			e.printStackTrace();
		}
	}
}


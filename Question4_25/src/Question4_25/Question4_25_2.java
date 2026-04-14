package Question4_25;

import java.util.Scanner;
/*
 * クラス名            :Question4_25
 * 概要                :合計と平均を求める
 * 作成者             :中西輝
 * 作成日              :2026.4.14
 */
public class Question4_25_2 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理で実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.14
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//素数であるかを表示
		System.out.println("整数の合計と平均を出します");
		//正の整数値を表示
		System.out.print("何個加算しますか:");
		//変数inputValueの初期化
		int inputValue = standardInput.nextInt();
		//変数sumNumberの初期化
		int sumNumber = 0;
		//変数averageNumberの初期化
		int averageNumber =0;
		//変数iが1から始まりiずつ増やしていきinputValue回繰り返す
		for(int i = 1; i <= inputValue; i++) {
			//整数を表示
			System.out.print("整数;");
			//変数integerNumberに入力した値を代入
			int integerNumber = standardInput.nextInt();
			//変数sumNumberと変数integerNumberが1000を超えたとき
			if(sumNumber + integerNumber > 1000) {
				//合計が1000を超えました。と表示
				System.out.println("合計が1000を超えました。");
				//最後の値は無視します。を表示
				System.out.println("最後の数値は無視します。");
				//飛び出す
				break;
			}
			//変数sumNumberにintegerNumberの値を足す
			sumNumber += integerNumber;
			//変数averageNumberに変数sumNumberの値から変数iの値を割った値を代入
			averageNumber = sumNumber / i;
		}
		//合計は(sumNumberの値)で、平均は(averageNumberの値)です。を表示する
		System.out.println("合計は"+sumNumber+"で、平均は"+averageNumber+"です。");
	}
}

package Question4_25;

import java.util.Scanner;
/*
 * クラス名            :Question4_25
 * 概要                :合計と平均を求める
 * 作成者             :中西輝
 * 作成日              :2026.4.14
 */
public class Question4_25 {
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
			//整数（0で終了）を表示
			System.out.print("整数（0で終了）;");
			//変数integerNumberに入力した値を代入
			int integerNumber = standardInput.nextInt();
			//integerNumberが0の時飛び出す
			if(integerNumber == 0) break;
			//変数sumNumberにintegerNumberの値を足す
			sumNumber += integerNumber;
			//変数averageNumberに変数sumNumberの値から変数iの値を割った値を代入
			averageNumber = sumNumber / i;
		}
		//合計は(sumNumberの値)で、平均は(averageNumberの値)です。を表示する
		System.out.println("合計は"+sumNumber+"で、平均は"+averageNumber+"です。");
	}
}

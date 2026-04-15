package Question5_5;

import java.util.Scanner;
/*
 * クラス名            :Question5_5
 * 概要                :3つの整数値を読み込んで合計と平均を実数値で表示平均はキャスト演算子を用いる
 * 作成者             :中西輝
 * 作成日              :2026.4.15
 */
public class Question5_5 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理で実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.15
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
				Scanner standardInput = new Scanner(System.in);
				//()内の文字を表示
				System.out.print("整数値 :");
				//入力値1に値を代入
				int inputValue1 = standardInput.nextInt();
				//()内の文字を表示
				System.out.print("整数値 :");
				//入力値2に値を代入
				int inputValue2 = standardInput.nextInt();
				//()内の文字を表示
				System.out.print("整数値 :");
				//入力値3に値を代入
				int inputValue3 = standardInput.nextInt();
				//合計値に入力値1と入力値2と入力値3の足した値を代入
				int sumValue = inputValue1+inputValue2+inputValue3;
				//""の中の文字と合計値の値と実数値に変換した合計値から3を割った平均を表示する
				System.out.println("合計は"+sumValue+"平均は"+(double)sumValue / 3);
	}
}

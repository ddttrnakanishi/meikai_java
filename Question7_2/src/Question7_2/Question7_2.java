package Question7_2;

import java.util.Scanner;
/*
 * クラス名            :Question7_2
 * 概要                :三つのint型引数inputValue1,inputValue2,inputValue3の最小値をお求める
 * 作成者             　:中西輝
 * 作成日              :2026.4.21
 */
public class Question7_2 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理とminNumber処理
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.21
	 */
	static int minNumber(int inputValue1, int inputValue2, int inputValue3 ) {
		//変数minNumberの初期化
		int minNumber = inputValue1;
		//minNumberが入力値2より大きいとき
		if (minNumber > inputValue2) {
			//minNumberに入力値2を代入
			minNumber = inputValue2;
		}
		//minNumberが入力値3より大きいとき
		if(minNumber > inputValue3) {
			//minNumberに入力値3を代入
			minNumber = inputValue3;
		}
		//返却
		return minNumber;
	}

	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示
		System.out.print("inputValue1の値 :");
		//入力値1の値を入力
		int inputValue1 = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("inputValue2の値 :");
		//入力値2の値を入力
		int inputValue2 = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("inputValue3の値 :");
		//入力値3の値を入力
		int inputValue3 = standardInput.nextInt();
		//""の中の文字と返却値を表示して改行
		System.out.println("最小値は" + minNumber(inputValue1, inputValue2, inputValue3 ) + "です。");
	}
}

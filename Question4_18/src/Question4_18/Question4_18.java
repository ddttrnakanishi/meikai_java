package Question4_18;

import java.util.Scanner;
/*
 * クラス名            :Question4_18
 * 概要                :1から読み込んだ値までの2乗値を表示
 * 作成者             :中西輝
 * 作成日              :2026.4.10
 */
public class Question4_18 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理を実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.10
	 */
	public static void main(String[] args) {
		//キーボードで入力する値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//nの値を表示
		System.out.print("nの値:");
		//変数に入力した値を代入
		int inputNumber = standardInput.nextInt();
		//2乗の計算結果の値の初期化
		int squareValue = 0;
		//2乗する値を1から始めて1ずつ増やしていき入力した値の回繰り返す
		for(int plusValue = 1; plusValue <= inputNumber; plusValue++) {
			//2乗の計算結果の値に2乗する値を代入する
			squareValue = plusValue * plusValue;
			//2乗する値と変数2乗の計算結果の値を表示
			System.out.println(plusValue+"の2乗は"+squareValue);
		}
	}
}

package Question7_4;

import java.util.Scanner;
/*
 * クラス名            :Question7_4
 * 概要                :1から入力値までの全整数の和を求める
 * 作成者             　:中西輝
 * 作成日              :2026.4.21
 */
public class Question7_4 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理とmedianNumber処理
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.21
	 */
	static int sumUp(int inputNumber) {
		//変数sumUpの初期化
		int sumUp = 0;
		//変数iが1から始まり1ずつ増やしていき入力値以上になるまで繰り返す
		for(int i = 1; i <= inputNumber; i++) {
			//sumUpにiの値を足す
			sumUp += i;
		}
		//返却
		return sumUp;
	}
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示
		System.out.print("入力値 :");
		//入力値の値を入力
		int inputNumber = standardInput.nextInt();
		//""の中の文字と返却値を表示して改行
		System.out.println("全整数の和は" + sumUp(inputNumber) + "です。");
	}
}

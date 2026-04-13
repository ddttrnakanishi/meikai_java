package Question4_11;

import java.util.Scanner;
/*
 * クラス名            :Question4_11
 * 概要                :読み込んだ値を1ずつ減らして0になるまで出力する
 * 作成者             :中西輝
 * 作成日              :2026.4.9
 */

public class Question4_11 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :～
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.9
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を読み込むための変数を作る
		Scanner standardInput = new Scanner(System.in);
		//カウントダウンをします:を表示
		System.out.println("カウントダウンをします:");
		//変数inputNumberを初期化
		int inputNumber = 0;
		//繰り返し
		do {
			//正の整数値:を表示
			System.out.print("正の整数値:");
			//入力された値を変数に代入
			inputNumber = standardInput.nextInt();
		//変数inputNumberが0より小さい時繰り返す
		}while(inputNumber <= 0);
		//変数iをinputNumberから初めて1つずつ減らしながらi回繰り返す
		for(int i = inputNumber; i >= 0; i--)
			//変数iの値を表示
			System.out.println(i);
	}
}

package Question4_12;

import java.util.Scanner;
/*
 * クラス名            :ensyu4_12
 * 概要                :0から読み込んだ値までカウントアップするプログラム
 * 作成者             :中西輝
 * 作成日              :2026.4.9
 */
public class Question4_12 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :～～
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.9
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を読み込むための変数を作る
		Scanner standardInput = new Scanner(System.in);
		//カウントアップするを表示する
		System.out.println("カウントアップする:");
		//変数inputNumberを初期化
		int inputNumber = 0;
		//繰り返し
		do {
			//正の整数値:を表示
			System.out.print("正の整数値:");
			//変数inputNumberに値を入力する
			inputNumber = standardInput.nextInt();
		//inputNumberが0より小さいとき繰り返す
		}while(inputNumber <= 0);
		//変数iを0から始めて変数iを1ずつ増やしていきinputNumber回繰り返す
		for(int i = 0;inputNumber >= i;i++ ) {
			//iの値を表示する
			System.out.println(i);

		}



	}

}

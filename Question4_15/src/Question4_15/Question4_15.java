package Question4_15;

import java.util.Scanner;
/*
 * クラス名            :ensyu4_11
 * 概要                :読み込んだ値から標準体重を求める
 * 作成者             :中西輝
 * 作成日              :2026.4.9
 */

public class Question4_15 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :～～
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.9
	 */
	public static void main(String[] args) {
		//キーボードで入力した値をいれる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//変数firstVaiueの初期化
		int firstVaiue = 0;
		//変数secondValueの初期化
		int secondValue = 0;
		//変数thirdValueの初期化
		int thirdValue = 0;
		//繰り返し
		do {
			//何cmから:と表示
			System.out.print("何cmから:");
			//変数firstVaiueに入力した値を代入
			firstVaiue = standardInput.nextInt();
		//入力した値が0より大きくなるまで繰り返し
		}while(firstVaiue <= 0);
		//繰り返し
		do {
			//何cmまで:と表示
			System.out.print("何cmまで:");
			//変数secondValueに入力した値を代入
			secondValue = standardInput.nextInt();
		//入力した値がfirstVaiueより小さい場合繰り返す
		}while(firstVaiue > secondValue);
		//繰り返し
		do {
			//何cmごと:と表示
			System.out.print("何cmごと:");
			//変数thirdValueに入力した値を代入
			thirdValue = standardInput.nextInt();
		//入力した値が0より大きくなるまで繰り返し
		}while(thirdValue <= 0);
		//身長　標準体重と表示
		System.out.println("身長　標準体重");
		//変数iをfirstVaiueから始めて変数iをthirdValueずつ増やしていきsecondValue回繰り返す
		for(int i = firstVaiue ; i <= secondValue ;i += thirdValue)
			//変数iの値と標準体重の計算結果を表示
			System.out.println(i + "   "+ (i - 100) * 0.9);

		
	}



}

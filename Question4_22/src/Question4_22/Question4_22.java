package Question4_22;

import java.util.Scanner;
/*
 * クラス名            :Question4_22
 * 概要                :入力した値の段のピラミッドを表示する
 * 作成者             :中西輝
 * 作成日              :2026.4.13
 */
public class Question4_22 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理で実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.13
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//段数はを表示
		System.out.print("段数は:");
		//変数inputNumberに入力した値を代入
		int inputNumber = standardInput.nextInt();
		//変数iを1から始めて変数iを1ずつ増やしていきinputNumber回繰り返す（段数）
		for(int i =  1 ;i <= inputNumber; i++) {
			//変数displayBlankを1から始めて変数displayBlankを1ずつ増やしていきinputNumber回繰り返す（空白の表示）
			for(int displayBlank = 1;  displayBlank <= inputNumber - i;displayBlank++) {
				//空白を表示
				System.out.print(" ");
			}
			//変数をjから始めて変数jを1ずつ増やしていき変数jが段数に2をかけて-1した値より大きくなるまで繰り返す（*の表示）
			for(int j = 1; j <= 2 * i - 1 ; j++) {
				//*を表示
				System.out.print("*");
				}
			//改行
				System.out.println();		
				}
	}
}



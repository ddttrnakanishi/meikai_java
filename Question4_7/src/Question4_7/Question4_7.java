package Question4_7;

import java.util.Scanner;
/*
 * クラス名            :ensyu4_7
 * 概要                :読み込んだ値の個数だけ記号を入力するプログラム
 * 作成者             :中西輝
 * 作成日              :2026.4.7
 */

public class Question4_7 {
	  /*
     * 関数名           :main
     * メソッドの説明   :～～
     * パラメータの説明 :なし
     * 返り値           :なし
     * 作成者             :中西輝
     * 作成日              :2026.4.7
     */
	public static void main(String[] args) {
		//キーボードに入力された値を読み込むための変数を作る
		Scanner standardInput = new Scanner(System.in);
		//何個表示しますかを表示
		System.out.print("何個表示しますか:");
		//ユーザーが入力した値を変数に代入
		int inputValue = standardInput.nextInt();
		//変数iにinputValueを代入
		int i = inputValue ;
		
		//繰り返し
		do {
			if(i == 0) {
				System.out.print("");
			}
			//iが奇数の場合
			else if(i % 2 == 1) {
				//*を表示する
				System.out.print("*");
			}
			//iが偶数の場合
			 else {
				//+を表示する
				System.out.print("+");
			}
			//i-1
			i--;
		//iが0より大きい場合は繰り返す
		}while(i > 0);
		

	}

}

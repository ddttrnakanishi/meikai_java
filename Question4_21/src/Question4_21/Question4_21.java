package Question4_21;

import java.util.Scanner;
/*
 * クラス名            :Question4_21
 * 概要                :直角が左上,右下,右上の三角形を表示する
 * 作成者             :中西輝
 * 作成日              :2026.4.13
 */
public class Question4_21 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :～～
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.13
	 */

	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//左上直角の三角形を表示しますを表示
		System.out.println("左上直角の三角形を表示します");
		//段数はを表示
		System.out.print("段数は:");
		//変数inputNumberに入力した値を代入
		int inputNumber = standardInput.nextInt();
		//変数iが入力した値から始まり1ずつ減らしていきiが0になるまで繰り返す
		for(int i = inputNumber;i >= 0;i--) {
			//変数jが0から始まり1ずつ増やしていきi回繰り返す
			for(int j =  0; j < i;j++)
				//*を表示
				System.out.print("*");
			//改行
			System.out.println();
		}
		//右上直角の三角形を表示しますを表示
		System.out.println("右上直角の三角形を表示します");

		//変数iが0から始まり1ずつ増やしていきinputnumber回繰り返す
		for(int i = 0;i <= inputNumber;i++) {
			//変数jが0から始まり1ずつ増やしていきinputnumber回繰り返す
			for(int j = 0;j <= inputNumber;j++) 
				//変数iがj以上の時
				if(i >= j) {
					//空白を表示
					System.out.print(" ");
				}
				//それ以外
				else {
					//*の表示
					System.out.print("*");
				}
			//改行
			System.out.println();
		}
		//右下直角の三角形を表示しますを表示
		System.out.println("右下直角の三角形を表示します");

		//変数iが0から始まり1ずつ増やしていきinputnumber回繰り返す
		for(int i = 0;i <= inputNumber;i++) {
			//変数jが0から始まり1ずつ増やしていきinputnumber回繰り返す
			for(int j = 0;j <= inputNumber;j++) 
				//入力した値から変数iと1を引いた値がj以上の時
				if(inputNumber - i - 1 >= j) {
					//空白を表示
					System.out.print(" ");
				}
				//それ以外
				else {
					//*の表示
					System.out.print("*");
				}
			//改行
			System.out.println();
		}

	}
}

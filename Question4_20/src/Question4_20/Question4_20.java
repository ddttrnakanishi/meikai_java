package Question4_20;

import java.util.Scanner;
/*
 * クラス名            :Question4_20
 * 概要                :入力した段数の正方形を表示するプログラム
 * 作成者             :中西輝
 * 作成日              :2026.4.13
 */
public class Question4_20 {
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
		//変数inputNumberの初期化
		int inputNumber = 0;
		//繰り返し
		do {
			//nの値を表示
			System.out.print("nの値:");
			//変数inputNumberに入力した値を代入
			inputNumber = standardInput.nextInt();
		//変数inputNumberが1未満の時繰り返す
		}while(inputNumber < 1);
		//変数iが1から始まり1ずつ増やしていきinputnumber回繰り返す
		for(int i = 1;i <= inputNumber;i++) {
			//変数jが1から始まり1ずつ増やしていきinputnumber回繰り返す
			for(int j = 1;j <= inputNumber;j++) 
				//*の表示
				System.out.print("*");
			//改行
			System.out.println();
		}

	}
}

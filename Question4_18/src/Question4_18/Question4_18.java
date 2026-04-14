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
		//変数inputNumberの初期化
		int inputNumber = 0;
		//nの値を表示
		System.out.print("nの値:");
		//変数inputNumberに入力した値を代入
		inputNumber = standardInput.nextInt();
		//変数squareValueの初期化
		int squareValue = 0;
		//変数iと変数plusValueを1から始めて両方とも1ずつ増やしていきinputNumber回繰り返す
		for(int i = 1,plusValue = 1;i <= inputNumber;++i,plusValue++) {
			//変数squareValueに変数plusValueの2乗を代入する
			squareValue = plusValue * plusValue;
			//変数iの値と変数squareValueの値を表示
			System.out.println(i+"の2乗は"+squareValue);
		}
	}
}

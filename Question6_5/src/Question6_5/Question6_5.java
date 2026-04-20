package Question6_5;

import java.util.Scanner;
/*
 * クラス名            :Question6_5
 * 概要                :配列の要素数と個々の要素の値を読み込んで各要素の値を表示する
 * 作成者             　:中西輝
 * 作成日              :2026.4.16
 */
public class Question6_5 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理で実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.16
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//()内の文字を表示
		System.out.print("要素数:");
		//入力値に入力した値を代入
		int inputNumber = standardInput.nextInt();
		//int型を構成要素とする配列要素数の作成
		int[]elementNumber = new int[inputNumber];
		//変数iが0から始まり1ずつ増やしていき入力値より大きくなるまで繰り返す
		for(int i = 0; i < inputNumber; i++) {
			//()内の文字と変数iの値を表示
			System.out.print("elementNumber"+"[" + i + "]" +"=");
			//elementNumber[i]に入力した値を代入
			elementNumber[i] = standardInput.nextInt();
		}
		//""の中の文字を表示
		System.out.print("a = {");
		//変数iが1から始まり1ずつ増やしていき入力値以上になるまで繰り返す
		for(int i = 1; i <= inputNumber; i++) {
			//変数iの値が入力した値より小さいとき
			if(i < inputNumber) {
				//()内の文字と要素数から1を引いた値を表示
				System.out.print(elementNumber[i - 1] + ", ");
			}
			//それ以外
			else {
				//()内の文字と要素数から1を引いた値を表示して改行
				System.out.println(elementNumber[i - 1] + "}");
			}
		}
	}
}

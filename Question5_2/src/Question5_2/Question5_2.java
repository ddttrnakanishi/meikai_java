package Question5_2;

import java.util.Scanner;
/*
 * クラス名            :Question5_2
 * 概要                :float型の変数とdouble型の変数に値を入れて表示する
 * 作成者             :中西輝
 * 作成日              :2026.4.15
 */
public class Question5_2 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理で実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.15
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//()内の文字を表示して改行
		System.out.println("変数xはfloat型で、変数yはdouble型です。");
		//()内の文字を表示
		System.out.print("x : ");
		//入力値1に入力した値を代入
		float inputNumber1 = standardInput.nextFloat();
		//()内の文字を表示
		System.out.print("y : ");
		//入力値2に入力した値を代入
		double inputNumber2 = standardInput.nextDouble();
		//""内の文字と入力値1を表示して改行
		System.out.println("x : "+inputNumber1);
		//""内の文字と入力値2を表示して改行
		System.out.println("y : "+inputNumber2);
	}
}

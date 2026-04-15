package Question5_1;

import java.util.Scanner;
/*
 * クラス名            :Question5_1
 * 概要                :10進数を8,16進数で表す
 * 作成者             :中西輝
 * 作成日              :2026.4.15
 */
public class Question5_1 {
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
		//整数と表示
		System.out.print("整数:");
		//入力した値を入力値に代入
		int inputNumber = standardInput.nextInt();
		//入力値の8進数を表示
		System.out.printf("8進数では%oです。\n",inputNumber);
		//入力値の16進数を表示
		System.out.printf("16進数では%xです。\n",inputNumber);
	}
}

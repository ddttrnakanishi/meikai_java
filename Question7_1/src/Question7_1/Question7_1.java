package Question7_1;

import java.util.Scanner;
/*
 * クラス名            :Question7_1
 * 概要                :受け取ったint型引数の値が負であれば-1、0であれば0、正であれば1を返却する
 * 作成者             　:中西輝
 * 作成日              :2026.4.21
 */
public class Question7_1 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理とsignOf処理
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.21
	 */

	static int signOf(int inputNumber) {
		//変数signOfの初期化
		int signOf = 0;
		//入力値が負の時
		if(inputNumber < 0) {
			//-1を代入
			signOf = -1;
		}
		//入力値が0の時
		else if(inputNumber == 0) {
			//0を代入
			signOf = 0;
		}
		//それ以外
		else {
			//1を代入
			signOf = 1;
		}
		//返却
		return signOf;
	}
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in); 
		//""の中の文字を表示
		System.out.print("整数 :");
		//変数inputNumberに入力した値を代入
		int inputNumber = standardInput.nextInt();
		//""の中の文字と返却値を表示して改行
		System.out.println("入力値は :" + signOf(inputNumber) + "です。");
	}
}

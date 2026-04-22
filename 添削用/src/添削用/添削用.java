package 添削用;

import java.util.Scanner;

public class 添削用 {

	public static void main(String[] args) {
		//「正の整数値：」を表示
		System.out.print("正の整数値：");
		//メゾット「readPlusInt」を表示
		readPlusInt();
	}
	/**
	 * 関数名           :readPlusInt
	 * メソッドの説明   :readPlusIntを処理する
	 * パラメータの説明 :なし
	 * 返り値           :inputNumber
	 * 作成者  :田中沙樹
	 * 作成日  :2026.04.21.
	 */
	static int readPlusInt() {
		//キーボードから読み込むための変数を作る
		Scanner standardInput = new Scanner(System.in);
		//整数値を読み込む
		int inputNumber = standardInput.nextInt();
		//実行する
		do {
			//「正の整数値：」を表示
			System.out.print("正の整数値：");
			//再入力
			inputNumber = standardInput.nextInt();
			//入力値が0以下の場合、繰り返す
		} while(inputNumber <= 0);
		//返却
		return inputNumber;
	}
}
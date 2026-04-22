package Question7_11;

import java.util.Scanner;
/*
 * クラス名             :Question7_11
 * 概要                 :整数を左右にシフトした値が2のべき乗での乗算や除算と等しくなるか確認
 * 作成者             　:中西輝
 * 作成日               :2026.4.22
 */
public class Question7_11 {
	/*
	 * 関数名           　:siftNumber
	 * メソッドの説明   　:2のべき乗の乗算の値を出し同じことを確認
	 * パラメータの説明　 :シフト数と整数
	 * 返り値          　 :なし
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.22
	 */

	static void siftNumber(int siftCount, int inputNumber) {
		//結果の値に入力値を代入
		int resultNumber = inputNumber;
		//変数iを1から始めて1ずつ増やしていきシフトの数になるまで繰り返す
		for(int i = 1; i <= siftCount; i++) {
			//結果の値に2をかける
			resultNumber *= 2;
		}
		//""の中の文字と計算結果を表示して改行
		System.out.println("入力値の2のべき乗で乗算" + resultNumber);
		//""の中の文字と計算結果とシフトした数を表示して改行
		System.out.println(resultNumber + "と" + (inputNumber << siftCount) + "は同じ。");
	}
	/*
	 * 関数名           　:siftNumber2
	 * メソッドの説明   　:2のべき乗の除算の値を出し同じことを確認
	 * パラメータの説明　 :シフト数と整数
	 * 返り値          　 :なし
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.22
	 */
	static void siftNumber2(int siftCount, int inputNumber) {
		//結果の値に入力値を代入
		int resultNumber = inputNumber;
		//変数iを1から始めて1ずつ増やしていきシフトの数になるまで繰り返す
		for(int i = 1; i <= siftCount; i++) {
			//結果の値を2で割る
			resultNumber /= 2;
		}
		//""の中の文字と計算結果を表示して改行
		System.out.println("入力値の2のべき乗で除算" + resultNumber);
		//""の中の文字と計算結果とシフトした数を表示して改行
		System.out.println(resultNumber + "と" + (inputNumber >> siftCount) + "は同じ。");
	}
	/*
	 * 関数名           　:main
	 * メソッドの説明   　:整数値とシフトの数を入力し結果を表示
	 * パラメータの説明　 :なし
	 * 返り値          　 :なし
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.22
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示
		System.out.print("整数 :");
		//入力値を入力
		int inputNumber = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("シフトするビット数 :");
		//シフトする数を入力
		int siftCount = standardInput.nextInt();
		//siftNumberメソッドの呼び出し
		siftNumber( siftCount,  inputNumber);
		//siftNumber2メソッドの呼び出し
		siftNumber2( siftCount,  inputNumber);
	}
}

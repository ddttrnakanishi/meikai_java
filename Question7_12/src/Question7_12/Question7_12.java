package Question7_12;

import java.util.Scanner;
/*
 * クラス名             :shiftNumberuestion7_12
 * 概要                 :整数を右にnビット回転した値と左にnビット回転した値を表示
 * 作成者             　:中西輝
 * 作成日               :2026.4.22
 */
public class Question7_12 {
	/*
	 * 関数名           　:printBits
	 * メソッドの説明   　:入力した整数値を32のビット数で表示し右にシフトしたビット
	 * 						と左にシフトしたビットを表示する
	 * パラメータの説明　 :整数、シフトの数
	 * 返り値          　 :なし
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.22
	 */
	static void printBits(int integerValue, int shiftNumber) {
		//変数iを32から始めて1ずつ減らしていき0になるまで繰り返す
		for(int i = 31; i >= 0; i--) {
			//iビットが1であるとき1をそうでないときは0を表示
			System.out.print(((integerValue >>> i & 1) == 1) ? '1':'0');
		}
		//改行
		System.out.println();
		//""の中の文字を表示
		System.out.println("右回転");
		//変数iを32から始めて1ずつ減らしていき0になるまで繰り返す
		for(int i = 31; i >= 0; i--) {
			//rRotate返却値の値が1の時は1をそうでないときは0を表示
			System.out.print(((rRotate(integerValue,shiftNumber) >>> i & 1) == 1) ? '1':'0');
		}
		//改行
		System.out.println();
		//""の中の文字を表示
		System.out.println("左回転");
		//変数iを32から始めて1ずつ減らしていき0になるまで繰り返す
		for(int i = 31; i >= 0; i--) {
			//lRotate返却値の値が1の時は1をそうでないときは0を表示
			System.out.print(((lRotate(integerValue,shiftNumber) >>> i & 1) == 1) ? '1':'0');
		}
		//改行
		System.out.println();
	}
	/*
	 * 関数名           　:rRotate
	 * メソッドの説明   　:シフトしたビット数と逆にシフトしたビット数を
	 * 					　論理和することでなくしたビット数を反対がわに表示する(右回転)
	 * パラメータの説明　 :整数とシフト数
	 * 返り値          　 :なし
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.22
	 */
	static int rRotate(int integerValue, int shiftNumber) {
		//変数rigehtShiftを初期化
		int rigehtShift = 0;
		//シフトする値がマイナスの時
		if(shiftNumber < 0) {
			//lRotateの回転を行う
			return lRotate(integerValue,-shiftNumber);
		}
			/*rigehtShiftに入力した整数値のビット数を右にshiftNumber分シフトしたビット数と
			 * 入力した整数値のビット数を左に32からshiftNumberの値を引いた分シフトしたビット数を
			 *論理和し求められたビット数を代入
			 */
			rigehtShift = (integerValue >>> shiftNumber) | (integerValue << 32 - shiftNumber);

		//rigehtShiftを返却
		return rigehtShift;
	}
	/*
	 * 関数名           　:lRotate
	 * メソッドの説明   　:シフトしたビット数と逆にシフトしたビット数を
	 * 					　論理和することでなくしたビット数を反対がわに表示する(左回転)
	 * パラメータの説明　 :整数とシフト数
	 * 返り値          　 :なし
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.22
	 */
	static int lRotate(int integerValue, int shiftNumber) {
		//変数leftShiftを初期化
		int leftShift = 0;
		//シフトする値がマイナスの時
		if(shiftNumber < 0) {
			//rRotateの回転を行う
			return rRotate(integerValue, -shiftNumber);
		}
			/*leftShiftに入力した整数値のビット数を左にshiftNumber分シフトしたビット数と
			 * 入力した整数値のビット数を右に32からshiftNumberの値を引いた分シフトしたビット数を
			 *論理和し求められたビット数を代入
			 */
			leftShift = (integerValue << shiftNumber) | (integerValue >>> 32 - shiftNumber);
		//leftShiftを返却
		return leftShift;
	}
	/*
	 * 関数名           　:main
	 * メソッドの説明   　:整数の入力とシフト数の入力し結果を表示する
	 * パラメータの説明　 :整数とシフト数
	 * 返り値          　 :なし
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.22
	 */
	public static void main(String[] arintegerValues) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示して改行
		System.out.println("整数を入力してください");
		//""の中の文字を表示
		System.out.print("integerValue : ");
		//整数値を入力
		int integerValue = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("シフトするビット数 :");
		//シフトする数を代入
		int shiftNumber = standardInput.nextInt();
		//返却値を受けとる
		printBits(integerValue,shiftNumber);
	}

}
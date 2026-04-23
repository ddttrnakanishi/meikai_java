package Question7_13;

import java.util.Scanner;
/*
 * クラス名             :shiftNumberuestion7_13
 * 概要                 :入力した整数のビットと指定したビット目を1,0,反転したビットを表示
 * 作成者             　:中西輝
 * 作成日               :2026.4.23
 */
public class Question7_13 {
	/*
	 * 関数名           　:main
	 * メソッドの説明   　:整数の入力とシフト数の入力し結果を表示する
	 * パラメータの説明　 :なし
	 * 返り値          　 :なし
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.23	
	 */
	public static void main(String[] args) {
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
	/*
	 * 関数名           　:printBits
	 * メソッドの説明   　:入力した整数値を32のビット数で表示し右にシフトしたビット
	 * 						と左にシフトしたビットを表示する
	 * パラメータの説明　 :整数、シフトの数
	 * 返り値          　 :なし
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.23
	 */
	static void printBits(int integerValue, int shiftNumber) {
		//変数iを32から始めて1ずつ減らしていき0になるまで繰り返す
		for(int i = 31; i >= 0; i--) {
			//iビットが1であるとき1をそうでないときは0を表示
			System.out.print(((integerValue >>> i & 1) == 1) ? '1':'0');
		}
		//改行
		System.out.println();
		//変数iを32から始めて1ずつ減らしていき0になるまで繰り返す
		for(int i = 31; i >= 0; i--) {
			//rRotate返却値の値が1の時は1をそうでないときは0を表示
			System.out.print(((set(integerValue,shiftNumber) >>> i & 1) == 1) ? '1':'0');
		}
		//改行
		System.out.println();
		//変数iを32から始めて1ずつ減らしていき0になるまで繰り返す
		for(int i = 31; i >= 0; i--) {
			//reset返却値の値が1の時は1をそうでないときは0を表示
			System.out.print(((reset(integerValue,shiftNumber) >>> i & 1) == 1) ? '1':'0');
		}
		//改行
		System.out.println();
		//変数iを32から始めて1ずつ減らしていき0になるまで繰り返す
		for(int i = 31; i >= 0; i--) {
			//inverse返却値の値が1の時は1をそうでないときは0を表示
			System.out.print(((inverse(integerValue,shiftNumber) >>> i & 1) == 1) ? '1':'0');
		}


	}
	/*
	 * 関数名           　:set
	 * メソッドの説明   　:入力した整数値のビットと1をシフトしたビットの論理和求める
	 * パラメータの説明　 :整数、シフトの数
	 * 返り値          　 :論理和
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.23
	 */
	static int set(int integerValue, int shiftNumber) {
		//入力した整数値のビットと1をシフトしたビットの論理和を代入
		int setNumber  = integerValue | (1 << shiftNumber);
		//返却
		return setNumber;

	}
	/*
	 * 関数名           　:reset
	 * メソッドの説明   　:入力した整数値のビットと入力した整数値のビットと
	 * 						1を左にシフトしたビットの排他的論理和の論理積を求める
	 * パラメータの説明　 :整数、シフトの数
	 * 返り値          　 :論理積
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.23
	 */
	static int reset(int integerValue, int shiftNumber) {
		//入力した整数値のビットと入力した整数値のビットと1を左にシフトしたビットの排他的論理和の論理積を代入
		int setNumber  = integerValue & (integerValue ^ (1 << shiftNumber));
		//返却
		return setNumber;

	}
	/*
	 * 関数名           　:inverse
	 * メソッドの説明   　:入力した整数値のビットと1を左にシフトしたビットの排他的論理和求める
	 * パラメータの説明　 :整数、シフトの数
	 * 返り値          　 :排他的論理和
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.23
	 */
	static int inverse(int integerValue, int shiftNumber) {
		//入力した整数値のビットと1を左にシフトしたビットの排他的論理和を代入
		int setNumber  = integerValue ^ (1 << shiftNumber);
		//返却
		return setNumber;
	}

}

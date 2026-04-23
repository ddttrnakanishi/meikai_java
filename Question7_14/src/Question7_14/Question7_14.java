package Question7_14;
import java.util.Scanner;
/*
 * クラス名             :Question7_14
 * 概要                 :入力した整数のビットと指定したビット目最下位として連続するビット
 * 						　を1,0,反転したビットを表示
 * 作成者             　:中西輝
 * 作成日               :2026.4.23
 */
public class Question7_14 {
	/*
	 * 関数名           　:main
	 * メソッドの説明   　:整数とシフト数とpos(最下位を決める値)の入力し結果を表示する
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
		System.out.print("シフトする数 :");
		//シフトする数を代入
		int shiftNumber = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("最下位はどこか :");
		//シフトする数を代入
		int piecesNumber = standardInput.nextInt();
		//返却値を受けとる
		printBits(integerValue,shiftNumber,piecesNumber);
	}
	/*
	 * 関数名           　:printBits
	 * メソッドの説明   　:入力した整数値を32のビット数で表示し右にシフトしたビット
	 * 						と左にシフトしたビットを表示する
	 * パラメータの説明　 :整数、シフトの数、最下位
	 * 返り値          　 :なし
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.23
	 */
	static void printBits(int integerValue, int shiftNumber, int piecesNumber) {
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
			System.out.print(((setN(integerValue,shiftNumber,piecesNumber) >>> i & 1) == 1) ? '1':'0');
		}
		//改行
		System.out.println();
		//変数iを32から始めて1ずつ減らしていき0になるまで繰り返す
		for(int i = 31; i >= 0; i--) {
			//reset返却値の値が1の時は1をそうでないときは0を表示
			System.out.print(((resetN(integerValue,shiftNumber,piecesNumber) >>> i & 1) == 1) ? '1':'0');
		}
		//改行
		System.out.println();
		//変数iを32から始めて1ずつ減らしていき0になるまで繰り返す
		for(int i = 31; i >= 0; i--) {
			//inverse返却値の値が1の時は1をそうでないときは0を表示
			System.out.print(((inverseN(integerValue,shiftNumber,piecesNumber) >>> i & 1) == 1) ? '1':'0');
		}
	}
	/*
	 * 関数名           　:setN
	 * メソッドの説明   　:入力した整数値のビットと0の補数をpiecesNumberビット左にシフトの論理和を求める
	 * パラメータの説明　 :整数、シフトの数、最下位
	 * 返り値          　 :論理和
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.23
	 */
	static int setN(int integerValue, int shiftNumber, int piecesNumber) {

		//入力した整数値のビットと1の補数をpiecesNumberビット左にシフトの論理和を代入
		int setNumber  = integerValue | (~(~0 << piecesNumber) << shiftNumber);
		//返却
		return setNumber;
	}
	/*
	 * 関数名           　:resetN
	 * メソッドの説明   　:入力した整数値のビットと 0の補数をpiecesNumberビット左にシフトの論理積を求める
	 * パラメータの説明　 :整数、シフトの数
	 * 返り値          　 :論理積
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.23
	 */
	static int resetN(int integerValue, int shiftNumber, int piecesNumber) {
		/*入力した整数値のビットと入力した整数値のビットと
		 * 1の補数をpiecesNumberビット左にシフトしもう一度補数を取った値の論理積を代入
		 */
		int setNumber  = integerValue & ~(~(~0 << piecesNumber) << shiftNumber);
		//返却
		return setNumber;
	}
	/*
	 * 関数名           　:inverseN
	 * メソッドの説明   　:入力した整数値のビットと1の補数をpiecesNumberビット左にシフトの排他的論理和を求める
	 * パラメータの説明　 :整数、シフトの数
	 * 返り値          　 :排他的論理和
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.23
	 */
	static int inverseN(int integerValue, int shiftNumber, int piecesNumber) {
		//入力した整数値のビットと1の補数をpiecesNumberビット左にシフトの排他的論理和を代入
		int setNumber  = integerValue ^ (~(~0 << piecesNumber) << shiftNumber);
		//返却
		return setNumber;
	}

}



package Question10_3;

import java.util.Scanner;
/*
 * クラス名            :MinMax
 * 概要                :コンストラクタの設定とMixMaxTesterで入力された値を基にそれぞれのメソッドで最小値や最大値を求め返却する
 * 作成者             :中西輝
 * 作成日              :2026.5.1
 */
public class MinMax {

	//名前を表すint型のinputNumberOneを初期化
	private int inputNumberOne;
	//身長を表すint型のinputNumberTwoを初期化
	private int inputNumberTwo = 0;
	//体重を表すint型のinputNumberThreeを初期化
	private int inputNumberThree = 0;
	//配列を表すint型のarrayNumberを初期化
	private int[] arrayNumber;
	/*
	 * コンストラクタ         :MinMax
	 * コンストラクタの説明   :クラスのインスタンスが生成される際のコンストラクタを作成
	 * パラメータの説明       :入力値１、入力値２、入力値３、要素数
	 * 作成者                 :中西輝
	 * 作成日                 :2026.5.1
	 */
	public MinMax(int inputNumberOne, int inputNumberTwo, int inputNumberThree, int[]  arrayNumber){
		//フィールドに仮引数の値を代入
		this.inputNumberOne = inputNumberOne;
		//フィールドに仮引数の値を代入
		this.inputNumberTwo = inputNumberTwo;
		//フィールドに仮引数の値を代入
		this.inputNumberThree = inputNumberThree;
		//フィールドに仮引数の配列の要素数のコピーを代入
		this.arrayNumber = arrayNumber;
	}
	/*
	 * 関数名　　：minDoubleMin
	 * メソッド　：最小値を取得するためのメソッド
	 * パラメータ：入力値１、入力値２
	 * 返り値　　：最小値
	 * 作成者　　 :中西輝
	 * 日付　　　：2026.5.1
	 */
	public static int minDoubleMin(int inputNumberOne, int inputNumberTwo) {
		//minNumberを入力値１で初期化
		int minNumber = inputNumberOne;
		//minNumberより入力値２が小さいとき
		if(minNumber > inputNumberTwo) {
			//minNumberに入力値２を代入
			minNumber = inputNumberTwo;
			//返却
			return minNumber;
		}
		//それ以外
		else {
			//返却
			return minNumber;
		}
	}
	/*
	 * 関数名　　：minTriple
	 * メソッド　：最小値を取得するためのメソッド
	 * パラメータ：入力値１、入力値２、入力値３
	 * 返り値　　：最小値
	 * 作成者　　 :中西輝
	 * 日付　　　：2026.5.1
	 */
	public static int minTriple(int inputNumberOne, int inputNumberTwo, int inputNumberThree) {
		//minNumberを入力値１で初期化
		int minNumber = inputNumberOne;
		//入力値２がminNumberより小さいときかつ入力値３より小さいとき
		if(minNumber > inputNumberTwo && inputNumberTwo < inputNumberThree) {
			//minNumberに入力値２を代入
			minNumber = inputNumberTwo;
			//返却
			return minNumber;
		}
		//入力値３がminNumberより小さいときかつ入力値２より小さいとき
		else if(minNumber > inputNumberThree && inputNumberTwo > inputNumberThree) {
			//minNumberに入力値３を代入
			minNumber = inputNumberThree;
			//返却
			return minNumber;
		}
		//それ以外
		else {
			//返却
			return minNumber;
		}
	}
	/*
	 * 関数名　　：minArray
	 * メソッド　：配列の最小値を取得するためのメソッド
	 * パラメータ：配列arrayNumber
	 * 返り値　　：配列の最小値
	 * 作成者　　：中西輝
	 * 日付　　　：2026.5.1
	 */
	public static int minArray(int[] arrayNumber) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//変数iを0から始めて1ずつ増やしていきarrayNumberの要素数になるまで繰り返す
		for(int i = 0; i < arrayNumber.length; i++) {
			//""の中の文字とiの値を表示
			System.out.print("arrayNumber[" + i + "] = ");
			//arrayNumber[i]の値を代入
			arrayNumber[i] = standardInput.nextInt();
		}
		//minArrayにarrayNumber[0]の値を代入
		int minArray = arrayNumber[0];
		//変数iを1から始めて1ずつ増やしていきarrayNumberの要素数になるまで繰り返す
		for(int i = 1; i < arrayNumber.length; i++) {
			// arrayNumber[i]よりminArrayの値が大きいとき
			if(minArray > arrayNumber[i]) {
				//minArrayにarrayNumber[i]の値を代入
				minArray = arrayNumber[i];
			}
		}
		//返却
		return minArray;

	}
	/*
	 * 関数名　　：maxNumber
	 * メソッド　：最大値を取得するためのメソッド
	 * パラメータ：入力値１、入力値２、入力値３
	 * 返り値　　：最大値
	 * 作成者　　：中西輝
	 * 日付　　　：2026.5.1
	 */
	public static int maxNumber(int inputNumberOne, int inputNumberTwo, int inputNumberThree) {
		//maxNumberを入力値１で初期化
		int maxNumber = inputNumberOne;
		//入力値２がmaxNumberと入力値３よりも大きいとき
		if(maxNumber < inputNumberTwo && inputNumberTwo > inputNumberThree) {
			//maxNumberに入力値２を代入
			maxNumber = inputNumberTwo;
			//返却
			return maxNumber;
		}
		//入力値３がmaxNumberと入力値２よりも大きいとき
		else if(maxNumber < inputNumberThree && inputNumberTwo < inputNumberThree) {
			//maxNumberに入力値３を代入
			maxNumber = inputNumberThree;
			//返却
			return maxNumber;
		}
		//それ以外
		else {
			//返却
			return maxNumber;
		}
	}
}


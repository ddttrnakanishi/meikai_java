package Question6_12;

import java.util.Random;
import java.util.Scanner;
/*
 * クラス名            :Question6_12
 * 概要                :配列の並びをシャッフルする
 * 作成者             　:中西輝
 * 作成日              :2026.4.17
 */
public class Question6_12 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理で実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.17
	 */
	public static void main(String[] args) {
		//ランダムに出される値を入れる変数を作る
		Random randomNumber = new Random();
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//要素数は5である
		final int elementNumber = 5;
		//変数iを初期化
		int i = 0;
		//int型を構成要素とする配列要素数の作成
		int[] arrayNumber = {1,2,3,4,5};
		////変数1が0から始まり1ずつ増やしていき要素数より大きくなるまで繰り返す
		for (i = 0; i < arrayNumber.length; i++) {
			//""の中の文字とiの値とarrayNumber[i]の値を表示して改行
			System.out.println("arrayNumber[" + i + "] = " +arrayNumber[i]);
			//変数iが4の時
			if(i == 4) {
				//飛び出す
				break;
			}
		}	
		//改行
		System.out.println();
		//変数jを初期化
		int j = 0;
		//変数shuffleNumber1の初期化
		int shuffleNumber1 = 0;
		//変数jが0から始まり1ずつ増やしていき1入力値より大きくなるまで繰り返す
		for (j = 0; j <= i; j++) {
			//shuffleNumber1に0－4のランダム数を代入
			shuffleNumber1 = randomNumber.nextInt(elementNumber);
			//shuffleNumber2に0－4のランダム数を代入
			int shuffleNumber2 = randomNumber.nextInt(elementNumber);
			/*
			 * ランダムで出した数値を入れ替える
			 */
			int boxNumber = arrayNumber[shuffleNumber1];
			arrayNumber[shuffleNumber1] = arrayNumber[shuffleNumber2];
			arrayNumber[shuffleNumber2] = boxNumber;

		}
		//変数jが0から始まり1ずつ増やしていきi以上になるまで繰り返す
		for (j = 0; j <= i; j++) {
			//""の中の文字とiの値とarrayNumber[i]の値を表示して改行
			System.out.println("arrayNumber[" + j + "] = " + arrayNumber[j]);
		}
	}
}

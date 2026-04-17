package Question6_13;

import java.util.Scanner;
/*
 * クラス名            :Question6_13
 * 概要                :縦向きの棒グラフを表示
 * 作成者             　:中西輝
 * 作成日              :2026.4.17
 */
public class Question6_13 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.17
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示
		System.out.print("要素数　:");
		//要素数の値を入力する
		int inputNumber = standardInput.nextInt();
		//int型を構成要素型とする配列の作成
		int[] arrayA = new int[inputNumber];
		//int型を構成要素型とする配列の作成
		int[] arrayB = new int[inputNumber];
		//変数iを0から始めて1ずつ増やしていき入力値より大きくなるまで繰り返す
		for(int i = 0; i < inputNumber; i++) {
			//""の中の文字と変数iの値を表示
			System.out.print("arrayA[" + i + "] = ");
			//配列arrayAに値を入力
			arrayA[i] = standardInput.nextInt();
		}
		//変数jを初期化(入力した値から-1した値)
		int j = inputNumber - 1;
		/*
		 * //変数iを0から始めて1ずつ増やしていき入力値より大きくなるまで繰り返す
		 *   変数jを-1していく
		 */
		for(int i = 0; i < inputNumber; i++,j--) {
			//arrayB[i]にarrayA[i]の値を代入
			arrayB[i] = arrayA[j];
		}
		//""内の文字を表示して改行
		System.out.println("arrayAの全要素をarrayBにコピーしました。");
		////変数iを0から始めて1ずつ増やしていき入力値より大きくなるまで繰り返す
		for(int i = 0; i < inputNumber; i++) {
			//""内の文字と変数iの値,arrayB[i]の値を表示して改行
			System.out.println("arrayB[" + i + "] = " + arrayB[i]);
		}
	}
}

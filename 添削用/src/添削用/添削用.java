package 添削用;

import java.util.Scanner;

public class 添削用 {

	static int linearSearchR(int[] arrayNumber, int keyNumber) {
		//変数iが要素数-1から始めて1ずつ減らしていきiが0になるまでの回数繰り返す
		for (int i = arrayNumber.length - 1; i >= 0; i--) {
			//もしキーと一致する要素が見つかった場合
			if (arrayNumber[i] == keyNumber) {
				//そのインデックスを返却する
				return i;
			}
		}
		//見つからなかった場合は-1を返却する
		return -1;
	}
	/**
	 * 関数名           : main
	 * メソッドの説明   : 配列の入力を受け取り末尾からキーを探索した結果を表示する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.24
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//"要素数："を表示する
		System.out.print("要素数：");
		//変数elementNumberに入力した値を代入する
		int elementNumber = standardInput.nextInt();
		//指定された要素数で配列を作成する
		int[] arrayNumber = new int[elementNumber];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < elementNumber; i++) {
			//"arrayNumber[i]：""を表示する
			System.out.print("arrayNumber[" + i + "]：");
			//arrayNumber[i]に入力した値を代入する
			arrayNumber[i] = standardInput.nextInt();
		}
		//"探す値："を表示する
		System.out.print("探す値：");
		//変数keyNumberに入力した値を代入する
		int keyNumber = standardInput.nextInt();
		//linearSearchRメソッドを呼び出し変数resultIndexに末尾からキーを探索した結果を代入する
		int resultIndex = linearSearchR(arrayNumber, keyNumber);
		//もしresultIndexが-1の場合
		if (resultIndex == -1) {
			//"その値の要素は存在しません。"を表示する
			System.out.println("その値の要素は存在しません。");
		} else {
			//"それはarrayNumber[resultIndex]にあります。"を表示する
			System.out.println("それはarrayNumber[" + resultIndex + "]にあります。");
		}
	}
}
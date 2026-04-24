package Question7_16;

import java.util.Scanner;
/*
 * クラス名             :Question7_16
 * 概要                 :配列arrayNumberの要素の最小値を求めるメソッドの作成
 * 作成者             　:中西輝
 * 作成日               :2026.4.23
 */
public class Question7_16 {
	/*
	 * 関数名           　:main
	 * メソッドの説明   　:要素数の入力と全要素の入力、minOfメソッドの結果を表示
	 * パラメータの説明　 :なし
	 * 返り値          　 :なし
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.23	
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//inputNumberの初期化
		int inputNumber = 0;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("要素数 :");
			//要素数を入力
			inputNumber = standardInput.nextInt();
			//inputNumberが0以下の場合繰り返す
		}while(inputNumber <= 0);
		//配列の作成
		int[] arrayNumber = new int[inputNumber];
		//変数iを0から初めて1ずつ増やしていき要素数の価まで繰り返す
		for(int i = 0; i < inputNumber; i++) {
			//""の中の文字とiの値を表示
			System.out.print("arrayNumber [" + i + "] =");
			//要素の値を代入
			arrayNumber[i] = standardInput.nextInt();
		}
		//""の文字とminOfメソッドの結果を表示して改行
		System.out.println("最小値は :" + minOf(arrayNumber));
	}
	/*
	 * 関数名           　:minOf
	 * メソッドの説明   　:要素の中での最小値を求める
	 * パラメータの説明　 :配列arrayNumber
	 * 返り値          　 :最小値
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.23	
	 */
	static int minOf(int[] arrayNumber) {
		//arrayNumberがnullの場合
		if(arrayNumber == null) {
			//返却
			return -1;
		}
		//最小値に[0]の要素の値を代入
		int minNumber = arrayNumber[0];
		//変数iが1から始まり1ずつ増やしていき要素の数分繰り返す
		for(int i = 1; i < arrayNumber.length; i++) {
			//最小値が要素の価よりも大きいとき
			if(minNumber > arrayNumber[i]) {
				//その要素の値を最小値に代入
				minNumber = arrayNumber[i];
			}
		}
		//返却
		return minNumber;
	}
}



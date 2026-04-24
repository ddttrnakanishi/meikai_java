package Question7_15;

import java.util.Scanner;
/*
 * クラス名             :Question7_15
 * 概要                 :配列arrayNumberの全要素を求めるメソッドの作成
 * 作成者             　:中西輝
 * 作成日               :2026.4.23
 */
public class Question7_15 {
	/*
	 * 関数名           　:main
	 * メソッドの説明   　:要素数の入力と全要素の入力、sumOfメソッドの結果を表示
	 * パラメータの説明　 :なし
	 * 返り値          　 :なし
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.23	
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示
		System.out.print("要素数 :");
		//要素数を入力
		int elementsNumber = standardInput.nextInt();
		//配列の作成
		int[] arrayNumber = new int [elementsNumber];
		//変数iが1から始まり1ずつ増やしていき要素数を超えるまで繰り返す
		for(int i = 0; i < elementsNumber; i++) {
			//""の中の文字と変数iの値を表示
			System.out.print("arrayNumber[" + i + "} = ");
			//全要素の値を入力
			arrayNumber[i] = standardInput.nextInt();
		} 
		//""の中の文字とsumOfメソッドの結果受け取り表示して改行
		System.out.println("合計は :" + sumOf(arrayNumber));
	}
	/*
	 * 関数名           　:sumOf
	 * メソッドの説明   　:要素の数だけ繰り返し、合計の算出
	 * パラメータの説明　 :配列arrayNumber
	 * 返り値          　 :合計値
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.23	
	 */
	static int sumOf(int[] arrayNumber) {
		//合計値を初期化
		int sumNumber = 0;
		//変数iが1から始まり1ずつ増やしていき要素の数分繰り返す
		for(int i = 0; i < arrayNumber.length; i++) {
			//合計値に要素の値を代入
			sumNumber += arrayNumber[i];
		}
		//返却
		return sumNumber; 
	}
}



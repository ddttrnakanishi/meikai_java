package Question7_33;

import java.util.Scanner;
/* 
 * クラス名 :Question7_33
 * 概要 :int型の1次元配列とint型の2次元配列の全要素を表示する
 * 作成者 　:中西輝 
 * 作成日 :2026.4.27
 */
public class Question7_33 {	
	//クラス全体で使える変数lineNumberに0を初期化
	private static int lineNumber = 0;
	//クラス全体で使える変数FINAL_NUMBERに1を初期化
	private final static int FINAL_NUMBER = 1;
	/*	
	 *  関数名 　        :main	
	 *  メソッドの説明 　:要素数を読み込み1次元配列を作成する。行によって列数が変わる2次元配列を作成する。
	 *  				　printArrayの処理の結果を表示する
	 *  パラメータの説明 :なし	 
	 *  返り値 　        :なし	 
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.27
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示
		System.out.print("要素数 :");
		//要素数を入力
		int elementNumber = standardInput.nextInt();
		//入力した値が要素数の配列の作成
		int[] arrayNumber = new int [elementNumber];
		//変数iが0から始まり1ずつ増やしていきarrayNumberの要素数になるまで繰り返す
		for(int i = 0; i < arrayNumber.length; i++) {
			//""の中の文字とiの値を表示
			System.out.print("arrayNumber[" + i + "] = ");
			//各要素の値を入力
			arrayNumber[i] = standardInput.nextInt();
		}
		//改行
		System.out.println();
		////""の中の文字を表示
		System.out.print("行数 :");
		//行数を入力
		lineNumber = standardInput.nextInt();
		//構成要素型がint型で構成要素数が入力した値の配列
		int[][] arrayNumberTwo = new int[lineNumber][];
		//columnNumberの初期化
		int columnNumber = 0;
		//変数iが0から始まり1ずつ増やしていき行数の値になるまで繰り返す
		for(int i = 0; i < lineNumber; i++) {
			//i+1した値と""の中の文字を表示
			System.out.print(i + FINAL_NUMBER + "行の列数 :");
			//列数を入力
			columnNumber = standardInput.nextInt();
			//構成要素型がint型で構成要素数が入力した値の配列
			arrayNumberTwo[i] = new int[columnNumber] ;
		}

		//変数iが0から始まり1ずつ増やしていき行数の値になるまで繰り返す
		for(int i = 0; i < lineNumber; i++) {
			//変数jが0から始まり1ずつ増やしていきarrayNumberTwoの要素数になるまで繰り返す
			for(int j = 0; j < arrayNumberTwo[i].length; j++) {
				//""の中の文字とi,jの値を表示
				System.out.print("arrayNumber[" + i + "][" + j + "]= ");
				//各要素の値を入力
				arrayNumberTwo[i][j] = standardInput.nextInt();
			}
		}
		//printArrayの処理を表示
		printArray(arrayNumber);
		//改行
		System.out.println();
		//printArrayの処理を表示
		printArray(arrayNumberTwo);
	}
	/*	
	 *  関数名 　        :printArray	
	 *  メソッドの説明 　:1次元配列の各要素を表示する
	 *  パラメータの説明 :配列arrayNumber
	 *  返り値 　        :なし	 
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.27
	 */
	public static void printArray(int[] arrayNumber) {
		//変数iが0から始まり1ずつ増やしていきarrayNumberの要素数になるまで繰り返す
		for(int i = 0; i < arrayNumber.length; i++) {
			//各要素を表示する
			System.out.print(arrayNumber[i] + " ");
		}
	}
	/*	
	 *  関数名 　        :printArray	
	 *  メソッドの説明 　:2次元配列の各要素を表示する
	 *  パラメータの説明 :配列arrayNumberTwo
	 *  返り値 　        :なし	 
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.27
	 */
	public static void printArray(int[][] arrayNumberTwo) {
		//変数iが0から始まり1ずつ増やしていき行数の値になるまで繰り返す
		for(int i = 0; i < lineNumber; i++) {
			//変数jが0から始まり1ずつ増やしていきarrayNumberTwoの要素数になるまで繰り返す
			for(int j = 0; j < arrayNumberTwo[i].length; j++) {
				//各要素を表示する
				System.out.printf("%-11d  ",arrayNumberTwo[i][j]);
			}
			//改行
			System.out.println();
		}
	}
}

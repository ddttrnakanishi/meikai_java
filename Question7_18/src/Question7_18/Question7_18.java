package Question7_18;

import java.util.Scanner;
/* 
 * クラス名 :Question7_18
 * 概要 :配列arrayNumberから要素arrayNumber[idx]を削除する
 * 作成者 　:中西輝 
 * 作成日 :2026.4.24
 */
public class Question7_18 {	
	//クラス全体で使える変数FINAL_VALUEに1を代入
	final static int FINAL_VALUE = 1;
	/*	
	 *  関数名 　        :main	
	 *  メソッドの説明 　:要素数、各要素の値、削除する場所を入力しaryRmvの結果を表示する	
	 *  パラメータの説明 :なし	 
	 *  返り値 　        :なし	 
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.24	 
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示
		System.out.print("要素数 :");
		//要素数を入力
		int inputNumber = standardInput.nextInt();
		//入力値の分だけ整数を入れられる配列を作る
		int[] arrayNumber = new int [inputNumber]; 
		//変数iを0から始めて1ずつ増やしていき入力値になるまで繰り返す
		for(int i = 0; i < inputNumber; i++) {
			//""の中の文字とiの値を表示
			System.out.print("arrayNumber [" + i + "} =");
			//配列[i]の値を入力
			arrayNumber[i] = standardInput.nextInt();
		}
		//""の中の文字を表示
		System.out.print("{");
		//変数iを0から始めて1ずつ増やしていき入力値になるまで繰り返す
		for(int i = 0; i < inputNumber - FINAL_VALUE; i++) {
			//arrayNumber[i]の値と""の中の文字を表示
			System.out.print(arrayNumber[i] + ", ");	
		}
		//arrayNumber[要素数から-1]の値と""の中の文字を表示して改行
		System.out.println(arrayNumber[inputNumber - FINAL_VALUE] + "}");
		//""の中の文字を表示
		System.out.print("削除する場所 :");
		//削除する場所を入力する
		int idx = standardInput.nextInt();
		//aryRmvメソッドの結果を表示
		aryRmv(arrayNumber, idx);
	}
	/*	
	 *  関数名 　          :aryRmv
	 *  メソッドの説明 　　:削除する値より後ろの全要素を1つ前方にずらす、
	 *  					その結果をもとにずらした結果を表示
	 *  パラメータの説明　 : 配列と削除する場所
	 *  返り値 　 　　　　 :なし	 
	 *  作成者 　          :中西輝	 
	 *  作成日 　          :2026.4.24	 
	 */
	static void aryRmv(int[]arrayNumber, int idx) {
		//変数iを削除する値から始めて1ずつ増やしていき要素数から-1した値になるまで繰り返す
		for(int i = idx; i < arrayNumber.length -FINAL_VALUE; i++) {
			//arrayNumber[i]にarrayNumber[i+1]した値を代入
			arrayNumber[i] = arrayNumber[i + FINAL_VALUE];
		}
		//""の中の文字を表示
		System.out.print("{");
		//変数iを0から始めて1ずつ増やしていき入力値になるまで繰り返す
		for(int i = 0; i < arrayNumber.length - FINAL_VALUE; i++) {
			//arrayNumber[i]の値と""の中の文字を表示
			System.out.print(arrayNumber[i] + ", ");	
		}
		//arrayNumber[要素数から-1]の値と""の中の文字を表示して改行
		System.out.println(arrayNumber[arrayNumber.length - FINAL_VALUE] + "}");
	}
}

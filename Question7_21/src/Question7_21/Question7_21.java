package Question7_21;

import java.util.Scanner;
/* 
 * クラス名 :Question7_21
 * 概要 :配列aと配列bの要素の値を入れ替える
 * 作成者 　:中西輝 
 * 作成日 :2026.4.24
 */
public class Question7_21 {	
	//クラス全体で使える変数FINAL_VALUEを初期化
	private final static int FINAL_VALUE = 1;
	//クラス全体で使える変数inputNumberを初期化
	private static int inputNumber = 0;
	//クラス全体で使える変数inputNumberTwoを初期化
	private static int inputNumberTwo = 0;
	/*	
	 *  関数名 　        :main	
	 *  メソッドの説明 　:要素数、各要素の値を入力しaryExchngの処理を行う	
	 *  パラメータの説明 :なし	 
	 *  返り値 　        :なし	 
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.24	 
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("要素数 :");
			//要素数を入力
			inputNumber  = standardInput.nextInt();
			//elementsNumberが0以下の場合繰り返す
		}while(inputNumber <= 0);
		//入力値の分だけ整数を入れられる配列を作る
		int[] arrayNumberA = new int [inputNumber]; 
		//変数iを0から始めて1ずつ増やしていき入力値になるまで繰り返す
		for(int i = 0; i < inputNumber; i++) {
			//""の中の文字とiの値を表示
			System.out.print("arrayNumber [" + i + "] =");
			//配列[i]の値を入力
			arrayNumberA[i] = standardInput.nextInt();
		}
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("要素数 :");
			//要素数を入力
			inputNumberTwo  = standardInput.nextInt();
			//elementsNumberが0以下の場合繰り返す
		}while(inputNumberTwo <= 0);
		//入力値の分だけ整数を入れられる配列を作る
		int[] arrayNumberB = new int [inputNumberTwo]; 
		//変数iを0から始めて1ずつ増やしていき入力値になるまで繰り返す
		for(int i = 0; i < inputNumberTwo; i++) {
			//""の中の文字とiの値を表示
			System.out.print("arrayNumber [" + i + "] =");
			//配列[i]の値を入力
			arrayNumberB[i] = standardInput.nextInt();
		}
		//aryExchngの処理を行う
		aryExchng(arrayNumberA,arrayNumberB);
	}
	/*	
	 *  関数名 　        :aryExchng	
	 *  メソッドの説明 　:二つの配列が等しくない場合小さいほうの要素数分の要素を交換する
	 *  				  nullの場合null以外を入力してくださいと表示
	 *  パラメータの説明 :配列A、配列B
	 *  返り値 　        :なし	 
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.24	 
	 */
	private static void aryExchng(int[] arrayNumberA, int[] arrayNumberB) {
		//arrayNumberAまたはarrayNumberBがnullの場合
		if(arrayNumberA == null && arrayNumberB == null) {
			//""の中の文字を表示して改行
			System.out.println("null以外を入力してください");
		}
		//boxNumberの初期化
		int boxNumber = 0;
		//配列Aと配列Bの要素数が違うとき
		if(arrayNumberA  != arrayNumberB) {
			//要素数が要素数2より大きい場合
			if(inputNumber > inputNumberTwo) {
				//変数iを0から始めて1ずつ増やしていき配列Bの要素数分繰り返す
				for(int i = 0; i < arrayNumberB.length; i++) {
					//boxNumberにarrayNumberA[i]の値を代入
					boxNumber = arrayNumberA[i];
					//arrayNumberA[i]にarrayNumberB[i]を代入
					arrayNumberA[i] = arrayNumberB[i];
					//arrayNumberB[i]にboxNumberを代入
					arrayNumberB[i] = boxNumber;
				}
				//""の中の文字を表示
				System.out.print("{");
				//変数iを0から始めて1ずつ増やしていき要素数から-1を引いた値になるまで繰り返す
				for(int i = 0; i < arrayNumberA.length - FINAL_VALUE; i++) {
					//arrayNumber[i]の値と""の中の文字を表示
					System.out.print(arrayNumberA[i] + ", ");	
				}
				//arrayNumber[要素数-1]の値と""の中の文字を表示して改行
				System.out.println(arrayNumberA[arrayNumberA.length - FINAL_VALUE] + "}");
				//""の中の文字を表示
				System.out.print("{");
				//変数iを0から始めて1ずつ増やしていき要素数から-1を引いた値になるまで繰り返す
				for(int i = 0; i < arrayNumberB.length - FINAL_VALUE; i++) {
					//arrayNumber[i]の値と""の中の文字を表示
					System.out.print(arrayNumberB[i] + ", ");	
				}
				//arrayNumber[要素数-1]の値と""の中の文字を表示して改行
				System.out.println(arrayNumberB[arrayNumberB.length - FINAL_VALUE] + "}");

			}
			//それ以外
			else {
				//変数iを0から始めて1ずつ増やしていき配列Aの要素数分繰り返す
				for(int i = 0; i < arrayNumberA.length; i++) {
					//boxNumberにarrayNumberA[i]の値を代入
					boxNumber = arrayNumberA[i];
					//arrayNumberA[i]にarrayNumberB[i]を代入
					arrayNumberA[i] = arrayNumberB[i];
					//arrayNumberB[i]にboxNumberを代入
					arrayNumberB[i] = boxNumber;
				}
				//変数iを0から始めて1ずつ増やしていき要素数から-1を引いた値になるまで繰り返す
				for(int i = 0; i < arrayNumberA.length - FINAL_VALUE; i++) {
					//arrayNumber[i]の値と""の中の文字を表示
					System.out.print(arrayNumberA[i] + ", ");	
				}
				//arrayNumber[要素数-1]の値と""の中の文字を表示して改行
				System.out.println(arrayNumberA[arrayNumberA.length - FINAL_VALUE] + "}");
				//""の中の文字を表示
				System.out.print("{");
				//変数iを0から始めて1ずつ増やしていき要素数から-1を引いた値になるまで繰り返す
				for(int i = 0; i < arrayNumberB.length - FINAL_VALUE; i++) {
					//arrayNumber[i]の値と""の中の文字を表示
					System.out.print(arrayNumberB[i] + ", ");	
				}
				//arrayNumber[要素数-1]の値と""の中の文字を表示して改行
				System.out.println(arrayNumberB[arrayNumberB.length - FINAL_VALUE] + "}");
			}
		}
		//配列Aと配列Bの要素数が同じとき
		if(arrayNumberA  == arrayNumberB) {
			//""の中の文字を表示して改行
			System.out.println("二つの配列は等しいです");
		}
	}
}

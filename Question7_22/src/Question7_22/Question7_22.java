package Question7_22;

import java.util.Scanner;
/* 
 * クラス名 	:Question7_22
 * 概要 		:配列aと同じ配列を生成して返却する
 * 作成者 　	:中西輝 
 * 作成日 		:2026.4.24
 */
public class Question7_22 {	
	/*	
	 *  関数名 　        :main	
	 *  メソッドの説明 　:
	 *  パラメータの説明 :なし	 
	 *  返り値 　        :なし	 
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.24	 
	 */
	public static void main(String[] args) {
		int inputNumber = 0;
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
	}
}

		
		

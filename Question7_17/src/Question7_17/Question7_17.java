package Question7_17;

import java.util.Scanner;
/* 
 * クラス名 :Question7_17 
 * 概要 :最も末尾側に位置する要素を見つける 
 * 作成者 　:中西輝 
 * 作成日 :2026.4.23 
 */
public class Question7_17 {	
	/*	
	 *  関数名 　:main	
	 *  メソッドの説明 　:要素数、各要素の値、探す値を入力し返却値を元に探す値がどこにあるか表示する	
	 *  パラメータの説明　 :なし	 
	 *  返り値 　 :なし	 
	 *  作成者 　 :中西輝	 
	 *  作成日 　 :2026.4.23		 
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
		System.out.print("探す値 :");
		//探す値を入力
		int keyNumber =  standardInput.nextInt();
		//確認する値にlinearSearchRメソッドの結果を代入
		int cheakNumber = linearSearchR(arrayNumber,keyNumber);
		//-1の場合		
		if(cheakNumber == -1) {
			//""の中の文字を表示位して改行
			System.out.println("その値はありません");
		}
		//それ以外
		else {
			//""の中の文字とcheakNumberの値を表示して改行
			System.out.println("その値はarrayNumber[" + cheakNumber + "]にあります。");
		}
	}
	/*	 
	 * 関数名 　:linearSearchR	 
	 * メソッドの説明 　:要素の値を配列の末尾から見ていき一致したら返却しない場合-1を返却	 
	 * パラメータの説明　 :配列と探す値	 
	 * 返り値 　 :iの値、-1	 
	 * 作成者 　 :中西輝	 
	 * 作成日 　 :2026.4.23		 
	 */
	static int linearSearchR(int []arrayNumber, int keyNumber) {
		//変数iを配列の末尾の-1から始めて1ずつ減らしていき0になるまで繰り返す
		for(int i = arrayNumber.length -1 ; i >= 0; i--) {
			//探す値と配列[i]の値が同じ時
			if(keyNumber == arrayNumber[i]) {
				//iの値を返却
				return i;
			}
		}
		//-1を返却
		return -1;
	}
}

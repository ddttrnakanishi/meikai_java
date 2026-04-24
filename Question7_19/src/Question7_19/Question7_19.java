package Question7_19;

import java.util.Scanner;
/* 
 * クラス名 :Question7_19
 * 概要 :配列arrayNumberから要素arrayNumber[idx]を先頭とするn個の要素を削除する
 * 作成者 　:中西輝 
 * 作成日 :2026.4.24
 */
public class Question7_19 {	
	//クラス全体で使える変数FINAL_VALUEに1を代入
	final static int FINAL_VALUE = 1;
	/*	
	 *  関数名 　        :main	
	 *  メソッドの説明 　:要素数、各要素の値、削除する場所、削除する個数
	 *  				  を入力しaryRmvNの処理を行う
	 *  パラメータの説明 :なし	 
	 *  返り値 　        :なし	 
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.24	 
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
			inputNumber  = standardInput.nextInt();
			//elementsNumberが0以下の場合繰り返す
		}while(inputNumber <= 0);
		//入力値の分だけ整数を入れられる配列を作る
		int[] arrayNumber = new int [inputNumber]; 
		//変数iを0から始めて1ずつ増やしていき入力値になるまで繰り返す
		for(int i = 0; i < inputNumber; i++) {
			//""の中の文字とiの値を表示
			System.out.print("arrayNumber [" + i + "] =");
			//配列[i]の値を入力
			arrayNumber[i] = standardInput.nextInt();
		}
		//idxの初期化
		int idx = 0;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("削除を始める場所 :");
			//削除する場所を入力する
			idx  = standardInput.nextInt();
			//要素値-1以上の時繰り返す
		}while(inputNumber - FINAL_VALUE <= idx);
		//""の中の文字を表示
		System.out.print("削除する個数 :");
		//削除する個数を入力する
		int n = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("{");
		//変数iを0から始めて1ずつ増やしていき入力値-1になるまで繰り返す
		for(int i = 0; i < inputNumber - FINAL_VALUE; i++) {
			//arrayNumber[i]の値と""の中の文字を表示
			System.out.print(arrayNumber[i] + ", ");	
		}
		//arrayNumber[要素数から-1]の値と""の中の文字を表示して改行
		System.out.println(arrayNumber[inputNumber - FINAL_VALUE] + "}");
		//aryRmvメソッドの処理を行う
		aryRmvN(arrayNumber, idx, n);
	}
	/*	
	 *  関数名 　          :aryRmvN
	 *  メソッドの説明 　　:削除する値より後ろの全要素を入力した個数分前方にずらす、
	 *  					その結果をもとにずらした結果を表示
	 *  					nullの場合null以外を入力してくださいと表示
	 *  パラメータの説明　 : 配列、削除する場所、削除する個数
	 *  返り値 　 　　　　 :なし	 
	 *  作成者 　          :中西輝	 
	 *  作成日 　          :2026.4.24	 
	 */
	public static void aryRmvN(int[]arrayNumber, int idx, int n) {
		//arrayNumberがnullの場合
		if(arrayNumber == null) {
			//""の中の文字を表示して改行
			System.out.println("null以外を入力してください");
		}
		/*変数iを削除を始める値から始めて1ずつ増やしていき要素数から削除する個数を
		 * 引いた値になるまで繰り返す
		 */
		for(int i = idx; i < arrayNumber.length - n; i++) {
			//arrayNumber[i]にarrayNumber[i+n]した値を代入
			arrayNumber[i] = arrayNumber[i + n];
		}
		//""の中の文字を表示
		System.out.print("{");
		//変数iを0から始めて1ずつ増やしていき要素数から-1を引いた値になるまで繰り返す
		for(int i = 0; i < arrayNumber.length - FINAL_VALUE; i++) {
			//arrayNumber[i]の値と""の中の文字を表示
			System.out.print(arrayNumber[i] + ", ");	
		}
		//arrayNumber[要素数-1]の値と""の中の文字を表示して改行
		System.out.println(arrayNumber[arrayNumber.length - FINAL_VALUE] + "}");
	}

}

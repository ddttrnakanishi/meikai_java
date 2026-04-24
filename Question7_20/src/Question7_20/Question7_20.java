package Question7_20;

import java.util.Scanner;
/* 
 * クラス名 :Question7_20
 * 概要 :配列arrayNumberの要素arrayNumber[idx]に整数を挿入するメソッドを作成
 * 作成者 　:中西輝 
 * 作成日 :2026.4.24
 */
public class Question7_20 {	
	//クラス全体で使える変数FINAL_VALUEに1を代入
	private final static int FINAL_VALUE = 1;
	//クラス全体で使える変数FINAL_VALUETWOに2を代入
	private final static int FINAL_VALUETWO = 2;
	/*	
	 *  関数名 　        :main	
	 *  メソッドの説明 　:要素数、各要素の値、整数を挿入する場所、整数
	 *  				  を入力しaryInsの処理を行う	
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
			System.out.print("整数を挿入する場所 :");
			//削除する場所を入力する
			idx   = standardInput.nextInt();
			//要素値-1の時繰り返す
		}while(inputNumber - FINAL_VALUE < idx);
		//""の中の文字を表示
		System.out.print("整数 :");
		//整数を入力する
		int integerNumber = standardInput.nextInt();
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
		aryIns(arrayNumber, idx, integerNumber);
	}
	/*	
	 *  関数名 　          :aryIns
	 *  メソッドの説明 　　:配列arrayNumberの要素arrayNumber[idx]に整数を挿入する
	 *  パラメータの説明　 : 配列、整数を挿入する場所、整数
	 *  					nullの場合null以外を入力してくださいと表示
	 *  返り値 　 　　　　 :なし	 
	 *  作成者 　          :中西輝	 
	 *  作成日 　          :2026.4.24	 
	 */
	private static void aryIns(int[] arrayNumber, int idx, int integerNumber) {
		//arrayNumberがnullの場合
		if(arrayNumber == null) {
			//""の中の文字を表示して改行
			System.out.println("null以外を入力してください");
		}
		//変数iを要素数の値から始めて1ずつ減らしていき挿入する値になるまで繰り返す
		for(int i = arrayNumber.length; i > idx; i--) {
			//arrayNumber[i-1]にarrayNumber[i-2]した値を代入
			arrayNumber[i - FINAL_VALUE] = arrayNumber[i - FINAL_VALUETWO];
		}
		//arrayNumber[idx]に整数を代入
		arrayNumber[idx] = integerNumber;

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

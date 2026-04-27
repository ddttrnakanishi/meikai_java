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
	 *  メソッドの説明 　:要素数、各要素の値、を入力し配列を表示したのちarrayCloneの処理を元にコピーした配列を表示
	 *  パラメータの説明 :なし	 
	 *  返り値 　        :なし	 
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.24	 
	 */
	public static void main(String[] args) {
		//inputNumberの初期化
		int inputNumber = 0;
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("要素数 :");
			//要素数を入力
			inputNumber  = standardInput.nextInt();
			//inputNumberが0以下の場合繰り返す
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
		//改行
		System.out.println();
		//arrayCloneの返却値の配列を作る
		int[] copyArray = arrayClone(arrayNumber); 
		//変数iを0から始めて1ずつ増やしていき入力値になるまで繰り返す
		for(int i = 0; i < inputNumber; i++) {
			//""の中の文字とiの値を表示
			System.out.println("copyArray [" + i + "] =" + copyArray[i]);
		}
	}
	/*	
	 *  関数名 　        :arrayClone	
	 *  メソッドの説明 　:コピーする配列を作り、arrayNumberの配列をコピーし返却
	 *  				nullの場合はnullを返却する
	 *  パラメータの説明 :配列
	 *  返り値 　        :null、copyArray
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.24	 
	 */
	public static int[] arrayClone(int[] arrayNumber) {
		//arrayNumberがnullの場合
		if(arrayNumber == null) {
			//""の中の文字を表示して改行
			System.out.println("null以外を入力してください");
			//返却
			return null;
		}
		//配列arrayNumberの分だけの配列を作る
		int[] copyArray = new int[arrayNumber.length];
		//変数iを0から始めて1ずつ増やしていきarrayNumberの要素数になるまで繰り返す
		for(int i = 0; i < arrayNumber.length; i++) {
			//copyArray[i]にarrayNumber[i]の値を代入
			copyArray[i] = arrayNumber[i];
		}
		//返却
		return copyArray;
	}
}




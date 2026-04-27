package Question7_23;

import java.util.Scanner;
/* 
 * クラス名 	:Question7_23
 * 概要 		:配列arrayNumberの要素の中の値が入力した値である場合先頭から順に格納した配列を返却する
 * 作成者 　	:中西輝 
 * 作成日 	:2026.4.24
 */
public class Question7_23 {	
	/*	
	 *  関数名 　       :main	
	 *  メソッドの説明 　:要素数、全要素の値、呼び出す値を入力しarraySrchIdxの処理を元に結果を表示する
	 *  パラメータの説明 :なし	 
	 *  返り値 　       :なし	 
	 *  作成者 　       :中西輝	 
	 *  作成日 　       :2026.4.24	 
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
		//""の中の文字を表示
		System.out.print("呼び出す値 :");
		//呼び出す値を代入
		int callNumber  = standardInput.nextInt();
		//arraySrchIdxの結果を元に配列を作成
		int[] returnArray = arraySrchIdx(arrayNumber,callNumber);		
		//返却値が0の場合		
		if(returnArray.length == 0) {			
			//""の中の文字を表示して改行			
			System.out.println("一致した値はありません");		
		}		
		//それ以外		
		else {			
			//""の中の文字を表示			
			System.out.print("{ ");			
			//変数iを0から始めて1ずつ増やしていき一致した個数になるまで繰り返す			
			for(int i = 0; i < returnArray.length; i++) {				
				//""の中の文字とiの値を表示				
				System.out.print(returnArray[i] + " ");			
			}			//""の中の文字を表示			
			System.out.println("}");		
		}	
	}
	/*	
	 *  関数名 　       :arraySrchIdx	
	 *  メソッドの説明 　:呼び出す値と一致している場合その個数に応じた配列を作成する
	 *  				nullの場合null、一致している値がない場合は0を返却
	 *  パラメータの説明 :配列、呼び出す値
	 *  返り値 　       :配列newArray、要素数0の配列
	 *  作成者 　       :中西輝	 
	 *  作成日 　       :2026.4.24	 
	 */
	public static int[] arraySrchIdx(int[] arrayNumber, int callNumber) {
		//arrayNumberがnullの場合
		if(arrayNumber == null) {
			//""の中の文字を表示して改行
			System.out.println("null以外を入力してください");
			//返却
			return null;
		}
		//countNumberの初期化
		int countNumber = 0;
		//変数iを0から始めて1ずつ増やしていきarrayNumberの要素数になるまで繰り返す
		for(int i = 0; i < arrayNumber.length; i++) {
			//arrayNumber[i]とcallNumberの値が同じ時
			if (arrayNumber[i] == callNumber) {
				//countNumberに+1
				countNumber++;
			}
		}
		//countNumberが0の場合
		if(countNumber == 0) {
			//返却
			return new int[0];
		}
			//配列countNumberの分だけの配列を作る
			int[] newArray = new int[countNumber];
			//newCountを初期化
			int newCount = 0;
			//変数iを0から始めて1ずつ増やしていき要素数になるまで繰り返す
			for(int i = 0; i < arrayNumber.length; i++) {
				//arrayNumber[i]とcallNumberの値が同じ時
				if (arrayNumber[i] == callNumber) {
					//newArray[newCount]にiの値を代入
					newArray[newCount] = i;
					//newCount+1
					newCount++;
				}
			}
			//返却
			return newArray;
		}
	}





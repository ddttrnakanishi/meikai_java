package Question7_26;

import java.util.Scanner;
/* 
 * クラス名 :Question7_26
 * 概要 :配列arrayNumberの要素arrayNumber[idx]に整数を挿入するメソッドを作成
 * 作成者 　:中西輝 
 * 作成日 :2026.4.26
 */
public class Question7_26 {	
	//クラス全体で使える変数FINAL_VALUEに1を代入
	private final static int FINAL_VALUE = 1;
	/*	
	 *  関数名 　        :main	
	 *  メソッドの説明 　:要素数、各要素の値、整数を挿入する場所、整数
	 *  				  を入力しaryInsの処理を行う	
	 *  パラメータの説明 :なし	 
	 *  返り値 　        :なし	 
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.26 
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
		//idxの初期化
		int idx = 0;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("整数を挿入する場所 :");
			//削除する場所を入力する
			idx   = standardInput.nextInt();
			//要素値の時繰り返す
		}while(inputNumber < idx);
		//""の中の文字を表示
		System.out.print("整数 :");
		//整数を入力する
		int integerNumber = standardInput.nextInt();
		//arraySrchIdxの結果を元に配列を作成
		int[] returnArray = arrayInsOfN(arrayNumber,idx,integerNumber);
		//返却値がnullの場合
		if(returnArray== null) {
			//""の中の文字を表示して改行
			System.out.println("不正な入力がされました。");
		}
		//それ以外
		else {
			//""の中の文字を表示
			System.out.print("{ ");
			//変数iを0から始めて1ずつ増やしていきreturnArrayの要素数-1になるまで繰り返す
			for(int i = 0; i < returnArray.length - FINAL_VALUE; i++) {
				//""の中の文字とiの値を表示
				System.out.print(returnArray[i] + ", ");
			}
			//arrayNumber[要素数-1]の値と""の中の文字を表示して改行
			System.out.println(returnArray[returnArray.length - FINAL_VALUE] + "}");
		}
	}
	/*	
	 *  関数名 　       :arrayInsOfN
	 *  メソッドの説明 　:配列arrayNumberの要素arrayNumber[idx]に整数を挿入し返却する
	 *  パラメータの説明 :配列arrayNumber、整数を挿入する場所、整数
	 *  				nullの場合、挿入する場所の値より要素数の値が小さい時かどちらかが負の値の時nullを返却
	 *  返り値 　       :null、配列newArray
	 *  作成者 　       :中西輝	 
	 *  作成日 　       :2026.4.26
	 */
		public static int[] arrayInsOfN(int[] arrayNumber, int idx, int integerNumber) {
			//arrayNumberがnullの場合
			if(arrayNumber == null) {
				//""の中の文字を表示して改行
				System.out.println("null以外を入力してください");
				//返却
				return null;
			}
			//挿入する場所の値より要素数の値が小さい時かどちらかが負の値の時
			if(idx >= arrayNumber.length || idx < 0|| integerNumber < 0) {
				//返却
				return null;
			}
			//配列arrayNumber+1の分だけの配列を作る
			int[] newArray = new int [arrayNumber.length + FINAL_VALUE];
			//変数iを0の値から始めて1ずつ増やしていき要素数になるまで繰り返す
			for(int i = 0; i < newArray.length; i++) {
				if(i == idx) {
					//arrayNumber[idx]に整数を代入
					newArray[idx] = integerNumber;
				}
				//挿入する場所の値がiより大きい場合
				else if(idx > i) {
					//newArray[i]にarrayNumber[i]の値を代入
					newArray[i] = arrayNumber[i];
				}
				else {
					//newArray[i]にarrayNumber[i-1]した値を代入
					newArray[i] = arrayNumber[i - FINAL_VALUE];
				}
			}
			//返却
			return newArray;
		}
}


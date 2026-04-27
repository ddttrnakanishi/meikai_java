package Question7_25;

import java.util.Scanner;
/* 
 * クラス名 	:Question7_25
 * 概要 		:配列arrayNumberから要素arrayNumber[消す値]から後ろにn個を削除した配列を表示
 * 作成者 　	:中西輝 
 * 作成日 	:2026.4.25
 */
public class Question7_25 {	
	/*	
	 *  関数名 　       :main	
	 *  メソッドの説明 　:要素数、全要素の値、消す場所、消す個数を入力しarrayRmvOfNの処理を元に結果を表示する
	 *  パラメータの説明 :なし	 
	 *  返り値 　       :なし	 
	 *  作成者 　       :中西輝	 
	 *  作成日 　       :2026.4.25	 
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
		System.out.print("消す場所 :");
		//消す場所の値を代入
		int deletePlace  = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("消す個数 :");
		//消す個数の値を代入
		int  deletePiece = standardInput.nextInt();
		//arraySrchIdxの結果を元に配列を作成
		int[] returnArray = arrayRmvOfN(arrayNumber,deletePlace,deletePiece);
		//返却値がnullの場合
		if(returnArray == null) {
			//""の中の文字を表示して改行
			System.out.println("不正の入力です");
		}
		
		//それ以外
		else {
			//""の中の文字を表示
			System.out.print("{ ");
			//変数iを0から始めて1ずつ増やしていきreturnArrayの要素数になるまで繰り返す
			for(int i = 0; i < returnArray.length; i++) {
				//""の中の文字とiの値を表示
				System.out.print(returnArray[i] + " ");
			}
			//""の中の文字を表示
			System.out.println("}");
		}
	}
	/*	
	 *  関数名 　       :arrayRmvOfN
	 *  メソッドの説明 　:要素数、全要素の値、消す場所、消す個数を入力しarrayRmvOfNの処理を元に結果を表示する
	 *  パラメータの説明 :配列、消す場所、消す個数より新しい配列の作成
	 *  				nullの場合、消す場所の値より要素数の値が小さい時かどちらかが負の値の場合、要素数が1の場合nullを返却
	 *  返り値 　       :配列0、消す場所、消す個数 
	 *  作成者 　       :中西輝	 
	 *  作成日 　       :2026.4.25	 
	 */
	public static int[] arrayRmvOfN(int[] arrayNumber, int deletePlace, int deletePiece) {
		//arrayNumberがnullの場合
		if(arrayNumber == null) {
			//""の中の文字を表示して改行
			System.out.println("null以外を入力してください");
			//返却
			return null;
		}
		//消す場所の値より要素数の値が小さい時かどちらかが負の値の時
		if(deletePlace >= arrayNumber.length || deletePlace < 0|| deletePiece < 0) {
			//返却
			return null;
		}
		//要素数が1の時
		if(arrayNumber.length == 1) {
			//返却
			return null;
		}
		//消す場所の値と個数の合計値がarrayNumberの要素数より大きい場合
		if(deletePlace + deletePiece > arrayNumber.length) {
			//消す個数にarrayNumberの要素数-消す場所の値の値を代入
			deletePiece = arrayNumber.length - deletePlace;
		}
		/*変数iを削除を始める値から始めて1ずつ増やしていき要素数から削除する個数を
		 * 引いた値になるまで繰り返す
		 */
		for(int i = deletePlace; i < arrayNumber.length - deletePiece; i++) {
			//arrayNumber[i]にarrayNumber[i+deletePiece]した値を代入
			arrayNumber[i] = arrayNumber[i + deletePiece];
		}
		//配列arrayNumber-deletePieceの分だけの配列を作る
		int[] newArray = new int [arrayNumber.length - deletePiece];
		//変数iを0から始めて1ずつ増やしていきnewArrayの要素数になるまで繰り返す
		for(int i = 0; i < newArray.length ; i++) {
			//消す場所の値がiより大きい場合
			if(deletePlace > i) {
				//newArray[i]にarrayNumber[i]の値を代入
				newArray[i] = arrayNumber[i];
			}
			else {
				//newArray[i]にarrayNumber[i+deletePiece]の値を代入
				newArray[i] = arrayNumber[i + deletePiece];
			}
		}
		//返却
		return newArray;
	}
}


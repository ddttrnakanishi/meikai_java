package Question7_24;

import java.util.Scanner;
/* 
 * クラス名 	:Question7_24
 * 概要 		:配列arrayNumberから要素arrayNumber[消す値]を削除した配列を表示
 * 作成者 　	:中西輝 
 * 作成日 	:2026.4.25
 */
public class Question7_24 {	
	//クラス全体で使える変数FINAL_VALUEに1を代入
	private final static int FINAL_VALUE = 1;
	/*	
	 *  関数名 　       :main	
	 *  メソッドの説明 　:要素数、全要素の値、消す場所を入力しarrayRmvOfの処理を元に結果を表示する
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
		//arraySrchIdxの結果を元に配列を作成
		int[] returnArray = arrayRmvOf(arrayNumber,deletePlace);
		//返却値がarrayNumberの要素数の場合
		if(returnArray.length == arrayNumber.length) {
			//""の中の文字を表示して改行
			System.out.println("消す場所が存在しないです");
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
	 *  関数名 　       :arrayRmvOf	
	 *  メソッドの説明 　:元の配列arrayNumberの中で消す場所を起点として左にシフトした配列を作成する
	 *  				nullの場合null、一致している値がない場合は要素数がarrayNumberのnewArrayを返却
	 *  パラメータの説明 :配列、消す場所の値
	 *  返り値 　       :配列newArray、null
	 *  作成者 　       :中西輝	 
	 *  作成日 　       :2026.4.25	 
	 */
	public static int[] arrayRmvOf(int[] arrayNumber, int deletePlace) {
		//arrayNumberがnullの場合
		if(arrayNumber == null) {
			//""の中の文字を表示して改行
			System.out.println("null以外を入力してください");
			//返却
			return null;
		}
		//消す場所の値より要素数の値が小さい時か負の値の時
		if(deletePlace >= arrayNumber.length || deletePlace < 0) {
			//配列arrayNumberの分だけの配列を作る
			int[] newArray = new int [arrayNumber.length ];
			//返却
			return newArray;
		}
			//配列arrayNumber-1の分だけの配列を作る
			int[] newArray = new int [arrayNumber.length - FINAL_VALUE];
			//変数iを0から始めて1ずつ増やしていきnewArrayの要素数になるまで繰り返す
			for(int i = 0; i < newArray.length ; i++) {
				//消す場所の値がiより大きい場合
				if(deletePlace > i) {
					//newArray[i]にarrayNumber[i]の値を代入
					newArray[i] = arrayNumber[i];
				}
				//それ以外
				else {
					//newArray[i]にarrayNumber[i+1]の値を代入
					newArray[i] = arrayNumber[i + FINAL_VALUE];
				}
			}
			//返却
			return newArray;
		}
	}

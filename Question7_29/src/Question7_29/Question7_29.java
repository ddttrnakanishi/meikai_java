package Question7_29;

import java.util.Scanner;
/* 
 * クラス名 :Question7_29
 * 概要 :二次元配列arrayNumberと同じ配列を生成して返すメソッドを作成
 * 作成者 　:中西輝 
 * 作成日 :2026.4.26
 */
public class Question7_29 {	
	//クラス全体で使える変数lineNumberの初期化
	private static int lineNumber = 0;
	//クラス全体で使える変数columnNumberの初期化
	private static int columnNumber= 0;
	/*	
	 *  関数名 　        :main	
	 *  メソッドの説明 　:配列の行数と列数を入力し全要素の値も入力したのちaryClone2の処理を受け取る
	 *  パラメータの説明 :なし	 
	 *  返り値 　        :なし	 
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.26 
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//繰り返し
		do {
			//""の中の文字を入力
			System.out.print("配列arrayNumber行数は :");
			//値を入力し代入
			lineNumber = standardInput.nextInt();
			//lineNumberが0以下の場合繰り返す
		}while(lineNumber <= 0);
		//繰り返し
		do {
			//""の中の文字を入力
			System.out.print("配列arrayNumberの列数は :");
			//値を入力し代入
			columnNumber = standardInput.nextInt();
			//lineNumberが0以下の場合繰り返す
		}while(columnNumber <= 0);
		//行数がlineNumberで列数がcolumnNumberの配列の作成
		int[][] arrayNumber = new int [lineNumber][columnNumber] ;
		//変数iを0から始めて1ずつ増やしていきarrayNumberの要素数の値になるまで繰り返す
		for(int i = 0; i < arrayNumber.length; i++) {
			//変数jを0から始めて1ずつ増やしていきarrayNumberの要素数の値になるまで繰り返す
			for(int j = 0; j < arrayNumber[i].length; j++) {
				//""の中の文字とi,jの値を表示
				System.out.print("arrayNumberOne[" + i + "][" + j + "] = " );
				//arrayNumber[i][j]の値を入力し代入
				arrayNumber[i][j] = standardInput.nextInt();
			}
		}
		//改行
		System.out.println();
		//aryClone2メソッドの結果を受け取る
		aryClone2(arrayNumber);
	}
	/*	
	 *  関数名 　        :aryClone2	
	 *  メソッドの説明 　:配列arrayNumberをコピーした配列copyArrayを作成し返却する
	 *  			　　nullの場合nullを返却しそれ以外を入力するような表示をする
	 *  パラメータの説明 :配列arrayNumber
	 *  返り値 　        :null、copyArray
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.26 
	 */
	public static  int[][]aryClone2(int[][] arrayNumber) {
		//arrayNumberがnullの場合
		if(arrayNumber == null) {
			//""の中の文字を表示して改行
			System.out.println("null以外を入力してください");
			//返却
			return null;
		}
		//行数がlineNumberで列数がcolumnNumberの配列の作成
		int[][] copyArray = new int [lineNumber][columnNumber];
		//変数iを0から始めて1ずつ増やしていきcopyArrayの要素数の値になるまで繰り返す
		for(int i = 0; i < copyArray.length; i++) {
			//変数jを0から始めて1ずつ増やしていきcopyArrayの要素数の値になるまで繰り返す
			for(int j = 0; j < copyArray[i].length; j++) {
				//copyArray[i][j]にarrayNumber[i][j]の値を代入
				copyArray[i][j] = arrayNumber[i][j];
				//""の中の文字とi,jの値を表示
				System.out.println("copyArray[" + i + "][" + j + "] = " + copyArray[i][j]);
			}
		}
		//返却
		return copyArray;
	}
}
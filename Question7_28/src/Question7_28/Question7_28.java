package Question7_28;

import java.util.Scanner;
/* 
 * クラス名 :Question7_28
 * 概要 :行列x、yの和を格納した二次元配列を返すメソッドを作成
 * 作成者 　:中西輝 
 * 作成日 :2026.4.26
 */
public class Question7_28 {	
	//クラス全体で使える変数lineNumberの初期化
	private static int lineNumber = 0;
	//クラス全体で使える変数columnNumberの初期化
	private static int columnNumber= 0;
	/*	
	 *  関数名 　        :main	
	 *  メソッドの説明 　:配列の行数と列数を入力し全要素の値も入力したのちaddMatrixの処理を行いその結果を元に
	 *  			　　加算した結果を表示する
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
			System.out.print("配列arrayNumberOne,arrayNumberTwoの行数は :");
			//値を入力し代入
			lineNumber = standardInput.nextInt();
			//lineNumberが0以下の場合繰り返す
		}while(lineNumber <= 0);
		//繰り返し
		do {
			//""の中の文字を入力
			System.out.print("配列arrayNumberOne,arrayNumberTwoの列数は :");
			//値を入力し代入
			columnNumber = standardInput.nextInt();
			//lineNumberが0以下の場合繰り返す
		}while(columnNumber <= 0);
		//行数がlineNumberで列数がcolumnNumberの配列の作成
		int[][] arrayNumberOne = new int [lineNumber][columnNumber] ;
		//変数iを0から始めて1ずつ増やしていきarrayNumberOneの要素数の値になるまで繰り返す
		for(int i = 0; i < arrayNumberOne.length; i++) {
			//変数jを0から始めて1ずつ増やしていきarrayNumberOneの要素数の値になるまで繰り返す
			for(int j = 0; j < arrayNumberOne[i].length; j++) {
				//""の中の文字とi,jの値を表示
				System.out.print("arrayNumberOne[" + i + "][" + j + "] = " );
				//arrayNumberOne[i][j]の値を入力し代入
				arrayNumberOne[i][j] = standardInput.nextInt();
			}
		}
		//改行
		System.out.println();
		//行数がlineNumberで列数がcolumnNumberの配列の作成
		int[][] arrayNumberTwo = new int [lineNumber][columnNumber] ;
		//変数iを0から始めて1ずつ増やしていきarrayNumberTwoの要素数の値になるまで繰り返す
		for(int i = 0; i < arrayNumberTwo.length; i++) {
			//変数jを0から始めて1ずつ増やしていきarrayNumberTwoの要素数の値になるまで繰り返す
			for(int j = 0; j < arrayNumberTwo[i].length; j++) {
				//""の中の文字とi,jの値を表示
				System.out.print("arrayNumberTwo[" + i + "][" + j + "] = " );
				//arrayNumberTwo[i][j]の値を入力し代入
				arrayNumberTwo[i][j] = standardInput.nextInt();
			}
		}
		//改行
		System.out.println();
		//返却値を受け取る
		addMatrix(arrayNumberOne,arrayNumberTwo);
	}
	/*	
	 *  関数名 　        :addMatrix	
	 *  メソッドの説明 　:arrayNumberOneとarrayNumberTwoの和である配列returnArray作成し返却する
	 *  			　　nullの場合nullを返却しそれ以外を入力するような表示をする
	 *  パラメータの説明 :配列arrayNumber
	 *  返り値 　        :null、copyArray
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.26 
	 */
	public static int[][] addMatrix(int[][] arrayNumberOne, int[][] arrayNumberTwo) {
		//arrayNumberOne,arrayNumberTwoのいずれかがnullの場合
		if(arrayNumberOne == null || arrayNumberTwo == null ) {
			//""の中の文字を表示して改行
			System.out.println("null以外を入力してください");
			//返却
			return null;
		}
		////行数がlineNumberで列数がcolumnNumberの配列の作成
		int[][] returnArray = new int[lineNumber][columnNumber] ;
		//変数iを0から始めて1ずつ増やしていきreturnArrayの要素数の値になるまで繰り返す
		for(int i = 0; i < returnArray.length; i++) {
			//変数jを0から始めて1ずつ増やしていきreturnArrayの要素数の値になるまで繰り返す
			for(int j = 0; j < returnArray[i].length; j++) {	
				//arrayNumberOne[i][j]とarrayNumberTwo[i][j]を足した値をreturnArray[i][j]に代入
				returnArray[i][j] = arrayNumberOne[i][j] + arrayNumberTwo[i][j];
				//最低でも三桁感覚をあけてarrayNumberThree[i][j]の値を表示
				System.out.printf("%3d", returnArray[i][j]);
			}
			//改行
			System.out.println();
		}
		return returnArray;
	}
}
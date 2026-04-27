package Question7_27;

import java.util.Scanner;
/* 
 * クラス名 :Question7_27
 * 概要 :三つの配列が同じであれば加算してtrueを返す、そうでなければ、falseを返すメソッドを作成
 * 作成者 　:中西輝 
 * 作成日 :2026.4.26
 */
public class Question7_27 {	
	//クラス全体で使える変数lineNumberAの初期化
	private static int lineNumberA = 0;
	//クラス全体で使える変数columnNumberAの初期化
	private static int columnNumberA= 0;
	//クラス全体で使える変数lineNumberBの初期化
	private static int lineNumberB= 0;
	//クラス全体で使える変数columnNumberBの初期化
	private static int columnNumberB = 0;
	/*	
	 *  関数名 　        :main	
	 *  メソッドの説明 　:配列の行数と列数を2回ずつ入力し全要素の値も入力したのちaddMatrixの処理を行いその結果を元に
	 *  			　　加算した結果や出来ないことを表示する
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
			System.out.print("配列aの行数は :");
			//値を入力し代入
			lineNumberA = standardInput.nextInt();
			//lineNumberAが0以下の場合繰り返す
		}while(lineNumberA <= 0);
		//繰り返し
		do {
			//""の中の文字を入力
			System.out.print("配列aの列数は :");
			//値を入力し代入
			columnNumberA = standardInput.nextInt();
			//lineNumberAが0以下の場合繰り返す
		}while(columnNumberA <= 0);
		//行数がlineNumberAで列数がcolumnNumberAの配列の作成
		int[][] arrayNumberOne = new int [lineNumberA][columnNumberA] ;
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
		//繰り返し
		do {
			//""の中の文字を入力
			System.out.print("配列bの行数は :");
			//値を入力し代入
			lineNumberB = standardInput.nextInt();
			//lineNumberBが0以下の場合繰り返す
		}while(lineNumberB <= 0);
		//繰り返し
		do {
			//""の中の文字を入力
			System.out.print("配列bの列数は :");
			//値を入力し代入
			columnNumberB = standardInput.nextInt();
			//columnNumberBが0以下の場合繰り返す
		}while(columnNumberB <= 0);
		//行数がlineNumberBで列数がcolumnNumberBの配列の作成
		int[][] arrayNumberTwo = new int [lineNumberB][columnNumberB] ;
		//変数iを0から始めて1ずつ増やしていきarrayNumberTwoの要素数の値になるまで繰り返す
		for(int i = 0; i < arrayNumberTwo.length; i++) {
			//変数jを0から始めて1ずつ増やしていきarrayNumberTwoの要素数の値になるまで繰り返す
			for(int j = 0; j < arrayNumberTwo[i].length; j++) {
				//""の中の文字とi,jの値を表示
				System.out.print("a[" + i + "][" + j + "] = " );
				//arrayNumberTwo[i][j]の値を入力し代入
				arrayNumberTwo[i][j] = standardInput.nextInt();
			}
		}
		//改行
		System.out.println();
		////行数がlineNumberAで列数がcolumnNumberAの新しい配列の作成
		int[][] arrayNumberThree = new int [lineNumberA][columnNumberA];
		//もしtrueが返却されたら
		if(addMatrix(arrayNumberOne, arrayNumberTwo, arrayNumberThree)) {
			//変数iを0から始めて1ずつ増やしていきarrayNumberThreeの要素数の値になるまで繰り返す
			for(int i = 0; i < arrayNumberThree.length; i++) {
				//変数jを0から始めて1ずつ増やしていきarrayNumberThreeの要素数の値になるまで繰り返す
				for(int j = 0; j < arrayNumberThree[i].length; j++) {	
					//最低でも三桁感覚をあけてarrayNumberThree[i][j]の値を表示
					System.out.printf("%3d", arrayNumberThree[i][j]);
				}
				//改行
				System.out.println();
			}
		}
		//それ以外
		else {
			//""の中の文字を表示して改行
			System.out.println("加算できないです");
		}
	}
	/*	
	 *  関数名 　        :addMatrix
	 *  メソッドの説明 　:行列が異なる場合、nullが入力された時はfalseをそれ以外はarrayNumberOne[i][j]と
	 *  			　　arrayNumberTwo[i][j]を足した値をarrayNumberThree[i][j]に代入しtrueを返却
	 *  パラメータの説明 :配列arrayNumberOne、配列arrayNumberTwo、配列arrayNumberThree
	 *  返り値 　        :false、true
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.26 
	 */
	public static boolean addMatrix(int[][] arrayNumberOne, int[][] arrayNumberTwo, int[][] arrayNumberThree) {
		//arrayNumberOne,arrayNumberTwo,arrayNumberThreeのいずれかがnullの場合
		if(arrayNumberOne == null || arrayNumberTwo == null || arrayNumberThree == null) {
			//""の中の文字を表示して改行
			System.out.println("null以外を入力してください");
			//返却
			return false;
		}
		//lineNumberAとlineNumberB、columnNumberAとcolumnNumberBの値が異なる時
		if(lineNumberA != lineNumberB || columnNumberA != columnNumberB) {
			//""の中の文字を表示して改行
			System.out.println("行列が異なるので");
			//返却
			return false;
		}

		//変数iを0から始めて1ずつ増やしていきarrayNumberOneの要素数の値になるまで繰り返す
		for(int i = 0; i < arrayNumberOne.length; i++) {
			//変数jを0から始めて1ずつ増やしていきarrayNumberOneの要素数の値になるまで繰り返す
			for(int j = 0; j < arrayNumberOne[i].length; j++) {
				//arrayNumberOne[i][j]とarrayNumberTwo[i][j]を足した値をarrayNumberThree[i][j]に代入
				arrayNumberThree[i][j] = arrayNumberOne[i][j] + arrayNumberTwo[i][j];
			}
		}
		//返却
		return true;
	}
}

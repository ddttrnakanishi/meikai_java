package Question6_18;

import java.util.Scanner;
/*
 * クラス名            :Question6_18
 * 概要                :行数・各行の列数・各要素の値をキーボードから読み込む
 * 作成者             　:中西輝
 * 作成日              :2026.4.20
 */
public class Question6_18 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.20
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//int型を構成要素型とする配列を構成要素型とする配列の宣言
		int[][] arrayNumber;
		//""の中の文字を表示
		System.out.print("行数 :");
		//行数を入力する
		int lineNumber = standardInput.nextInt();
		//構成要素型がint型で構成要素数が入力した値の配列
		arrayNumber = new int[lineNumber][];
		//columnNumberの初期化
		int columnNumber = 0;
		//変数iが0から始まり1ずつ増やしていき行数の値になるまで繰り返す
		for(int i = 0; i < lineNumber; i++) {
			//i+1した値と""の中の文字を表示
			System.out.print(i + 1 + "行の列数 :");
			//列数を入力
			columnNumber = standardInput.nextInt();
			//構成要素型がint型で構成要素数が入力した値の配列
			arrayNumber[i] = new int[columnNumber] ;
		}
		//elementNumberの初期化
		int elementNumber = 0;
		//変数iが0から始まり1ずつ増やしていき行数の値になるまで繰り返す
		for(int i = 0; i < arrayNumber.length;i++) {
			//変数jが0から始まり1ずつ増やしていきi行数の列数分繰り返す
			for(int j = 0; j < arrayNumber[i].length; j++) {
				//""の中の文字と変数iとjの値を表示
				System.out.printf("要素数 : [" + i + "]" + "[" + j + "] =");
				//要素数を入力
				elementNumber = standardInput.nextInt();
				//arrayNumber[i][j]に入力した要素数を代入
				arrayNumber[i][j] = elementNumber;
			}
		}
		//変数iが0から始まり1ずつ増やしていき行数の値になるまで繰り返す
		for(int i = 0; i < arrayNumber.length; i++) {
			//変数jが0から始まり1ずつ増やしていきi行数の列数分繰り返す
			for(int j = 0; j < arrayNumber[i].length; j++) {
				//arrayNumber[i][j]の値を三桁で表示
				System.out.printf("%3d", arrayNumber[i][j]);
			}
			//改行
			System.out.println();
		}
	}
}

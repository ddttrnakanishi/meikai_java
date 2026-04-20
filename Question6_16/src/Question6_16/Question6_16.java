package Question6_16;

import java.util.Scanner;

/*
 * クラス名            :Question6_16
 * 概要                :4行3列の行列3行4列の行列の積を求める
 * 作成者             　:中西輝
 * 作成日              :2026.4.18
 */
public class Question6_16 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.18
	 */
	public static void main(String[] args) {
		//キーボードで入力する値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//int型を構成要素型とする配列を構成要素型とする配列の宣言
		int [][] firstMatrix = new int[4][3];
		//int型を構成要素型とする配列を構成要素型とする配列の宣言
		int [][] secondMatrix = new int[3][4];
		//変数iを0から始めて1ずつ増やしていき4になるまで繰り返す(4行)
		for(int i = 0; i < 4; i++) {
			//変数jを0から始めて1ずつ増やしていき3になるまで繰り返す(3列)
			for(int j = 0; j < 3; j++) {
				//""の中の文字と変数iと変数jの値を表示
				System.out.print("firstMatrix["+ i +"]"+"["+ j +"] =" );
				//firstMatrix[i][j]の値を入力
				firstMatrix[i][j] = standardInput.nextInt();
			}
		}
		//改行
		System.out.println();
		//変数iを0から始めて1ずつ増やしていき3になるまで繰り返す(3行)
		for(int i = 0; i < 3; i++) {
			//変数jを0から始めて1ずつ増やしていき4になるまで繰り返す(4列)
			for(int j = 0; j < 4; j++) {
				//""の中の文字と変数iと変数jの値を表示
				System.out.print("secondMatrix["+ i +"]"+"["+ j +"] =" );
				//secondMatrix[i][j]の値を入力
				secondMatrix[i][j] = standardInput.nextInt();
			}
		}
		//改行
		System.out.println();
		//変数iを0から始めて1ずつ増やしていき4になるまで繰り返す(4行),[4][3],[3][4]の積は[4][4]になるため
		for(int i = 0; i < 4; i++) {
			//変数jを0から始めて1ずつ増やしていき4になるまで繰り返す(4列),[4][3],[3][4]の積は[4][4]になるため
			for(int j = 0; j < 4; j++) {
				//合計の初期化
				int sumValue = 0;
				//変数addNumberを0から始めて1ずつ増やしていき3になるまで繰り返す(それぞれ3回かけたものを足すため3になる)
				for(int addNumber = 0; addNumber < 3; addNumber++) {
					//合計にfirstMatrix[i][addNumber]の値とsecondMatrix[addNumber][j]の値をかけたものを足していく
					sumValue += firstMatrix[i][addNumber] * secondMatrix[addNumber][j];
				}
				//少なくとも合計の値を三桁で表示
				System.out.printf("%3d ", sumValue);
			}
			//改行
			System.out.println();
		}
	}
}


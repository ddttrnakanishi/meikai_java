package Question6_7;

import java.util.Random;
import java.util.Scanner;
/*
 * クラス名            :Question6_7
 * 概要                :キー値が複数あるとき最も末尾側の数値を表示する
 * 作成者             　:中西輝
 * 作成日              :2026.4.16
 */
public class Question6_7 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理で実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.16
	 */
	public static void main(String[] args) {
		//ランダムに出される値を入れる変数を作る
		Random randomNumber = new Random();
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//要素数は12である
		final int elementNumber = 12;
		//int型を構成要素とする配列要素数の作成
		int[] arrayNumber = new int[elementNumber];
		//変数jの初期化
		int j = 0;
		//変数jが0から始まり1ずつ増やしていき12より大きくなるまで繰り返す
		for (j = 0; j < elementNumber; j++) {
			//0から9までのランダムのランダム数をarrayNumber[j]に代入
			arrayNumber[j] = randomNumber.nextInt(10);
		}
		//""の中の文字を表示するが{の前で改行
		System.out.print("配列arrayNumberの全要素の値\n{ ");
		//変数jが0から始まり1ずつ増やしていき12より大きくなるまで繰り返す
		for( j = 0; j < elementNumber; j++) {
			//ランダムに出力された値を表示
			System.out.print(arrayNumber[j] + " ");
		}
		//""の中の文字を表示して改行
		System.out.println("}");
		//""の中の文字を表示
		System.out.print("探す数値 :");
		//探す値をキーボードで入力
		int keyNumber = standardInput.nextInt();
		/* 変数iの初期化
		 * 変数最後の値を初期化
		 */
		int i = 0;
		int endNumber = 0;
		//変数iが0から始まり1ずつ増やしていき12より大きくなるまで繰り返す
		for(i = 0; i < elementNumber; i++) {
			//ランダムに出力された値と探す値が同じ時
			if(arrayNumber[i] == keyNumber) {
				//最後の値に変数iの値を代入
				endNumber = i;
			}
		}
		//ランダムに出力された値と探す値が同じ時
		if(arrayNumber[endNumber] == keyNumber) {
			//""の中の文字とendNumberの値を表示して改行
			System.out.println("それはarrayNumber[" + endNumber + "]にあります。");
		}
		//それ以外
		else {
			//""の中の文字を表示して改行
			System.out.println("それはありません。");
		}
	}
}




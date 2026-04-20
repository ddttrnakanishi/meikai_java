package Question6_10;

import java.util.Random;
import java.util.Scanner;
/*
 * クラス名            :Question6_10
 * 概要                :連続する要素が同じになったとき入れ替える
 * 作成者             　:中西輝
 * 作成日              :2026.4.16
 */
public class Question6_10 {
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
		//変数boxNumberの初期化
		int boxNumber = 0;		
		//変数jが0から始まり1ずつ増やしていき1入力値より大きくなるまで繰り返す
		for (j = 0; j < elementNumber; j++) {
			//1から10までのランダムのランダム数をarrayNumber[j]に代入
			arrayNumber[j] = randomNumber.nextInt(10) + 1;
			//変数jが配列の1番目の値以外の時と0以外の時
			if( j != 0) {
				//ランダム出した値と一個前の値が同じ時繰り返す
				while(arrayNumber[j] == arrayNumber[j - 1]) {
					//arrayNumber[j]に1から10のランダムな数を代入
					arrayNumber[j] = randomNumber.nextInt(10) + 1;
				}
			}
		}
		//""の中の文字を表示するが{の前で改行
		System.out.print("配列arrayNumberの全要素の値\n{ ");
		//変数jが0から始まり1ずつ増やしていき入力した値より大きくなるまで繰り返す
		for( j = 0; j < elementNumber; j++) {
			//ランダムに出力された値を表示
			System.out.print(arrayNumber[j] + " ");
		}
		//""内の文字を表示して改行
		System.out.println("}");
	}
}

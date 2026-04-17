package Question6_11;

import java.util.Random;
import java.util.Scanner;
/*
 * クラス名            :Question6_11
 * 概要                :同じ要素数を出さないようにする
 * 作成者             　:中西輝
 * 作成日              :2026.4.16
 */
public class Question6_11 {
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
		//要素数は10である
		final int elementNumber = 10;
		//int型を構成要素とする配列要素数の作成
		int[] arrayNumber = new int[elementNumber];
		//変数jの初期化
		int j = 0;
		//変数jが0から始まり1ずつ増やしていき1入力値より大きくなるまで繰り返す
		for (j = 0; j < elementNumber; j++) {
			//0から9までのランダムのランダム数をarrayNumber[j]に代入
			arrayNumber[j] = randomNumber.nextInt(10);
				//変数iが0から始まり1ずつ増やしていき変数j以上になるまで繰り返す
				for(int i = 0; i <= j - 1; i++) {
					//インデックスの値の値が同じ場合
					if(arrayNumber[i] == arrayNumber[j]) {
						//ランダムに代入された値を入れ替える
						arrayNumber[j] = randomNumber.nextInt(10);
						//変数iに-1を代入
						i = -1;
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
		//""の中の文字を表示して改行
		System.out.println("}");
	}
}

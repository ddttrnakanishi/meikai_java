package Question6_9;

import java.util.Random;
import java.util.Scanner;
/*
 * クラス名            :Question6_9
 * 概要                :要素数がint型の配列を作り全要素を1-10の乱数で埋め尽くす
 * 作成者             　:中西輝
 * 作成日              :2026.4.16
 */
public class Question6_9 {
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
		//()の中の文字を表示
		System.out.print("要素数は？ :");	
		//要素数をキーボードで入力する
		int  elementNumber = standardInput.nextInt();
		////int型を構成要素とする配列要素数の作成
		int[] indexNumber = new int [elementNumber];
		//変数iが0から始まり1ずつ増やしていき入力した値より大きくなるまで繰り返す
		for (int i = 0; i < elementNumber; i++) {
			//1から10までのランダムのランダム数をindexNumber[i]に代入
			indexNumber[i] = randomNumber.nextInt(10)+1;
		}
		//変数iが0から始まり1ずつ増やしていき入力した値より大きくなるまで繰り返す
		for(int i = 0; i < elementNumber; i++) {
			//""の中の文字と変数iの値とindexNumber[i]の値を表示して改行
			System.out.println("elementNumber"+"[" + i + "]" +"=" + indexNumber[(i)]);
		}
	}
}

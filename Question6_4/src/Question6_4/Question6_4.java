package Question6_4;

import java.util.Random;
import java.util.Scanner;
/*
 * クラス名            :Question6_4
 * 概要                :縦向きの棒グラフを表示
 * 作成者             　:中西輝
 * 作成日              :2026.4.15
 */
public class Question6_4 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理で実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.15
	 */
	public static void main(String[] args) {
		//ランダムな数を入れる変数を作る
		Random randomNumber = new Random();
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//()の中の文字を表示
		System.out.print("要素数:");
		//変数入力値に入力した値を代入
		int inputNumber = standardInput.nextInt();
		//int型を構成要素とする配列要素数の作成
		int[]elementNumber = new int[inputNumber];
		//変数iが0から始まり1ずつ増やしていき入力値よりも多くなるまで繰り返す
		for(int i = 0; i < inputNumber; i++) {
			//変数elementNumber[i]に0-9までのランダム値に1を足した値をを代入
			elementNumber[i] = 1 + randomNumber.nextInt(10);
		}
		//変数iが0から始まり1ずつ増やしていき10よりも大きくなるまで繰り返す
		for(int i = 0; i < 10; i++) {
			//変数jが0から始まり1ずつ増やしていき入力値より大きくなるまで繰り返す
			for(int j = 0; j < inputNumber; j++) {
				//10-変数iがランダム値に1を足した数より大きい場合
				if(10 - i > elementNumber[j]) {
					//空白を表示
					System.out.print(" ");
				}	
				//それ以外
				else  {
					//*を表示
					System.out.print("*");
				}
			}
			//改行する
			System.out.println();
		}
		//()の文字を表示
		System.out.println("---------------------");
		//変数iが0から始まり1ずつ増やしていき入力値より大きくなるまで繰り返す
		for(int i = 0; i < inputNumber; i++) {
			//変数iを10で割った余剰を表示
			System.out.print(i % 10);
		}
	}
}

package Question6_6;

import java.util.Scanner;
/*
 * クラス名            :Question6_6
 * 概要                :テストの点数の合計、平均、最高、最低点を表示する
 * 作成者             　:中西輝
 * 作成日              :2026.4.16
 */
public class Question6_6 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理で実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.16
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//()の中の文字を表示
		System.out.print("人数は？ :");	
		//人数をキーボードで入力する
		int peopleNumber = standardInput.nextInt();
		//int型を構成要素とする配列要素数の作成
		int[] scoreNumber = new int[peopleNumber];
		//人数と""の中の文字を表示して改行
		System.out.println(peopleNumber + "人の点数を入力せよ。");
		//変数iを0から始めて1ずつ増やしていき人数の値になるまで繰り返す
		for(int i = 0; i < peopleNumber; i++) {
			//変数iに1を足した数と""の中の文字を表示
			System.out.print((i + 1) + "番の点数　:");
			//点数を入力する
			scoreNumber[i] = standardInput.nextInt();
		}
		/*　最高値に一人目の点数を代入
		 *  最低値に一人目の点数を代入
		 *  合計値に一人目の点数を代入
		 *  平均値に一人目の点数を代入
		 */ 
		int maxValue = scoreNumber[0];
		int mixValue = scoreNumber[0];
		int sumValue = scoreNumber[0];
		int averageValue = scoreNumber[0];
		//変数iを1から始めて1ずつ増やしていき人数の値になるまで繰り返す
		for(int i = 1; i < peopleNumber; i++) {
			//合計値にi人目の点数を足す
			sumValue += scoreNumber[i];
			//i人目の点数が最高値よりも大きい時
			if(scoreNumber[i] > maxValue) {
				//最高値にi人目の値を代入
				maxValue = scoreNumber[i];
			}
			//i人目の点数が最低値よりも小さい時
			if(scoreNumber[i] < mixValue) {
				//最低値にi人目の値を代入
				mixValue = scoreNumber[i];
			}
		}
		//""中の文とsumValueの値,sumValueの値から人数を割った値,maxValueの値,mixValueの値を表示して改行
		System.out.println("合計点は" + sumValue + "平均点は" + (double)sumValue / peopleNumber + "最高点は" + maxValue + "最低点は" + mixValue + "です。" );
	}
}

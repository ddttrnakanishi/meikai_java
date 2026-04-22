package Question7_8;

import java.util.Random;
/*
 * クラス名            :Question7_8
 * 概要                :乱数を生成し表示する
 * 作成者             　:中西輝
 * 作成日              :2026.4.21
 */
public class Question7_8 {
	/*
	 * 関数名           :random
	 * メソッドの説明   　:ランダム数1以上ランダム数2未満の乱数を生成して返却
	 * パラメータの説明　 :ランダム数１とランダム数２
	 * 返り値           :ランダム数１かランダム数１以上ランダム数２の値
	 * 作成者           :中西輝
	 * 作成日           :2026.4.21
	 */
	static int random(int randomValue1, int randomValue2) {
		//ランダムな数を入れる変数を作る
		Random randomNumber = new Random();
		//randomValue3の初期化
		int randomValue3 = 0;
		//ランダム数１の値よりランダム数２の値が大きい時
		if(randomValue1 < randomValue2) {
			//ランダム数1以上ランダム数2未満の乱数をrandomValue3に代入し	
			return randomValue3 = randomNumber.nextInt(randomValue2 - randomValue1) + randomValue1;		
		}
		//それ以外
		else {
			//randomValue1の値をrandomValue3に代入し返却
			return randomValue3 = randomValue1;
		}
	}
	/*
	 * 関数名           :main
	 * メソッドの説明  　 :0-99のランダムな数を出力しrandomのメソッドの結果を表示
	 * パラメータの説明 　:なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.21
	 */
	public static void main(String[] args) {
		//ランダムな数を入れる変数を作る
		Random randomNumber = new Random();
		//randomValue1に0-99のランダムな値を代入
		int randomValue1 = randomNumber.nextInt(100);
		//randomValue2に0-99のランダムな値を代入
		int randomValue2 = randomNumber.nextInt(100);
		//""の中の文字と返却値を表示して改行
		System.out.println("ランダムの数 :" + random(randomValue1, randomValue2));
	}
}
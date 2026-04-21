package Question7_6;

import java.util.Scanner;
/*
 * クラス名            :Question7_6
 * 概要                :引数monthNumberで指定された月の季節を表示するメソッドprintSeasonを表示する
 * 作成者             　:中西輝
 * 作成日              :2026.4.21
 */
public class Question7_6 {
	/*
	 * 関数名           :printSeason
	 * メソッドの説明   :入力された値の季節を表示
	 * パラメータの説明 :月の数字
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.21
	 */
	static void printSeason(int monthNumber) {
		//monthNumberが3,4,5のどれかの時
		if(monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
			//""の中の文字を表示して改行
			System.out.println("春");
		}
		//monthNumberが6,7,8のどれかの時
		else if(monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
			//""の中の文字を表示して改行
			System.out.println("夏");
		}
		//monthNumberが9,10,11のどれかの時
		else if(monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
			//""の中の文字を表示して改行
			System.out.println("秋");
		}
		//monthNumberが12,1,2のどれかの時
		else if(monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
			//""の中の文字を表示して改行
			System.out.println("冬");
		}
		//それ以外
		else {
			//改行
			System.out.println();
		}
	}
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.21
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示
		System.out.print("何月 :");
		//whatMonthに入力した値を代入
		int whatMonth = standardInput.nextInt();
		//printSeasonメソッドの呼び出し
		printSeason(whatMonth);
	}
}

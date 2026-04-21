package Question7_6;

import java.util.Scanner;
/*
 * クラス名            :Question7_6
 * 概要                :引数mで指定された月の季節を表示するメソッドprintSeasonを表示する
 * 作成者             　:中西輝
 * 作成日              :2026.4.21
 */
public class Question7_6 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理とmedianNumber処理
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.21
	 */
	static void printSeason(int m) {
		//mが3,4,5のどれかの時
		if(m == 3 || m == 4 || m == 5) {
			//""の中の文字を表示して改行
			System.out.println("春");
		}
		//mが6,7,8のどれかの時
		else if(m == 6 || m == 7 || m == 8) {
			//""の中の文字を表示して改行
			System.out.println("夏");
		}
		//mが9,10,11のどれかの時
		else if(m == 9 || m == 10 || m == 11) {
			//""の中の文字を表示して改行
			System.out.println("秋");
		}
		//mが12,1,2のどれかの時
		else if(m == 12 || m == 1 || m == 2) {
			//""の中の文字を表示して改行
			System.out.println("冬");
		}
		//それ以外
		else {
			//改行
			System.out.println();
		}
	}
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

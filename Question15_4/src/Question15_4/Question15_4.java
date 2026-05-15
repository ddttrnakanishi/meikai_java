package Question15_4;

import java.util.Scanner;
/*
 * クラス名            :Question15_4
 * 概要                :値を入力して少数以下や全体の桁数を合わせて表示する
 * @author             :中西輝
 * 作成日              :2026.5.15
 */
public class Question15_4 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :値を入力してprintDoubleメソッドの呼び出しを行う
	 * @param           :なし
	 * @return          :なし
	 * @author          :中西輝
	 * 作成日           :2026.5.15
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//xの初期化
		double x = 0;
		//pの初期化
		int p = 0;
		//wの初期化
		int w = 0;

		//""の中の文字を表示
		System.out.print("浮動小数点数値 :");
		//浮動小数点数値の入力
		x = standardInput.nextDouble();
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("小数点以下の桁数 :");
			//桁数の入力
			p = standardInput.nextInt();
			//pが0以下の場合繰り返す
		}while(p <= 0);
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("全体の桁数 :");
			//桁数の入力
			w = standardInput.nextInt();
			//wが0以下の場合繰り返す
		}while(w <= 0);
		//printDoubleメソッドの呼び出し
		printDouble(x, p, w);
	}
	/*
	 * 関数名　　：printDouble
	 * メソッド　：浮動小数点数値を小数点以下p桁、全体をw桁で表示する
	 * @param    ：浮動小数点数値、小数点以下の桁数、全体の桁数
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.5.15
	 */
	private static void printDouble(double x, int p, int w){
		//浮動小数点数値を小数点以下p桁、全体をw桁で表示する
		System.out.printf(String.format("%%%d.%df", w , p), x);
	}
}

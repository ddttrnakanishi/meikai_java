package Question10_2;

import java.util.Scanner;

/*
 * クラス名            :ExIdTester
 * 概要                :ExIdクラスの識別番号を作成しそれぞれの番号または変更した分の値を足した値を表示
 * 作成者              :中西輝
 * 作成日              :2026.4.30
 */
public class ExIdTester {
	//キーボードで入力した値を入れる変数を作る
		static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名           :main
	 * メソッドの説明   :ExIdクラスの識別番号を作成しそれぞれの番号または変更した分の値を足した値を表示
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.30
	 */
	public static void main(String[] args) {
		//""の中の文字を表示
		System.out.print("いくつの識別番号を見ますか :");
		//howManyの値を入力
		int howMany = standardInput.nextInt();
		//howManyの値を要素数とした配列の作成
		int[] arrayNumber = new int[howMany];
		//変数iを1から始めて1づつ増やしていきhowMany以上になるまで繰り返す
		for(int i = 1; i <= howMany; i++) {
			//ExIdクラスの識別番号の作成
			ExId numberOne = new ExId();
			//""の中の文字とnumberOneの返却値を表示して改行
			System.out.println("number" + i + "の識別番号 :" + numberOne.getInstanceCounter());
			//最後のループではない場合のみ、以下の処理を行う
		    if (i < howMany) {
			//インスタンスを生成
			ExId.changeNumber();
			}
		}
	}
}

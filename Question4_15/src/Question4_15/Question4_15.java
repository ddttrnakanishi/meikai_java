package Question4_15;

import java.util.Scanner;
/*
 * クラス名            :Question4_15
 * 概要                :読み込んだ値から標準体重を求める
 * 作成者             :中西輝
 * 作成日              :2026.4.9
 */
public class Question4_15 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理を実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.9
	 */
	public static void main(String[] args) {
		//キーボードで入力した値をいれる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//変数startHeightの初期化
		int startHeight = 0;
		//変数endHeightの初期化
		int endHeight = 0;
		//変数intervalValueの初期化
		int intervalValue = 0;
		//繰り返し
		do {
			//何cmから:と表示
			System.out.print("何cmから:");
			//変数startHeightに入力した値を代入
			startHeight = standardInput.nextInt();
		//入力した値が0より大きくなるまで繰り返し
		}while(startHeight <= 0);
		//繰り返し
		do {
			//何cmまで:と表示
			System.out.print("何cmまで:");
			//変数endHeightに入力した値を代入
			endHeight = standardInput.nextInt();
		//入力した値がendHeightより小さい場合繰り返す
		}while(startHeight > endHeight);
		//繰り返し
		do {
			//何cmごと:と表示
			System.out.print("何cmごと:");
			//変数intervalValueに入力した値を代入
			intervalValue = standardInput.nextInt();
		//入力した値が0より大きくなるまで繰り返し
		}while(intervalValue <= 0);
		//身長　標準体重と表示
		System.out.println("身長　標準体重");
		//startHeightから始めてstartHeightをintervalValueずつ増やしていきendHeight回繰り返す
		for(; startHeight <= endHeight ;startHeight += intervalValue) {
			//startHeightの値と標準体重の計算結果を表示
			System.out.println(startHeight + "   "+ (startHeight - 100) * 0.9);
		}
	}
}

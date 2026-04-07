package Question4_2;

import java.util.Random;
import java.util.Scanner;

/*
 * クラス名			:ensyu4_2
 * 概要    			:ランダムに出力された値を当てる
 * 作成者 			:中西輝
 * 作成日 			:2026.4.6
 * 関数名           :main
 * メソッドの説明   :～～
 * パラメータの説明 :なし
 * 返り値           :なし
 */

//Question4_2のクラス
public class Question4_2 {
	//関数ヘッダ
	public static void main(String[] args) {
		//ランダムな数の出力
		Random random = new Random();
		//キーボードからの入力
		Scanner standardInput = new Scanner(System.in);

		//0～89までの数字に10を足した数を変数numberに代入する
		int number = random.nextInt((90)+10);
		//数あてゲームを開始!!を表示する
		System.out.println("数あてゲーム開始!!");
		//"10～99の数を当ててください。を表示する
		System.out.println("10～99の数を当ててください。");
		//変数の初期化
		int value;{
			//繰り返し
			do {
				//いくつかなを表示する
				System.out.print("いくつかな;");
				//整数値を読み込む
				value = standardInput.nextInt();
				//変数numberよりも変数valueが大きい場合
				if (value>number) {
					//もっと小さい数字だよ。を表示する
					System.out.println("もっと小さい数字だよ。");
				}
				//変数valueよりも変numberが大きい場合
				else if (value<number) {
					//もっと大きい数字だよ。を表示する
					System.out.println("もっと大きい数字だよ。");
				}
			//valueがnumberでは無いとき繰り返す
			}while(value!= number);
			//正解です。を表示する
			System.out.println("正解です。");

		}	
	}
}

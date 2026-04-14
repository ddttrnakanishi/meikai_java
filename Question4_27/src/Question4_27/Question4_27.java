package Question4_27;

import java.util.Random;
import java.util.Scanner;
/*
 * クラス名            :Question4_27
 * 概要                :ランダムに出力された値を回数以内に当てる
 * 作成者             :中西輝
 * 作成日              :2026.4.14
 */
public class Question4_27 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理で実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.14
	 */
	public static void main(String[] args) {
		//ランダムな数の出力を入れる変数を作る
		Random randomNumber = new Random();
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//0～99までの数字を変数numberに代入する
		int displayNumber = randomNumber.nextInt(100);
		//数あてゲームを開始!!を表示する
		System.out.println("数あてゲーム開始!!");
		//"0～99の数を当ててください。を表示する
		System.out.println("0～99の数を当ててください。");
		//制限回数を決める:を表示
		System.out.print("制限回数を決める:");
		//変数timeNumberに入力した値を代入
		int  timeNumber = standardInput.nextInt();
		//変数answerNumberを初期化
		int answerNumber = 0;
		//変数breakNumberを初期化
		int breakNumber = 0;
		//変数をiをtimeNumberから始めて変数iを1ずつ減らしていき1以下になるまで繰り返す
		for(int i = timeNumber; i >= 1; i--) {
			//いくつかなを表示
			System.out.print("いくつかな:");
			//変数answerNumberに値を入力
			answerNumber = standardInput.nextInt();
			//変数displayNumberより変数answerNumberが大きい時
			if(answerNumber > displayNumber) {
				//もっと小さい数字だよ。を表示
				System.out.println("もっと小さい数字だよ。");
				//スキップする
				continue ;
				//変数answerNumberよりも変数displayNumberが大きい場合
			}else if (answerNumber <  displayNumber) { 
				//もっと大きい数字だよ。を表示する
				System.out.println("もっと大きい数字だよ。");
				//スキップする
				continue ;
				//変数answerNumber変数displayNumberが同じ値の時
			} else if (answerNumber == displayNumber)	{
				//変数breakNumberに1を代入する
				breakNumber = 1;
				//飛び出す
				break;
			}
		}
		//変数breakNumberが1の時
		if(breakNumber == 1) {
			//正解です。を表示
			System.out.println("正解です。");
			//それ以外
		}else{
			//答えは（displayNumberの値）です。を表示
			System.out.println("答えは"+displayNumber+"です。");
		}
	}
}


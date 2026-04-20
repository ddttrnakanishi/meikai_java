package Question6_15;

import java.util.Random;
import java.util.Scanner;
/*
 * クラス名 :Question6_15
 * 概要 :縦向きの棒グラフを表示
 * 作成者 　:中西輝
 * 作成日 :2026.4.18
 */
public class Question6_15 {
	/*
	 * 関数名 :main
	 * メソッドの説明 :メイン処理
	 * パラメータの説明 :なし
	 * 返り値 :なし
	 * 作成者 :中西輝
	 * 作成日 :2026.4.18
	 */
	public static void main(String[] args) {
		//ランダムに出される値を入れる変数を作る
		Random randomNumber = new Random();
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//String型を構成要型とする
		final String[] DAYENGLISH = {
				"monday", "tuesday", "wednesday",
				"thursday", "friday","saturday", "sunday"};
		//String型を構成要型とする
		final String[] DAYJAPANESE = { "月","火","水","木","金","土","日" };
		//""の中の文字を表示して改行
		System.out.println("英語の曜日名を小文字で入力してください。");
		//checkDayの初期化
		int checkDay = -1;
		//繰り返し
		while(true) {
			//randomDayに0-6のランダムに出された値を代入
			int randomDay = randomNumber.nextInt(7);
			//checkDayの値とrandomDayの値が同じの時
			if(checkDay == randomDay) {
				//スキップ
				continue;
			}
			//ランダムに選ばれた曜日を表示
			System.out.print(DAYJAPANESE[randomDay] + "曜日　:");
			//答えを入力
			String inputDay = standardInput.next();
			//選ばれた曜日の要素数と入力した要素数が同じ時			
			if (DAYENGLISH[randomDay].equals(inputDay)) {
				//""の中の文字を表示
				System.out.print("正解です。もう一度？　1...Yes/0...No :");
				//1or0を入力
				int onceNumber = standardInput.nextInt();
				//入力した値が1の時
				if(onceNumber == 1) {
					//変数checkDayにrandomDayの値を代入
					checkDay = randomDay ;
					//スキップ
					continue;
				}
				//それ以外
				else {
					//飛び出す
					break;
				}
			}
			//""の中の文字を表示
			System.out.println("違います。");
		}
	}
}




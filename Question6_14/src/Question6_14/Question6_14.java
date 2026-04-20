package Question6_14;

import java.util.Random;
import java.util.Scanner;
/*
 * クラス名            :Question6_14
 * 概要                :縦向きの棒グラフを表示
 * 作成者             　:中西輝
 * 作成日              :2026.4.17
 */
public class Question6_14 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.17
	 */
	public static void main(String[] args) {
		//ランダムに出される値を入れる変数を作る
		Random randomMonth = new Random();
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//String型を構成要素とする配列要素数の作成
		String[] MONTH_NUNBER1 = {
				"January","February","March","April","May","June","July",
				"August","September","October","November","December"};
		//""の中の文字を表示して改行
		System.out.println("英語の月名を入力してください\nなお、先頭は大文字で、2文字以降は小文字とします");
		//変数memoryNumberを初期化
		int memoryNumber = -1;
		//繰り返す
		while(true) {
			//変数answerMonthに0-11のランダムな数を代入
			int answerMonth = randomMonth.nextInt(12);
			//記憶した値とランダムに出された値が同じとき
			if(memoryNumber == answerMonth) {
				//記憶した値とランダムに出された値が同じとき繰り返す
				while(memoryNumber == answerMonth) {
					//arrayNumber[j]に0-9のランダムな数を代入
					answerMonth = randomMonth.nextInt(12);
				}
			}
			//ランダムに出力された値に+1した値と""の中の文字表示
			System.out.print(answerMonth + 1 + "月:");
			//英単語を入力
			String monthNumber2 = standardInput.next();
			//問題の月の英単語と入力した英単語が同じとき
			if((MONTH_NUNBER1[answerMonth]).equals(monthNumber2)) {
				//記憶した値に答えの月の値を代入
				memoryNumber = answerMonth;
				//""の中の文字を表示
				System.out.print("正解です。もう一度？　1…Yes/0…No :");
				//1or0を入力
				int oneTime = standardInput.nextInt();
				//1の時
				if(oneTime == 1) {
					//スキップ
					continue;
				}
				//それ以外
				else { 
					//飛び出す
					break;
				}
			}
			//""の中の文字を表示して改行
			System.out.println("違います。");
		}
	}
}


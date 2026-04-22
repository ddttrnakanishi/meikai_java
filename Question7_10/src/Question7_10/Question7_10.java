package Question7_10;

import java.util.Random;
import java.util.Scanner;
/*
 * クラス名             :Question7_10
 * 概要                 :四つの問題からランダムに出題される暗記ゲームの作成
 * 作成者             　:中西輝
 * 作成日               :2026.4.22
 */
public class Question7_10 {

	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名           　:confirmRtry
	 * メソッドの説明   　:もう一度行うか0,1を入力しfalse,trueを返却する
	 * パラメータの説明　 :なし
	 * 返り値          　 :false,true
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.22
	 */
	static boolean confirmRtry() {
		//onceAgainの初期化
		int onceAgain = 0;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("もう一度？<Yes…1/No…0> : ");
			//0,1を入力
			onceAgain = standardInput.nextInt();
			//0,1以外の場合繰り返す
		}while(onceAgain != 0 && onceAgain != 1);
		//1であればtrue、0であればfalseを返却
		return onceAgain == 1;
	}
	/*
	 * 関数名           　:main
	 * メソッドの説明   　:三桁のランダムな値を出力し四つの問題からランダムに設定し計算結果を入力し表示する
	 * パラメータの説明　 :なし
	 * 返り値          　 :なし
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.22
	 */
	public static void main(String[] args) {
		//ランダムに出力された値を入れる変数を作る
		Random randomNumber = new Random();
		//""の中の文字を表示して改行
		System.out.println("暗記力トレーニング！！");
		
		do {
			//三桁の値を代入
			int randomNumber1 = randomNumber.nextInt(900) + 100;
			//三桁の値を代入
			int randomNumber2 = randomNumber.nextInt(900) + 100;
			//三桁の値を代入
			int randomNumber3 = randomNumber.nextInt(900) + 100;
		//0-3のランダムな値を代入
		int questionNumber = randomNumber.nextInt(4);
		//答えを初期化
		int answerNumber = 1;
		//三つの値の計算結果を初期化
		int allAnswer = 0;
			//0-3の値のcaseを行う
			switch(questionNumber){
			//0の時
			case 0:
				//答えが一致しない場合繰り返す
				while(answerNumber != allAnswer) {
					//三つの値と""の中の文字を表示
					System.out.print(randomNumber1 + "+" + randomNumber2 + "+" + randomNumber3 + " = ");
					//答えを入力
					answerNumber = standardInput.nextInt();
					//計算結果を代入
					allAnswer = randomNumber1 + randomNumber2 + randomNumber3;
					//入力値と計算結果が同じとき
					if(answerNumber == allAnswer) {
						//飛び出す
						break;
					}
					//""の中の文字を表示して改行。
					System.out.println("違いますよ！！");
				}
				//飛び出す
				break;
				//1の時
			case 1:
				////答えが一致しない場合繰り返す
				while(answerNumber != allAnswer) {
					//三つの値と""の中の文字を表示
					System.out.print(randomNumber1 + "+" + randomNumber2 + "-" + randomNumber3 + " = ");
					//答えを入力
					answerNumber = standardInput.nextInt();
					//計算結果を代入
					allAnswer = randomNumber1 + randomNumber2 - randomNumber3;
					//入力値と計算結果が同じとき
					if(answerNumber == allAnswer) {
						//飛び出す
						break;
					}
					//""の中の文字を表示して改行。
					System.out.println("違いますよ！！");
				}
				//飛び出す
				break;
				//2の時
			case 2:
				////答えが一致しない場合繰り返す
				while(answerNumber!= allAnswer) {
					//三つの値と""の中の文字を表示
					System.out.print(randomNumber1 + "-" + randomNumber2 + "+" + randomNumber3 + " = ");
					//答えを入力
					answerNumber = standardInput.nextInt();
					//計算結果を代入
					allAnswer = randomNumber1 - randomNumber2 - randomNumber3;
					//入力値と計算結果が同じとき
					if(answerNumber == allAnswer) {
						//飛び出す
						break;
					}
					//""の中の文字を表示して改行。
					System.out.println("違いますよ！！");
				}
				//飛び出す
				break;
				//3の時
			case 3:
				////答えが一致しない場合繰り返す
				while(answerNumber!= allAnswer) {
					//三つの値と""の中の文字を表示
					System.out.print(randomNumber1 + "-" + randomNumber2 + "-" + randomNumber3 + " = ");
					//答えを入力
					answerNumber = standardInput.nextInt();
					//計算結果を代入
					allAnswer = randomNumber1 - randomNumber2 - randomNumber3;
					//入力値と計算結果が同じとき
					if(answerNumber == allAnswer) {
						//飛び出す
						break;
					}
					//""の中の文字を表示して改行。
					System.out.println("違いますよ！！");
				}
				//飛び出す
				break;
			}
		//trueの場合は繰り返す
		}while(confirmRtry());
	}
}




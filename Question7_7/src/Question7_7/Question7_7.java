package Question7_7;

import java.util.Scanner;
/*
 * クラス名            :Question7_7
 * 概要                :'*'を連続表示するメソッドputStarsを内部でメソッドputCharsを
 * 　　　　　　　　　　　呼び出すことによって表示を行う
 * 作成者             　:中西輝
 * 作成日              :2026.4.21
 */
public class Question7_7 {
	/*
	 * 関数名           :putChars
	 * メソッドの説明   :入力された段数の値が0以上の時文字を表示する
	 * パラメータの説明 :文字と段数
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.21
	 */
	static void putChars(char outputCharacter, int stageNumber) {
		//段数が0以上の時繰り返す
		while(stageNumber -- > 0) {
			//＊の表示
			System.out.print(outputCharacter);
		}
	}
	/*
	 * 関数名           :putStars
	 * メソッドの説明   :putCharsを呼び出す
	 * パラメータの説明 :段数
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.21
	 */
	static void putStars(int stageNumber) {
		//段数が0以上の時繰り返す
		while(stageNumber -- > 0) {
		//*を1個表示
		putChars('*', 1);
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
		//""の中の文字を表示して改行
		System.out.println("左下直角の三角形を表示します。");
		//""の中の文字を表示
		System.out.print("段数は :");
		//段数の値を入力
		int stageNumber = standardInput.nextInt();
		//変数iが1から始まり1ずつ増やしていき段数分繰り返す
		for(int i = 1; i <= stageNumber; i++) {
			//putStars(i)を呼び出す
			putStars(i);
			//改行
			System.out.println();	
		}
	}
}

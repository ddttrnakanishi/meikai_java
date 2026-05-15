package Question15_2;

import java.util.Scanner;
/*
 * クラス名            :PrintCode
 * 概要                :文字を入力して文字コードで表示する
 * @author             :中西輝
 * 作成日              :2026.5.14
 */
public class PrintCode {
	/*
	 * 関数名           :main
	 * メソッドの説明   :文字を入力して文字コードで表示する
	 * @param           :なし
	 * @return          :なし
	 * @author          :中西輝
	 * 作成日           :2026.5.14
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示
		System.out.print("文字列s :");
		//文字を入力
		String inputString = standardInput.next();
		//変数iを0から始めて1ずつ増やしていき文字の長さ分繰り返す
		for(int i = 0; i < inputString.length(); i++) {
			//""の中の文字とiの値と文字コードを表示して改行
			System.out.printf("s[" + i + "] = %x\n", inputString.codePointAt(i));
		}
	}
}


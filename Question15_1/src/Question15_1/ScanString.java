package Question15_1;

import java.util.Scanner;
/*
 * クラス名            :ScanString
 * 概要                :文字を入力して逆順で表示する
 * @author             :中西輝
 * 作成日              :2026.5.14
 */
public class ScanString {
	/*
	 * 関数名           :main
	 * メソッドの説明   :文字を入力して逆順で表示する
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
		//変数iを文字の長さ-1から始めて1ずつ減らしていき0以上の間繰り返す
		for(int i = inputString.length() -1; i >= 0; i--) {
			//""の中の文字とiの値と文字を表示して改行
			System.out.println("s[" + i + "] = " + inputString.charAt(i));
		}
	}
}

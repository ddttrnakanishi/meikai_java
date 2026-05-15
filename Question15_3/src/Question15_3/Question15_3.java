package Question15_3;

import java.util.Scanner;
/*
 * クラス名            :Question15_3
 * 概要                :文字入力をしたのち文字探索をして上下で揃うように表示する
 * @author             :中西輝
 * 作成日              :2026.5.14
 */
public class Question15_3 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :文字入力をしたのち文字探索をして上下で揃うように表示する
	 * @param           :なし
	 * @return          :なし
	 * @author          :中西輝
	 * 作成日           :2026.5.14
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示
		System.out.print("文字列s1 :");
		//文字を入力
		String inputString1 = standardInput.next();
		//""の中の文字を表示
		System.out.print("文字列s2 :");
		//文字を入力
		String inputString2 = standardInput.next();
		//inputString1にinputString2が含まれているのか確認する
		int idx = inputString1.indexOf(inputString2);
		//含まれていない時
		if(idx == -1) {
			//""の中の文字を表示して改行
			System.out.println("s1中にs2は含まれません。");
		}
		//それ以外
		else {
			//文字を表示して改行
			System.out.println(inputString1);
			//iを0から始めて1ずつ増やしていき含まれている箇所まで繰り返す
			for(int i = 0; i < idx; i++) {
				//空白の表示
				System.out.print(' ');
			}

			//文字を表示して改行
			System.out.println(inputString2);
		}
	}
}


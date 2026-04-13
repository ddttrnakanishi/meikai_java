package Question4_10;

import java.util.Scanner;
/*
 * クラス名            :Question4_10
 * 概要                :読み込んだ値の個数だけ記号を入力するプログラム
 * 作成者             :中西輝
 * 作成日              :2026.4.8
 */
public class Question4_10 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :～
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.8
	 */
	public static void main(String[] args) {
		//キーボードに入力された値を読み込むための変数を作る
		Scanner standardInput = new Scanner(System.in);
		//変数inputValueの初期化
		int inputValue = 0;
		//何個表示しますかを表示
		System.out.print("何個表示しますか:");
		//ユーザーが入力した値を変数に代入
		inputValue = standardInput.nextInt();
		//変数iを1から初めて1つずつ増やしながらinputValue回繰り返す
		for(int i = 1 ; i <= inputValue ; i++)	
			//*を表示する
			System.out.print("*");
		//改行
		System.out.println();
	}
}


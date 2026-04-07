package Question4_6_2;

import java.util.Scanner;
/*
 * クラス名			:ensyu4_6_2
 * 概要    			:読み込んだ値が1未満の場合改行文字を出力しないプログラム
 * 作成者 			:中西輝
 * 作成日  			:2026.4.7
 * 関数名           :main
 * メソッドの説明   :～～
 * パラメータの説明 :なし
 * 返り値           :なし
 */
// Question4_6のクラス

public class Question4_6_2 {

	public static void main(String[] args) {
		//キーボードで入力
		Scanner standardInput = new Scanner(System.in);

		//何個*を表示しますかを表示
		System.out.print("何個*を表示しますか:");
		//変数nに値を入力
		int n = standardInput.nextInt();

		//変数iの初期化
		int i = 1;
		//変数iより変数nが大きい場合繰り返し
		while(i<=n) {
			//*を表示
			System.out.print("*");
			//変数iに+1をする
			++i;
		}

	}}

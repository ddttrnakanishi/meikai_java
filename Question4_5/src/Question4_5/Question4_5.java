package Question4_5;

import java.util.Scanner;

/*
 * クラス名			:ensyu4_5
 * 概要    			:p102のx--が--xの場合どのような値が出力されるか
 * 作成者 			:中西輝
 * 作成日  			:2026.4.7
 * 関数名           :main
 * メソッドの説明   :～～
 * パラメータの説明 :なし
 * 返り値           :なし
 */
// Question4_5のクラス
public class Question4_5 {
	//関数ヘッダ
	public static void main(String[] args) {
		//キーボードで入力
		Scanner standardInput = new Scanner(System.in);

		//カウントダウンをしますを表示
		System.out.println("カウントダウンをします。");
		//変数valueXの初期化
		int valueX = 0;
		//繰り返し
		do {
			//正の整数値:を表示
			System.out.print("正の整数値:");
			//valueXの値を入力
			valueX = standardInput.nextInt();
		 //valueXの値が0より小さいとき繰り返し
		}while(valueX<=0);
		//valueXの値が0より大きい場合
		while(valueX>=0) {
			//valueXの値を-1してからvalueXの値を表示
			System.out.println(--valueX);
		}


	}

}

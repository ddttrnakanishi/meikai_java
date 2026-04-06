package Question4_1;

import java.util.Scanner;

/*
 * クラス名:ensyu4_1
 * 概要    :整数値が正か負の値であるかを繰り返し調べる
 * 作成者  :中西輝
 * 作成日  :2026.4.6
 * 関数名           :main
 * メソッドの説明   :～～
 * パラメータの説明 :なし
 * 返り値           :なし
 */

//Question4_1のクラス
public class Question4_1 {
	//関数ヘッダ
	public static void main(String[] args) {
		//キーボードからの入力
		Scanner standardInput = new Scanner(System.in);
		//変数の初期化
		int value ;
		//繰り返し
		do {
			//整数値の入力を促す
			System.out.print("整数値:");
			//変数に整数値を読み込む
			int inputNumber = standardInput.nextInt();
			//入力値が0より大きい場合
			if (inputNumber>0)
				//その値は正と表示する
				System.out.println("その値は正です。");
			//それ以外
			else 
				//その値は負と表示する
				System.out.println("その値は負です。");
			//もう一度？1…Yes/0…Noと表示する
			System.out.print("もう一度? 1…Yes/0…No :");
			//
			value = standardInput.nextInt();
		//1と表示される場合繰り返す
		}while(value==1);

	}

}

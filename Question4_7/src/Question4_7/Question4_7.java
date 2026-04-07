package Question4_7;

import java.util.Scanner;
/*
 * クラス名			:ensyu4_7
 * 概要    			:読み込んだ値の個数だけ記号を入力するプログラム
 * 作成者 			:中西輝
 * 作成日  			:2026.4.7
 * 関数名           :main
 * メソッドの説明   :～～
 * パラメータの説明 :なし
 * 返り値           :なし
 */
// Question4_7のクラス
public class Question4_7 {
	//関数ヘッダ
	public static void main(String[] args) {
		//キーボードで入力
		Scanner standardInput = new Scanner(System.in);
		//何個表示しますかを表示
		System.out.print("何個表示しますか:");
		//firstvalueに値を入力
		int firstvalue = standardInput.nextInt();
		//変数secondvalueの初期化
		int secondvalue = 0;
		//繰り返し
		do {
			//firstvalueがsecondvalueよりも大きい場合
			if(firstvalue>secondvalue) {
				//*を表示する
				System.out.print("*");
				//secondvalueに+1をする
				secondvalue++;
			}
			//firstvalueがsecondvalueよりも大きい場合
			if(firstvalue>secondvalue) {
				//+を表示する
				System.out.print("+");
				//secondvalueに+1をする
				secondvalue++;
			}
		//
		}while(firstvalue>secondvalue);
		

	}

}

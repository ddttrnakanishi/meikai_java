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
		//変数secondvalueにfirstvalueを代入
		int secondvalue = firstvalue ;
		
		//繰り返し
		do {
			//secondvalueが奇数の場合
			if(secondvalue%2==1) {
				//*を表示する
				System.out.print("*");
			}
			//secondvalueが偶数の場合
			 else if (secondvalue%2==0){
				//+を表示する
				System.out.print("+");
			}
			//secondvalue-1
			secondvalue--;
		//secondvalueが0より大きい場合は繰り返す
		}while(secondvalue>0);
		

	}

}

package Question4_4;

import java.util.Scanner;
/*
 * クラス名			:ensyu4_4
 * 概要    			:while文終了時にxの値が-1になることを確認する
 * 作成者 			:中西輝
 * 作成日  			:2026.4.7
 * 関数名           :main
 * メソッドの説明   :～～
 * パラメータの説明 :なし
 * 返り値           :なし
 */
// Question4_4のクラス
public class Question4_4 {
	//関数ヘッダ
	public static void main(String[] args) {
		//キーボードで入力
		Scanner standardInput = new Scanner(System.in);
		//カウントダウンをしますを表示
		System.out.println("カウントダウンをします。");
		//変数xの宣言
		int  x;
		//繰り返し
		do {
			//正の整数値:を表示
			System.out.print("正の整数値:");
			//xの値を入力
			x = standardInput.nextInt();
			//xの値が0以下である場合繰り返す
		} while(x<=0);

		//xの値が-1以上の場合繰り返す
		while(x>=-1){
			//xの値を表示する
			System.out.println(x);
			//xの値から-1をする
			x--;
		}



	}


}



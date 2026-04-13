package Question4_3;

import java.util.Scanner;

/*
 * クラス名			:Question4_3
 * 概要    			:二つの整数値を読み込み小さいほうの数以上から大きいほうの数以下までの数値を小さいほうから出力する
 * 作成者 			:中西輝
 * 作成日  			:2026.4.6
 * 関数名           :main
 * メソッドの説明   :～
 * パラメータの説明 :なし
 * 返り値           :なし
 */

//Question4_3のクラス
public class Question4_3 {
	//関数ヘッダ
	public static void main(String[] args) {
		//キーボードからの入力
		Scanner standardInput = new Scanner(System.in);
		//整数A:を表示する
		System.out.print("整数A:");
		//一つ目変数の値を入力する
		int firstvalue = standardInput.nextInt();
		//整数B:を表示する
		System.out.print("整数B:");
		//二つ目変数の値を入力する
		int secondvalue = standardInput.nextInt();
		//変数min,maxの初期化
		int min,max = 0;

		//一つ目の値が二つ目の値よりも大きい場合
		if (firstvalue >= secondvalue) {
			//変数minにsecondvalueを代入
			min = secondvalue;
			//変数maxにfirstvalueを代入
			max = firstvalue;
		}
		//二つ目の値が一つ目の値よりも大きい場合
		else {
			//変数minにfirstvalueを代入
			min = firstvalue;
			//変数maxにsecondvalueを代入
			max = secondvalue;
		}

		//繰り返し
		do {
			//minよりmaxが大きい場合
			if (min <= max) {
				//minの値を表示する
				System.out.print(min);
				//minに+1を足す
				min += 1;
			}
			//minの値がmaxの値と一致するまで繰り返す
		}while(max >= min );

	}
}
package Question4_24;

import java.util.Scanner;
/*
 * クラス名            :Question4_24
 * 概要                :素数であるかを判断する
 * 作成者             :中西輝
 * 作成日              :2026.4.14
 */
public class Question4_24 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理で実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.14
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//素数であるかを表示
		System.out.println("素数であるか");
		//正の整数値を表示
		System.out.print("正の整数値:");
		//変数inputValueの初期化
		int inputValue = standardInput.nextInt();
		//変数divideNumberの初期化
		int divideNumber = 0;
		//変数iが2から始まり1ずつ増やしていき入力した値未満になるまで繰り返す
		for(int i = 2; i < inputValue; i++) {
			//変数inputValueを変数iで割った余剰が0の時
			if(inputValue % i == 0) {
				//変数divideNumberに1を代入
				divideNumber = 1;
				//飛び出す
				break;
			}
		}
		//変数divideNumberが1の場合
		if(divideNumber == 1) {
			//素数ではないと表示
			System.out.println(inputValue +"は素数ではない");
		}
		//それ以外
		else {
			//素数であると表示
			System.out.println(inputValue +"は素数である");
		}
	}
}


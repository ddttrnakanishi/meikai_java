package Question4_13;

import java.util.Scanner;
/*
 * クラス名            :ensyu4_13
 * 概要                :1から
 * 作成者             :中西輝
 * 作成日              :2026.4.9
 */

public class Question4_13 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :～～
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.9
	 */
	public static void main(String[] args) {
		//キーボードで入力する値を読み込む変数を作る
		Scanner standardInput = new Scanner(System.in);
		//1からinputNumberまでの和を求めます:を表示
		System.out.println("1からinputNumberまでの和を求めます:");
		//変数inputNumberの初期化
		int inputNumber = 0;
		//繰り返し
		do {
			//inputNumberの値:を表示
			System.out.print("inputNumberの値:");
			//変数inputNumberに入力した値を代入
			inputNumber = standardInput.nextInt();
			//inputNumberが0以上になるまで繰り返す
		}while(inputNumber < 0);
		//変数sumNumberの初期化
		int sumNumber = 0;
		//変数iを1から始めて変数iを1ずつ増やしていきinputNumber回繰り返す
		for(int i = 1;i <= inputNumber; i ++)
			//sumNumberにiを足す
			sumNumber += i;
		//1から inputNumberまでの和はsumNumberです。と表示する
		System.out.println("1から" + inputNumber+"までの和は"+sumNumber+"です。");
		
		

	}

}

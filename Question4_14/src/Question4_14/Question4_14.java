package Question4_14;
import java.util.Scanner;
/*
 * クラス名            :ensyu4_14
 * 概要                :1から inputNumberまでの値を足し式を表示するプログラム
 * 作成者             :中西輝
 * 作成日              :2026.4.9
 */

public class Question4_14 {
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
		//変数iを1から始めて変数iを1ずつ増やしていきinputNumber回繰り返す
		for(int i = 1; i <= inputNumber ;i++)
			//変数iの値と+を表示
			System.out.print(i+"+");
		//=と変数sumNumberを表示
		System.out.println("="+ sumNumber);


	}

}

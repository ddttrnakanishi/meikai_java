package Question4_17;

import java.util.Scanner;
/*
 * クラス名            :Question4_17
 * 概要                :読み込んだ整数値のすべての約数を表示
 * 作成者             :中西輝
 * 作成日              :2026.4.10
 */
public class Question4_17 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理を実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.10
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を読み込む変数を作る
		Scanner standardInput = new Scanner(System.in);
		//変数firstNumberの初期化
		int firstNumber = 0;
		//繰り返し
		do {
			//整数値を表示
			System.out.print("整数値:");
			//変数firstNumberに入力した値を代入
			firstNumber = standardInput.nextInt();
		//変数firstNumberが0以下の場合繰り返す
		}while(firstNumber <= 0);
		//変数sumNumberの初期化
		int sumNumber = 0;
		//変数iが1から始まり1ずつ増やしたときfirstNumber回繰り返す
		for(int i = 1;i <= firstNumber;i++) {
			//変数firstNumberをiで割ったときの余りが0の場合
			if(firstNumber % i == 0) {
				//変数iの値を表示
				System.out.println(i);
				//変数sumNumberに+1をする
				sumNumber ++;
			}
		}
		//約数はsumNumber個です。と表示
		System.out.println("約数は"+sumNumber+"個です。");
	}
}

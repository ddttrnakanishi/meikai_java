package Question4_9;

import java.util.Scanner;

/*
 * クラス名            :ensyu4_9
 * 概要                :読み込んだ値の個数だけ記号を入力するプログラム
 * 作成者             :中西輝
 * 作成日              :2026.4.8
 */
public class Question4_9 {
	 /*
     * 関数名           :main
     * メソッドの説明   :～～
     * パラメータの説明 :なし
     * 返り値           :なし
     * 作成者             :中西輝
     * 作成日              :2026.4.8
     */
	public static void main(String[] args) {
		//キーボードに入力された値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//変数inputValueの初期化
		int inputValue = 0;
		//繰り返し
		do {
			//nの値:を表示する
			System.out.print("nの値:");
			//ユーザーが入力した値を変数に代入する
			inputValue =standardInput.nextInt();
		//入力した値が0より小さい場合繰り返す
		}while( inputValue <= 0 );	
		//変数maxNumberの初期化
		int maxNumber =1;
		//変数iの初期化
		int i = 1;
		//変数iより入力した値が大きい時繰り返す
		while( i <= inputValue){
			//変数maxNumberに変数iをかける
			maxNumber *= i ;
			//変数iに+1をする
			 i++;
		}
		//1からinputValueまでの積はmaxNumberです。と表示する
		System.out.println("1から"+inputValue+"までの積は"+maxNumber+"です。");
		

	}

}

package Question4_8;

import java.util.Scanner;

/*
 * クラス名            :ensyu4_8
 * 概要                :読み込んだ値の個数だけ記号を入力するプログラム
 * 作成者             :中西輝
 * 作成日              :2026.4.7
 */
public class Question4_8 {
	 /*
     * 関数名           :main
     * メソッドの説明   :～～
     * パラメータの説明 :なし
     * 返り値           :なし
     * 作成者             :中西輝
     * 作成日              :2026.4.7
     */
	public static void main(String[] args) {
		//キーボードに入力された値を読み込むための変数を作る
		Scanner standardInput = new Scanner(System.in);
		
		//firstValueはint型の変数
		int firstValue = 0;
		//繰り返し
		do {
			//整数値を表示
			System.out.print("整数値:");
			//firstValueに数値を入力
			firstValue = standardInput.nextInt();
		//firstValueが0以下の場合繰り返す
		}while(firstValue<=0);
		
		//変数dividedNumberの宣言
		int  dividedNumber = firstValue;
		//変数numberTimesの初期化
		int numberTimes = 0;
		//firstValueが0より大きい場合繰り返す
		while(dividedNumber>0) {
			//dividedNumberはfirstValueを10で割った数
			dividedNumber = firstValue/=10;
			//numberTimesに+1する
			numberTimes++;
			
		}
		//その値は"+numberTimes+"です。と表示する
		System.out.println("その値は"+numberTimes+"桁です。");
		
		
		
		
		
		
		

	}

}

package Question4_8;

import java.util.Scanner;

/*
 * クラス名            :ensyu4_7
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
		
		//firstvalueはint型の変数
		int firstvalue;
		//繰り返し
		do {
			//整数値を表示
			System.out.print("整数値:");
			//firstvalueに数値を入力
			firstvalue = standardInput.nextInt();
		//firstvalueが0以下の場合繰り返す
		}while(firstvalue<=0);
		
		//変数dividednumberの宣言
		int  dividednumber = firstvalue;
		//変数numbertimesの初期化
		int numbertimes = 0;
		//firstvalueが0より大きい場合繰り返す
		while(dividednumber>0) {
			//dividednumberはfirstvalueを10で割った数
			dividednumber = firstvalue/=10;
			//numbertimesに+1する
			numbertimes++;
			
		}
		//その値は"+numbertimes+"です。と表示する
		System.out.println("その値は"+numbertimes+"桁です。");
		
		
		
		
		
		
		

	}

}

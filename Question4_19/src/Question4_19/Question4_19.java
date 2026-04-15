package Question4_19;

import java.util.Scanner;
/*
 * クラス名            :Question4_19
 * 概要                :1-12の時は季節を1-12以外の値が入力された際に再入力させるプログラム
 * 作成者             :中西輝
 * 作成日              :2026.4.10
 */
public class Question4_19 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理で実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.10
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を読み込む変数を作る
		Scanner standardInput = new Scanner(System.in);
		//もう一度繰り返すかを管理する値の初期化
		int onceAgain = 0;
		//ユーザーが入力した月の値の初期化
		int whatMonth = 0;
		//繰り返し
		do {
			//繰り返し
			do {
				//季節を求めます。\n何月ですか:を表示
				System.out.print("季節を求めます。\n何月ですか:");
				//ユーザーが入力した月の値に入力した値を代入
				whatMonth = standardInput.nextInt();
			//入力した値が1未満または12より大きい時繰り返す
			}while(whatMonth < 1 && whatMonth > 12);
			//5以下または3以上の時
			if(whatMonth >= 3 && whatMonth <= 5) {
				//それは春ですと表示
				System.out.println("それは春です。");
			}
			//8以下または6以上の時
			else if(whatMonth >= 6 && whatMonth <= 8) {
				//それは夏ですと表示
				System.out.println("それは夏です。");
			}
			//11以下または9以上の時
			else if(whatMonth >= 9 && whatMonth <= 11) {
				//それは秋ですと表示
				System.out.println("それは秋です。");
			}
			//12,1,2のいずれかの時
			else if(whatMonth == 12 || whatMonth == 1 ||  whatMonth == 2) {
				//それは冬ですと表示
				System.out.println("それは冬です。");
			}
			//もう一度？1…yes/0…no : と表示
			System.out.print("もう一度？1…yes/0…no : ");
			//もう一度繰り返すかを管理する値に入力した値を代入
			onceAgain = standardInput.nextInt();
		//もう一度繰り返すかを管理する値が1の時繰り返す
		}while(onceAgain == 1);
	}
}



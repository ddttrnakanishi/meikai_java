package Question4_16;

import java.util.Scanner;
/*
 * クラス名            :Question4_16
 * 概要                :読み込んだだけ*を表示するプログラム
 * 作成者             :中西輝
 * 作成日              :2026.4.10
 */
public class Question4_16 {
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
		//変数displayNumberの初期化
		int displayNumber = 0;
		//繰り返す
		do {
			//何個*を表示しますか:を表示
			System.out.print("何個*を表示しますか:");
			//変数displayNumberに値を入力する
			displayNumber = standardInput.nextInt();
			//0未満の時繰り返す
		}while(displayNumber < 0);
		//変数iを1から始めて変数iを1ずつ増やしていきdisplayNumber回繰り返す
		for(int i = 1 ; i <= displayNumber ;i++) {
			//*を表示
			System.out.print("*");
			//変数i割る5の余りが0の場合
			if (i % 5 == 0){
				//改行する
				System.out.println();			
			}
		}
	}
}

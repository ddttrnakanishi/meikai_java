package Question6_12;

import java.util.Random;
import java.util.Scanner;
/*
 * クラス名            :Question6_12
 * 概要                :配列の並びをシャッフルする
 * 作成者             　:中西輝
 * 作成日              :2026.4.16
 */
public class Question6_12 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理で実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.16
	 */
	public static void main(String[] args) {
		//ランダムに出される値を入れる変数を作る
				Random randomNumber = new Random();
				//キーボードで入力した値を入れる変数を作る
				Scanner standardInput = new Scanner(System.in);
				//要素数は12である
				int elementNumber = standardInput.nextInt();
				//int型を構成要素とする配列要素数の作成
				int[] arrayNumber = new int[elementNumber];
				//変数jの初期化
				int j = 0;
				//変数boxNumberの初期化
				int boxNumber = 0;		
				//変数jが0から始まり1ずつ増やしていき1入力値より大きくなるまで繰り返す
				for (j = 0; j < elementNumber; j++) {
					//0から9までのランダムのランダム数をarrayNumber[j]に代入
					arrayNumber[j] = randomNumber.nextInt(10);

	}

}

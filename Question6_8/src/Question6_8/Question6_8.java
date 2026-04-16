package Question6_8;

import java.util.Scanner;
/*
 * クラス名            :Question6_8
 * 概要                :double型の配列の全要素の合計と平均を求める
 * 作成者             　:中西輝
 * 作成日              :2026.4.16
 */
public class Question6_8 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理で実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.16
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//()の中の文字を表示
		System.out.print("要素数は？ :");	
		//要素数をキーボードで入力する
		int  elementNumber = standardInput.nextInt();
		//double型を構成要素とする配列要素数の作成
		double [] indexNumber = new double[elementNumber];
		////変数iが0から始まり1ずつ増やしていき入力した値より大きくなるまで繰り返す
		for(int i = 0; i < elementNumber; i++) {
			//""の中の文字と変数iの値を表示
			System.out.print("elementNumber"+"[" + i + "]" +"=");
			//全要素の値を入力
			indexNumber[i] = standardInput.nextInt();
		}
		//合計値を初期化
		double sumNumber = 0;
		//配列を先頭から末尾まで1つ走査する
		for(double i : indexNumber) {
			//合計値に入力した要素値を足す
			sumNumber += i;
		}
		//""の中の文字と合計の値と平均の値を表示して改行
		System.out.println("全要素の合計は" + sumNumber +"平均は" + sumNumber / elementNumber + "です。");
	}
}

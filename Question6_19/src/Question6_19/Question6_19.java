package Question6_19;

import java.util.Scanner;
/*
 * クラス名            :Question6_19
 * 概要                :クラスの数、各クラスの人数、全員の点数を読み込んで点数の合計と平均点を求める
 * 作成者             　:中西輝
 * 作成日              :2026.4.20
 */
public class Question6_19 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.20
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//int型を構成要素型とする配列を構成要素型とする配列の宣言
		int[][] arrayNumber;
		//""の中の文字を表示
		System.out.print("クラスの数 :");
		//クラスの数を入力する
		int classSize = standardInput.nextInt();
		//構成要素型がint型で構成要素数が入力した値の配列
		arrayNumber = new int[classSize][];
		//int型を構成要素型とする配列の作成
		int[] arrayPeople = new int [classSize];
		//classPeopleを初期化
		int classPeople = 0;
		//変数iを0から始めて1ずつ増やしていきクラスの数の値より大きくなるまで繰り返す
		for(int i = 0; i < classSize; i++) {
			//変数iに+1した値と""の中の文字を表示
			System.out.print((i + 1) + "組の人数 :");
			//クラスの人数を入力
			classPeople = standardInput.nextInt();
			//int型を構成要素型とする配列の作成
			arrayNumber[i] = new int[classPeople];
			//変数jを0から始めて1ずつ増やしていきクラスの人数の値より大きくなるまで繰り返す
			for(int j = 0; j < classPeople; j++) {
				//変数iに+1した値と変数jに+1した値と""の中の文字を表示
				System.out.print((i + 1) + "組" + (j + 1) + "番の点数 :");
				//点数を入力する
				arrayNumber[i][j] = standardInput.nextInt();
			}
			//改行
			System.out.println();
		}
		//""の中の文字を表示して改行
		System.out.println("  組 |    合計    平均");
		//""の中の文字を表示して改行
		System.out.println("-----+-------------------");
		//allPeopleの初期化
		int allPeople = 0;
		//sumNumberの初期化
		int sumNumber = 0;
		//sumNumber2の初期化
		int sumNumber2 = 0;
		//変数iが0から始まり1ずつ増やしていきクラスの数の値になるまで繰り返す
		for(int i = 0; i < arrayNumber.length; i++) {
			//sumNumberに0を代入
			sumNumber = 0;
			//変数jが0から始まり1ずつ増やしていきクラスの人数分繰り返す
			for(int j = 0; j < arrayNumber[i].length; j++) {
				//allPeopleに+1をする
				allPeople++;
				//合計値に点数を足す
				sumNumber += arrayNumber[i][j];
				//合計値に点数を足す
				sumNumber2 += arrayNumber[i][j];
			}
			//""の中の文字と組数の値と合計と平均を表示する
			System.out.printf("%d 組 |    %d    %.1f\n",(i + 1), sumNumber, (double)sumNumber / arrayNumber[i].length);
		}
		//""の中の文字を表示して改行
		System.out.println("-----+-------------------");
		//""の中の文字と全体の合計と平均を表示する
		System.out.printf("  計 |    %d    %.1f\n",sumNumber2, (double)sumNumber2 / allPeople);
	}	

}		
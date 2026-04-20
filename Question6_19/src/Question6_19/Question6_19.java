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
		Scanner standardInput = new Scanner(System.in);
		//int型を構成要素型とする配列を構成要素型とする配列の宣言
		int[][] arrayNumber;
		//""の中の文字を表示
		System.out.print("クラスの数 :");
		//行数を入力する
		int classSize = standardInput.nextInt();
		arrayNumber = new int[classSize][];
		int i = 0;
		int[] arrayPeople = new int [classSize];
		int classPeople = 0;
		for(i = 0; i < classSize; i++) {
			System.out.print((i + 1) + "組の人数 :");
			classPeople = standardInput.nextInt();
			arrayNumber[i] = new int[classPeople];
			for(int j = 0; j < classPeople; j++) {
				System.out.print((i + 1) + "組" + (j + 1) + "番の点数 :");
				int peopleScore = standardInput.nextInt();

				arrayNumber[i][j] = peopleScore;

			}
			System.out.println();
		}
		System.out.println("  組 |    合計    平均");
		System.out.println("-----+-------------------");
		int a =0;
		int b = 0;
		for( i = 0; i < arrayNumber.length; i++) {
			for( int j = 0; j < arrayNumber[i].length; j++) {
				b++;
				a += arrayNumber[i][j];
				System.out.println((i + 1) +" 組 |    " + arrayNumber[i][j] +"    " + (double)arrayNumber[i][j] / arrayNumber[i].length);
			}
			System.out.println("-----+-------------------");
			System.out.println("  計 |    " + a + "    " + (double)a / b);
		}
	}	
}		


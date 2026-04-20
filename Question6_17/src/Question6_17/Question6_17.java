package Question6_17;

import java.util.Scanner;
/*
 * クラス名            :Question6_17
 * 概要                :6人の生徒の国語と数学の点数を入力し、科目ごとの平均点と生徒の平均点を表示する
 * 作成者             　:中西輝
 * 作成日              :2026.4.19
 */
public class Question6_17 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.19
	 */
	public static void main(String[] args) {
		//キーボードで入力する値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//int型を構成要素型とする配列を構成要素型とする配列の宣言
		int [][] resultMatrix = new int[2][6];
		//String型を構成要素型とする配列の宣言
		String[] SUBJECTSCORE = {"国語","数学"};
		//変数iを0から始めて1ずつ増やしていき2になるまで繰り返す(科目)
		for(int i = 0; i < 2; i++) {
			//変数jを0から始めて1ずつ増やしていき6になるまで繰り返す(人数)
			for(int j = 0; j < 6; j++) {
				//""の中の文字と配列SUBJECTSCOREがiの時の文字と変数iと変数jの値を表示
				System.out.print(j + 1 + "人目の" + SUBJECTSCORE[i] + "resultMatrix["+ i +"]"+"["+ j +"] =" );
				//resultMatrix[i][j]に値を入力
				resultMatrix[i][j] = standardInput.nextInt();
			}
		}
		//改行
		System.out.println();
		//変数iを0から始めて1ずつ増やしていき2になるまで繰り返す(科目)
		for(int i = 0; i < 2; i++) {
			int sumSubject = 0;
			//変数jを0から始めて1ずつ増やしていき6になるまで繰り返す(人数)
			for(int j = 0; j < 6; j++) {
				//科目ごとの全員の合計を計算
				sumSubject += resultMatrix[i][j];
			}
			//""の中の文字と配列SUBJECTSCOREがiの時の文字と科目ごとの平均を計算し表示して改行
			System.out.println(SUBJECTSCORE[i] + "の平均は" + (double)sumSubject / 6);
		}
		//変数iを0から始めて1ずつ増やしていき1になるまで繰り返す(科目)
		for(int i = 0; i < 1; i++) {
			//変数jを0から始めて1ずつ増やしていき6になるまで繰り返す(人数)
			for(int j = 0; j < 6; j++) {
				//""の中の文字と1人ずつ２科目の平均を表示して改行
				System.out.println(j + 1 + "人目の平均" + (double)(resultMatrix[i][j] + resultMatrix[i + 1][j]) / 2);	
			}
		}
	}
}



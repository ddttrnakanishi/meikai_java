package 添削用;

//import java.util.Random;
import java.util.Scanner;

public class 添削用 {

	public static void main(String[] args) {
		//新しい標準入力ストリームを作成する。
				Scanner standardInput = new Scanner(System.in);
				//6行2列の2次元配列を宣言する。
				int[][] oneArray = new int[6][2];
				//学生の数を表す6をファイナル変数で宣言する。
				final int THE_FINAL = 6;
				//教科の数を表す2をファイナル変数で宣言する。
				final int TRUE_FINAL = 2;
				//２教科をsubjectNameでまとめ、ファイナル宣言を行う。
				final String[] subjectName = {"国語", "数学"};
				//合計値を格納するscoreAverageを0で初期化する。
				int scoreAverage = 0;
				//数学の合計を格納するmathAverageを0で初期化する。
				int mathAverage = 0;

				/*
				 * iの値に応じて、oneArray配列の行を下へ進行させる。
				 * iを0で初期化し、iが6未満の間は繰り返し処理を実行する。
				 * 最後にiの値を増加させる。
				 */
				for(int i = 0; i < 6; i++) {
					/*
					 * jの値に応じて、oneArray配列の列を下へ進行させる。
					 * jを0で初期化し、jが2未満の間は繰り返し処理を実行する。
					 * 最後にjの値を増加させる。
					 */
					for(int j = 0; j < 2; j++) {
						//iの値に応じた人の点数を入力させる。
						System.out.print((i + 1) + "人目の" + subjectName[j] + "は:");
						//iとjの値に応じた要素に、読み込んだ値を代入する。
						oneArray[i][j] = standardInput.nextInt();
					}
				}
				/*
				 * jの値に応じて、oneArray配列の列を横へ進行させる。
				 * jを0で初期化し、jが6未満の間は繰り返し処理を実行する。
				 * 最後にjの値を増加させる。
				 */
				for(int j = 0; j < 2; j++) {
					/*
					 * iの値に応じて、oneArray配列の行を下へ進行させる。
					 * iを0で初期化し、iが6未満の間は繰り返し処理を実行する。
					 * 最後にiの値を増加させる。
					 */

					for(int i = 0; i < 6; i++) {
						//iとjの値に応じた要素をscoreAverageに加算する。
						scoreAverage += oneArray[i][j];
					}
					//それぞれの合計を6で割り、平均を表示する。
					System.out.println(subjectName[j] + "の平均点は、" + (scoreAverage/THE_FINAL));

				}
				/*
				 * iの値に応じて、oneArray配列の行を下へ進行させる。
				 * iを0で初期化し、iが6未満の間は繰り返し処理を実行する。
				 * 最後にiの値を増加させる。
				 */
				for(int i = 0; i < 6; i++) {
					//合計値の格納先を0で初期化する。
					scoreAverage = 0;
					/*
					 * jの値に応じて、oneArray配列の列を下へ進行させる。
					 * jを0で初期化し、jが2未満の間は繰り返し処理を実行する。
					 * 最後にjの値を増加させる。
					 */
					for(int j = 0; j < 2; j++) {
						//iとjの値に応じた要素を代入し加算する。
						scoreAverage += oneArray[i][j];
					}
					//学生ごとの平均点を表示する。
					System.out.println("学生[" + (i + 1) + "]の平均は、" + (scoreAverage/TRUE_FINAL));
				}
			}
		}
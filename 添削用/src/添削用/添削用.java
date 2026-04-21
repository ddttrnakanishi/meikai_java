package 添削用;

//import java.util.Random;
import java.util.Scanner;

public class 添削用 {

	public static void main(String[] args) {
		//キーボードに入力された値を読み込むための変数を作る
				Scanner standardInput = new Scanner(System.in);
				//「クラス数：」を表示
				System.out.print("クラス数：");
				//整数値を読み込む
				int classNumber = standardInput.nextInt();
				//改行
				System.out.println();
				//変数を初期化
				int totalNumber = 0;
				//変数を初期化
				int countNumber = 0;
				//配列を宣言
				int [][]arrayNumber = new int [1][1];
				//iが配列の長さよりも小さいとき、インクリメントしながら繰り返す
				for (int i = 0; i < arrayNumber .length; i++) {
					//jが配列の長さよりも小さいとき、インクリメントしながら繰り返す
					for (int j = 0; j < arrayNumber [i].length; j++) {
						//足す
						totalNumber += arrayNumber [i][j];
						//インクリメントする
						countNumber++;
					}
				}
				//平均を表示
				double aveNumber = (double)totalNumber / countNumber;
				//合計を表示
				System.out.println("全体合計：" + totalNumber);
				//平均を表示
				System.out.println("全体平均：" + aveNumber);
			}
		}
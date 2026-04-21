package 添削用;

//import java.util.Random;
import java.util.Scanner;

public class 添削用 {

	public static void main(String[] args) {
		//キーボードに入力された値を読み込むための変数を作る
				Scanner standardinput = new Scanner(System.in);
				// 行数入力
				System.out.print("行数を入力してください：");
				//整数値を読み込む
				int rowNumber = standardinput.nextInt();
				//配列を宣言
				int[][] c = new int[rowNumber][];
				// iが行数と値が小さいとき、インクリメントしながら繰り返す
				for (int i = 0; i < rowNumber; i++) {
					//列数の入力を表示
					System.out.print(i + "行目の列数を入力してください：");
					//整数値を読み込む
					int colNumber = standardinput.nextInt();
					//配列を宣言
					c[i] = new int[colNumber];
					//iが列数と値が小さいとき、インクリメントしながら繰り返す
					for (int j = 0; j < colNumber; j++) {
						//配列の値を表示
						System.out.print("c[" + i + "][" + j + "] の値：");
						//整数値を読み込む
						c[i][j] = standardinput.nextInt();
					}
				}
				//iが配列の長さよりも小さいとき、インクリメントしながら繰り返す
				for (int i = 0; i < c.length; i++) {
					//jが配列の長さよりも小さいとき、インクリメントしながら繰り返す
					for (int j = 0; j < c[i].length; j++) {
						//表示
						System.out.printf("%3d", c[i][j]);
					}
					//改行
					System.out.println();
				}   
			}
		}
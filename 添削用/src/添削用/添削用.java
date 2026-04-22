package 添削用;

//import java.util.Random;
import java.util.Scanner;

public class 添削用 {

	public static void main(String[] args) {
		//キーボードに入力された値を読み込むための変数を作る
		Scanner standardInput = new Scanner(System.in);
		//配列を宣言
		int [][]arrayNumber = new int[3][4];
		//配列を宣言
		int [][]baseNumber = new int[4][3];
		//配列を宣言
		int [][]camelNumber = new int[4][4];
		//iが3未満の場合、インクリメントしながら繰り返す
		for (int i = 0; i < 3; i++) {
			//jが4未満の場合、インクリメントしながら繰り返す
			for(int j = 0; j < 4; j++) {
				//表示
				System.out.print("arrayNumber[][]={");
				//値を入力
				arrayNumber[i][j] = standardInput.nextInt();
			}
		}
		//iが4未満の場合、インクリメントしながら繰り返す
		for (int i = 0; i < 4; i++) {
			//jが3未満の場合、インクリメントしながら繰り返す
			for(int j = 0; j < 3; j++) {
				//値を入力
				baseNumber[i][j] = standardInput.nextInt();
				//表示
				System.out.print("baseNumber[][]={");
			}
		}
		//iが4以下の場合、インクリメントしながら繰り返す
		for (int i = 0; i < 4; i++) {
			//jが4以下の場合、インクリメントしながら繰り返す
			for (int j = 0; j < 4; j++) {
				//kが3以下の場合、インクリメントしながら繰り返す
				for (int k = 0; k < 3; k++) {
					//配列cを代入
					camelNumber[i][j] += arrayNumber[i][k]*baseNumber[k][j];      			 
				}
				//配列cを表示
				System.out.println("camelNumber[][]={" + camelNumber[i][j] + "}");
			}
		}
	}
}
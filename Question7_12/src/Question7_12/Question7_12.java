package Question7_12;

import java.util.Scanner;
/*
 * クラス名             :Question7_12
 * 概要                 :整数を右にnビット回転した値と左にnビット回転した値を表示
 * 作成者             　:中西輝
 * 作成日               :2026.4.22
 */
public class Question7_12 {
	
	static void printBits(int integerValue) {
		for(int i = 31; i >= 0; i--) {
			System.out.print(((integerValue >>> i & 1) == 1) ? '1':'0');
		}
	}
	/*
	 * 関数名           　:rRotate
	 * メソッドの説明   　:2のべき乗の乗算の値を出し同じことを確認
	 * パラメータの説明　 :シフト数と整数
	 * 返り値          　 :なし
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.22
	 */
	static int rRotate(int g, int z) {
		
	}

	public static void main(String[] args) {
		Scanner standardInput = new Scanner(System.in);
		System.out.println("二つの整数を入力してください");
		System.out.print("g : ");
		int g = standardInput.nextInt();
		System.out.print("z : ");
		int z = standardInput.nextInt();
		System.out.print("シフトするビット数 :");
		int q = standardInput.nextInt();
		
		
		System.out.print("\ng | z = ");
		printBits(g | z );
		

	}

}

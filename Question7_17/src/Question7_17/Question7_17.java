package Question7_17;

import java.util.Scanner;
/*
 * クラス名             :Question7_17
 * 概要                 :最も末尾側に位置する要素を見つける
 * 作成者             　:中西輝
 * 作成日               :2026.4.23
 */
public class Question7_17 {
	/*
	 * 関数名           　:main
	 * メソッドの説明   　:
	 * パラメータの説明　 :なし
	 * 返り値          　 :なし
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.23	
	 */

	private static int inputNumber;
	public static void main(String[] args) {
		Scanner standardInput = new Scanner(System.in);
		System.out.print("要素数 :");
		inputNumber = standardInput.nextInt();
		int[] arrayNumber = new int [inputNumber]; 

		for(int i = 0; i < inputNumber; i++) {
			System.out.print("arrayNumber [" + i + "} =");
			arrayNumber[i] = standardInput.nextInt();
		}
		System.out.print("探す値 :");
		int keyNumber =  standardInput.nextInt();

		int cheakNumber = linearSearchR(arrayNumber,keyNumber);

		if(cheakNumber == -1) {
			System.out.println("その値はありません");
		}
		else {
			System.out.println("その値はarrayNumber[" + cheakNumber + "]にあります。");
		}
	}
	static int linearSearchR(int []arrayNumber, int keyNumber) {
		for(int i = inputNumber; 0 <= i; i--) {
			if(keyNumber == arrayNumber[i]) {
				return keyNumber = i;
			}
		}
		return -1;
	}

}

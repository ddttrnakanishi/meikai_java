package Question6_4;

import java.util.Random;
import java.util.Scanner;
/*
 * クラス名            :Question6_4
 * 概要                :縦向きの棒グラフを表示
 * 作成者             :中西輝
 * 作成日              :2026.4.15
 */
public class Question6_4 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理で実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.15
	 */
	public static void main(String[] args) {
		Random randomNumber = new Random();
		Scanner standardInput = new Scanner(System.in);
		System.out.print("要素数:");
		int inputNumber = standardInput.nextInt();
		int[]elementNumber = new int[inputNumber];
		
		for(int i = 0; i < inputNumber; i++) {
			elementNumber[i] = 1 + randomNumber.nextInt(10);
		}
		for(int i = 10; i >= 0; i--) {
			for(int j = 0; j <= inputNumber; j++) {
				if(i > elementNumber[i]) {
					System.out.print(" ");
				}	
				else if(i <= elementNumber[i]) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("---------------------");
		for(int i = 0; i < inputNumber; i++) {
			System.out.print(i % 10);
		}
	}
}

package Question2_8;

import java.util.Random;
import java.util.Scanner;

public class Question2_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);// TODO 自動生成されたメソッド・スタブ

		System.out.print("整数値:");
		int x = stdIn.nextInt();
		
		Random y = new Random();
		int z = y.nextInt(11);
		System.out.println("その値の±5の乱数を生成しました。それは"+(x+(z-5))+"です。");
		
	}

}

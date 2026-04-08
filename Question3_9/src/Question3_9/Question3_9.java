package Question3_9;

import java.util.Scanner;

public class Question3_9 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("実数値:");
		double a = stdIn.nextInt();// TODO 自動生成されたメソッド・スタブ
		System.out.print("実数値:");
		double b = stdIn.nextInt();
		
		double max = a>b?a:b;
		System.out.println(max);		
		
		
	}

}

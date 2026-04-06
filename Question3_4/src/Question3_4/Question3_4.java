package Question3_4;

import java.util.Scanner;


public class Question3_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);// TODO 自動生成されたメソッド・スタブ
		
		
		System.out.print("変数a:");
		int a = stdIn.nextInt();
		System.out.print("変数b:");
		int b = stdIn.nextInt();
		
		if(a>b)
			System.out.println("aの方が大きいです。");
		else if (b>a)	
			System.out.println("bの方が大きいです。");
		else
			System.out.println("aとbは同じ値です。");

	}

}

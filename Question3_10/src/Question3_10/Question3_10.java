package Question3_10;

import java.util.Scanner;

public class Question3_10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);// TODO 自動生成されたメソッド・スタブ
		System.out.print("整数値:");
		int a = stdIn.nextInt();
		System.out.print("整数値:");
		int b = stdIn.nextInt();
		
		if (a>b)
			System.out.println(a-b);
		else 	
			System.out.println((a-b)*-1);
			
			
			
		
		
	}

}

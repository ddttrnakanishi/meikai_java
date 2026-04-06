package Question3_8;

import java.util.Scanner;

public class Question3_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);// TODO 自動生成されたメソッド・スタブ

		System.out.print("点数:");
		int k = stdIn.nextInt();
		
		if (0<=k&&k<=59)
			System.out.println("不可");
		else if(60<=k&&k<=69)
			System.out.println("可");
		else if (70<=k&&k<=79)
			System.out.println("良");
		else if(80<=k&&k<=100)
			System.out.println("優");
		
	}

}

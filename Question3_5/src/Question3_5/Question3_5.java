package Question3_5;

import java.util.Scanner;


public class Question3_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);// TODO 自動生成されたメソッド・スタブ
		
		
		System.out.print("整数値:");
		int x = stdIn.nextInt();
		
		
		 if(x<0)
			System.out.println("正ではない値が入力されました。");
		 else if(x%5==0)
			System.out.println("その値は5で割り切れます。");
		 else if  (x%5>0)	
			System.out.println("その値は5で割り切れません。");
		

	


	}

}

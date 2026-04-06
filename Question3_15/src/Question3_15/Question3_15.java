package Question3_15;

import java.util.Scanner;

public class Question3_15 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("整数値a:");
	int a = stdIn.nextInt();
	System.out.print("整数値b:");
	int b = stdIn.nextInt();
	
	if (a<b) {
		int c=a;
		a=b;
		b=c;
	}
	
	System.out.println("整数値aは"+a+"です。");
	System.out.println("整数値bは"+b+"です。");	
		
		
	
	
	
	}

}

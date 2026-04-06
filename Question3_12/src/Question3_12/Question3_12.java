package Question3_12;

import java.util.Scanner;

public class Question3_12 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("整数値:");
	int a = stdIn.nextInt();
	System.out.print("整数値:");
	int b = stdIn.nextInt();
	System.out.print("整数値:");
	int c  = stdIn.nextInt();
	
	int m = a;
	
	if (m>b)  m=b;
	if (m>c)  m=c;
	
	System.out.println("最小値は"+m+"です。");
	
	
	
		
	}

}

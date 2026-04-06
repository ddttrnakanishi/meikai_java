package Question3_14;

import java.util.Scanner;

public class Question3_14 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("整数a:");
	int a = stdIn.nextInt();
	System.out.print("整数b:");
	int b = stdIn.nextInt();
	
	int h=a, l=b; 
	
	
	if (a>b) {
		h=a; l=b;
		System.out.println("大きい法の値は"+h+"です。");
		System.out.println("小さい法の値は"+l+"です。");
	}
		
	else if (a<b) {
		h=b; l=a;
		System.out.println("大きい法の値は"+h+"です。");
		System.out.println("小さい法の値は"+l+"です。");
	}
		
	else 
		
	
	System.out.println("二つの値は同じです。");
		

	}

}

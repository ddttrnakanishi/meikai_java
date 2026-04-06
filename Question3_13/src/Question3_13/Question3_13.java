package Question3_13;

import java.util.Scanner;

public class Question3_13 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("整数値:");
	int a = stdIn.nextInt();
	System.out.print("整数値:");
	int b = stdIn.nextInt();
	System.out.print("整数値:");
	int c = stdIn.nextInt();
	
	int o = a;
	
	if (o>=b) o=b;
	if (o<=c) o=c;
	if (o>=a) o=a;
		System.out.println("中央値は"+o+"である。");
	
	
	}

}

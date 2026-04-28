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
	
	if (a>b&&b>c||c>b&&b>a) o=b;
	if (b<c&&a>c||a<c&&c>b) o=c;
	
		System.out.println("中央値は"+o+"である。");
	
	
	}

}

package Question3_16;

import java.util.Scanner;

public class Question3_16 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("整数値a:");
	int a = stdIn.nextInt();
	System.out.print("整数値b:");
	int b = stdIn.nextInt();
	System.out.print("整数値c:");
	int c = stdIn.nextInt();
	
	if (b>a&&c>a&&b>c) {
		int x = c;
		c = b;
		b = x;
	
		System.out.println("整数値aは"+a+"です。");
		System.out.println("整数値bは"+b+"です。");
		System.out.println("整数値cは"+c+"です。");
	
	}
	else if (a>b&&c>b&&a>c) {
		int y = a;
		int w =c;
		a = b;
		b = w;
		c = y;
		System.out.println("整数値aは"+a+"です。");
		System.out.println("整数値bは"+b+"です。");
		System.out.println("整数値cは"+c+"です。");
	}
	else if (a>b&&c>b&&a<c) {
		int y = a;
		a = b;
		b = y;
		System.out.println("整数値aは"+a+"です。");
		System.out.println("整数値bは"+b+"です。");
		System.out.println("整数値cは"+c+"です。");
	}
	else if (a>c&&b>c&&a>b) {
		int z = a;
		a = c;
		c = z;
		System.out.println("整数値aは"+a+"です。");
		System.out.println("整数値bは"+b+"です。");
		System.out.println("整数値cは"+c+"です。");
	}
	
	else if (a>c&&b>c&&a<b) {
		int z = a;
		a = c;
		c = b;
		b = z;
		System.out.println("整数値aは"+a+"です。");
		System.out.println("整数値bは"+b+"です。");
		System.out.println("整数値cは"+c+"です。");
	}
	else {
		System.out.println("整数値aは"+a+"です。");
		System.out.println("整数値bは"+b+"です。");
		System.out.println("整数値cは"+c+"です。");

	}

}
}

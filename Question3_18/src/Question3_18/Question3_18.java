package Question3_18;

import java.util.Scanner;

public class Question3_18 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値a:");
		int a = stdIn.nextInt();
		
		switch (a) {
			case 1 :
			case 2 :
			case 12 : System.out.println("冬");
			break;
			case 3 : 
			case 4 : 
			case 5 : System.out.println("春");
			break;
			case 6 :
			case 7 :
			case 8 : System.out.println("夏");
			break;
			case 9 :
			case 10 :
			case 11 : System.out.println("秋");
			break;
		}
		

	}

}

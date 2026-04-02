package Question2_7;

import java.util.Random;

public class Question2_7 {

	public static void main(String[] args) {
		Random x = new Random();
		
		int y = x.nextInt(9);// TODO 自動生成されたメソッド・スタブ
		System.out.println(y+1);
		
		Random z = new Random();
		
		int w = x.nextInt(9);
		System.out.println(w-9);
		
		int o = x.nextInt(89);
		System.out.println(o+10);
		
		
	}

}

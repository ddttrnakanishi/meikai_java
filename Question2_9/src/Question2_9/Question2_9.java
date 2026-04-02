package Question2_9;

import java.util.Random;

public class Question2_9 {

	public static void main(String[] args) {
		Random x = new Random();
		
		Double y = x.nextDouble(1);// TODO 自動生成されたメソッド・スタブ
		System.out.println(y);
		
		Random z = new Random();
		
		Double w = x.nextDouble(10);
		System.out.println(w);
		
		Double o = x.nextDouble(1);
		Double t = x.nextDouble(1);
		System.out.println(t-o);

	}

}

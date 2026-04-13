package 添削用;

//import java.util.Random;
import java.util.Scanner;

public class 添削用 {

	public static void main(String[] args) {
		//キーボードを読み込む
				Scanner standardInput = new Scanner(System.in);
				//「何㎝から：」と表示
				System.out.print("何㎝から：");
				//整数値を読み込む
				int startNumber=standardInput.nextInt();
				//「何㎝まで：」と表示
				System.out.print("何㎝まで：");
				//整数値を読み込む
				int goalNumber=standardInput.nextInt();
				//「何㎝ごと：」を表示
				System.out.print("何㎝ごと：");
				//整数値を読み込む
				int stepNumber=standardInput.nextInt();
		        //「身長　標準体重」を表示
				System.out.println("身長"+"　"+"標準体重");
				//plusNumberがgoalNumberと同じ値になるまで表示を繰り返す
				for(int plusNumber = startNumber; plusNumber <= goalNumber ;System.out.println(plusNumber+"　"+(plusNumber-100)*0.9),plusNumber = plusNumber+stepNumber);



			}

		}
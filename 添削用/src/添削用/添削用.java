package 添削用;

//import java.util.Random;
import java.util.Scanner;

public class 添削用 {

	public static void main(String[] args) {
		//キーボードに入力された値を読み込むための変数を作る
		Scanner standardInput=new Scanner(System.in);
		//「直角三角形を表示します。」と表示
		System.out.println("直角三角形を表示します。");
		//「段数は：」と表示
		System.out.print("段数は：");
		//整数値を読み込む
		int inputNumber=standardInput.nextInt();
		//iがinputNumberと同じ値になるまでインクリメントする
		for(int i =1;i<=inputNumber;i++) {
			//twoNumberがinputNumberと同じ値になるまでインクリメントする
			for(int twoNumber=1;twoNumber<=inputNumber;twoNumber++)
				//(twoNumber+i)-1がinputNumberより小さい場合、空欄を表示
				if((twoNumber+i)-1<inputNumber) 
					System.out.print(" ");
			//その他の場合、「*」を表示
				else 
					System.out.print('*');
			System.out.println();
		}

	}
}
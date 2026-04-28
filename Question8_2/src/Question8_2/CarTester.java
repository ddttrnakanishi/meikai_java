package Question8_2;

import java.util.Scanner;
/*
 * クラス名            :CarTester
 * 概要                :各情報を入力し入力した値をもとにクラスCar型のmyCarを作成し
 * 						putSpecの情報とNewAndUsedCarメソッドの処理の結果を表示
 * 作成者              :中西輝
 * 作成日              :2026.4.28
 */
public class CarTester {
	/*
	 * 関数名           :main
	 * メソッドの説明   :各情報を入力し入力した値をもとにクラスCar型のmyCarを作成し
	 * 					putSpecの情報とNewAndUsedCarメソッドの処理の結果を表示
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.28
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示して改行
		System.out.println("車のデータを入力せよ");
		//""の中の文字を表示
		System.out.print("何年目？ :");
		//whatYearの値を入力
		int whatYear = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("色は :");
		//colourの文字を入力
		String colour = standardInput.next();
		//""の中の文字を表示
		System.out.print("製造年は :");
		//ModelYearの値を入力
		int  ModelYear = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("ナンバーは :");
		//Numberの値を入力
		int Number = standardInput.nextInt();
		//入力した値をもとにクラスCar型のmyCarを作成
		Car myCar = new Car(whatYear, colour, ModelYear, Number);
		//myCarの情報をputSpecに沿い表示
		myCar.putSpec();
		//myCar.NewAndUsedCar(whatYear)の返却値がfalseの場合
		if(myCar.NewAndUsedCar(whatYear) == false) {
			//""の中の文字を表示して改行
			System.out.println("古くからの愛車");
		}
		//それ以外
		else {
			//""の文字を表示して改行
			System.out.println("新しい愛車");
		}
	}
}

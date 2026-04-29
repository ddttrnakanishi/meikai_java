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
	 * 					移動距離の計算、putSpecの情報とNewAndUsedCarメソッドの処理の結果を表示
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
		System.out.print("車名：");
		//widthの文字を入力
		String name = standardInput.next();
		//""の中の文字を表示
		System.out.print("車幅：");
		//widthの値を入力
		int width = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("高さ：");
		//heightの値を入力
		int height = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("長さ：");
		//lengthの値を入力
		int length = standardInput.nextInt();
		//fuelを0で初期化
		double fuel = 0;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("ガソリン量：");
			//fuelの値を入力
			fuel = standardInput.nextDouble();
			//入力された値が負の数である場合繰り返す
		}while(fuel < 0);
		//whatYearの初期化
		int whatYear;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("何年目？ :");
			//whatYearの値を入力
			whatYear = standardInput.nextInt();
			//0未満の時繰り返す
		}while(whatYear < 0);
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
		Car myCar = new Car(name, width,height, length, fuel, whatYear, colour, ModelYear, Number);
		//trueである限り繰り返す
		while(true) {
			//""の中の文字と現在地と残りの年長の値を表示して改行
			System.out.println("現在地(" + myCar.getX() + ", " + myCar.getY() + ")・残りの燃料 " + myCar.getFuel());
			//""の中の文字を表示
			System.out.print("移動しますか[0…No/1…Yes] :");
			//入力値が0の場合
			if(standardInput.nextInt() == 0) {
				//飛び出す
				break;
			}
			//""の中の文字を表示
			System.out.print("X方向の移動距離 :");
			//移動距離を入力
			double dx = standardInput.nextDouble();
			//""の中の文字を表示
			System.out.print("Y方向の移動距離 :");
			//移動距離を表示
			double dy = standardInput.nextDouble();
			//falseが返却されたとき
			if(!myCar.move(dx, dy)) {
				//""の中の文字を表示して改行
				System.out.println("燃料が足りません！");
			}
		}
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

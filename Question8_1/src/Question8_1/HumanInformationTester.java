package Question8_1;

import java.util.Scanner;
/*
 * クラス名            :HumanInformationTester
 * 概要                :各情報を入力し入力した値をもとにクラスHuman型のmyInformationを作成し
 * 						putInformationの情報を表示
 * 作成者              :中西輝
 * 作成日              :2026.4.28
 */
public class HumanInformationTester {
	/*
	 * 関数名           :main
	 * メソッドの説明   :各情報の入力と入力した値をもとにクラスHuman型のmyInformationを作成し
	 * 						putInformationの情報を表示
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.28
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示して改行
		System.out.println("人のデータを入力せよ");
		//""の中の文字を表示
		System.out.print("名前は :");
		//nameInformationの文字を入力
		String nameInformation = standardInput.next();
		//heightInformationの初期化
		double heightInformation;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("身長は :");
			//heightInformationの値を入力
			heightInformation = standardInput.nextDouble();
			//heightInformationが0未満の時繰り返し
		}while(heightInformation < 0);
		//weightInformationの初期化
		double weightInformation;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("体重は :");
			//weightInformationの値を入力
			weightInformation = standardInput.nextDouble();
			//weightInformationが0未満の時繰り返し
		}while(weightInformation < 0);
		//入力した値をもとにクラスHuman型のmyInformationを作成
		Human myInformation = new Human(nameInformation, heightInformation, weightInformation);
		//myInformationの情報をputInformationに沿い表示
		myInformation.putInformation();
	}
}

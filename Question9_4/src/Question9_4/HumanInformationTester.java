package Question9_4;
import java.util.Scanner;
/*
 * クラス名            :HumanInformationTester
 * 概要                :各情報を入力し入力した値をもとにクラスHuman型のmyInformationを作成
 * 作成者              :中西輝
 * 作成日              :2026.4.29
 */
public class HumanInformationTester {
	/*
	 * 関数名           :main
	 * メソッドの説明   :各情報の入力と入力した値をもとにクラスHuman型のmyInformationを作成し各情報の表示
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.29
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
		//birthdayYearの初期化
		int birthdayYear;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("誕生年は :");
			//birthdayYearの値を入力
			birthdayYear = standardInput.nextInt();
			//birthdayYearが0未満の時繰り返し
		}while(birthdayYear <= 0);
		//birthdayMonthの初期化
		int birthdayMonth;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("誕生月は :");
			//birthdayMonthの値を入力
			birthdayMonth = standardInput.nextInt();
			//birthdayMonthが0未満、12より大きい時繰り返し
		}while(birthdayMonth <= 0 || birthdayMonth > 12);
		//birthdayDateの初期化
		int birthdayDate;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("誕生日は :");
			//birthdayDateの値を入力
			birthdayDate = standardInput.nextInt();
			//birthdayDateが0未満、31より大きい時繰り返し
		}while(birthdayDate <= 0 || birthdayDate > 31);
		//入力した値をもとにクラスHuman型のmyInformationを作成
		human myInformation = new human(nameInformation, heightInformation, weightInformation, new Day(birthdayYear,birthdayMonth,birthdayDate));

		//""の中の文字と名前の文字を表示して改行
		System.out.println("名前 :" + nameInformation);
		//""の中の文字と身長の値を表示して改行
		System.out.println("身長 :" + heightInformation + "cm");
		//""の中の文字と体重の値を表示して改行
		System.out.println("体重 :" + weightInformation + "kg");
		//""の中の文字と誕生日の値を表示して改行
		System.out.println("誕生日 :" + myInformation.getbirthdayInformation().toString());
	}
}



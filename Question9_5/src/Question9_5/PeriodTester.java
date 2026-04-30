package Question9_5;

import java.util.Scanner;
/*
 * クラス名            :PeriodTester
 * 概要                :各情報を入力し入力した値をもとにクラスPeriod型のmyDayを作成し表示する
 * 作成者              :中西輝
 * 作成日              :2026.4.30
 */
public class PeriodTester {
	/*
	 * 関数名           :main
	 * メソッドの説明   :各情報の入力と入力した値をもとにクラスPeriod型のmyDayを作成し各情報の表示
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.30
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示して改行
		System.out.println("期間を入力してください");
		//startYearの初期化
		int startYear;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("開始年は :");
			//startYearの値を入力
			startYear = standardInput.nextInt();
			//startYearが0未満の時繰り返し
		}while(startYear <= 0);
		//startMonthの初期化
		int startMonth;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("開始月は :");
			//startMonthの値を入力
			startMonth = standardInput.nextInt();
			//startMonthが0未満、12より大きい時繰り返し
		}while(startMonth <= 0 || startMonth > 12);
		//startDateの初期化
		int startDate;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("開始日は :");
			//startDateの値を入力
			startDate = standardInput.nextInt();
			//startDateが0未満、31より大きい時繰り返し
		}while(startDate <= 0 || startDate > 31);

		//改行
		System.out.println();

		//finYearの初期化
		int finYear;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("終了年は :");
			//finYearの値を入力
			finYear = standardInput.nextInt();
			//finYearが0未満、開始年より前の年の時繰り返し
		}while(finYear <= 0 || startYear > finYear);
		//finMonthの初期化
		int finMonth;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("終了月は :");
			//finMonthの値を入力
			finMonth = standardInput.nextInt();
			//finMonthが0未満、12より大きい時、開始年と同じ年かつ開始月が終了月よりも大きい時繰り返し
		}while(finMonth <= 0 || finMonth > 12 || startYear == finYear && startMonth > finMonth);
		//finDateの初期化
		int finDate;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("終了日は :");
			//finDateの値を入力
			finDate = standardInput.nextInt();
			//finDateが0未満、31より大きい時、終了年が開始年と同じ年かつ終了月が開始月と同じ月かつ開始日が終了日よりも大きい時繰り返し
		}while(finDate <= 0 || finDate > 31 || startYear == finYear && startMonth == finMonth && startDate > finDate);

		//入力した値をもとにクラスPeriod型のmyDayを作成
		Period myDay = new Period(new Day(startYear, startMonth, startDate), new Day(finYear, finMonth, finDate));

		//""の中の文字と開始日の値と曜日を表示して改行
		System.out.println("開始日は :" + myDay.getfrom().toString());
		//""の中の文字と誕生日の値と曜日を表示して改行
		System.out.println("終了日は :" + myDay.getto().toString());
	}
}

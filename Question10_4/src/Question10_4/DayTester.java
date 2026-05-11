package Question10_4;

import java.util.Scanner;

/*
 * クラス名            :DayTester
 * 概要                :Dayクラスのメソッドを用いて処理結果を表示する
 * 作成者              :中西輝
 * 作成日              :2026.5.11
 */
public class DayTester {
	/*
	 * 関数名           :main
	 * メソッドの説明   :Dayクラスのメソッドを用いて処理結果を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.5.11
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//Dayクラスの実行日の日付を取得
		Day todayDate = new Day(); 
		//""の中の文字と実行日の日付を表示して改行
		System.out.println("今日は " + todayDate + " です。");
		//改行してから""の中の文字を表示して改行
		System.out.println("\n比較する日付を入力してください。");
		//""の中の文字を表示
		System.out.print("年："); 
		//年を入力
		int yearNumber = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("月："); 
		//月を入力
		int monthNumber = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("日："); 
		//日を入力
		int dateNumber = standardInput.nextInt();
		//入力した値をもとにクラスDay型のtargetDayを作成
		Day targetDay = new Day(yearNumber, monthNumber, dateNumber);
		//""の中の文字と実行した日付をdayOfYearメソッドで処理しその返却値を表示して改行
		System.out.println("元旦からの経過日数：" + todayDate.dayOfYear() + "日");
		//""の中の文字と実行した日付をleftDaysInYearメソッドで処理しその返却値を表示して改行
		System.out.println("年内の残り日数：" + todayDate.leftDaysInYear() + "日");
		//クラスメソッドで「実行した日」と「入力した日」を比較する
		Day.compare(todayDate, targetDay);
		//""の中の文字を表示
		System.out.print("何日後の日付を調べますか：");
		//日にちを入力
		int dayLater = standardInput.nextInt();
		//""の中の文字と実行した日付をsucceedingDayメソッドで処理しその返却値を表示して改行
		System.out.println("明日の日付：" + todayDate.succeedingDay());
		//""の中の文字と実行した日付をprecedingDayメソッドで処理しその返却値を表示して改行
		System.out.println("昨日の日付：" + todayDate.precedingDay());
		//入力した日にちと""の中の文字と実行した日付をafterDayメソッドで処理しその返却値を表示して改行
		System.out.println(dayLater + "日後の日付：" + todayDate.afterDay(dayLater));
		//入力した日にちと""の中の文字と実行した日付をbeforeDayメソッドで処理しその返却値を表示して改行
		System.out.println(dayLater + "日前の日付：" + todayDate.beforeDay(dayLater));
	}
}
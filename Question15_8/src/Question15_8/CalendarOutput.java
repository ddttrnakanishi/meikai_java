package Question15_8;
/*
 *クラス名	：CalendarOutput
 *クラス概要：コマンドライン引数で入力された値を用いて、カレンダーを表示するクラス
 *@auter	：中西輝
 *日付　　　：2026.5.18
 */
public class CalendarOutput {

	/*
	 *関数名　　      ：main
	 *メソッドの説明  ：コマンドライン引数で入力された年、月の値を基にカレンダーを表示する
	 *			      ：年のみが入力された場合は、その年の1～12月すべてのカレンダーを表示する
	 *			      ：年と月が入力された場合は、その月のカレンダーを表示する
	 *			      ：入力されなかった場合は、プログラム実行時の月のカレンダーを表示する
	 *@param 	      ：args（文字列の配列）
	 *日付　　　      ：2026.5.18
	 */
	public static void main(String[] args) {
		// 引数の数によって処理を変更
		switch (args.length) {
		//入力がない場合
		case 0: 
			//CalenderPrint型のnowMonthをインスタンス化
			CalenderPrint nowMonth = new CalenderPrint();
			//printExecutionCalenderの呼び出し
			nowMonth.printExecutionCalender();
			//飛び出す
			break;
			//年のみ入力された場合
		case 1: 
			//yearNumberOneに引数に入力された年の文字列を数値にし代入
			int yearNumberOne = Integer.parseInt(args[0]);
			//入力された年の月のカレンダーを表示するためのコンストラクタを呼び出しインスタンス化
			CalenderPrint yearFull = new CalenderPrint(yearNumberOne);
			//yearFullの時のprintAllCalenderの呼び出し
			yearFull.printAllCalender();
			//飛び出す
			break;
			//年と月が入力された場合
		case 2: 
			//yearNumberTwoに引数に入力された年の文字列を数値にし代入
			int yearNumberTwo = Integer.parseInt(args[0]);
			//monthNumberに引数に入力された月の文字列を数値に変換して代入
			int monthNumber = Integer.parseInt(args[1]);
			//入力された年の月のカレンダーを表示するためのコンストラクタを呼び出しインスタンス化
			CalenderPrint targetMonth = new CalenderPrint(yearNumberTwo, monthNumber);
			//targetMonthの時のprintInputCalenderの呼び出し
			targetMonth.printInputCalender();
			//飛び出す
			break;
			//三つ以上の引数が入力された場合
		default:
			//""の中の文字を表示して改行
			System.out.println("三つ以上の引数は読み込むことはできません");
			//飛びだす
			break;
		}
	}
}


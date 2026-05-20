package Question15_8;

/*
 *クラス名　：CalenderPrint
 *概要      ：Dayクラスを継承しコマンドライン引数に基づきカレンダーを表示するクラス
 *@author	：中西輝
 *日付　　　：2026.5.18
 */

public class CalenderPrint extends Day {
	////全体で使えるfinal変数LINEBREAKの作成
	private static final int LINEBREAK = 6;
	/*
	 * コンストラクタ   	　:CalenderPrint
	 * コンストラクタの説明   :コマンドラインの入力が無い場合のコンストラクタ
	 * @param           	　:なし
	 * @author            　　:中西輝
	 * 作成日             　　:2026.5.18
	 */
	public CalenderPrint () {
		//スーパークラスのコンストラクタを参照
		super();
	}
	/*
	 * コンストラクタ   	　:CalenderPrint
	 * コンストラクタの説明   :年のみ入力の場合のコンストラクタ
	 * @param           	　:入力された年
	 * @author            　　:中西輝
	 * 作成日             　　:2026.5.18
	 */
	public CalenderPrint (int yearNumber) {
		//スーパークラスのコンストラクタを参照
		super(yearNumber);
	}
	/*
	 * コンストラクタ   	　:CalenderPrint
	 * コンストラクタの説明   :年、月が入力の場合のコンストラクタ
	 * @param           	　:入力された年、月
	 * @author            　　:中西輝
	 * 作成日             　　:2026.5.18
	 */

	public CalenderPrint (int yearNumber, int monthNumber) {
		//スーパークラスのコンストラクタを参照
		super(yearNumber, monthNumber);
	}
	/*
	 * 関数名　　：showCalendar
	 * メソッド　：カレンダーを表示するメソッド
	 * @param    ：なし
	 * @return　 ：なし
	 * @author 　：中西輝
	 * 日付　　　：2026.5.18
	 */
	private void showCalendar() {
		//1日の曜日を知るためにセット
		setDate(NUMBER_ONE); 
		//変数iを0から始めて1ずつ増やしていき月の1日の曜日になるまで繰り返す
		for (int i = NUMBER_ZERO; i < dayOfWeek(); i++) {
			//空白を表示
			System.out.print("   ");
		}
		//変数iを1から始めて1ずつ増やしていき月の最後の日付になるまで繰り返す
		for (int i = NUMBER_ONE; i <= getDaysInMonth(getYear(), getMonth()); i++) {
			//日付を更新
			setDate(i); 
			//日付を少なくとも3桁で表示
			System.out.printf("%3d", i);
			//日付が土曜日の時
			if (dayOfWeek() == LINEBREAK) {
				//改行
				System.out.println();
			}
		}
		//改行
		System.out.println();
		// 日付を1日に設定する
		setDate(NUMBER_ONE); 
	}
	/*
	 * 関数名　　：printExecutionCalender
	 * メソッド　：実行日の月のカレンダーを表示するメソッド
	 * @param    ：なし
	 * @return　 ：なし
	 * @author 　：中西輝
	 * 日付　　　：2026.5.18
	 */
	public void printExecutionCalender() {
		//getExecutionYearの処理を行う
		getExecutionYear(); 
		//showCalendarの処理を行う
		showCalendar();
	}
	/*
	 * 関数名　　：printAllCalender
	 * メソッド　：入力された年のカレンダーを表示するメソッド
	 * @param    ：なし
	 * @return　 ：なし
	 * @author 　：中西輝
	 * 日付　　　：2026.5.18
	 */
	public void printAllCalender() {
		//変数iを1から始めて1ずつ増やしていき12になるまで繰り返す
		for (int i = 1; i <= MAX_MONTH; i++) {
			//日付を更新
			setMonth(i);
			//""の中の文字と何月かを表示して改行
			System.out.println("\n<" + i + "月>");
			//howCalendarの処理を行う
			showCalendar();
		}
	}
	/*
	 * 関数名　　：printInputCalender
	 * メソッド　：入力された年の月のカレンダーを表示するメソッド
	 * @param    ：なし
	 * @return　 ：なし
	 * @author 　：中西輝
	 * 日付　　　：2026.5.18
	 */
	public void printInputCalender() {
		//howCalendarの処理を行う
		showCalendar();
	}
}
package Question15_8;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;
/*
 *クラス名　：Day
 *概要      ：コマンドライン引数で入力された値を基に各メソッドの処理を行うクラス
 *@author	：中西輝
 *日付　　　：2026.5.18
 */
public class Day {
	//全体で使えるfinal変数MIN_YEARの作成
	public static final int MIN_YEAR   = 1;
	//全体で使えるfinal変数MIN_MONTHの作成
	public static final int MIN_MONTH  = 1;
	//全体で使えるfinal変数ONE_MONTHの作成
	public static final int ONE_MONTH  = 1;
	//全体で使えるfinal変数TWO_MONTHの作成
	public static final int TWO_MONTH  = 2;
	//全体で使えるfinal変数MAX_MONTHの作成
	public static final int MAX_MONTH  = 12;
	//全体で使えるfinal変数ERROR_YEARの作成
	public static final int ERROR_YEAR = 2020;
	//全体で使えるfinal変数NUMBER_ZEROの作成
	public static final int NUMBER_ZERO   = 0;
	//全体で使えるfinal変数NUMBER_ONEの作成
	public static final int NUMBER_ONE   = 1;
	//全体で使えるfinal変数の配列DAYS_IN_MONTHSの作成
	public static final int[] DAYS_IN_MONTHS =
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	//年を表すint型のyearを初期化
	private int year = 0;
	//月を表すint型のmonthを初期化
	private int month = 0;
	//日を表すint型のdateを初期化
	private int date = 0;

	/*
	 * コンストラクタ   	　:Day
	 * コンストラクタの説明   :同一クラス内のコンストラクトの呼び出し
	 * 						　;クラスのインスタンスが生成される際に閏年を算出するコンストラクタを
	 * 						  グレゴリオカレンダーを用いて作成。					　
	 * @param           	　:なし
	 * @author            　　:中西輝
	 * 作成日             　　:2026.5.18
	 */
	public Day() {
		//現在の日付に設定されたGregorianCalendar型のインスタンスを生成
		GregorianCalendar todayNumber = new GregorianCalendar();
		////フィールドに仮引数の値(プログラム実行時の年)を代入
		this.year  = todayNumber.get(GregorianCalendar.YEAR);
		//フィールドに仮引数の値(プログラム実行時の月+1)を代入
		this.month = todayNumber.get(GregorianCalendar.MONTH) + NUMBER_ONE;
		//フィールドに仮引数の値(プログラム実行時の日にち)を代入
		this.date  = todayNumber.get(GregorianCalendar.DATE);
	}
	/*
	 * コンストラクタ   	　:Day
	 * コンストラクタの説明   :同一クラス内のコンストラクトの呼び出し。
	 * 						　;クラスのインスタンスが生成される際のコンストラクタを作成。
	 * 						　;年の値が0以下の時は1に強制的にする。
	 * @param           	　:年
	 * @author            　　:中西輝
	 * 作成日             　　:2026.5.18
	 */
	public Day(int year) { 
		//年が0以下の場合
		if(year <= NUMBER_ZERO) {
			//年を2020に設定
			year = ERROR_YEAR;
		}
		//フィールドに年を設定
		this.year = year;
		//フィールドに1を設定
		this.month = NUMBER_ONE;
		//フィールドに1を設定
		this.date = NUMBER_ONE; 
	}
	/*
	 * コンストラクタ   	　:Day
	 * コンストラクタの説明   :同一クラス内のコンストラクトの呼び出し。
	 * 						　;クラスのインスタンスが生成される際のコンストラクタを作成。
	 * 						　;年の値が0以下の時は1に強制的にする。
	 * 						  ;月の値が1未満の時は1を12より大きい時は12に強制的にする。
	 * @param           	　:年,月
	 * @author            　　:中西輝
	 * 作成日             　　:2026.5.18
	 */
	public Day(int year, int month) { 
		//年が0以下の場合
		if(year <= NUMBER_ZERO) {
			//年を2020に設定
			year = ERROR_YEAR;
			//フィールドに年を設定
			this.year = year;
		}
		//フィールドに年を設定
		this.year = year;
		//月が1未満の場合
		if(month < MIN_MONTH) {
			//月を1に設定
			month = MIN_MONTH;
		}
		//月が12より大きい場合
		if(month > MAX_MONTH) {
			//月を12に設定
			month = MAX_MONTH;
		} 
		//フィールドに月を設定
		this.month = month;
		//フィールドに日を設定
		this.date = NUMBER_ONE;
	}
	/*
	 * コンストラクタ   	　:Day
	 * コンストラクタの説明   :同一クラス内のコンストラクトの呼び出し。
	 * 						　;クラスのインスタンスが生成される際のコンストラクタを作成。
	 * 						　;年の値が0以下の時は1に強制的にする。
	 * 						  ;月の値が1未満の時は1を12より大きい時は12に強制的にする。
	 * 						  ;月ごとの最大日数を算出する。 
	 * @param           	　:年,月,日
	 * @author            　　:中西輝
	 * 作成日             　　:2026.5.18
	 */
	public Day(int year, int month, int date) {
		//年が0以下の場合
		if(year <= NUMBER_ZERO) {
			//年を2020に設定
			year = ERROR_YEAR;
			//フィールドに年を設定
			this.year = year;
		}
		//フィールドに年を設定
		this.year = year;
		//月が1未満の場合
		if (month < MIN_MONTH) {
			//月を1に設定
			month = MIN_MONTH;
		}
		//月が12より大きい場合
		if (month > MAX_MONTH) {
			//月を12に設定
			month = MAX_MONTH;
		}
		//フィールドに月を設定
		this.month = month;

		//変数maxDateに年と月の値からなるgetDaysInMonthの返却値を代入
		int maxDate = getDaysInMonth(this.year, this.month);
		//日が1より小さいとき
		if (date < NUMBER_ONE) {
			//日を1に設定
			date = NUMBER_ONE;
		}
		//日がmaxDateより大きい場合
		if (date > maxDate)  {
			//日をmaxDateに設定
			date = maxDate;
		}
		//フィールドに日を設定
		this.date = date;
	}
	/*
	 * コンストラクタ   　　　:Day
	 * コンストラクタの説明   :同一クラス内のコンストラクトの呼び出し
	 * 						  ;クラスのインスタンスが生成される際のコンストラクタを作成
	 * 						  ;フィールドに仮引数の値を代入
	 * 						  :this(year、month、date)の呼び出し
	 * @param           	　:d
	 * @author            　　:中西輝
	 * 作成日           　　　:2026.5.18
	 */
	public Day(Day d) { 
		//フィールドに仮引数の値を代入
		this(d.year, d.month, d.date); 
	}
	/*
	 * 関数名　　：getYear
	 * メソッド　：年を取得するためのメソッド
	 * @param    ：なし
	 * @return　 ：year
	 * @author 　：中西輝
	 * 日付　　　：2026.5.18
	 */
	public int getYear() { return year; }
	/*
	 * 関数名　　：getMonth
	 * メソッド　：月を取得するためのメソッド
	 * @param    ：なし
	 * @return　 ：month
	 * @author 　；中西輝
	 * 日付　　　：2026.5.18
	 */
	public int getMonth() { return month; }
	/*
	 * 関数名　　：getDate
	 * メソッド　：日を取得するためのメソッド
	 * @param    ：なし
	 * @return　 ：date
	 * @author 　；中西輝
	 * 日付　　　：2026.5.18
	 */
	public int getDate() { return date; }
	/*
	 *関数名　　：isLeap
	 *メソッド　：閏年かを判定するメソッド
	 *@param    ：年
	 *@return 　：西暦yが閏年ならtrue、そうでなければfalseを返す
	 *@author　 ；中西輝
	 *日付　　　：2026.5.18
	 */
	public static boolean isLeap(int year) {
		//西暦yがうるう年ならtrue、そうでなければfalseを返す
		return year % 4 == 0 && year % 100 != 0 ||year % 400 == 0;
	}

	/*
	 * 関数名　　：getDaysInMonth
	 * メソッド　：2月の場合は閏年か確認したのち月末の値を返却する
	 * 　　　　　：月ごとの月末の値を返却
	 * @param    ：年、月
	 * @return　 ：29,月ごとの月末の値
	 * @author 　；中西輝
	 * 日付　　　：2026.5.18
	 */
	protected int getDaysInMonth(int yearNumber, int monthNumber) {
		//月が2月の時かつ閏年の場合
		if (monthNumber == TWO_MONTH && isLeap(yearNumber)) {
			//月末を29日にし返却
			return DAYS_IN_MONTHS[NUMBER_ONE] + NUMBER_ONE;
		}
		//月ごとの月末を返却
		return DAYS_IN_MONTHS[monthNumber - NUMBER_ONE];
	}
	/*
	 * 関数名　　：getExecutionYear
	 * メソッド　：プログラム実行時の日付を取得するメソッド
	 * @param    ：なし
	 * @return　 ：実行日の年
	 * @author 　；中西輝
	 * 日付　　　：2026.5.18
	 */
	public void getExecutionYear() {
		//GregorianCalendarを利用して実行日の年月日をインスタンス化
		GregorianCalendar todayNumber = new GregorianCalendar();
		//実行日の年を取得
		int yearNumber = todayNumber.get(YEAR);

	}
	/*
	 * 関数名　　：setYear
	 * メソッド　：年を設定するためのメソッド
	 *			 ；フィールドにyearをセット
	 * @param    ：なし
	 * @return　 ：年
	 * @author 　；中西輝
	 * 日付　　　：2026.5.18
	 */
	public void setYear(int year) { this.year = year; }
	/*
	 * 関数名　　：setMonth
	 * メソッド　：月を設定するためのメソッド
	 *			；フィールドにmonthをセット
	 * @param    ：なし
	 * @return　 ：month
	 * @author 　；中西輝
	 * 日付　　　：2026.5.18
	 */
	public void setMonth(int month) { this.month = month; }
	/*
	 * 関数名　　：setDate
	 * メソッド　：日を設定するためのメソッド
	 *			；フィールドにdateをセット
	 * @param    ：なし
	 * @return　 ：date
	 * @author 　；中西輝
	 * 日付　　　：2026.5.18
	 */

	public void setDate(int date) { this.date = date; }
	/*
	 * 関数名　　：set
	 * メソッド　：年を設定するためのメソッド
	 *			；フィールドにyear, month, dateをセット
	 * @param    ：なし
	 * @return　 ：なし
	 * @author 　；中西輝
	 * 日付　　　：2026.5.18
	 */
	public void set(int year, int month, int date) {
		//フィールドに年を設定
		this.year = year; 
		//フィールドに月を設定
		this.month = month;
		//フィールドに日を設定
		this.date = date;
	}
	/*
	 * 関数名　　：isLeap
	 * メソッド　：このインスタンスが保持する年が閏年かどうかを判定します。
	 * @param    ：なし
	 * @return　 ：自身の保持する年が閏年であればtrueそれ以外false
	 * @author 　；中西輝
	 * 日付　　　：2026.5.18
	 */
	public boolean isLeap() { 
		// 自身の保持する年が閏年であればtrue
		return isLeap(year); 
	}
	/*
	 * 関数名　　：dayOfWeek
	 * メソッド　：受け取った日付から曜日を返却するメソッド
	 * @param    ：なし
	 * @return　 ：曜日
	 * @author 　；中西輝
	 * 日付　　　：2026.5.18
	 */
	public int dayOfWeek() {
		//変数yearNumberをyearで初期化
		int yearNumber = year; 
		//変数monthNumberをmonthで初期化
		int monthNumber = month;
		//monthNumberが1か2の時
		if (monthNumber == ONE_MONTH || monthNumber == TWO_MONTH){
			//yearNumberを-1する
			yearNumber--; 
			//monthNumberに12を足す
			monthNumber += MAX_MONTH;
		}
		//求めた曜日を返却
		return (yearNumber + yearNumber / 4 - yearNumber / 100 + yearNumber / 400 + (13 * monthNumber + 8) / 5 + date) % 7;

	}
}
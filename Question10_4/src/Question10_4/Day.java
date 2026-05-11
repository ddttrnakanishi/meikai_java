package Question10_4;

import java.util.GregorianCalendar;
/*
 * クラス名            :Day
 * 概要                :引数を受け取らないコンストラクタによるインスタンスの生成をプログラムの実行日で設定する。
 * 					   :引数に受け取るコンストラクタに不正な値が指定された場合に適当な値に調節する。
 * 					   ;年内出の経過日数を求めるメソッドの作成。
 * 					   ;年内の残り日数を求めるメソッドの作成。
 * 					   ;他の日付との前後関係を判定するインスタンスメソッドの作成。
 * 					   ;二つの日付の前後関係を判定するクラスメソッドの作成。
 * 					   ;日付を一つ後ろに進めるメソッドの作成。
 * 					   ;次の日の日付を返却するメソッドの作成。
 * 					   ;日付を一つ前に戻すメソッドの作成。
 * 					   ;前の日の日付を返却するメソッドの作成。
 * 					   ;日付を入力した分だけ後ろに進めるメソッドの作成。
 * 					   ;入力した日にち後の日付を返却するメソッドの作成。
 * 					   ;日付を入力した分だけ前に戻すメソッドの作成。
 * 					   ;入力した日にち前の日付を返却するメソッドの作成。	
 * 作成者              :中西輝
 * 作成日              :2026.5.7
 */
public class Day {
	//年を表すint型のyearを初期化
	private int year = 0;
	//月を表すint型のmonthを初期化
	private int month = 0;
	//日を表すint型のdateを初期化
	private int date = 0;

	//全体で使えるfinal変数MIN_YEARの作成
	private static final int MIN_YEAR   = 1;
	//全体で使えるfinal変数MIN_MONTHの作成
	private static final int MIN_MONTH  = 1;
	//全体で使えるfinal変数MAX_MONTHの作成
	private static final int MAX_MONTH  = 12;
	//全体で使えるfinal変数MIN_DATEの作成
	private static final int MIN_DATE   = 1;
	//全体で使えるfinal変数DAYS_IN_NORMAL_YEARの作成
	private static final int DAYS_IN_NORMAL_YEAR = 365;
	//全体で使えるfinal変数DAYS_IN_LEAP_YEARの作成
	private static final int DAYS_IN_LEAP_YEAR   = 366;
	//全体で使えるfinal変数FEB_LEAP_DAYSの作成
	private static final int FEB_LEAP_DAYS       = 29;
	//全体で使えるfinal変数NUMBER_ONEの作成
	private static final int NUMBER_ONE   = 1;
	//全体で使えるfinal変数ONE_MONTHの作成
	private static final int ONE_MONTH  = 1;
	//全体で使えるfinal変数TWO_MONTHの作成
	private static final int TWO_MONTH  = 2;
	//全体で使えるfinal変数の配列DAYS_IN_MONTHSの作成
	private static final int[] DAYS_IN_MONTHS =
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	/*
	 * コンストラクタ   	　:Day
	 * コンストラクタの説明   :同一クラス内のコンストラクトの呼び出し
	 * 						　;クラスのインスタンスが生成される際に閏年を算出するコンストラクタを
	 * 						  グレゴリオカレンダーを用いて作成。					　
	 * パラメータの説明 	　:なし
	 * 作成者             　　:中西輝
	 * 作成日             　　:2026.5.7
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
	 * パラメータの説明 	　:年
	 * 作成者             　　:中西輝
	 * 作成日             　　:2026.5.7
	 */
	public Day(int year) { 
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
	 * 						  ;月の値が1未満の時は1を12より大きい時は12に強制的にする。
	 * パラメータの説明 	　:年,月
	 * 作成者             　　:中西輝
	 * 作成日             　　:2026.5.7
	 */
	public Day(int year, int month) { 
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
	 * 						  ;月の値が1未満の時は1を12より大きい時は12に強制的にする。
	 * 						  ;月ごとの最大日数を算出する。 
	 * パラメータの説明 	　:年,月,日
	 * 作成者             　　:中西輝
	 * 作成日             　　:2026.5.7
	 */
	public Day(int year, int month, int date) {
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

		// 日の調整（ここが32日などの不正値を防ぐ門番です）
		//変数maxDateに年と月の値からなるgetDaysInMonthの返却値を代入
		int maxDate = getDaysInMonth(this.year, this.month);
		//日が1より小さいとき
		if (date < MIN_DATE) {
			//日を1に設定
			date = MIN_DATE;
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
	 * パラメータの説明 　　　:d
	 * 作成者          　　　 :中西輝
	 * 作成日           　　　:2026.5.7
	 */
	public Day(Day d) { 
		//フィールドに仮引数の値を代入
		this(d.year, d.month, d.date); 
	}
	/*
	 * 関数名　　：getYear
	 * メソッド　：年を取得するためのメソッド
	 * パラメータ：なし
	 * 返り値　　：year
	 * 作成者　　：中西輝
	 * 日付　　　：2026.5.7
	 */
	public int getYear() { return year; }
	/*
	 * 関数名　　：getMonth
	 * メソッド　：月を取得するためのメソッド
	 * パラメータ：なし
	 * 返り値　　：month
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	public int getMonth() { return month; }
	/*
	 * 関数名　　：getDate
	 * メソッド　：日を取得するためのメソッド
	 * パラメータ：なし
	 * 返り値　　：date
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	public int getDate() { return date; }
	/*
	関数名　　：setYear
	メソッド　：年を設定するためのメソッド
			  ；フィールドにyearをセット
	パラメータ：なし
	返り値　　：year
	作成者	  ；中西輝
	日付　　　：2026.5.7
	 */
	public void setYear(int year) { this.year = year; }
	/*
	関数名　　：setMonth
	メソッド　：月を設定するためのメソッド
			  ；フィールドにmonthをセット
	パラメータ：なし
	返り値　　：month
	作成者	  ；中西輝
	日付　　　：2026.5.7
	 */
	public void setMonth(int month) { this.month = month; }
	/*
	関数名　　：setDate
	メソッド　：日を設定するためのメソッド
			  ；フィールドにdateをセット
	パラメータ：なし
	返り値　　：date
	作成者	  ；中西輝
	日付　　　：2026.5.7
	 */
	public void setDate(int date) { this.date = date; }
	/*
	関数名　　：set
	メソッド　：年を設定するためのメソッド
			  ；フィールドにyear, month, dateをセット
	パラメータ：year, month, date
	返り値　　：なし
	作成者　　；中西輝
	日付　　　：2026.5.7
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
	 * メソッド　：閏年かを判定するメソッド
	 * パラメータ：年
	 * 返り値　　：西暦yが閏年ならtrue、そうでなければfalseを返す
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	public static boolean isLeap(int y) {
		//西暦yがうるう年ならtrue、そうでなければfalseを返す
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;

	}
	/*
	 * 関数名　　：isLeap
	 * メソッド　：このインスタンスが保持する年が閏年かどうかを判定します。
	 * パラメータ：なし
	 * 返り値　　：true
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	public boolean isLeap() { 
		// 自身の保持する年が閏年であればtrue
		return isLeap(year); 
	}
	/*
	 * 関数名　　：dayOfWeek
	 * メソッド　：受け取った日付から曜日を返却するメソッド
	 * パラメータ：なし
	 * 返り値　　：曜日
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
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
	/*
	 * 関数名　　：isSame
	 * メソッド　：日付が一致しているかを確認するメソッド
	 * パラメータ：d
	 * 返り値　　：全てが一致したときだけその値を返却
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	public boolean isSame(Day d) { 
		//年,月,日の値を返却
		return year == d.year && month == d.month && date == d.date; 
	}
	/*
	 * 関数名　　：isBefore
	 * メソッド　：前の日付かを確認するメソッド
	 * パラメータ：d
	 * 返り値　　：true,false
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	public boolean isBefore(Day d) {
		//実行した日よりも入力した年のほうが大きい場合
		if (year < d.year) {
			//trueを返却
			return true;

		}
		//実行した日よりも入力した年のほうが小さい場合
		if (year > d.year) {
			//falseを返却
			return false;

		}
		//実行した日よりも入力した月のほうが大きい場合
		if (month < d.month) {
			//trueを返却
			return true;

		}
		//実行した日よりも入力した月のほうが小さい場合
		if (month > d.month) {
			//falseを返却
			return false;

		}
		// 年と月が同じ場合に、自身の日が相手の日より前であればtrue
		return date < d.date;

	}
	/*
	 * 関数名　　：isAfter
	 * メソッド　：後の日付かを確認するメソッド
	 * パラメータ：d
	 * 返り値　　：true,false
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	public boolean isAfter(Day d) {
		//実行した日よりも入力した年のほうが小さい場合
		if (year > d.year) {
			//trueを返却
			return true;

		}
		//実行した日よりも入力した年のほうが大きい場合
		if (year < d.year) {
			//falseを返却
			return false;

		}
		//実行した日よりも入力した月のほうが小さい場合
		if (month > d.month) {
			//trueを返却
			return true;

		}
		//実行した日よりも入力した月のほうが大きい場合
		if (month < d.month) {
			//falseを返却
			return false;

		}
		// 年と月が同じ場合に、自身の日が相手の日より後であればtrue
		return date > d.date;

	}
	/*
	 * 関数名　　：compare
	 * メソッド　：比較しその結果を表示するメソッド
	 * パラメータ：d1,d2
	 * 返り値　　：なし
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	public static void compare(Day d1, Day d2) {
		//d1とd2の値が全て同じ場合
		if (d1.isSame(d2)) {
			//""の中の文字を表示
			System.out.println("2つの日付は同じです。");
		}
		//d1がd2の日付のより前の場合
		if (d1.isBefore(d2)) {
			//""の中の文字と日付を表示
			System.out.println(d1 + " は " + d2 + " より前です。");

		}
		//d1がd2の日付のより後の場合
		if (d1.isAfter(d2)) {
			//""の中の文字と日付を表示
			System.out.println(d1 + " は " + d2 + " より後です。");
		}
	}
	/*
	 * 関数名　　：succeed
	 * メソッド　：日付を一日進めるメソッド
	 *           ；月ごとの月末の日ではない場合一日進める
	 * 			 ；月末であり12月より前の日付の場合は月に+1して日は1にする
	 *			 ；月末であり12月場合は年に+1して月を1して日は1にする
	 * パラメータ：なし
	 * 返り値　　：なし
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	public void succeed() {
		//月ごとの月末の日ではない場合
		if (date < getDaysInMonth(year, month)) {
			//一日進める
			date++;
		}
		//それ以外
		else {
			//12月より前の月の場合
			if (month < MAX_MONTH){
				//月に+1をする
				month++; 
				//日を1にする
				date = MIN_DATE;
			}
			//それ以外
			else {
				//年に+1する
				year++;
				//月を1にする
				month = MIN_MONTH;
				//日を1にする
				date = MIN_DATE;
			}
		}

	}
	/*
	 * 関数名　　：precede
	 * メソッド　：日付を一日戻すメソッド
	 *           ；一日ではない場合一日戻す
	 * 			 ；一月ではない場合月を-1して月ごとの月末の日を代入
	 *			 ；年を跨ぐ場合は年を-1して月を12にし月ごとの月末の日を代入
	 * パラメータ：なし
	 * 返り値　　：なし
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	public void precede() {
		//一日ではない場合
		if (date > MIN_DATE) {
			//一日戻す
			date--;
		}
		//それ以外
		else {
			//一月では無い場合
			if (month > MIN_MONTH){
				//月を-1する
				month--; 
				//月ごとの月末の日を代入
				date = getDaysInMonth(year, month);
			}
			//それ以外
			else {
				//年を-1する
				year--; 
				//月を12にする
				month = MAX_MONTH; 
				//月ごとの月末の日を代入
				date = getDaysInMonth(year, month);
			}
		}
	}
	/*
	 * 関数名　　：after
	 * メソッド　：入力した分だけ日付を進めるメソッド
	 *           ；マイナスの値が入力された場合beforeメソッドの内容で処理を行う
	 * 			 ；入力した分だけsucceedメソッドの処理を行う
	 * パラメータ：なし
	 * 返り値　　：なし
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	public void after(int afterDay) {
		//進める日にちがマイナスの場合
		if (afterDay < 0) {
			//beforeのメソッドの内容で行う
			before(-afterDay);
		}
		//それ以外
		else {
			//変数iを0から始めて1ずつ増やしていきafterDayになるまで繰り返す
			for (int i = 0; i < afterDay; i++) {
				//succeedメソッドの処理を行う
				succeed();
			}
		}
	}
	/*
	 * 関数名　　：before
	 * メソッド　：入力した分だけ日付を戻すメソッド
	 *           ；マイナスの値が入力された場合afterメソッドの内容で処理を行う
	 * 			 ；入力した分だけsucceedメソッドの処理を行う
	 * パラメータ：なし
	 * 返り値　　：なし
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	public void before(int beforeDay) {
		//戻す日にちがマイナスの場合
		if (beforeDay < 0) {
			//afterのメソッドの内容で行う
			after(-beforeDay);
		}
		//それ以外
		else {
			//変数iを0から始めて1ずつ増やしていきbeforeDayになるまで繰り返す
			for (int i = 0; i < beforeDay; i++) {
				//precedeメソッドの処理を行う
				precede();
			}
		}
	}
	/*
	 * 関数名　　：succeedingDay
	 * メソッド　：succeedを基に新しいインスタンスを返却するメソッド
	 * パラメータ：なし
	 * 返り値　　：d
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	public Day succeedingDay() { 
		//コピーを作成し新たなインスタンスを生成する
		Day d = new Day(this);
		//作成したインスタンスの日付を用いてsucceedの処理を行う
		d.succeed();
		//返却
		return d; 
	}
	/*
	 * 関数名　　：precedingDay
	 * メソッド　：precedeを基に新しいインスタンスを返却するメソッド
	 * パラメータ：なし
	 * 返り値　　：d
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	public Day precedingDay() { 
		//コピーを作成し新たなインスタンスを生成する
		Day d = new Day(this); 
		//作成したインスタンスの日付を用いてprecedeの処理を行う
		d.precede(); 
		//返却
		return d;
	}
	/*
	 * 関数名　　：afterDay
	 * メソッド　：afterを基に新しいインスタンスを返却するメソッド
	 * パラメータ：なし
	 * 返り値　　：d
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	public Day afterDay(int afterDay) { 
		//コピーを作成し新たなインスタンスを生成する
		Day d = new Day(this); 
		//作成したインスタンスの日付を用いてafterDayの値の数だけafterの処理を行う
		d.after(afterDay); 
		//返却
		return d; 
	}
	/*
	 * 関数名　　：beforeDay
	 * メソッド　：beforeを基に新しいインスタンスを返却するメソッド
	 * パラメータ：なし
	 * 返り値　　：d
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	public Day beforeDay(int beforeDay) { 
		//コピーを作成し新たなインスタンスを生成する
		Day d = new Day(this); 
		//作成したインスタンスの日付を用いてbeforeDayの値の数だけbeforeの処理を行う
		d.before(beforeDay);
		//返却
		return d; 
	}
	/*
	 * 関数名　　：getDaysInMonth
	 * メソッド　：2月の場合は閏年か確認したのち月末の値を返却する
	 * 　　　　　：月ごとの月末の値を返却
	 * パラメータ：y,m
	 * 返り値　　：29,月ごとの月末の値
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	private int getDaysInMonth(int y, int m) {
		//月が2月の時かつ閏年の場合
		if (m == TWO_MONTH && isLeap(y)) {
			//月末を29日にし返却
			return FEB_LEAP_DAYS;
		}
		//月ごとの月末を返却
		return DAYS_IN_MONTHS[m - NUMBER_ONE];
	}
	/*
	 * 関数名　　：dayOfYear
	 * メソッド　：経過日数を求め返却するメソッド
	 * パラメータ：なし
	 * 返り値　　：経過日数
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	public int dayOfYear() {
		//変数daysElapsedをdateで初期化
		int daysElapsed = date;
		//変数iを1から始めて1ずつ増やしていきmonthになるまで繰り返す
		for (int i = NUMBER_ONE; i < month; i++) {
			//変数daysElapsedにその年のi月分の日数を足す
			daysElapsed += getDaysInMonth(year, i);
		}
		//返却
		return daysElapsed;

	}
	/*
	 * 関数名　　：leftDaysInYear
	 * メソッド　：残りの日数を求め返却するメソッド
	 * パラメータ：なし
	 * 返り値　　：残りの日数
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	public int leftDaysInYear() {
		//変数leapYearに閏年の場合366,違う場合365で初期化する
		int leapYear = isLeap() ? DAYS_IN_LEAP_YEAR : DAYS_IN_NORMAL_YEAR;
		//返却
		return leapYear - dayOfYear();
	}
	/*
	 * 関数名　　：toString
	 * メソッド　：文字列表現を決めて返却するメソッド
	 * パラメータ：なし
	 * 返り値　　：文字列表現
	 * 作成者　　；中西輝
	 * 日付　　　：2026.5.7
	 */
	public String toString() {
		//文字型の配列wdの作成
		final String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
		//文字列表現を決めて返却
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}
}
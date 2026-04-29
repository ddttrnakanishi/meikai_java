package Question9_4;

public class Day {
	/*
	 * クラス名            :Day
	 * 概要                :年、月、日を取得、設定するメソッドの作成
	 * 						曜日を求めるメソッドの作成
	 * 						年、月、日があっているか確認するメソッドの作成
	 * 						文字列表現を決めて返却するメソッドの作成
	 * 作成者              :中西輝
	 * 作成日              :2026.4.29
	 */

		//年を表すint型のyearを初期化 
		private int year = 1;
		//月を表すint型のmonthを初期化 
		private int month = 1;
		//日を表すint型のdateを初期化 
		private int date = 1;
		/*
		 * コンストラクタ   　　　:Day
		 * コンストラクタの説明   :同一クラス内のコンストラクトの呼び出し
		 * 						　クラスのインスタンスが生成される際のコンストラクタを作成
		 * パラメータの説明 　　　:なし
		 * 作成者          　　　 :中西輝
		 * 作成日           　　　:2026.4.29
		 */
		public Day() {}
		/*
		 * コンストラクタ   　　　:Day
		 * コンストラクタの説明   :同一クラス内のコンストラクトの呼び出し
		 * 						　クラスのインスタンスが生成される際のコンストラクタを作成
		 * 						　フィールドに仮引数の値を代入、0が指定されたときは強制的に1に調整する
		 * パラメータの説明 　　　:年
		 * 作成者          　　　 :中西輝
		 * 作成日           　　　:2026.4.29
		 */
		public Day(int year) {if(year == 0) {year = 1;} this.year = year;}
		/*
		 * コンストラクタ   　　　:Day
		 * コンストラクタの説明   :同一クラス内のコンストラクトの呼び出し
		 * 						　クラスのインスタンスが生成される際のコンストラクタを作成
		 * 						　フィールドに仮引数の値を代入
		 * 						　this(year)の呼び出し
		 * パラメータの説明 　　　:年、月
		 * 作成者          　　　 :中西輝
		 * 作成日           　　　:2026.4.29
		 */
		public Day(int year, int month) { this(year); this.month = month;}
		/*
		 * コンストラクタ   　　　:Day
		 * コンストラクタの説明   :同一クラス内のコンストラクトの呼び出し
		 * 						　クラスのインスタンスが生成される際のコンストラクタを作成
		 * 						　フィールドに仮引数の値を代入
		 * 						　this(year、month)の呼び出し
		 * パラメータの説明 　　　:年、月、日
		 * 作成者          　　　 :中西輝
		 * 作成日           　　　:2026.4.29
		 */
		public Day(int year, int month, int date) { this(year, month); this.date = date;}
		/*
		 * コンストラクタ   　　　:Day
		 * コンストラクタの説明   :同一クラス内のコンストラクトの呼び出し
		 * 						　クラスのインスタンスが生成される際のコンストラクタを作成
		 * 						　フィールドに仮引数の値を代入
		 * 						　this(year、month、date)の呼び出し
		 * パラメータの説明 　　　:d
		 * 作成者          　　　 :中西輝
		 * 作成日           　　　:2026.4.29
		 */
		public Day(Day d) {this(d.year, d.month, d.date);}
		/*
		 * 関数名　　：getYear
		 * メソッド　：年を取得するためのメソッド
		 * パラメータ：なし
		 * 返り値　　：year
		 * 作成者　　 :中西輝
		 * 日付　　　：2026/04/29
		 */
		public int getYear() { return year; }
		/*
			関数名　　：getMonth
			メソッド　：月を取得するためのメソッド
			パラメータ：なし
			返り値　　：month
			作成者　　 :中西輝
			日付　　　：2026/04/29
		 */
		public int getMonth() { return month; }
		/*
			関数名　　：getDate
			メソッド　：日を取得するためのメソッド
			パラメータ：なし
			返り値　　：date
			作成者　　 :中西輝
			日付　　　：2026/04/29
		 */
		public int getDate() { return date; }
		/*
			関数名　　：setYear
			メソッド　：年を設定するためのメソッド
					   フィールドにyearをセット
			パラメータ：なし
			返り値　　：year
			作成者　　 :中西輝
			日付　　　：2026/04/29
		 */
		public void setYear() { int year; } { this.year = year; }
		/*
			関数名　　：setMonth
			メソッド　：月を設定するためのメソッド
					   フィールドにmonthをセット
			パラメータ：なし
			返り値　　：month
			作成者　　 :中西輝
			日付　　　：2026/04/29
		 */
		public void setMonth() { int month; } { this.month = month; }
		/*
			関数名　　：setDate
			メソッド　：日を設定するためのメソッド
					   フィールドにdateをセット
			パラメータ：なし
			返り値　　：date
			作成者　　 :中西輝
			日付　　　：2026/04/29
		 */
		public void setDate() { int date; } { this.date = date; }
		/*
			関数名　　：set
			メソッド　：年を設定するためのメソッド
					   フィールドにdateをセット
			パラメータ：year, month, date
			返り値　　：なし
			作成者　　 :中西輝
			日付　　　：2026/04/29
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
			関数名　　：dayOfWeek
			メソッド　：曜日を求めるメソッド
			パラメータ：なし
			返り値　　：曜日
			作成者　　 :中西輝
			日付　　　：2026/04/29
		 */
		public int dayOfWeek() {
			//ｙの初期化
			int y = year;
			//ｍの初期化
			int m = month;
			//mが１，または2の時
			if(m == 1 || m == 2) {
				//y-1
				y--;
				//m+12
				m += 12;
			}
			//曜日の返却
			return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date ) % 7;
		}
		/*
			関数名　　：equalTo
			メソッド　：年、月、日があっているか確認するメソッド
			パラメータ：ｄ
			返り値　　：比べた結果
			作成者　　 :中西輝
			日付　　　：2026/04/29
		 */
		public boolean equalTo(Day d) {
			//比べた結果の返却
			return year == d.year && month == d.month && date == d.date;	
		}
		/*
			関数名　　：toString
			メソッド　：文字列表現を決めて返却するメソッド
			パラメータ：なし
			返り値　　：文字列表現
			作成者　　 :中西輝
			日付　　　：2026/04/29
		 */
		public String toString() {
			//文字型の配列wdの作成
			String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
			//文字列表現を決めて返却
			return String.format("%04d年%02d月%02d日(%s)",year, month, date, wd[dayOfWeek()]);
		}
	}


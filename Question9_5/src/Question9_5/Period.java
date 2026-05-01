package Question9_5;
/*
 * クラス名            :Period
 * 概要                :コンストラクタの設定と日付を取得するためのメソッドの作成
 * 作成者              :中西輝
 * 作成日              :2026.4.30
 */
public class Period {
	//開始日を表すDayクラス型のstartDateを初期化
	private Day startDate;
	//終了日を表すDayクラス型のendDateを初期化
	private Day endDate;
	/*
	 * コンストラクタ         :Period
	 * コンストラクタの説明   :クラスのインスタンスが生成される際のコンストラクタを作成
	 * パラメータの説明       :開始日、終了日
	 * 作成者                 :中西輝
	 * 作成日                 :2026.4.30
	 */
	public Period(Day startDate, Day endDate) {
		//フィールドに仮引数の日付のコピーを代入
		this.startDate = new Day(startDate);
		//フィールドに仮引数の日付のコピーを代入
		this.endDate = new Day(endDate);
	}
	/*
	 * 関数名　　：getstartDate
	 * メソッド　：日付を取得するためのメソッド
	 * パラメータ：なし
	 * 返り値　　：日付
	 * 作成者　　 :中西輝
	 * 日付　　　：2026/04/30
	 */
	public Day getstartDate() {
		//返却
		return new Day(startDate);
	}
	/*
	 * 関数名　　：getendDate
	 * メソッド　：日付を取得するためのメソッド
	 * パラメータ：なし
	 * 返り値　　：日付
	 * 作成者　　 :中西輝
	 * 日付　　　：2026/04/30
	 */
	public Day getendDate() {
		//返却
		return new Day(endDate);
	}
}
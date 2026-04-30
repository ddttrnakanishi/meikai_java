package Question9_5;
/*
 * クラス名            :Period
 * 概要                :コンストラクタの設定と日付を取得するためのメソッドの作成
 * 作成者              :中西輝
 * 作成日              :2026.4.30
 */
public class Period {
	//開始日を表すDayクラス型のfromを初期化
	private Day from;
	//終了日を表すDayクラス型のtoを初期化
	private Day to;
	/*
	 * コンストラクタ         :Period
	 * コンストラクタの説明   :クラスのインスタンスが生成される際のコンストラクタを作成
	 * パラメータの説明       :開始日、終了日
	 * 作成者                 :中西輝
	 * 作成日                 :2026.4.30
	 */
	public Period(Day from, Day to) {
		//フィールドに仮引数の日付のコピーを代入
		this.from = new Day(from);
		//フィールドに仮引数の日付のコピーを代入
		this.to = new Day(to);
	}
	/*
	 * 関数名　　：getfrom
	 * メソッド　：日付を取得するためのメソッド
	 * パラメータ：なし
	 * 返り値　　：日付
	 * 作成者　　 :中西輝
	 * 日付　　　：2026/04/30
	 */
	public Day getfrom() {
		//返却
		return new Day(from);
	}
	/*
	 * 関数名　　：getto
	 * メソッド　：日付を取得するためのメソッド
	 * パラメータ：なし
	 * 返り値　　：日付
	 * 作成者　　 :中西輝
	 * 日付　　　：2026/04/30
	 */
	public Day getto() {
		//返却
		return new Day(to);
	}
}
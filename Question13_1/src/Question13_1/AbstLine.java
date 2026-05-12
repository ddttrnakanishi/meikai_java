package Question13_1;
/*
 * クラス名      :AbstLine
 * 概要          :直線を表す抽象クラス
 * 作成者        :中西輝
 * 作成日        :2026.5.12
 */
public abstract class AbstLine extends Shape{
	// 直線の長さを表すint型のフィールドを0で初期化
	private int length = 0;
	/*
	 * コンストラクタ         :AbstLine
	 * コンストラクタの説明   :直線を生成するコンストラクタ
	 * パラメータの説明       :生成する直線の長さ
	 * 作成者                 :中西輝
	 * 作成日                 :2026.5.12
	 */
	public AbstLine(int length) {
		//setLengthを呼び出してインスタンスを生成する
		setLength(length);
	}
	/*
	 * 関数名　　：getLength
	 * メソッド　：直線の長さを取得するメソッド
	 * パラメータ：なし
	 * 返り値　　：length
	 * 作成者　　：中西輝
	 * 作成日    ：2026.5.12 
	 */
	public int getLength() {
		//返却
		return length;
	}
	/*
	 * 関数名　　：setLength
	 * メソッド　：直線の長さを設定するメソッド
	 * パラメータ：設定する直線の長さ
	 * 返り値　　：なし
	 * 作成者　　：中西輝
	 * 作成日    ：2026.5.12
	 */
	public void setLength(int length) {
		//フィールドに受け取った引数の値を設定する
		this.length = length;
	}
	/*
	 * 関数名　　：toString
	 * メソッド　：直線に関する図形情報を表す文字列を返却するメソッド
	 * パラメータ：なし
	 * 返り値　　：文字列AbstLine(length）
	 * 作成者　　：中西輝
	 * 作成日    ：2026.5.12
	 */
	public String toString() {
		//入力された長さを返却
		return "AbstLine(length:" + length + ")";
	}
}

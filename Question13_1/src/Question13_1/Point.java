package Question13_1;
/*
 * クラス名      :Point
 * 概要          :点を表すクラス
 * 作成者        :中西輝
 * 作成日        :2026.5.12
 */
public  class Point extends Shape {
	/*
	 * コンストラクタ         :Point
	 * コンストラクタの説明   :点を生成するコンストラクタ
	 * パラメータの説明       :なし
	 * 作成者                 :中西輝
	 * 作成日                 :2026.5.12
	 */
	public Point() {
		//何も行わない
	}
	/*
	 * 関数名　　：toStoring
	 * メソッド　：点に関する図形情報を表す文字列を返却する抽象メソッド
	 * パラメータ：なし
	 * 返り値　　：Point
	 * 作成者　　：中西輝
	 * 作成日    ：2026.5.12
	 */
	@Override public String toStoring() {
		//返却
		return "Point";
	}
	/*
	 * 関数名　　：draw
	 * メソッド　：点を描画するメソッド
	 * パラメータ：なし
	 * 返り値　　：なし
	 * 作成者　　：中西輝
	 * 作成日    ：2026.5.12
	 */
	@Override public void draw() {
		//+を一個表示して改行
		System.out.println('+');
	}
}

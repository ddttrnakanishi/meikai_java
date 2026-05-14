package Question13_2;

/*
 * クラス名            :IsoscelesTriangle
 * 概要                :直角二等辺三角形の概念を表す抽象クラス
 * 作成者              :中西輝
 * 作成日              :2026.5.13
 */
public abstract class IsoscelesTriangle {
	/*
	 * 関数名　　：toString
	 * メソッド　：図形情報を表す文字列を返却する抽象メソッド
	 * パラメータ：なし
	 * 返り値　　：なし
	 * 作成者　　：中西輝
	 * 作成日    ：2026.5.13
	 */
	public abstract String toString();
	/*
	 * 関数名　　：draw
	 * メソッド　：図形を描画するための抽象メソッド
	 * パラメータ：なし
	 * 返り値　　：なし
	 * 作成者　　：中西輝
	 * 作成日    ：2026.5.13
	 */
	public abstract void draw();
	/*
	 * 関数名　　：print
	 * メソッド　：図形情報の表示と図形の描画を行うメソッド
	 * パラメータ：なし
	 * 返り値　　：なし
	 * 作成者　　：中西輝
	 * 作成日    ：2026.5.13
	 */
	public void print() {
		//メソッドtoStringが返却する文字列を表示して改行
		System.out.println(toString());
		//メソッドdrawを呼び出して図形の描画
		draw();
	}
}


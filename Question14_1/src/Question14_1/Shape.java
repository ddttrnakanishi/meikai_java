package Question14_1;

/*
 * クラス名            :Shape
 * 概要                :図形の概念を表す抽象クラス
 * @author             :中西輝
 * 作成日              :2026.5.13 
 */
public abstract class Shape {
	/*
	 * 関数名　　：toStoring
	 * メソッド　：図形情報を表す文字列を返却する抽象メソッド
	 * @param    ：なし
	 * @return 　：なし
	 * @author 　：中西輝
	 * 作成日    ：2026.5.13
	 */
	public abstract String toStoring();
	/*
	 * 関数名　　：draw
	 * メソッド　：図形を描画するための抽象メソッド
	 * @param    ：なし
	 * @return 　：なし
	 * @author 　：中西輝
	 * 作成日    ：2026.5.13
	 */
	public abstract void draw();
	/*
	 * 関数名　　：print
	 * メソッド　：図形情報の表示と図形の描画を行うメソッド
	 * @param    ：なし
	 * @return 　：なし
	 * @author 　：中西輝
	 * 作成日    ：2026.5.13
	 */
	public void print() {
		//メソッドtoStringが返却する文字列を表示して改行
		System.out.println(toString());
		//メソッドdrawを呼び出して図形の描画
		draw();
	}
}


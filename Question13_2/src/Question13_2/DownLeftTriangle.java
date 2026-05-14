package Question13_2;
/*
 * クラス名      :DownLeftTriangle
 * 概要          :左下が直角の二等辺三角形を表すクラス
 * 作成者        :中西輝
 * 作成日        :2026.5.13
 */
public class DownLeftTriangle extends TriangleSize{
	/*
	 * コンストラクタ         :DownLeftTriangle
	 * コンストラクタの説明   :左下が直角の二等辺三角形を生成するコンストラクタ
	 * パラメータの説明       :生成する直角二等辺三角形の大きさ
	 * 作成者                 :中西輝
	 * 作成日                 :2026.5.13
	 */
	public DownLeftTriangle(int length) {super(length);}
	/*
	 * 関数名　　：toString
	 * メソッド　：直角二等辺三角形に関する図形情報を表す文字列を返却するメソッド
	 * パラメータ：なし
	 * 返り値　　：文字列DownLeftTriangle(length）
	 * 作成者　　：中西輝
	 * 作成日    ：2026.5.13
	 */
	@Override
	public String toString() {
		//入力された長さを返却
		return "DownLeftTriangle(length:" + getLength() + ")";
	}
	/*
	 * 関数名　　：draw
	 * メソッド　：直角二等辺三角形を描画するメソッド
	 * パラメータ：なし
	 * 返り値　　：なし
	 * 作成者　　：中西輝
	 * 作成日    ：2026.5.13
	 */
	public void draw() {
		//変数iが0から始まり1ずつ増やしていきiが一辺の長さ分になるまで繰り返す
		for(int i = 0;i <= getLength();i++) {
			//変数jが0から始まり1ずつ増やしていきi回繰り返す
			for(int j =  0; j < i;j++)
				//*を表示
				System.out.print("*");
			//改行
			System.out.println();
		}
	}
}

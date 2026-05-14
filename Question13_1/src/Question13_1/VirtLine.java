package Question13_1;
/*
 * クラス名      :VirtLine
 * 概要          :垂直直線を表すクラス
 * 作成者        :中西輝
 * 作成日        :2026.5.12
 */
public class VirtLine extends AbstLine{
	/*
	 * コンストラクタ         :VirtLine
	 * コンストラクタの説明   :垂直直線を生成するコンストラクタ
	 * パラメータの説明       :生成する垂直直線の長さ
	 * 作成者                 :中西輝
	 * 作成日                 :2026.5.12 
	 */
	public VirtLine(int length) {super(length);}
	/*
	 * 関数名　　：toString
	 * メソッド　：垂直直線に関する図形情報を表す文字列を返却するメソッド
	 * パラメータ：なし
	 * 返り値　　：文字列VirtLine(length）
	 * 作成者　　：中西輝
	 * 作成日    ：2026.5.12
	 */
	@Override
	public String toString() {
		//入力された長さを返却
		return "VirtLine(length:" + getLength() + ")";
	}
	/*
	 * 関数名　　：draw
	 * メソッド　：垂直直線を描画するメソッド
	 * パラメータ：なし
	 * 返り値　　：なし
	 * 作成者　　：中西輝
	 * 作成日    ：2026.5.12
	 */
	public void draw() {
		//長さの個数だけ繰り返す
		for(int i = 1; i <= getLength(); i++) {
			//""の中の文字を表示
			System.out.println('|');
		}
	}
}

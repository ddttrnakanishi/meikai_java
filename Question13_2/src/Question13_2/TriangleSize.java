package Question13_2;

/*
 * クラス名      :TriangleSize
 * 概要          :三角形の大きさを表す抽象クラス
 * 作成者        :中西輝
 * 作成日        :2026.5.13
 */
public abstract class TriangleSize extends IsoscelesTriangle{
	
		// 辺の長さを表すint型のフィールドを0で初期化
		private int length = 0;
		/*
		 * コンストラクタ         :TriangleSize
		 * コンストラクタの説明   :三角形を生成するコンストラクタ
		 * パラメータの説明       :生成する三角形の辺の長さ
		 * 作成者                 :中西輝
		 * 作成日                 :2026.5.13
		 */
		public TriangleSize(int length) {
			//setLengthを呼び出してインスタンスを生成する
			setLength(length);
		}
		/*
		 * 関数名　　：getLength
		 * メソッド　：三角形の一辺の長さを取得するメソッド
		 * パラメータ：なし
		 * 返り値　　：length
		 * 作成者　　：中西輝
		 * 作成日    ：2026.5.13
		 */
		public int getLength() {
			//返却
			return length;
		}
		/*
		 * 関数名　　：setLength
		 * メソッド　：三角形の一辺の長さを設定するメソッド
		 * パラメータ：設定する三角形の一辺の長さ
		 * 返り値　　：なし
		 * 作成者　　：中西輝
		 * 作成日    ：2026.5.13
		 */
		public void setLength(int length) {
			//フィールドに受け取った引数の値を設定する
			this.length = length;
		}
		/*
		 * 関数名　　：toString
		 * メソッド　：三角形に関する図形情報を表す文字列を返却するメソッド
		 * パラメータ：なし
		 * 返り値　　：文字列TriangleSize(length）
		 * 作成者　　：中西輝
		 * 作成日    ：2026.5.13
		 */
		public String toString() {
			//入力された長さを返却
			return toString();
		}
	}


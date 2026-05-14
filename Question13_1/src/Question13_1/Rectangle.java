package Question13_1;
/*
 * クラス名      :Rectangle
 * 概要          :長方形を表すクラス
 * 作成者        :中西輝
 * 作成日        :2026.5.12 
 */
public class Rectangle extends Shape{
	//幅を表すint型のフィールドを0で初期化
	private int width = 0;
	//高さを表すint型のフィールドを0で初期化
	private int heigth = 0;
	/*
	 * コンストラクタ         :Rectangle
	 * コンストラクタの説明   :長方形を生成するコンストラクタ
	 * パラメータの説明       :幅と高さ
	 * 作成者                 :中西輝
	 * 作成日                 :2026.5.12
	 */
	public Rectangle(int width, int heigth) {
		//受け取った幅の値をフィールドに設定
		this.width = width;
		//受け取った高さの値をフィールドに設定
		this.heigth = heigth;
	}
	/*
	 * 関数名　　：toString
	 * メソッド　：長方形に関する図形情報を表す文字列を返却するメソッド
	 * パラメータ：なし
	 * 返り値　　：文字列Rectangle(width,heigth）
	 * 作成者　　：中西輝
	 * 作成日    ：2026.5.12
	 */
	@Override
	public String toString() {
		//入力された幅と高さを返却
		return "Rectangle(width:" + width + ", heigth:" + heigth + ")";
	}
	/*
	 * 関数名　　：draw
	 * メソッド　：長方形を描画するメソッド
	 * パラメータ：なし
	 * 返り値　　：なし
	 * 作成者　　：中西輝
	 * 作成日    ：2026.5.12
	 */
	public void draw() {
		//高さの個数だけ繰り返す
		for(int i = 1; i <= heigth; i++) {
			//幅の個数だけ繰り返す
			for(int j = 1; j <= width; j++) {
				//""の中の文字を表示
				System.out.print('*');
			}
			//改行
			System.out.println();
		}
	}
}

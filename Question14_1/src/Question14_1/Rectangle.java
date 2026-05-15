package Question14_1;
/*
 * クラス名      :Rectangle
 * 概要          :長方形を表し計算を行うクラス
 * @author       :中西輝
 * 作成日        :2026.5.13 
 */
public class Rectangle extends Shape implements Plane2D{
	//幅を表すint型のフィールドを0で初期化
	private int width = 0;
	//高さを表すint型のフィールドを0で初期化
	private int heigth = 0;
	/*
	 * コンストラクタ         :Rectangle
	 * コンストラクタの説明   :長方形を生成するコンストラクタ
	 * @param                 :幅と高さ
	 * @author                :中西輝
	 * 作成日                 :2026.5.13
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
	 * @param    ：なし
	 * @return 　：文字列Rectangle(width,heigth）
	 * @author 　：中西輝
	 * 作成日    ：2026.5.13
	 */
	@Override
	public String toString() {
		//入力された幅と高さを返却
		return "Rectangle(width:" + width + ", heigth:" + heigth + ")";
	}
	/*
	 * 関数名　　：draw
	 * メソッド　：長方形を描画するメソッド
	 * @param    ：なし
	 * @return 　：なし
	 * @author 　：中西輝
	 * 作成日    ：2026.5.13
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
	/*
	 * 関数名　　：getArea
	 * メソッド　：長方形を面積を計算するメソッド
	 * @param    ：なし
	 * @return 　：面積
	 * @author 　：中西輝
	 * 作成日    ：2026.5.13
	 */
	public int getArea() {
		//返却
		return width * heigth;
	}
}

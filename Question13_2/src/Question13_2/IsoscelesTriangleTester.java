package Question13_2;
/*
 * クラス名            :IsoscelesTriangleTester
 * 概要                :指定された配列の図形を引数の値の分だけの図形を表示する
 * 作成者              :中西輝
 * 作成日              :2026.5.13
 */
public class IsoscelesTriangleTester {
	/*
	 * 関数名           :main
	 * メソッドの説明   :指定された配列の図形を引数の値の分だけの図形を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.5.13
	 */
	public static void main(String[] args) {
		//要素数が4のIsoscelesTriangle型のインスタンスを作成
		IsoscelesTriangle[] p = new IsoscelesTriangle[4];
		//左下が直角二等辺三角形のインスタンスを参照
		p[0] = new DownLeftTriangle(3);
		//左上が直角二等辺三角形のインスタンスを参照
		p[1] = new UpperLeftTriangle(4);
		//右下が直角二等辺三角形のインスタンスを参照
		p[2] = new DownRigthTriangle(5);
		//右下が直角二等辺三角形のインスタンスを参照
		p[3] = new UpperRightTriangle(6);
		//配列pの結果を一つずつ見ていく
		for(IsoscelesTriangle s : p) {
			//一つずつ指定された図を表示する
			s.print();
			//改行
			System.out.println();
		}
	}
}

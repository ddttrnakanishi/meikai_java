package Question14_1;

import java.util.Scanner;
/*
 * クラス名            :ShapTester
 * 概要                :配列の図形を入力した値の分だけの図形を表示する
 * 					   :入力した値を基に面積を求める
 * @author             :中西輝
 * 作成日              :2026.5.13
 */
public class ShapTester {
	//キーボードで入力した値を入れる変数を作る
	static Scanner STANDARDINPUT = new Scanner(System.in);
	//全体で使えるfinal変数の初期化
	private static final int NUMBERTWO = 2;
	/*
	 * 関数名           :main
	 * メソッドの説明   :配列の図形を入力した値の分だけの図形を表示する
	 * 					:入力した値を基に面積を求める
	 * @param           :なし
	 * @return          :なし
	 * @author          :中西輝
	 * 作成日           :2026.5.13
	 */
	public static void main(String[] args) {

		//howManyの値のshape型のインスタンスを作成
		Shape[] p = new Shape[NUMBERTWO];
		
		//""の中の文字を表示
		System.out.print("長方形の幅:");
		//幅を入力
		int inputWidth = STANDARDINPUT.nextInt();
		//""の中の文字を表示
		System.out.print("長方形の高さ:");
		//高さを入力
		int inputHeigth = STANDARDINPUT.nextInt();
		////入力された数だけの長方形を生成する
		p[0] = new Rectangle(inputWidth, inputHeigth);

		//""の中の文字を表示
		System.out.print("平行四辺形の幅:");
		//幅を入力
		int inputWidth2 = STANDARDINPUT.nextInt();
		//""の中の文字を表示
		System.out.print("平行四辺形の高さ:");
		//高さを入力
		int inputHeigth2 = STANDARDINPUT.nextInt();
		////入力された数だけの長方形を生成する
		p[1] = new Parallelogram(inputWidth2, inputHeigth2);

		//配列pの結果を一つずつ見ていく
		for(Shape s : p) {
			//一つずつ指定された図を表示する
			s.print();
			// もし s が Plane2D インターフェースを実装している場合
			if (s instanceof Plane2D) {
				//""の中の文字と面積を表示して改行
				System.out.println("面積は" + ((Plane2D)s).getArea());
			}
			//改行
			System.out.println();
		}
	}
}


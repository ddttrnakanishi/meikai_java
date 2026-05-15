package Question15_6;
/*
 * クラス名            :CircleInformation
 * 概要                :コマンドライン引数を入力し円の面積と円周の値を表示する
 * @author             :中西輝
 * 作成日              :2026.5.15
 */
public class CircleInformation {
	//クラス全体で使えるfinal変数の初期化
	final static double PI = 3.14; 
	//クラス全体で使えるfinal変数の初期化
	final static int NUMBERTWO = 2;
	/*
	 * 関数名           :main
	 * メソッドの説明   :コマンドライン引数を入力し円の面積と円周の値を表示する
	 * @param           :なし
	 * @return          :なし
	 * @author          :中西輝
	 * 作成日           :2026.5.15
	 */
	public static void main(String[] args) {
		//変数radiusNumberにコマンドライン引数を入力
		double radiusNumber = Double.parseDouble(args[0]);
		//円の面積を求める
		double circleArea = radiusNumber * radiusNumber * PI;
		//円周を求める
		double circlePerimeter = NUMBERTWO * radiusNumber * PI;
		//""の中の文字と面積の値を表示して改行
		System.out.println("円の面積は" + circleArea);
		//""の中の文字と円周の値を表示して改行
		System.out.println("円周は" + circlePerimeter);
	}
}

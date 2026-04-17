package Question6_1;

/*
 * クラス名            :Question6_1
 * 概要                :double型で要素数が5の配列を作り全要素の値を表示
 * 作成者             :中西輝
 * 作成日              :2026.4.15
 */
public class Question6_1 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.15
	 */
	public static void main(String[] args) {
		//double型を構成要素型とし、構成要素数が5の配列の宣言
		double [] elementNumber = new double[5];
		//elementNumber[1]に10を代入
		elementNumber[1] = 10;
		//elementNumber[2]に20を代入
		elementNumber[2] = 20;
		//elementNumber[3]にelementNumber[1]の値の3倍の値を代入
		elementNumber[3] = elementNumber[1] * 3;
		//elementNumber[4]にelementNumber[1]の値の4倍の値を代入
		elementNumber[4] = elementNumber[2] * 4;
		
		//要素の値を表示
		System.out.println("elementNumber[" + 0 + "] = " + elementNumber[0]);
		//要素の値を表示
		System.out.println("elementNumber[" + 1 + "] = " + elementNumber[1]);
		//要素の値を表示
		System.out.println("elementNumber[" + 2 + "] = " + elementNumber[2]);
		//要素の値を表示
		System.out.println("elementNumber[" + 3 + "] = " + elementNumber[3]);
		//要素の値を表示
		System.out.println("elementNumber[" + 4 + "] = " + elementNumber[4]);
	}
}

package Question6_3;
/*
 * クラス名            :Question6_3
 * 概要                :double型で要素数が5の配列を作り先頭から順に1.1,2.2,3.3,4.4,5.5を代入して表示
 * 作成者             :中西輝
 * 作成日              :2026.4.15
 */
public class Question6_3 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理で実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.15
	 */
	public static void main(String[] args) {
		//double型を構成要素とする配列要素数の作成
		double [] elementNumber = new double[5];
		//変数jを初期化
		int j = 0;
		/*変数iが1.1から始まり1.1ずつ増やした値が5.5以上になるまで繰り返す
		 * 変数jを1ずつ増やしていく
		 */
		for(double i = 1.1; i <= 5.5; i += 1.1, j++) {
			//変数elementNumber[j]にiの値を代入
			elementNumber[j] = i ;
			//全要素の値を表示
			System.out.println("elementNumber[" + j + "] = " +elementNumber[j]);
		}
	}
}

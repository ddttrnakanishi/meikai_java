package Question15_7;
/*
 * クラス名            :SumOfArgs
 * 概要                :コマンドライン引数を入力し合計を表示する
 * @author             :中西輝
 * 作成日              :2026.5.15
 */
public class SumOfArgs {
	/*
	 * 関数名           :main
	 * メソッドの説明   :コマンドライン引数を入力し合計を表示する
	 * @param           :なし
	 * @return          :なし
	 * @author          :中西輝
	 * 作成日           :2026.5.15
	 */
	public static void main(String[] args) {
		//sumを初期化
		double sum = 0.0;
		//コマンドライン引数を一つずつ見る
		for(String i : args) {
			//合計にコマンドライン引数を足す
			sum += Double.parseDouble(i);
		}
		//""の中の文字と合計を表示して改行
		System.out.println("合計は" + sum + "です。");
	}
}

package Question5_7;

/*
 * クラス名            :Question5_7
 * 概要                :0.0から1.0まで0.001おきの値とその値の二乗した値を表示
 * 作成者             :中西輝
 * 作成日              :2026.4.15
 */
public class Question5_7 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理で実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.15
	 */
	public static void main(String[] args) {
		//()内の文字を表示
		System.out.println("  その値       二乗した値   ");
		//()内の文字を表示
		System.out.println("----------------------------");
		//変数iを0.0から1.0まで0.001ずつ増やしていく
		for(float i = 0.0F; i <= 1.0F; i += 0.001F) {
			//小数点以下7桁の変数iと変数iの二乗の値を表示
			System.out.printf("%8.7f     %8.7f\n",i , i * i);
		}
	}
}

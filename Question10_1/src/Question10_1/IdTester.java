package Question10_1;
/*
 * クラス名            :IdTester
 * 概要                :Idクラスの識別番号を作成しそれぞれの番号と最後に与えた番号を表示
 * 作成者              :中西輝
 * 作成日              :2026.4.30
 */
public class IdTester {
	/*
	 * 関数名           :main
	 * メソッドの説明   :Idクラスの識別番号を作成しそれぞれの番号と最後に与えた番号を返却された値を基に表示
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.230
	 */
	public static void main(String[] args) {
		//Idクラスの識別番号の作成
		Id a = new Id();
		//Idクラスの識別番号の作成
		Id b = new Id();
		//""の中の文字とgetInstanceCounterの返却値を表示して改行
		System.out.println("aの識別番号 :" + a.getInstanceCounter());
		//""の中の文字とgetInstanceCounterの返却値を表示して改行
		System.out.println("bの識別番号 :" + b.getInstanceCounter());
		//""の中の文字とgetMaxIdの返却値を表示して改行
		System.out.println("aの最後の識別番号 :" + a.getMaxId());
		//""の中の文字とgetMaxIdの返却値を表示して改行
		System.out.println("bの最後の識別番号 :" + b.getMaxId());
	}
}

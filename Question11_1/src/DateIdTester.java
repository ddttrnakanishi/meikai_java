import id.DateId;
/*
 * クラス名            :DateIdTester
 * 概要                :a,b,cの識別番号を表示する
 * 作成者              :中西輝
 * 作成日              :2026.5.11
 */
public class DateIdTester {
	/*
	 * 関数名           :main
	 * メソッドの説明   :DateIdクラスの識別番号を作成しそれぞれの値を表示
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.5.11
	 */
	public static void main(String[] args) {
		//DateIdクラスのインスタンスを生成する
		DateId dateNumber1 = new DateId();
		//DateIdクラスのインスタンスを生成する
		DateId dateNumber2 = new DateId();
		//DateIdクラスのインスタンスを生成する
		DateId cdateNumber3 = new DateId();
		//""の中の文字とdateNumber1の識別番号を表示して改行する
		System.out.println("aの識別番号 : " + dateNumber1.getId());
		//""の中の文字とdateNumber2の識別番号を表示して改行する
		System.out.println("bの識別番号 : " + dateNumber2.getId());
		//""の中の文字とcdateNumber3の識別番号を表示して改行する
		System.out.println("cの識別番号 : " + cdateNumber3.getId());
	}
}



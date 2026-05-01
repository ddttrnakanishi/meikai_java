package Question10_2;
/*
 * クラス名            :ExIdTester
 * 概要                :ExIdクラスの識別番号を作成しそれぞれの番号または変更した分の値を足した値を表示
 * 作成者              :中西輝
 * 作成日              :2026.4.30
 */
public class ExIdTester {
	/*
	 * 関数名           :main
	 * メソッドの説明   :ExIdクラスの識別番号を作成しそれぞれの番号または変更した分の値を足した値を表示
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.30
	 */
	public static void main(String[] args) {
		//ExIdクラスの識別番号の作成
		ExId numberOne = new ExId();
		//""の中の文字とnumberOneの返却値を表示して改行
		System.out.println("numberOneの識別番号 :" + numberOne.getInstanceCounter());
		ExId.changeNumber();
		//ExIdクラスの識別番号の作成0
		ExId numberTwo = new ExId();
		//""の中の文字とnumberTwoの返却値を表示して改行
		System.out.println("numberTwoの識別番号 :" + numberTwo.getInstanceCounter());
		ExId.changeNumber();
		//ExIdクラスの識別番号の作成
		ExId numberThree = new ExId();
		//""の中の文字とnumberThreeの返却値を表示して改行
		System.out.println("numberThreeの識別番号 :" + numberThree.getInstanceCounter());
		ExId.changeNumber();
		//ExIdクラスの識別番号の作成
		ExId numberFour = new ExId();
		//""の中の文字とnumberFourの返却値を表示して改行
		System.out.println("numberFourの識別番号 :" + numberFour.getInstanceCounter());
		ExId.changeNumber();
		//ExIdクラスの識別番号の作成
		ExId numberFive = new ExId();
		//""の中の文字とnumberFiveの返却値を表示して改行
		System.out.println("numberFiveの識別番号 :" + numberFive.getInstanceCounter());
		ExId.changeNumber();
		//ExIdクラスの識別番号の作成
		ExId numberSix = new ExId();
		//""の中の文字とnumberSixの返却値を表示して改行
		System.out.println("numberSixの識別番号 :" + numberSix.getInstanceCounter());
	}

}

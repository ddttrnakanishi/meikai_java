package Question8_2;
/*
 * クラス名            :Car
 * 概要                :コンストラクタの設定とCarTesterで入力された物を表示する
 * 						NewAndUsedCarメソッド処理を行う
 * 作成者             :中西輝
 * 作成日              :2026.4.28
 */
public class Car {
	//何年から乗っているかを表すint型のNewOrOld
	private static int NewOrOld;
	//色を表すString型のcolour
	private static String colour;
	//製造年を表すint型のModelYear
	private static int ModelYear;
	//ナンバーを表すint型のNumber
	private static int Number;
	/*
	 * コンストラクタ   :Car
	 * メソッドの説明   :クラスのインスタンスが生成される際のコンストラクタを作成
	 * パラメータの説明 :何年から乗っているか、色、製造年、ナンバー
	 * 作成者           :中西輝
	 * 作成日           :2026.4.28
	 */
	Car(int whatYear, String colour, int ModelYear,int Number){
		//フィールドに仮引数の値を代入
		this.NewOrOld = whatYear;
		//フィールドに仮引数の文字を代入
		this.colour = colour;
		//フィールドに仮引数の値を代入
		this.ModelYear = ModelYear;
		//フィールドに仮引数の値を代入
		this.Number = Number;
	}
	/*
	 * 関数名           :putSpec
	 * メソッドの説明   :各情報の表示
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.28
	 */
	void putSpec() {
		//""の中の文字と名前の文字を表示して改行
		System.out.println("色 :" + colour);
		//""の中の文字と製造年の値を表示して改行
		System.out.println("製造年 :" + ModelYear + "年");
		//""の中の文字とナンバーの値を表示して改行
		System.out.println("ナンバー :" + Number);
	}
	/*
	 * 関数名           :NewAndUsedCar
	 * メソッドの説明   :whatYearが5以上の時false、それ以外trueを返却
	 * パラメータの説明 :何年目か
	 * 返り値           :false、true
	 * 作成者           :中西輝
	 * 作成日           :2026.4.28
	 */
	public boolean NewAndUsedCar(int whatYear) {
		//whatYearが5以上の時
		if(whatYear >= 5) {
			//返却
			return false;
		}
		//それ以外
		else {
			//trueを返却
			return true;
		}
	}
}

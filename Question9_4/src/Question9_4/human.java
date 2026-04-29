package Question9_4;

/*
 * クラス名            :human
 * 概要                :コンストラクタの設定とHumanInformationTesterで入力された物を表示する
 * 作成者             :中西輝
 * 作成日              :2026.4.29
 */
public class human {
	//名前を表すString型のnameInformationを初期化
	private String nameInformation;
	//身長を表すdouble型のheightInformationを初期化
	private double heightInformation = 0;
	//体重を表すdouble型のweightInformationを初期化
	private double weightInformation = 0;
	//誕生日を表すDayクラス型のbirthdayNumberを初期化
	private Day birthdayNumber;
	/*
	 * コンストラクタ   :Human
	 * コンストラクタの説明   :クラスのインスタンスが生成される際のコンストラクタを作成
	 * パラメータの説明 :文字型の名前、double型の身長、double型の体重、誕生日
	 * 作成者             :中西輝
	 * 作成日              :2026.4.29
	 */
	human(String nameInformation, double heightInformation, double weightInformation, Day birthdayNumber){
		//フィールドに仮引数の文字を代入
		this.nameInformation = nameInformation;
		//フィールドに仮引数の値を代入
		this.heightInformation = heightInformation;
		//フィールドに仮引数の値を代入
		this.weightInformation = weightInformation;
		//フィールドに仮引数の日付のコピーを代入
		this.birthdayNumber = new Day (birthdayNumber);
	}
	/*
	 * 関数名　　：getaccountOpening
	 * メソッド　：日付を取得するためのメソッド
	 * パラメータ：なし
	 * 返り値　　：日付
	 * 作成者　　 :中西輝
	 * 日付　　　：2026/04/29
	 */
	public Day getbirthdayInformation() {
		//返却
		return new Day(birthdayNumber);
	}

}


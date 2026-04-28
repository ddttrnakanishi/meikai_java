package Question8_1;
/*
 * クラス名            :Human
 * 概要                :コンストラクタの設定とHumanInformationTesterで入力された物を表示する
 * 作成者             :中西輝
 * 作成日              :2026.4.28
 */
class Human{
	//名前を表すString型のnameInformation
	private static String nameInformation;
	//身長を表すdouble型のheightInformation
	private static double heightInformation;
	//体重を表すdouble型のweightInformation
	private static double weightInformation;
	/*
	 * コンストラクタ   :Human
	 * メソッドの説明   :クラスのインスタンスが生成される際のコンストラクタを作成
	 * パラメータの説明 :文字型の名前、double型の身長、double型の体重
	 * 作成者             :中西輝
	 * 作成日              :2026.4.28
	 */
	Human(String nameInformation, double heightInformation, double weightInformation){
		//フィールドに仮引数の文字を代入
		this.nameInformation = nameInformation;
		//フィールドに仮引数の値を代入
		this.heightInformation = heightInformation;
		//フィールドに仮引数の値を代入
		this.weightInformation = weightInformation;
	}
	/*
	 * 関数名           :putInformation
	 * メソッドの説明   :各情報の表示
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.28
	 */
	public static void putInformation() {
		//""の中の文字と名前の文字を表示して改行
		System.out.println("名前 :" + nameInformation);
		//""の中の文字と身長の値を表示して改行
		System.out.println("身長 :" + heightInformation + "cm");
		//""の中の文字と体重の値を表示して改行
		System.out.println("体重 :" + weightInformation + "kg");
	} 
}

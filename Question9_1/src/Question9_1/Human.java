package Question9_1;
/*
 * クラス名            :Human
 * 概要                :コンストラクタの設定,フィールドの値を取得するゲッタと設定するセッタの作成
 * 作成者             :中西輝
 * 作成日              :2026.4.28
 */
public class Human {
	//名前を表すString型のnameInformationを初期化
	private  String nameInformation;
	//身長を表すdouble型のheightInformationを初期化
	private double heightInformation = 0;
	//体重を表すdouble型のweightInformationを初期化
	private double weightInformation = 0;
	/*
	 * コンストラクタ   :Human
	 * メソッドの説明   :クラスのインスタンスが生成される際のコンストラクタを作成
	 *					 フィールドの値を取得するゲッタと設定するセッタの作成
	 * パラメータの説明 :文字型の名前、double型の身長、double型の体重
	 * 作成者             :中西輝
	 * 作成日              :2026.4.28
	 */
	public Human(String nameInformation, int heightInformation, int weightInformation) {
		//フィールドに仮引数の文字を代入
		this.nameInformation = nameInformation;
		//フィールドに仮引数の値を代入
		this.heightInformation = heightInformation;
		//フィールドに仮引数の値を代入
		this.weightInformation = weightInformation;
	}
	//名前を取得
	String getNameInformation() { return nameInformation; }
	//身長を取得
	double getHeightInformation() { return heightInformation; }
	//体重を取得
	double getWeightInformation() { return weightInformation; }
	//名前を設定
	void setNameInformation() { this.nameInformation = nameInformation; }
	//名前を設定
	void setHeightInformation() { this.heightInformation = heightInformation; }
	//名前を設定
	void setWeightInformation() { this.weightInformation = weightInformation; }
}


package Question13_4;
/*
 * クラス名            :Human
 * 概要                :コンストラクタの設定とHumanInformationTesterで入力された物を表示する
 * @author　　　　　　 :中西輝
 * 作成日              :2026.5.13
 */
public class Human {
	//名前を表すString型のnameInformationを初期化
		private String nameInformation;
		//身長を表すdouble型のheightInformationを初期化
		private double heightInformation = 0;
		//体重を表すdouble型のweightInformationを初期化
		private double weightInformation = 0;
		//誕生日を表すDayクラス型のbirthdayNumberを初期化
		private Day birthdayNumber;
		/*
		 * コンストラクタ         :Human
		 * コンストラクタの説明   :クラスのインスタンスが生成される際のコンストラクタを作成
		 * @param 　　　　　　　　:文字型の名前、double型の身長、double型の体重、誕生日
		 * @author          　　　:中西輝
		 * 作成日                 :2026.5.13
		 */
		Human(String nameInformation, double heightInformation, double weightInformation, Day birthdayNumber){
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
		 * 関数名　　：getbirthdayInformation
		 * メソッド　：日付を取得するためのメソッド
		 * @param　　：なし
		 * @return　 ：日付
		 * @author　 ：中西輝
		 * 日付　　　：2026.5.13
		 */
		public Day getbirthdayInformation() {
			//返却
			return new Day(birthdayNumber);
		}
	}

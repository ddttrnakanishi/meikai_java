package Question7_8;

import java.util.Random;
/*
 * クラス名            :Question7_8
 * 概要                :'*'を連続表示するメソッドputStarsを内部でメソッドputCharsを
 * 　　　　　　　　　　　呼び出すことによって表示を行う
 * 作成者             　:中西輝
 * 作成日              :2026.4.21
 */
public class Question7_8 {
	/*
	 * 関数名           :putChars
	 * メソッドの説明   :入力された段数の値が0以上の時文字を表示する
	 * パラメータの説明 :文字と段数
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.21
	 */
	static int random(int randomValue1, int randomValue2) {
		int differenceNumber = 0;
		if(randomValue1 < randomValue2) {
			differenceNumber = randomValue2 - randomValue1;
			int randomValue3 = Random.nextInt(randomValue1 + differenceNumber);
		}
		else {
			return differenceNumber = randomValue1;
		}
		
	}

	public static void main(String[] args) {
		Random randomNumber = new Random();
		int randomValue1 = Random.nextInt();
		int randomValue2 = Random.nextInt();

	}

}

package Question7_3;

import java.util.Scanner;
/*
 * クラス名            :Question7_3
 * 概要                :三つのint型引数inputValue1,inputValue2,inputValue3の中央値をお求める
 * 作成者             　:中西輝
 * 作成日              :2026.4.21
 */
public class Question7_3 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理とmedianNumber処理
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.21
	 */
	static int medianNumber(int inputValue1, int inputValue2, int inputValue3 ) {
		//変数medianNumberの初期化
		int medianNumber = 0;
		/*inputValue1がinputValue2よりも大きくinputValue3よりも小さいとき
		 * inputValue1がinputValue3よりも大きくinputValue2よりも小さいとき
		 */
		if ((inputValue1 >= inputValue2 && inputValue3 >= inputValue1)
				||(inputValue1 <= inputValue2 && inputValue3 <= inputValue1)) {
			//medianNumberに入力値2を代入
			medianNumber = inputValue1;
		}
		/*inputValue2がinputValue1よりも大きくinputValue3よりも小さいとき
		 * inputValue2がinputValue3よりも大きくinputValue1よりも小さいとき
		 */
		else if ((inputValue1 <= inputValue2 && inputValue3 >= inputValue2)
				||(inputValue1 >= inputValue2 && inputValue3 <= inputValue2)) {
			//medianNumberに入力値2を代入
			medianNumber = inputValue2;
		}
		//それ以外		
		else { 
			//medianNumberに入力値3を代入
			medianNumber = inputValue3;
		}
		//返却
		return medianNumber;
	}
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示
		System.out.print("inputValue1の値 :");
		//入力値1の値を入力
		int inputValue1 = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("inputValue2の値 :");
		//入力値2の値を入力
		int inputValue2 = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("inputValue3の値 :");
		//入力値3の値を入力
		int inputValue3 = standardInput.nextInt();
		//""の中の文字と返却値を表示して改行
		System.out.println("中央値は" + medianNumber(inputValue1, inputValue2, inputValue3 ) + "です。");
	}
}


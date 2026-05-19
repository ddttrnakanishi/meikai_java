package Question16_3;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * クラス名            :Question16_3
 * 概要                :引数に整数を受け取り、整数値の桁数をだし返却する
 * 					　 :整数値以外が入力された場合はもう一度入力させる
 * @author             :中西輝
 * 作成日              :2026.5.19
 */
public class Question16_3 {
	//キーボードで入力した値を入れる変数を作る
	private final static Scanner STANDARDINPUT = new Scanner(System.in);
	//全体で使えるfinal変数NUMBER10の作成
	private static final int NUMBER10 = 10;
	//全体で使えるfinal変数NUMBERZEROの作成
	private static final int NUMBERZERO = 0;
	/*
	 * 関数名　　：tryParseInt
	 * メソッド　：引数に整数を受け取り、整数値の桁数をだし返却する
	 * 			 ：整数値以外が入力された場合はもう一度入力させる
	 * @param    ：入力した値
	 * @return 　：桁数
	 * @throws 　：InputMismatchException　エラー
	 * @author　 ：中西輝
	 * 作成日    ：2026.5.19
	 */
	public static int tryParseInt  (int inputString)throws InputMismatchException{

		//変数numberTimesの初期化
		int numberTimes = 0;
		//trueである場合繰り返す
		while(true) {
			//処理する
			try {
				//繰り返し
				do {
					//整数値を表示
					System.out.print("整数値:");
					//inputStringに数値を入力
					inputString = STANDARDINPUT.nextInt();
					//inputStringが0以下の場合繰り返す
				}while(inputString <= NUMBERZERO);

				//変数dividedNumberの宣言
				int  dividedNumber = inputString;
				//dividedNumberが0より大きい場合繰り返す
				while(dividedNumber > NUMBERZERO) {
					//dividedNumberはfirstValueを10で割った数
					dividedNumber = inputString /= NUMBER10;
					//numberTimesに+1する
					numberTimes++;
				}
				//飛び出す
				break;
			}
			//整数以外が入力された場合
			catch(InputMismatchException e) {
				//""の中の文字を表示して改行
				System.out.println("整数以外が入力されました");
				//無限ループしてしまうため文字を保持
				STANDARDINPUT.next();
			}
		}
		//返却
		return numberTimes;
	}
	/*
	 * 関数名           :main
	 * メソッドの説明   :整数を入力しtryParseIntメソッドの結果を表示する
	 * @param           :なし
	 * @return          :なし
	 * @author          :中西輝
	 * 作成日           :2026.5.19
	 */
	public static void main(String[] args) {
		////変数inputStringの初期化
		int inputString = 0 ;
		//""の中の文字を表示
		System.out.println("整数を入力してください");
		//tryParseIntの処理の結果を表示して改行
		System.out.println(tryParseInt(inputString) + "は桁です");
	}
}

package Question16_2;

import java.util.Scanner;
/*
 * クラス名            :Question16_2
 * 概要                :引数に文字列を受け取り、整数値に変換し返却する
 * 					　 :整数値以外が入力された場合は出来ないことを表示する
 * @author             :中西輝
 * 作成日              :2026.5.18
 */
public class Question16_2 {
	/*
	 * 関数名　　：tryParseInt
	 * メソッド　：引数に文字列を受け取り、整数値に変換し返却するメソッド
	 * @param    ：入力した値
	 * @return 　：整数値
	 * @throws 　：ParseException　エラー
	 * @author　 ：中西輝
	 * 作成日    ：2026.5.18
	 */
	public static int tryParseInt  (String inputString)throws ParseException {
		//変数changeStringの初期化
		int changeString = 0;
		//変換する
		try {
			//文字列から整数値に変換
			changeString = Integer.parseInt(inputString);
		}
		//変換できない場合
		catch(NumberFormatException e){
			//""の中の文字と入力した文字を表示して改行
			throw new ParseException("//エラー//\n入力された文字列" + inputString + "は整数に変換できません。");
		}
		//返却
		return changeString;
	}
	/*
	 * 関数名           :main
	 * メソッドの説明   :整数を入力しtryParseIntメソッドの結果を表示する
	 * @param           :なし
	 * @return          :なし
	 * @author          :中西輝
	 * 作成日           :2026.5.18
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示
		System.out.print("整数を入力 :");
		//文字を入力
		String inputString = standardInput.next();
		//変換する
		try {
			//文字列から整数値に変換
			int changeString = tryParseInt(inputString);
			//""の中の文字と整数値を表示して改行
			System.out.println("整数値に変換:" + changeString);
		}
		//変換できない場合
		catch(ParseException e){
			//getMessageを受け取り表示する
			System.out.println(e.getMessage());
		}
	}
}

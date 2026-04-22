package Question7_9;
import java.util.Scanner;
/*
 * クラス名             :Question7_9
 * 概要                 :正の整数値と表示してキーボードから読み取りその値を返却する
 * 作成者             　:中西輝
 * 作成日               :2026.4.22
 */
public class Question7_9 {
	/*
	 * 関数名           　:readPlusInt
	 * メソッドの説明   　:入力値が0以下なら再度読み込み返却
	 * パラメータの説明　 :なし
	 * 返り値          　 :正の入力値
	 * 作成者          　 :中西輝
	 * 作成日          　 :2026.4.22
	 */
	static int readPlusInt() {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示
		System.out.print("正の整数値 :");
		//入力値の値を入力
		int inputNumber = standardInput.nextInt();
		//入力値が0以下なら繰り返す
		while(inputNumber <= 0){
			//""の中の文字を表示
			System.out.print("正の整数値 :");
			//再度入力する
			inputNumber = standardInput.nextInt();
		}
		//入力値を返却する
		return inputNumber;
	}
	/*
	 * 関数名           　:main
	 * メソッドの説明   　:readPlusIntメソッドの返却値を受け取る
	 * パラメータの説明　 :なし
	 * 返り値           　:なし
	 * 作成者           　:中西輝
	 * 作成日           　:2026.4.22
	 */
	public static void main(String[] args) {
		//返却値を受け取る
		readPlusInt();
	}
}

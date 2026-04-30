package Question10_2;

import java.util.Scanner;
/*
 * クラス名            :ExId
 * 概要                :コンストラクタの設定と識別番号を決めるメソッドの作成
 * 作成者              :中西輝
 * 作成日              :2026.4.30
 */
public class ExId {
	//キーボードで入力した値を入れる変数を作る
	static Scanner standardInput = new Scanner(System.in);
	//クラス変数の初期化
	private static int classCounter = 1;
	//クラス変数の初期化
	private static int pulusNumber = 0;
	//インスタンス変数の初期化
	private  int instanceCounter = 0;
	/*
	 * コンストラクタ         :ExId
	 * コンストラクタの説明   :インスタンス変数にclassCounter+pulusNumberしたクラス変数を代入
	 * パラメータの説明       :なし
	 * 作成者                 :中西輝
	 * 作成日                 :2026.4.30
	 */
	public ExId() {
		//インスタンス変数にclassCounter + pulusNumberしたクラス変数を代入
		instanceCounter = classCounter + pulusNumber;
		//クラス変数にインスタンス変数を代入
		classCounter = instanceCounter;
	}
	/*
	 * 関数名　　：changeNumber
	 * メソッド　：足していく値を変化させる問うメソッド
	 * パラメータ：なし
	 * 返り値　　：なし
	 * 作成者　　 :中西輝
	 * 日付　　　：2026/04/30
	 */
	public static void changeNumber() {
		//""の中の文字を表示
		System.out.print("足していく値を変更しますか？ Yes…1/No…0 :");
		//1or0を入力
		int answerNumber = standardInput.nextInt();
		//1の場合
		if(answerNumber == 1) {
			//""の中の文字を表示
			System.out.print("いくつに変更しますか？");
			//変更する値を入力
			pulusNumber = standardInput.nextInt();
		}
	}
	/*
	 * 関数名　　：getInstanceCounter
	 * メソッド　：インスタンス変数を取得するためのメソッド
	 * パラメータ：なし
	 * 返り値　　：インスタンス変数
	 * 作成者　　 :中西輝
	 * 日付　　　：2026/04/30
	 */
	public int getInstanceCounter() {
		//返却
		return instanceCounter;
	} 

}



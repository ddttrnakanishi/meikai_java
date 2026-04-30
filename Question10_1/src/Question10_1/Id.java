package Question10_1;
/*
 * クラス名            :Id
 * 概要                :コンストラクタの設定と識別番号を決めるメソッドの作成
 * 作成者              :中西輝
 * 作成日              :2026.4.30
 */
public class Id {
	//クラス変数の初期化
	private static int classCounter = 0;
	//インスタンス変数の初期化
	private  int instanceCounter = 0;
	/*
	 * コンストラクタ         :Id
	 * コンストラクタの説明   :インスタンス変数に+1したクラス変数を代入
	 * パラメータの説明       :なし
	 * 作成者                 :中西輝
	 * 作成日                 :2026.4.30
	 */
	public Id() {
		//インスタンス変数に+1したクラス変数を代入
		instanceCounter = ++classCounter;
	}
	/*
	 * 関数名　　：getMaxId
	 * メソッド　：クラス変数を取得するためのメソッド
	 * パラメータ：なし
	 * 返り値　　：クラス変数
	 * 作成者　　 :中西輝
	 * 日付　　　：2026/04/30
	 */
	public static int getMaxId() {
		//返却
		return classCounter;
	}
	/*
	 * 関数名　　：getInstanceCounter
	 * メソッド　：インスタンス変数を取得するためのメソッド
	 * パラメータ：なし
	 * 返り値　　：インスタンス変数
	 * 作成者　　 :中西輝
	 * 日付　　　：2026/04/30
	 */
	public  int getInstanceCounter() {
		//返却
		return instanceCounter;
	}
}

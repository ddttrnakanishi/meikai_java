package Question12_2;

public class Account {
	//名前を表すString型のnameを初期化
	private String name = null;
	//口座番号を表すString型のnoを初期化
	private String no = null;
	//預金残高を表すString型のbalanceを初期化
	private long balance = 0;

	/*
	 * コンストラクタ   :Account
	 * コンストラクタの説明   :クラスのインスタンスが生成される際のコンストラクタを作成
	 *					 フィールドの値を取得するゲッタの作成
	 * パラメータの説明 :名前、口座番号、預金残高、
	 * 作成者             :中西輝
	 * 作成日              :2026.4.29
	 */
	public Account(String n, String num, long balance){
		//フィールドに仮引数の文字を代入
		this.name = n;
		//フィールドに仮引数の値を代入
		this.no = num;
		//フィールドに仮引数の値を代入
		this.balance = balance ;


	}
	/*
	 * 関数名　　：getName
	 * メソッド　：名前を取得するためのメソッド
	 * パラメータ：なし
	 * 返り値　　：name
	 * 作成者　　 :中西輝
	 * 日付　　　：2026/04/29
	 */
	public String getName() {
		//返却
		return name;
	}
	/*
	 * 関数名　　：getNo
	 * メソッド　：口座番号を取得するためのメソッド
	 * パラメータ：なし
	 * 返り値　　：no
	 * 作成者　　 :中西輝
	 * 日付　　　：2026/04/29
	 */
	public String getNo() {
		//返却
		return no;
	}
	/*
	 * 関数名　　：getBalance
	 * メソッド　：預金残高を取得するためのメソッド
	 * パラメータ：なし
	 * 返り値　　：balance
	 * 作成者　　 :中西輝
	 * 日付　　　：2026/04/29
	 */
	public long getBalance() {
		//返却
		return balance;
	}
	/*
	 * 関数名　　：deposit
	 * メソッド　：預金残高を取得するためのメソッド
	 * パラメータ：なし
	 * 返り値　　：なし
	 * 作成者　　 :中西輝
	 * 日付　　　：2026/04/29
	 */
	public void deposit(long k) {
		//預金残高にkの値を足す
		balance += k;
	}
	/*
	 * 関数名　　：withdraw
	 * メソッド　：預金残高を取得するためのメソッド
	 * パラメータ：なし
	 * 返り値　　：なし
	 * 作成者　　 :中西輝
	 * 日付　　　：2026/04/29
	 */
	public void withdraw(long k) {
		//預金残高からkの値を引く
		balance -= k;
	}
}

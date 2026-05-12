package Question12_2;

public class TimeAccount extends Account {
	private long timeBalance;
	/*
	 * コンストラクタ   　　　:TimeAccount
	 * コンストラクタの説明   :クラスの継承と新たなインスタンスの生成
	 * パラメータの説明 　　　:名前、口座番号、預金残高、定期預金残高
	 * 作成者           　　  :中西輝
	 * 作成日				　:2026.5.12
	 */
	TimeAccount(String n, String num, long Balance, long timeBalance) {
		//スーパークラスのコンストラクタの呼び出し
		super(n, num, Balance);
		//フィールドに仮引数の値を代入
		this.timeBalance = timeBalance;
	}
	/*
	 * 関数名　　：getTimeBalance
	 * メソッド　：timeBalanceを取得するメソッド
	 * パラメータ：なし
	 * 返り値　　：timeBalance
	 * 作成者	 ：中西輝
	 * 日付　　　：2026.5.12
	 */
	long getTimeBalance() {
		//返却
		return timeBalance;
	}
	/*
	 * 関数名　　：sumBalance
	 * メソッド　：預金残高と定期預金残高を足すメソッド
	 * パラメータ：なし
	 * 返り値　　：sumBalance
	 * 作成者	 ：中西輝
	 * 日付　　　：2026.5.12
	 */
	public long sumBalance() {
		//変数sumBalanceの初期化
		long sumBalance = 0;
		//預金残高と定期預金残高を足して代入
		sumBalance = timeBalance + getBalance();
		//返却
		return sumBalance;
	}
}

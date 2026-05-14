package Question12_2;
/*
 * クラス名            :compBalanceTester　
 * 概要                :両者の預金残高の合計を比較する
 * 作成者              :中西輝
 * 作成日              :2026.5.12
 */
public class compBalanceTester {
	/*
	 * 関数名　　：compBalance
	 * メソッド　：両者の預金残高の合計を比較し結果を表示する
	 * パラメータ：なし
	 * 返り値　　：なし
	 * 作成者	 ：中西輝
	 * 日付　　　：2026.5.12
	 */
	private static int compBalance(Account a, Account b) {
		//変数aTotalの初期化
		long aTotal = 0;
		//もしaがTimeAccountなら
		if (a instanceof TimeAccount) {
			// sumBalance()を呼ぶ
			aTotal = ((TimeAccount) a).sumBalance();
		} 
		//それ以外
		else {
			// getBalance()を呼ぶ
			aTotal = b.getBalance();
		}
		//変数bTotalの初期化
		long bTotal = 0;
		//もしbがTimeAccountなら
		if (b instanceof TimeAccount) {
			// sumBalance()を呼ぶ
			bTotal = ((TimeAccount) b).sumBalance();
		} 
		//それ以外
		else {
			// getBalance()を呼ぶ
			bTotal = b.getBalance();
		}
		//aの預金残高よりｂの預金残高が少ないとき
		if (aTotal > bTotal) {
			//1を返却
			return 1;
		} 
		//aの預金残高よりｂの預金残高が多いとき	
		else if (aTotal < bTotal) {
			//-1を返却
			return -1;
		}
		//0を返却
		return 0;
	}
	/*
	 * 関数名           :main
	 * メソッドの説明   :compBalanceの結果を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.5.12
	 */
	public static void main(String[] args) {
		//クラスのインスタンスを初期化
		Account a = new Account ("Aさん", "123456", 600 );
		//クラスのインスタンスを初期化
		TimeAccount b = new TimeAccount ("Bさん", "654321", 200, 500 );
		//compBalanceメソッドの結果を基に表示する
		switch(compBalance(a, b)) {
		//0の場合""の中の文字を表示して改行し抜けだす
		case  0 : System.out.println("AさんとBさんの預金残高は同じ。"); break;
		//1の場合""の中の文字を表示して改行し抜けだす
		case  1 : System.out.println("Aさんの方が預金残高が多い。"); break;
		//-1の場合""の中の文字を表示して改行し抜けだす
		case -1 : System.out.println("Bさんの方が預金残高が多い。"); break;
		}
	}
}

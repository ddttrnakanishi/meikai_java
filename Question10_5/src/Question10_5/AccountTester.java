package Question10_5;
/*
 * クラス名            :AccountTester
 * 概要                :二人の情報を表示する
 * 作成者              :中西輝
 * 作成日              :2026.5.11
 */
public class AccountTester {
	/*
	 * 関数名           :main
	 * メソッドの説明   :インスタンスを生成し表示する内容を決めて各項目ごとに表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.5.11
	 */
	public static void main(String[] args) {
		//クラスのインスタンスを初期化
		Account adachi = new Account("足立幸一", "123456", 1000);
		//足立君の残高から-200
		adachi.withdraw(200);
		//""の中の文字を表示して改行
		System.out.println("■足立君の口座");
		//""の中の文字を表示して改行
		System.out.println("　口座名義 :" + adachi.getName());
		//""の中の文字を表示しgetNoの処理結果を表示して改行
		System.out.println("　口座番号 :" + adachi.getNo());
		//""の中の文字を表示しgetbalanceの処理結果を表示して改行
		System.out.println("　預金残高 :" + adachi.getBalance());
		//クラスのインスタンスを初期化
		Account nakata = new Account("仲田真二", "654321", 200);
		//仲田君の残高に+100
		nakata.deposit(100);
		//""の中の文字を表示して改行
		System.out.println("■仲田君の口座");
		//""の中の文字を表示して改行
		System.out.println("　口座名義 :" + nakata.getName());
		//""の中の文字を表示しgetNoの処理結果を表示して改行
		System.out.println("　口座番号 :" + nakata.getNo());
		//""の中の文字を表示しgetbalanceの処理結果を表示して改行
		System.out.println("　預金残高 :" + nakata.getBalance());
	}
}

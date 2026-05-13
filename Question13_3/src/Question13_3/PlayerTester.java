package Question13_3;
/*
 * クラス名            :PlayerTester
 * 概要                :各プレイヤーの出す手をテストし受け取るクラス。
 * 作成者              :中西輝
 * 作成日              :2026.5.13
 */
public class PlayerTester {
	/*
	 * 関数名           :main
	 * メソッドの説明   :各プレイヤーの出す手をテストし受け取る
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.5.13
	 */
	public static void main(String[] args) {
		//要素数が2のPlayer型のインスタンスを作成
		Player[] p = new  Player[2];
		//人間プレイヤーのインスタンスを参照
		p[0] = new HumanPlayer();
		//コンピュータプレイヤーのインスタンスを参照
		p[1] = new ComputerPlayer();

		//配列pの結果を一つずつ見ていく
		for(Player s : p) {
			//各結果を受け取る
			s.decideHand();
			//改行
			System.out.println();
		}
	}
}

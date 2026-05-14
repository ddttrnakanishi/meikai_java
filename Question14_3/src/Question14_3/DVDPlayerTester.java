package Question14_3;
/*
 * クラス名            :DVDPlayerTester
 * 概要                :配列の分だけの文字を表示する
 * @author             :中西輝
 * 作成日              :2026.5.14
 */
public class DVDPlayerTester {
	/*
	 * 関数名           :main
	 * メソッドの説明   :配列の分だけの文字を表示する
	 * @param           :なし
	 * @return          :なし
	 * @author          :中西輝
	 * 作成日           :2026.5.14
	 */
	public static void main(String[] args) {
		//要素数が2のDVDPlayer型のインスタンスを作成
		DVDPlayer[] a = new DVDPlayer[2];
		// 新しい配列を作成する
		a[0] = new DVDPlayer();
		// 新しい配列を作成する
		a[1] = new DVDPlayer();
		//配列を一つずつ見ていく
		for(DVDPlayer p : a) {
			//文字を表示する
			p.play();
			//文字を表示する
			p.stop();
			//文字を表示する
			p.slow();
			//改行
			System.out.println();
		}
	}
}

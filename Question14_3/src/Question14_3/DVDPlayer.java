package Question14_3;
/*
 * クラス名            :DVDPlayer
 * 概要                :各メソッドに沿い文字を表示する
 * @author             :中西輝
 * 作成日              :2026.5.14
 */
public class DVDPlayer implements ExPlayer{
	/*
	 * 関数名　　：play
	 * メソッド　：文字の表示
	 * @param    ：なし
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.5.14
	 */
	public void play() {
		//""の中の文字を表示して改行
		System.out.println("■DVD再生開始！");
	}
	/*
	 * 関数名　　：stop
	 * メソッド　：文字の表示
	 * @param    ：なし
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.5.14
	 */
	public void stop() {
		//""の中の文字を表示して改行
		System.out.println("■DVD再生終了！");
	}
	/*
	 * 関数名　　：slow
	 * メソッド　：文字の表示
	 * @param    ：なし
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.5.14
	 */
	public void slow() {
		//""の中の文字を表示して改行
		System.out.println("■DVDスロー再生開始！");
	}

}

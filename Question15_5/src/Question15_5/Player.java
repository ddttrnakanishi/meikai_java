package Question15_5;
/*
 * クラス名            :Player
 * 概要                :プレイヤーの概念を表す抽象クラス
 * @author             :中西輝
 * 作成日              :2026.5.15
 */
public abstract class Player {
	
	
	/*
	 * 関数名　　：getHandOut
	 * メソッド　：出す手の値の文字をを取得するメソッド
	 * @param    ：なし
	 * @return 　：出す手の値の文字
	 * @author　 ：中西輝
	 * 作成日    ：2026.5.15
	 */
	public int getHandOut() {
	//返却
    return this.getHandOut();
	}
	/*
	 * 関数名　　：printResult
	 * メソッド　：出す手の値をを取得するメソッド
	 * @param    ：なし
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.5.15
	 */

	public abstract void decideHand();
}


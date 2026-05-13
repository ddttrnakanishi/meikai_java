package Question13_3;
/*
 * クラス名            :Player
 * 概要                :プレイヤーの概念を表す抽象クラス
 * 作成者              :中西輝
 * 作成日              :2026.5.13
 */
public abstract class Player {
	
	
	/*
	 * 関数名　　：getHandOut
	 * メソッド　：出す手の値の文字をを取得するメソッド
	 * パラメータ：なし
	 * 返り値　　：なし
	 * 作成者　　：中西輝
	 * 作成日    ：2026.5.13
	 */
	public abstract int getHandOut();
		
	/*
	 * 関数名　　：printResult
	 * メソッド　：出す手の値をを取得するメソッド
	 * パラメータ：なし
	 * 返り値　　：なし
	 * 作成者　　：中西輝
	 * 作成日    ：2026.5.13
	 */

	public abstract void decideHand();
}

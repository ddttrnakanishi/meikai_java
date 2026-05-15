package Question15_5;

import java.util.Random;
/*
 * クラス名            :ComputerPlayer1
 * 概要                :コンピュータの出す手を表すクラス。
 * 					　 ;プレイヤーの概念を表す抽象クラスの派生
 * 作成者              :中西輝
 * 作成日              :2026.5.15
 */
public class ComputerPlayer1 extends Player{
	//ランサムな値を入れる変数を作る
	Random randmNumber = new Random();
	//コンピュータの出す手を表すint型のフィールドの初期化
	static int randomHand = 0;
	/*
	 * 関数名　　：getHandOut
	 * メソッド　：出す手の値の文字をを取得するメソッド
	 * パラメータ：なし
	 * 返り値　　：コンピュータの出す手
	 * 作成者　　：中西輝
	 * 作成日    ：2026.5.15
	 */
	@Override
	public int getHandOut() {
		//返却
		return this.randomHand;
	}
	/*
	 * 関数名　　：decideHand
	 * メソッド　：出す手の値の文字を決めて表示するメソッド
	 * パラメータ：なし
	 * 返り値　　：なし
	 * 作成者　　：中西輝
	 * 作成日    ：2026.5.15
	 */
	public void decideHand() {
		//変数randomNumberに0-2のランダムな値を代入
		int randomNumber = randmNumber.nextInt(3);

		// クラスのフィールドに値を代入
		this.randomHand = randomNumber;

		// switch文を使って、ランダムに出力された値に応じたメッセージを表示
		switch (this.randomHand) {
		//0の場合
		case 0:
			//""の中の文字を表示して改行
			System.out.println("コンピュータ1はグーを出します");
			//飛び出す
			break;
			//1の場合
		case 1:
			//""の中の文字を表示して改行
			System.out.println("コンピュータ1はチョキを出します");
			//飛び出す
			break;
			//2の場合
		case 2:
			//""の中の文字を表示して改行
			System.out.println("コンピュータ1はパーを出します");
			//飛び出す
			break;
		}
	}
}

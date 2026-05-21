package Ex1_1;

import java.util.Random;
/*
 *クラス名	：Card
 *クラス概要：多次元配列を使用しカードの情報を取得したり変更したりするクラス
 *@auter	：中西輝
 *日付　　　：2026.5.19
 */
public class Card {
	//ランダムな値を入れる変数を作る
	Random RANDOMNUMBER = new Random();
	//カードの情報を持つ多次元配列の作成
	private String[][]cardDeck = {
			{"H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "H11", "H12", "H13"},
			{"D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "D11", "D12", "D13"},
			{"S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "S11", "S12", "S13"},
			{"C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "C11", "C12", "C13"}
	};
	//全体で使えるfinal変数の作成
	private static final int CARDSUIT = 4;
	//全体で使えるfinal変数の作成
	private static final int CARDNUMBER = 13;
	//全体で使えるfinal変数の作成
	private static final int DRAWCARD = 5;
	//要素数が5の配列の作成（手札を五枚にする）
	private String[] handOfCards = new String[DRAWCARD];
	/*
	 * コンストラクタ   	　:Card
	 * コンストラクタの説明   :ONEDRAWメソッドの結果の情報を各配列に代入する
	 * @param           	　:なし
	 * @author            　　:中西輝
	 * 作成日             　　:2026.5.19
	 */
	public Card() {
		//変数iを0から始めて1ずつ増やしていき5になるまで繰り返す
		for(int i = 0; i < DRAWCARD; i++) {
			//五枚の各カードにoneDrawで得た情報を代入
			this.handOfCards[i] = oneDraw();
		}
	}
	/*
	 * 関数名　　：ONEDRAW
	 * メソッド　：カードを一枚引くメソッド
	 * @param    ：なし
	 * @return　 ：memoryArray
	 * @author 　：中西輝
	 * 日付　　　：2026.5.19
	 */
	private String oneDraw() {
		//変数suitNumberに0-3のランダムな数を代入
		int suitNumber = RANDOMNUMBER.nextInt(CARDSUIT);
		//変数randomCardに0-12のランダムな数を代入
		int randomCard = RANDOMNUMBER.nextInt(CARDNUMBER);
		//文字列memoryArrayの初期化
		String memoryArray = null;
		//trueである限り繰り返す
		while(true) {
			//cardDeck[suitNumber][randomCard]がnullではないとき
			if(cardDeck[suitNumber][randomCard] != null) {
				//memoryArrayにcardDeck[suitNumber][randomCard]を代入
				memoryArray = cardDeck[suitNumber][randomCard];
				//cardDeck[suitNumber][randomCard]をnullにする
				cardDeck[suitNumber][randomCard] = null;
				//返却
				return memoryArray;
			}
			//変数suitNumberに0-3のランダムな数を代入
			suitNumber = RANDOMNUMBER.nextInt(CARDSUIT);
			//変数randomCardに0-12のランダムな数を代入
			randomCard = RANDOMNUMBER.nextInt(CARDNUMBER);
		}
	}
	/*
	 * 関数名　　：getHandString
	 * メソッド　：カードの情報を取得し順番に表示するメソッド
	 * @param    ：なし
	 * @return　 ：resultPrint
	 * @author 　：中西輝
	 * 日付　　　：2026.5.19
	 */
	public String getHandString() {
		//文字列resultPrintに{を代入
		String resultPrint = "{";
		//変数iを0から始めて1ずつ増やしていきhandOfCardsの要素数分繰り返す
		for (int i = 0; i < handOfCards.length; i++) {
			//文字列resultPrintにhandOfCards[i]を代入
			resultPrint += handOfCards[i];
			//iが5ではないとき
			if (i != handOfCards.length - 1) {
				//文字列resultPrintに,を代入
				resultPrint += ',';
			}
		}
		//文字列resultPrintに}を代入
		resultPrint += "}";
		//返却
		return resultPrint;
	}
	/*
	 * 関数名　　：changeCard
	 * メソッド　：カードの情報を取得し新しい情報に変更するメソッド
	 * @param    ：cardNumber(何番目のカードか)
	 * @return　 ：なし
	 * @author 　：中西輝
	 * 日付　　　：2026.5.19
	 */
	public void changeCard(int cardNumber) {
		//新しい情報を代入
		handOfCards[cardNumber] = oneDraw();
	}
	/*
	 * 関数名　　：getCardAt
	 * メソッド　：カードの情報を取得するメソッド
	 * @param    ：cardNumber(何番目のカードか)
	 * @return　 ：カードの情報
	 * @author 　：中西輝
	 * 日付　　　：2026.5.19
	 */
	public String getCardAt(int cardNumber) {
		//返却
		return handOfCards[cardNumber];
	}
}

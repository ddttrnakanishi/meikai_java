package Question15_5;

import java.util.Scanner;
/*
 * クラス名            :PlayerTester
 * 概要                :各プレイヤーの出す手をテストし受け取り勝敗を付けるクラス。
 * 作成者              :中西輝
 * 作成日              :2026.5.15
 */
public class PlayerTester {
	/*
	 * 関数名           :main
	 * メソッドの説明   :各プレイヤーの出す手をテストし受け取り勝敗を付けるクラス。
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.5.15
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//playRetryの初期化
		int playRetry = 0;
		do {
			//要素数が3のPlayer型のインスタンスを作成
			Player[] p = new  Player[3];
			//人間プレイヤーのインスタンスを参照
			p[0] = new HumanPlayer();
			//コンピュータプレイヤーのインスタンスを参照
			p[1] = new ComputerPlayer1();
			//コンピュータプレイヤーのインスタンスを参照
			p[2] = new ComputerPlayer2();


			//配列pの結果を一つずつ見ていく
			for(Player s : p) {
				//各結果を受け取る
				s.decideHand();
				//改行
				System.out.println();
			}
			/*
			 * 全ての値が同じとき
			 * 全ての値が違うとき
			 */
			if(HumanPlayer.handOut == ComputerPlayer1.randomHand && HumanPlayer.handOut == ComputerPlayer2.randomHand 
					|| HumanPlayer.handOut != ComputerPlayer1.randomHand && HumanPlayer.handOut != ComputerPlayer2.randomHand && ComputerPlayer1.randomHand != ComputerPlayer2.randomHand) {
				//""の中の文字を表示して改行
				System.out.println("引き分けです。");
			}
			/*
			 * 人間が0の時他が2以外のとき
			 * 人間が1の時他が0以外のとき
			 * 人間が2の時他が1以外のとき
			 */
			else if(HumanPlayer.handOut == 0 && ComputerPlayer1.randomHand != 2 && ComputerPlayer2.randomHand != 2
					|| HumanPlayer.handOut == 1 && ComputerPlayer1.randomHand != 0 && ComputerPlayer2.randomHand != 0
					|| HumanPlayer.handOut == 2 && ComputerPlayer1.randomHand != 1 && ComputerPlayer2.randomHand != 1){
				//""の中の文字を表示して改行
				System.out.println("人間の勝ちです。");
			}
			//それ以外
			else {
				//""の中の文字を表示して改行
				System.out.println("人間の負けです。");
			}
			//繰り返し
			do {
				//""の中の文字を表示
				System.out.print("もう一度？ 0/いいえ  1/はい :");
				//入力
				playRetry = standardInput.nextInt();
				//入力が0,1以外の時繰り返す
			}while(playRetry != 0 && playRetry != 1);
			//playRetryが1の時繰り返す
		}while(playRetry == 1);
	}
}


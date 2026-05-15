package Question15_5;

import java.util.Scanner;
/*
 * クラス名            :HumanPlayer
 * 概要                :人間の出す手を表すクラス。
 * 					　 ;プレイヤーの概念を表す抽象クラスの派生
 * 作成者              :中西輝
 * 作成日              :2026.5.15
 */
public class HumanPlayer extends Player{
	//キーボードで入力した値を入れる変数を作る
	static Scanner STANDARDINPUT = new Scanner(System.in);
	//人間の出す手を表すint型のフィールドの初期化
	static int handOut;
	/*
	 * 関数名　　：getHandOut
	 * メソッド　：出す手の値の文字をを取得するメソッド
	 * パラメータ：なし
	 * 返り値　　：人間の出す手
	 * 作成者　　：中西輝
	 * 作成日    ：2026.5.15
	 */
	
    public int getHandOut() {
		//返却
        return handOut;
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
		//変数inputNumberの初期化
        int inputNumber = 0;
        //繰り返し
        do {
        	//""の中の文字を表示
            System.out.print("何を出しますか (0:グー, 1:チョキ, 2:パー): ");
            //何を出すか入力
            inputNumber = STANDARDINPUT.nextInt();
        //0,1,2以外の場合繰り返す
        } while (inputNumber < 0 || inputNumber > 2);
		// クラスのフィールドに値を代入
        this.handOut = inputNumber;

	    // switch文を使って、入力された値に応じたメッセージを表示
	    switch (this.handOut) {
	  //0の場合
	  		case 0:
	  			//""の中の文字を表示して改行
	  			System.out.println("あなたはグーを出します");
	  			//飛び出す
	  			break;
	  			//1の場合
	  		case 1:
	  			//""の中の文字を表示して改行
	  			System.out.println("あなたはチョキを出します");
	  			//飛び出す
	  			break;
	  			//2の場合
	  		case 2:
	  			//""の中の文字を表示して改行
	  			System.out.println("あなたはパーを出します");
	  			//飛び出す
	  			break;
	    }
	}
}


package Ex1_1;

import java.util.Scanner;
/*
 *クラス名	：Ex1_1
 *クラス概要：CardClassクラスの結果を基にカードを表示し、交換するか入力するクラス
 *@auter	：中西輝
 *日付　　　：2026.5.19
 */
public class Ex1_1 {
	//全体で使えるfinal変数の作成
	private static final int DRAWCARD = 5;
	/*
	 *関数名　　      ：main
	 *メソッドの説明  ：CardClassクラスの結果を基にカードを表示し、交換するか入力するクラス
	 *				　：0,1以外が入力されたときはエラーを発生させる
	 *@param 	      ：なし
	 *日付　　　      ：2026.5.19
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//CardClassクラスの情報を参照しコピーを作成
		CardClass firstHand = new CardClass();
		//""の中の文字を表示して改行
		System.out.println("初回カードを表示します");
		//getHandStringメソッドを参照して最初のカードを表示する
		System.out.println(firstHand.getHandString());
		//変数iを0から始めて1ずつ増やしていき5になるまで繰り返す
		for(int i = 0; i < DRAWCARD; i++) {
			//decideNumberの初期化
			int decideNumber = 0;
			//trueである場合繰り返す
			while (true) {
				//処理する
				try {
					//""i+1の値とiの時のカードの情報を表示する
					System.out.print((i + 1) + "番目" + firstHand.getCardAt(i) + "交換する？\n"
							+ "交換:1 保持:0 >");
					//交換か保持のどちらにするか入力
					decideNumber = standardInput.nextInt();
					//decideNumberが0,1以外の時
					if (decideNumber != 0 && decideNumber != 1) {
						// 不正な引数が渡されたことを示す例外を投げる
						throw new IllegalArgumentException();
					}
					//飛び出す
					break;
					//0,1以外の値が入力されたとき
				} catch (IllegalArgumentException e) {
					// ""の中の文字を表示して改行
					System.out.println("0or1を入力してください");

					//文字が入力されたとき
				}catch (Exception e) {
						// ""の中の文字を表示して改行
						System.out.println("数字を入力してください");
						//無限ループしないために文字の保持
						standardInput.nextLine();
					}
				}
				//入力の値が1の時
				if(decideNumber == 1) {
					//カードの情報を変える
					firstHand.changeCard(i);
				}
			}

			//""の中の文字を表示して改行
			System.out.println("最終的な手札です");
			//最終的なカードを表示する
			System.out.println(firstHand.getHandString());
		}
	}

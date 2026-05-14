package Question14_2;
/*
 * クラス名            :RobotPet
 * 概要                :ペットの概念を継承し、名前を表示してロボットの動作を行うクラス
 * @author             :中西輝
 * 作成日              :2026.5.14 
 */
public class RobotPet extends Pet implements Skinnable{
	/*
	 * コンストラクタ         :RobotPet
	 * コンストラクタの説明   :名前を生成するコンストラクタ
	 * @param                 :僕の名前、ご主人様の名前
	 * @author                :中西輝
	 * 作成日                 :2026.5.14
	 */
	public RobotPet(String name, String masterName) {
		//スーパークラスの参照
		super(name, masterName);
	}
	/*
	 * 関数名　　：introduce
	 * メソッド　：名前を表示するメソッド
	 * @param    ：なし
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.5.14
	 */
	public void introduce() {
		//""の中の文字と名前を表示して改行
		System.out.println("◇私はロボット。名前は" + getName() + "。");
		//""の中の文字と名前を表示して改行
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}
	/*
	 * 関数名　　：work
	 * メソッド　：ロボットが行う動作を表示するメソッド
	 * @param    ：ランダムに出された値
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.5.14
	 */
	public void work(int sw) {
		//ランダムに出された値によって表示する内容を変化
		switch(sw) {
		//0の場合
		case 0:
			//""の中の文字を表示して改行
			System.out.println("掃除します。");
			//飛び出す
			break;
			//1の場合
		case 1:
			//""の中の文字を表示して改行
			System.out.println("洗濯します。");
			//飛び出す
			break;
			//2の場合
		case 2:
			//""の中の文字を表示して改行
			System.out.println("炊事します。");
			//飛び出す
			break;
		}
	}
	/*
	 * 関数名　　：changeSkin
	 * メソッド　：ロボットの変更するスキンを表示するメソッド
	 * @param    ：ランダムに出された値
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.5.14
	 */
	public void changeSkin(int skin) {
		//""の中の文字を表示
		System.out.print("スキンを");
		//ランダムに出された値によって表示する内容を変化
		switch(skin) {
		//黒の場合
		case BLACK:
			//""の中の文字を表示して改行
			System.out.println("漆黒");
			//飛び出す
			break;
			//赤の場合
		case RED:
			//""の中の文字を表示して改行
			System.out.println("深紅");
			//飛び出す
			break;
			//緑の場合
		case GREEN:
			//""の中の文字を表示して改行
			System.out.println("柳葉");
			//飛び出す
			break;
			//青の場合
		case BLUE:
			//""の中の文字を表示して改行
			System.out.println("露草");
			//飛び出す
			break;
			//ヒョウ柄の場合
		case LEOPARD:
			//""の中の文字を表示して改行
			System.out.println("豹柄");
			//飛び出す
			break;
		}
		//""の中の文字を表示して改行
		System.out.println("に変更しました。");
	}
}

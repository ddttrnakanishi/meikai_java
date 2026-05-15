package Question14_2;
/*
 * クラス名            :RobotPetChange
 * 概要                :ランダムな値に対してスキを変える動作を行うクラス
 * @author             :中西輝
 * 作成日              :2026.5.14 
 */
public class RobotPetChange extends RobotPet implements Skinnable{
	/*
	 * コンストラクタ         :RobotPetChange
	 * コンストラクタの説明   :名前を生成するコンストラクタ
	 * @param                 :僕の名前、ご主人様の名前
	 * @author                :中西輝
	 * 作成日                 :2026.5.14
	 */
	public RobotPetChange(String name, String masterName) {
		//スーパークラスの参照
		super(name, masterName);
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



package Question14_2;
/*
 * クラス名            :Pet
 * 概要                :ペットの概念を表す抽象クラス
 * @author             :中西輝
 * 作成日              :2026.5.14 
 */
public class Pet {
	//名前を表すString型のnameを初期化
	private String name;
	//名前を表すString型のmasterNameを初期化
	private String masterName;
	/*
	 * コンストラクタ         :Pet
	 * コンストラクタの説明   :名前を生成するコンストラクタ
	 * @param                 :僕の名前、ご主人様の名前
	 * @author                :中西輝
	 * 作成日                 :2026.5.14
	 */
	public Pet(String name, String masterName) {
		//受け取った名前をフィールドに設定
		this.name = name;
		//受け取った名前をフィールドに設定
		this.masterName = masterName;
	}
	/*
	 * 関数名　　：getName
	 * メソッド　：名前を取得するするメソッド
	 * @param    ：なし
	 * @return 　：僕の名前
	 * @author　 ：中西輝
	 * 作成日    ：2026.5.14
	 */
	public String getName() {
		//返却
		return name;
	}
	/*
	 * 関数名　　：getMasterName
	 * メソッド　：名前を取得するするメソッド
	 * @param    ：なし
	 * @return 　：ご主人様の名前
	 * @author　 ：中西輝
	 * 作成日    ：2026.5.14
	 */
	public String getMasterName() {
		//返却
		return masterName;
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
		System.out.println("■僕の名前は" + name + "です！");
		//""の中の文字と名前を表示して改行
		System.out.println("■ご主人様は" + masterName + "です！");
	}
}

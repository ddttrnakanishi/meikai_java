package test5_14;
/*
 * クラス名            :skill
 * 概要                :子クラスの情報を基に処理する内容を変える親クラス
 * 作成者              :中西輝
 * 作成日              :2026.5.14
 */
public class skill {
	//文字列skillNameの初期化
	private String skillName;
	/*
	 * コンストラクタ   　　　:skillName
	 * コンストラクタの説明   :スキルの名前を代入
	 * パラメータの説明 　　　:スキル名
	 * 作成者           　　　:中西輝
	 * 作成日           　　　:2026.5.14
	 */
	public void skillName(String skillName) {
		//skillNameに子クラスの文字を代入
		this.skillName = skillName;
	}
	/*
	 * 関数名           :pullTrigger
	 * メソッドの説明   :子クラスの情報を基にスキルを発動したときに文字を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.5.14
	 */
	public void pullTrigger() {
		//なんのスキルなのかを送られてきた情報を基に処理する
		skillName(skillName);
	}
}

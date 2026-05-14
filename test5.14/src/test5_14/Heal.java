package test5_14;
/*
 * クラス名            :Heal
 * 概要                :skillクラスを継承してヒールの動作を処理するクラス
 * 作成者              :中西輝
 * 作成日              :2026.5.14
 */
public class Heal extends skill{
	//文字列Healの初期化
	private String Heal;
	/*
	 * コンストラクタ   　　　:Heal
	 * コンストラクタの説明   :スキルの名前を代入
	 * パラメータの説明 　　　:スキル名
	 * 作成者          　　　 :中西輝
	 * 作成日           　　　:2026.5.14
	 */
	public Heal(String skillName) {
		//Healにヒールという文字を代入
		this.Heal = "ヒール";
	}
	/*
	 * 関数名           :pullTrigger
	 * メソッドの説明   :スキルを発動したときに文字を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.5.14
	 */
	@Override
	public void pullTrigger() {
		//なんのスキルなのかをskillNameに知らせる
		skillName(Heal);
		//""の中の文字とスキル名を表示して改行
		System.out.println(Heal + "を発動します");
		//""の中の文字を表示して改行
		System.out.println("味方のHPが回復した！");
	}
}

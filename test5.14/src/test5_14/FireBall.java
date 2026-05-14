package test5_14;
/*
 * クラス名            :FireBall
 * 概要                :skillクラスを継承してファイヤーボールの動作を処理するクラス
 * 作成者              :中西輝
 * 作成日              :2026.5.14
 */
public class FireBall extends skill{
	//文字列FireBallの初期化
	private String FireBall;
	/*
	 * コンストラクタ   　　　:FireBall
	 * コンストラクタの説明   :スキルの名前を代入
	 * パラメータの説明 　　　:スキル名
	 * 作成者           　　　:中西輝
	 * 作成日           　　　:2026.5.14
	 */
	public FireBall(String skillName) {
		//FireBallにファイヤーボールという文字を代入
		this.FireBall = "ファイヤーボール";
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
		skillName(FireBall);
		//""の中の文字とスキル名を表示して改行
		System.out.println(FireBall + "を発動します");
		//""の中の文字を表示して改行
		System.out.println("敵に火属性のダメージ！");
	}
}
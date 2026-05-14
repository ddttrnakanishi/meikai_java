package test5_14;
/*
 * クラス名            :Main
 * 概要                :各スキルを発動したときに文字を表示する
 * 作成者              :中西輝
 * 作成日              :2026.5.14
 */
public class Main {
	/*
	 * 関数名           :main
	 * メソッドの説明   :各スキルを発動したときに文字を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.5.14
	 */
	public static void main(String[] args) {
		//要素数が2のクラスskillを参照した配列を作成
		skill []skillName = new skill[2];
		//クラスのインスタンスを初期化
		skillName[0] = new FireBall ("ファイヤーボール" );
		//クラスのインスタンスを初期化
		skillName[1] = new Heal ("ヒール" );
		//配列を一つずつ見ていく
		for( skill s : skillName) {
			//配列ごとの処理を行う
			s.pullTrigger();
			//改行
			System.out.println();	
		}
	}
}

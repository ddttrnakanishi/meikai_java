package Question14_2;
/*
 * インタフェース名    :Skinnable
 * 概要                :色ごとに番号を与えスキンの色を取得するインタフェース
 * @author             :中西輝
 * 作成日              :2026.5.14 
 */
public interface Skinnable {
	//黒
	int BLACK = 0;
	//赤
	int RED = 1;
	//緑
	int GREEN = 2;
	//青
	int BLUE = 3;
	//ヒョウ柄
	int LEOPARD = 4;
	/*
	 * 関数名　　：changeSkin
	 * メソッド　：色を取得するメソッド
	 * @param    ：ランダムに出された値
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.5.14
	 */
	public void changeSkin(int skin);
}

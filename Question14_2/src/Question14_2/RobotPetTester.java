package Question14_2;

import java.util.Random;
/*
 * クラス名            :RobotPetTester
 * 概要                :配列の名前を子クラスの処理を行って表示する
 * 					   :ランダムに出された値を基にロボットの動作やスキンの色を子クラスの処理を行って表示する
 * @author             :中西輝
 * 作成日              :2026.5.14
 */
public class RobotPetTester {
	/*
	 * 関数名　　：intro
	 * メソッド　：名前を表示するメソッドの呼び出し
	 * @param    ：名前
	 * @return 　：なし
	 * @author　 ：中西輝
	 * 作成日    ：2026.5.14
	 */
	public static void intro(Pet p) {
		//introduceメソッドの呼び出し
		p.introduce();
	}
	/*
	 * 関数名           :main
	 * メソッドの説明   :配列の図形を入力した値の分だけの図形を表示する
	 * 					:入力した値を基に面積を求める
	 * @param           :なし
	 * @return          :なし
	 * @author          :中西輝
	 * 作成日           :2026.5.13
	 */
	public static void main(String[] args) {
		// 新しい配列を作成しそれぞれの名前を決める
		Pet[] a = {
				new Pet("中西", "マイク"),
				new RobotPetChange("ドラえもん", "のび太"),
		};
		//名前を一つずつ見ていく
		for(Pet p : a) {
			//名前を表示する
			intro(p);
			//改行
			System.out.println();
		}
		//ランダムな値を入れる変数を作る
		Random randamNumber  = new Random();
		//randomCollar1に0-2の値を代入
		int randomCollar1 = randamNumber.nextInt(3);
		//ランダムな値が代入された値に対する文字を生成する
		RobotPetChange workNumber = new RobotPetChange(null, null);
		//文字を表示する
		workNumber.work(randomCollar1);	
		//randomCollar2に0-4の値を代入
		int randomCollar2 = randamNumber.nextInt(5);
		//ランダムな値が代入された値に対する文字を生成する
		RobotPetChange changeNumber = new RobotPetChange(null, null);
		//文字を表示する
		changeNumber.changeSkin(randomCollar2);
	}
}

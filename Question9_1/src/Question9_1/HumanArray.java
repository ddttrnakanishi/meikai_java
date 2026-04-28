package Question9_1;
/*
 * クラス名            :HumanArray
 * 概要                :Humanクラスの配列を生成する、生成時、生成後に要素を代入するものを作成
 * 作成者              :中西輝
 * 作成日              :2026.4.28
 */
public class HumanArray {
	/*
	 * 関数名           :main
	 * メソッドの説明   :Humanクラスの配列を生成する、生成時、生成後に要素を代入するものを作成
	 * 						getHeightInformationでの情報を基に文字や値を表示
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.28
	 */
	public static void main(String[] args) {
		//要素が決まっている配列humanArrayの作成
		Human[] humanArray = {
				new Human("マイケル", 177, 68),
				new Human	("マイク", 190, 88),
		};
		//変数iが0から始まり1ずつ増やしていきhumanArrayの要素数まで繰り返す
		for(int i = 0; i < humanArray.length; i++) {
			//""の中の文字とi、humanArray[i]の文字や値を表示して改行
			System.out.println("x[" + i + "] = " + humanArray[i].getNameInformation() + "の"
					+ humanArray[i].getHeightInformation() + "cmで" 
					+ humanArray[i].getWeightInformation() + "kgです");
		}
		//改行
		System.out.println();
		//配列の作成
		Human[] humanArrayTwo;
		//要素に文字や値を代入し配列humanArrayの作成
		humanArrayTwo = new Human[] {
				new Human("マイケルjr", 120, 35),
				new Human	("マイクjr", 164, 50)
		};
		//変数iが0から始まり1ずつ増やしていきhumanArrayTwoの要素数まで繰り返す
		for(int i = 0; i < humanArrayTwo.length; i++) {
			//""の中の文字とi、humanArrayTwo[i]の文字や値を表示して改行
			System.out.println("x[" + i + "] = " + humanArrayTwo[i].getNameInformation() + "の"
					+ humanArrayTwo[i].getHeightInformation() + "cmで" 
					+ humanArrayTwo[i].getWeightInformation() + "kgです");
		}
	}
}

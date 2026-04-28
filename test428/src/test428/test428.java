package test428;
/*
 * クラス名            :test428
 * 概要                :各店舗ごとの総売上と平均売上を表示(平均は小数表記)
						全店舗・全日程の中での最高売上と、それがどの店舗の何日目かを表示
						1日の売上が「150,000以上」の日を「目標達成日」とし、各店舗で何日間達成したかを表示
 * 作成者             :中西輝
 * 作成日              :2026.4.28
 */

public class test428 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :各店舗ごとの総売上と平均売上を表示(平均は小数表記)
						全店舗・全日程の中での最高売上と、それがどの店舗の何日目かを表示
						1日の売上が「150,000以上」の日を「目標達成日」とし、各店舗で何日間達成したかを表示
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.28
	 */
	public static void main(String[] args) {
		//int型の構成要素型の二次元配列の作成
		int[][] sales = {
				{120000, 158000, 130000, 170000},
				{80000, 105000, 95000, 110000},
				{185000, 140000, 160000, 155000} };
		//string型の構成要素型の一次元配列の作成
		String[] storeNames = {"店舗A", "店舗B", "店舗C"};
		//string型の構成要素型の一次元配列の作成
		String[] dayNumber = {"Day1", "Day2", "Day3", "Day4"};
		//avelageSalesの初期化
		int avelageSales = 0;
		//hightSalesの初期化
		int hightSales = 0;
		//hightStoreの初期化
		String hightStore = "店舗A";
		//hightDayの初期化
		String hightDay = "Day1";
		//変数iを0から始めて1ずつ増やしていきsalesの行分繰り返す
		for(int i = 0; i < sales.length; i++) {
			//sumSalesの初期化
			int sumSales = 0;
			//clearDayの初期化
			int clearDay = 0;
			//変数jを0から始めて1ずつ増やしていきsalesの列分繰り返す
			for(int j = 0; j < sales[i].length; j++) {
				//店舗ごとの合計を出す
				sumSales += sales[i][j];
				//店舗ごとの平均を出す
				avelageSales = sumSales / sales[i].length;
				//今までの最高売り上げより高い売り上げが出た場合
				if(hightSales < sales[i][j]) {
					//その売り上げを最高売り上げとする
					hightSales = sales[i][j];
					//売り上げた店舗名を変更する
					hightStore = storeNames[i];
					//売り上げた日を変更する
					hightDay = dayNumber[j];
				}
				//一日の売り上げが150000以上の場合
				if(sales[i][j] >= 150000) {
					//目標達成日を+1する
					clearDay++;
				}
			}
			/*storeNames[i]の店舗名と""の中の文字
			 * 店舗の売り上げの合計、平均の売り上げを少数で表示して改行
			 */
			System.out.printf(storeNames[i] + "の総売上は" + sumSales + " 平均売上は" + (double)avelageSales + "です"); 
			//改行
			System.out.println();
			//storeNames[i]の店舗名と""の中の文字とclearした回数を表示して改行
			System.out.println(storeNames[i] +"の目標達成した日は" + clearDay + "回");
		}
		//""の中の文字と最高売り上げ額、その店舗、何日目なのかを表示して改行
		System.out.printf("全店舗・全日程の中での最高売上は" + hightSales + " 店舗は" + hightStore + "の" + hightDay + "です"); 
	}
}

package Question12_1;
/*
 * クラス名            :Mileage　
 * 概要 			   :走行距離を更新するメソッド
 * 					   :走行距離を取得するためのメソッド
 * 		               :親クラスの表示処理を呼び出し、走行距離を追加で表示する
 * 作成者              :中西輝
 * 作成日              :2026.5.11
 */
public class Mileage extends Car{
	//走行距離を表すdouble型のrunMileageを初期化 
	protected double runMileage = 0;
	/*
	 * コンストラクタ   :Mileage
	 * コンストラクタの説明   :クラスのインスタンスが生成される際のコンストラクタを作成
	 * パラメータの説明 :名前、幅、高さ、長さ、残り燃料
	 * 作成者           :中西輝
	 * 作成日           :2026.5.11
	 */
	public Mileage(String name, int width, int height, int length, double fuel) {
		//親クラスの値を参照
		super(name, width, height, length, fuel);
		//フィールドに仮引数の値を代入
		this.runMileage = 0;
	}
	/*
		関数名　　：updateMileage
		メソッド　：走行距離を更新するメソッド
		パラメータ：x,yの距離
		返り値　　：なし
		作成者　　：中西輝
		日付　　　：2026.5.11
	 */
	public void updateMileage(double dx, double dy) {
		//走行距離を足す
		this.runMileage += (dx + dy);
	}
	/*
		関数名　　：getMileage
		メソッド　：走行距離を取得するためのメソッド
		パラメータ：なし
		返り値　　：runMileage
		作成者　　：中西輝
		日付　　　：2026.5.11
	 */
	public double getMileage() {
		//Mileageの値を返却
		return runMileage;
	}
	/*
	 * 関数名           :putSpec
	 * メソッドの説明   :親クラスの表示処理を呼び出し、走行距離を追加で表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.5.11
	 */
	public void putSpec() {
		// 親クラスの表示処理を呼び出す
		super.putSpec();
		// 走行距離を追加で表示する
		System.out.println("走行距離：" + runMileage + "m");
	}
}
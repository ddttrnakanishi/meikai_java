package Question12_1;

public class Mileage extends Car{
	public Mileage(String name, int width, int height, int length, double fuel,double mileage) {
		super(name, width, height, length, fuel);
		//フィールドに仮引数の値を代入
		this.Mileage = mileage;
	}
	/*
	関数名　　：getM
	メソッド　：走行距離を取得するためのメソッド
	パラメータ：なし
	返り値　　：Mileage
	作成者　　：中西輝
	日付　　　：2026.5.11
	 */
	public static double getMileage() {
		//xとyの値を足したものをMileageに代入
		Mileage = getX() + getY() ;
		//Mileageの値を返却
		return Mileage;
	}
}


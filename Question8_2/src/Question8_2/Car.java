package Question8_2;
/*
 * クラス名            :Car
 * 概要                :コンストラクタの設定とCarTesterで入力された物を表示する
 * 						NewAndUsedCarメソッド処理を行う
 * 作成者             :中西輝
 * 作成日              :2026.4.28
 */
public class Car {
	//名前を表すString型のnameを初期化 
	private String name = null;
	//幅を表すint型のwidthを初期化 
	private int width = 0;
	//高さを表すint型のheightを初期化 
	private int height = 0;
	//長さを表すint型のlengthを初期化 
	private int length = 0;
	//現在位置のx座標を初期化 
	private double x = 0;
	//現在位置のy座標を初期化 
	private double y = 0;
	//残り燃料を表すdouble型のfuelを初期化 
	private double fuel = 0;
	//何年から乗っているかを表すint型のNewOrOldを初期化
	private int NewOrOld = 0;
	//色を表すString型のcolourを初期化 
	private String colour = null;
	//製造年を表すint型のModelYearを初期化 
	private int ModelYear = 0;
	//ナンバーを表すint型のNumberを初期化
	private int Number = 0;
	/*
	 * コンストラクタ   :Car
	 * コンストラクタの説明   :クラスのインスタンスが生成される際のコンストラクタを作成
	 * パラメータの説明 :名前、幅、高さ、長さ、残り燃料、何年から乗っているか、色、製造年、ナンバー
	 * 作成者           :中西輝
	 * 作成日           :2026.4.28
	 */
	Car(String name,int width,int height,int length,double fuel, int whatYear, String colour, int ModelYear,int Number){
		//フィールドに仮引数の値を代入
		this.name = name;
		//フィールドに仮引数の値を代入
		this.width = width;
		//フィールドに仮引数の値を代入
		this.height = height;
		//フィールドに仮引数の値を代入
		this.length = length;
		//フィールドに仮引数の値を代入
		this.fuel = fuel;
		//初期位置を(x,y) = (0.0,0.0)に設定する
		x = y = 0.0;
		//フィールドに仮引数の値を代入
		this.NewOrOld = whatYear;
		//フィールドに仮引数の文字を代入
		this.colour = colour;
		//フィールドに仮引数の値を代入
		this.ModelYear = ModelYear;
		//フィールドに仮引数の値を代入
		this.Number = Number;
	}
	/*
	関数名　　：getX
	メソッド　：x座標を取得するためのメソッド
	パラメータ：なし
	返り値　　：x
	作成者　　：中西輝
	日付　　　：2026/04/28
	 */
	public double getX() {
		//xの値を返却
		return x;
	}
	/*
	関数名　　：getY
	メソッド　：y座標を取得するためのメソッド
	パラメータ：なし
	返り値　　：y
	作成者　　 :中西輝
	日付　　　：2026/04/28
	 */
	public double getY() {
		//yの値を返却
		return y;
	}
	/*
	関数名　　：getFuel
	メソッド　：残り燃料の数値を取得するためのメソッド
	パラメータ：なし
	返り値　　：fuel
	作成者　　：中西輝
	日付　　　：2026/04/28
	 */
	public double getFuel() {
		//残り燃料の値を返却
		return fuel;
	}
	/*
	 * 関数名           :putSpec
	 * メソッドの説明   :各情報の表示
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.28
	 */
	void putSpec() {
		//""の中の文字と名前の文字を表示して改行		
		System.out.println("名前：" + name);
		//""の中の文字と車幅の文字を表示して改行	
		System.out.println("車幅：" + width + "mm");
		//""の中の文字と車高幅の文字を表示して改行	
		System.out.println("車高：" + height + "mm");
		//""の中の文字と車長の文字を表示して改行	
		System.out.println("車長：" + length + "mm");
		//""の中の文字と名前の文字を表示して改行
		System.out.println("色 :" + colour);
		//""の中の文字と製造年の値を表示して改行
		System.out.println("製造年 :" + ModelYear + "年");
		//""の中の文字とナンバーの値を表示して改行
		System.out.println("ナンバー :" + Number);
	}
	/*
	関数名　　：move
	メソッド　：指定された距離だけ車を移動し、残りの燃料と位置を変更するメソッド
	パラメータ：移動を示す値dx,dy
	返り値　　：false,true
	作成者　　：中西輝
	日付　　　：2026/04/28
	 */
	public boolean move(double dx, double dy) {
		//負の値が入力された場合
		if (dx < 0 || dy < 0) {
			//falseを返却
			return false;
		}
		//移動距離の数値を取得し、計算する
		double dist = Math.sqrt(dx * dx + dy * dy);

		//燃料不足の場合
		if (dist > fuel) {
			//falseを返却
			return false;
			//それ以外
		}else {
			//残り燃料から使った分の燃料を引く
			fuel -= dist;
			//xの座標を更新
			x += dx;
			//yの座標を更新
			y += dy;
			//trueを返却
			return true;
		}
	}
	/*
	 * 関数名           :NewAndUsedCar
	 * メソッドの説明   :whatYearが5以上の時false、それ以外trueを返却
	 * パラメータの説明 :何年目か
	 * 返り値           :false、true
	 * 作成者           :中西輝
	 * 作成日           :2026.4.28
	 */
	public boolean NewAndUsedCar(int whatYear) {
		//whatYearが5より大きい時
		if(whatYear > 5) {
			//返却
			return false;
		}
		//それ以外
		else {
			//trueを返却
			return true;
		}
	}
}

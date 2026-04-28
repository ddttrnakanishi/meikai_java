package 添削用;



class Human{
	//非公開でフィールドnameを生成し、nonameで初期化する。
	private String name = "noname";
	//非公開でフィールドheightを生成し、0.0で初期化する
	private double height = 0.0;
	//非公開でフィールドweightを生成し、0.0で初期化する。
	private double weight = 0.0;

	/**
	 * コンストラクタ名 :Human
	 * メソッドの説明   :名前、身長、体重のコンストラクタを生成し、初期化する
	 * パラメータの説明 :文字列name, 仮引数height, weight
	 * 返り値           :nameをString型、身長と体重はdouble型で返却する
	 * 作成者           :川野晟慶
	 * 作成日           :2026/4/28
	 */
	Human(String name, double height, double weight){
		//thisで作られたフィールドに、仮引数を代入する。
		this.name = name; this.height = height; this.weight = weight;
	}
	//名前を調べるためのインスタンスメソッド
	String getName() {
		//名前を返却する
		return name;
	}
	//身長を調べるためのインスタンスメソッド
	double getHeight() {
		//身長をdouble型で返却する
		return height;
	}
	//体重を調べるためのインスタンスメソッド
	double getWeight() {
		//体重をdouble型で返却する
		return weight;
	}
	//スペックを表示するインスタンスメソッド
	void putSpectator(){
		//名前、身長、体重をそれぞれ表示する
		System.out.println(name + "は、身長" + height + "cm、体重" + weight + "kgです。");
	}
}
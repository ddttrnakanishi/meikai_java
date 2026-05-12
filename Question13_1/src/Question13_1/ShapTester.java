package Question13_1;

import java.util.Scanner;
/*
 * クラス名            :ShapTester
 * 概要                :入力した番号の配列の図形を入力した値の分だけの図形を表示する
 * 作成者              :中西輝
 * 作成日              :2026.5.12
 */
public class ShapTester {
	//キーボードで入力した値を入れる変数を作る
	static Scanner STANDARDINPUT = new Scanner(System.in);
	/*
	 * 関数名           :main
	 * メソッドの説明   :入力した番号の配列の図形を入力した値の分だけの図形を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.5.12
	 */
	public static void main(String[] args) {
		//変数howManyの初期化
		int howMany = 0;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("図形は何個 :");
			//個数を入力
			howMany = STANDARDINPUT.nextInt();
			//0以下の時繰り返す
		}while(howMany <= 0);
		//howManyの値のshape型のインスタンスを作成
		Shape[] p = new Shape[howMany];
		//変数inputNumberの初期化
		int inputNumber = 0;
		//変数iを0から始めて1づつ増やしていきhowManyになるまで繰り返す
		for(int i = 0; i < howMany; i++) {
			//繰り返す
			do {
				//iの値に1を足した数と""の中の文字を表示
				System.out.print(i + 1 + "番の図形の種類(1…点/2…水平直線/3…垂直直線/4…長方形) :");
				//どの図形にするか入力
				inputNumber = STANDARDINPUT.nextInt();
				//0以下の時、4より大きい時繰り返す
			}while(inputNumber <= 0 || inputNumber > 4);
			//inputNumberの結果を基に表示する
			switch(inputNumber) {
			//1の時、点を生成する
			case 1 : p[i] = new Point();
			//飛び出す
			break;
			//2の時、""の中の文字を表示
			case 2:System.out.print("長さ:");
			//長さを入力
			int inputLine = STANDARDINPUT.nextInt();
			//入力された数だけの水平直線を生成する
			p[i] = new HorzLine(inputLine);
			//飛び出す
			break;
			//3の時、""の中の文字を表示
			case 3:System.out.print("長さ:");
			////長さを入力
			int inputLine2 = STANDARDINPUT.nextInt();
			//入力された数だけの垂直直線を生成する
			p[i] = new VirtLine(inputLine2);
			//飛び出す
			break;
			//4の時、""の中の文字を表示
			case 4:System.out.print("幅:");
			//幅を入力
			int inputWidth = STANDARDINPUT.nextInt();
			//""の中の文字を表示
			System.out.print("高さ:");
			//高さを入力
			int inputHeigth = STANDARDINPUT.nextInt();
			////入力された数だけの長方形を生成する
			p[i] = new Rectangle(inputWidth, inputHeigth);
			//飛び出す
			break;
			}
		}
		//配列pの結果を一つずつ見ていく
		for(Shape s :p) {
			//一つずつ指定された図を表示する
			s.print();
			//改行
			System.out.println();
		}
	}
}

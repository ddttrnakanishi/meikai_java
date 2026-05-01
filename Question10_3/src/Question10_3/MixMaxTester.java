package Question10_3;

import java.util.Scanner;
/*
 * クラス名            :MixMaxTester
 * 概要                :各値を入力しクラスMinMax型のanserValueを作成しそれぞれのメソッドを経由し値を表示する
 * 作成者              :中西輝
 * 作成日              :2026.5.1
 */
public class MixMaxTester {
	/*
	 * 関数名           :main
	 * メソッドの説明   ::各値を入力しクラスMinMax型のanserValueを作成しそれぞれのメソッドを経由し値を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.5.1
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示して改行
		System.out.println("値を入力してください");
		//""の中の文字を表示
		System.out.print("aの値は :");
		//inputNumberOneの値を入力
		int inputNumberOne = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("bの値は :");
		//inputNumberTwoの値を入力
		int inputNumberTwo = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("cの値は :");
		//inputNumberThreeの値を入力
		int inputNumberThree = standardInput.nextInt();
		//elementNumberの初期化
		int elementNumber = 0;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("要素数は :");
			//要素数の入力
			elementNumber = standardInput.nextInt();
			//0以下の場合繰り返し
		}while(elementNumber <= 0);
		//入力した値が要素数の配列の作成
		int[] arrayNumber = new int[elementNumber];
		//入力した値をもとにクラスMixMax型のanserValueを作成
		MinMax anserValue = new MinMax(inputNumberOne, inputNumberTwo,inputNumberThree, arrayNumber);
		//""の中の文字と配列の最小値を表示して改行
		System.out.println("配列arrayNumberの最小値は" + MinMax.minArray(arrayNumber) );
		//""の中の文字とa,bの最小値を表示して改行
		System.out.println("a,bの最小値は" + MinMax.minDoubleMin(inputNumberOne, inputNumberTwo));
		//""の中の文字とa,b,cの最小値を表示して改行
		System.out.println("a,b,cの最小値は" + MinMax.minTriple(inputNumberOne, inputNumberTwo, inputNumberThree));
		//""の中の文字とa,b,cの最大値を表示して改行
		System.out.println("a,b,cの最大値は" + MinMax.maxNumber(inputNumberOne, inputNumberTwo, inputNumberThree));
	}
}

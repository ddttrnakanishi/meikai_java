package Question7_30;

import java.util.Scanner;
/* 
 * クラス名 :Question7_30
 * 概要 :二つのint型整数a,bの最小値、三つのint型整数a,b,cのの最小値、配列aの要素の最小値を求める
 * 作成者 　:中西輝 
 * 作成日 :2026.4.27
 */
public class Question7_30 {	

	/*	
	 *  関数名 　        :main	
	 *  メソッドの説明 　:a,b,cの値を入力し配列aの要素を入力、それぞれに適したminメソッドを受け取る
	 *  パラメータの説明 :なし	 
	 *  返り値 　        :なし	 
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.27
	 */

	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//inputNumberOneの初期化
		int inputNumberOne = 0;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("aの値 :");
			//aの値を入力
			inputNumberOne = standardInput.nextInt();
			//入力した値が0以下の場合繰り返す
		}while(inputNumberOne <= 0);
		//""の中の文字を表示
		System.out.print("bの値 :");
		//bの値を入力
		int inputNumberTwo = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("cの値 :");
		//cの値を入力
		int inputNumberThree = standardInput.nextInt();
		//改行
		System.out.println();
		//aの値の要素数の配列の作成
		int[] arrayNumber = new int [inputNumberOne];
		//変数iが0から始まり1ずつ増やしていき要素数になるまで繰り返す
		for(int i = 0; i < arrayNumber.length; i++) {
			//""の中の文字とiの値を表示
			System.out.print("arrayNumber[" + i + "] =");
			//各要素の値を入力
			arrayNumber[i] = standardInput.nextInt();
		}
		//改行
		System.out.println();
		//""の中の文字と適したminメソッドを受け取り表示して改行
		System.out.println("a,bの最小値は" + min(inputNumberOne,inputNumberTwo) + "です。");
		//""の中の文字と適したminメソッドを受け取り表示して改行
		System.out.println("a,b,cの最小値は" + min(inputNumberOne,inputNumberTwo,inputNumberThree) + "です。");
		//""の中の文字と適したminメソッドを受け取り表示して改行
		System.out.println("配列aの要素の最小値は" + min(arrayNumber) + "です。");
	}
	/*	
	 *  関数名 　        :min	
	 *  メソッドの説明 　:a,bの最小値を求めて返却
	 *  パラメータの説明 :inputNumberOne、inputNumberTwo
	 *  返り値 　        :a、b
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.27
	 */
	public static int min(int a, int b) {
		//bよりもaが大きい場合
		if(a > b) {
			//bを返却
			return b;
		}
		//それ以外
		else {
			//aを返却
			return a;
		}
	}
	/*	
	 *  関数名 　        :min	
	 *  メソッドの説明 　:a,b,cの最小値を求めて返却
	 *  パラメータの説明 :inputNumberOne、inputNumberTwo、inputNumberThree
	 *  返り値 　        :minValue
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.27
	 */
	public static int min(int a, int b, int c) {
		//minValueの初期化
		int minValue = a;
		//minValueがbよりも大きい場合
		if(minValue > b) {
			//minValueにbを代入
			minValue = b;
		}
		//minValueがcよりも大きい場合
		if(minValue > c) {
			//minValueにcを代入
			minValue = c;
		}
		//minValueを返却
		return minValue;
	}

	/*	
	 *  関数名 　        :min	
	 *  メソッドの説明 　:配列arrayNumberの要素の最小値を求めて返却
	 *						nullの場合は0を返却
	 *  パラメータの説明 :配列arrayNumber
	 *  返り値 　        :null、minArray
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.27
	 */
	public static int min(int[] arrayNumber) {
		//arrayNumberがnullの場合
		if(arrayNumber == null) {
			//""の中の文字を表示して改行
			System.out.println("null以外を入力してください");
			//返却
			return 0 ;
		}
		//それ以外
		else {
			//minArrayにarrayNumber[0]を代入
			int minArray = arrayNumber[0];
			//変数iを1から始めて1ずつ増やしていきarrayNumberの要素数になるまで繰り返す
			for(int i = 1; i < arrayNumber.length; i++) {
				//minArrayがarrayNumber[i]より大きい場合
				if(minArray > arrayNumber[i]) {
					//minArrayにarrayNumber[i]を代入
					minArray = arrayNumber[i];
				}
			}
			//minArrayを返却
			return minArray;
		}
	}
}

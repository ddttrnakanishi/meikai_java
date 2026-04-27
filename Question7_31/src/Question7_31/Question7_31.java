package Question7_31;

import java.util.Scanner;
/* 
 * クラス名 :Question7_31
 * 概要 :int,long,float,double型の整数や実数を読み込み絶対値を表示する
 * 作成者 　:中西輝 
 * 作成日 :2026.4.27
 */
public class Question7_31 {	

	/*	
	 *  関数名 　        :main	
	 *  メソッドの説明 　:int,long,float,double型の整数や実数を読み込み、それぞれに適したabsoluteメソッドを受け取る
	 *  パラメータの説明 :なし	 
	 *  返り値 　        :なし	 
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.27
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示
		System.out.print("int型整数x :");
		//整数を入力
		int inputValue1 = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("long型整数x :");
		//整数を入力
		long inputValue2 = standardInput.nextLong();
		//""の中の文字を表示
		System.out.print("float型整数x :");
		//実数を入力
		float inputValue3 = standardInput.nextFloat();
		//""の中の文字を表示
		System.out.print("double型整数x :");
		//実数を入力
		double inputValue4 = standardInput.nextDouble();
		//""の中の文字と適したabsoluteメソッドを受け取り表示
		System.out.println("int型整数xの絶対値は" + absolute(inputValue1) + "です");
		//""の中の文字と適したabsoluteメソッドを受け取り表示
		System.out.println("long型整数xの絶対値は" + absolute(inputValue2) + "です");
		//""の中の文字と適したabsoluteメソッドを受け取り表示
		System.out.println("float型整数xの絶対値は" + absolute(inputValue3) + "です");
		//""の中の文字と適したabsoluteメソッドを受け取り表示
		System.out.println("double型整数xの絶対値は" + absolute(inputValue4) + "です");
	}
	/*	
	 *  関数名 　        :absolute	
	 *  メソッドの説明 　:double型の実数の絶対値を求めて返却
	 *  パラメータの説明 :実数
	 *  返り値 　        :inputValue4の絶対値
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.27
	 */
	private static double absolute(double inputValue4) {
		//実数がマイナスの値の時
		if(inputValue4 < 0) {
			//実数に*-1をする
			inputValue4 *= -1;
		}
		//返却
		return inputValue4;
	}
	/*	
	 *  関数名 　        :absolute	
	 *  メソッドの説明 　:float型の実数の絶対値を求めて返却
	 *  パラメータの説明 :実数
	 *  返り値 　        :inputValue3の絶対値
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.27
	 */
	private static float absolute(float inputValue3) {
		//実数がマイナスの値の時
		if(inputValue3 < 0) {
			//実数に*-1をする
			inputValue3 *= -1;
		}
		//返却
		return inputValue3;
	}
	/*	
	 *  関数名 　        :absolute	
	 *  メソッドの説明 　:long型の実数の絶対値を求めて返却
	 *  パラメータの説明 :整数
	 *  返り値 　        :inputValue2の絶対値
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.27
	 */
	private static long absolute(long inputValue2) {
		//整数がマイナスの値の時
		if(inputValue2 < 0) {
			//整数に*-1をする
			inputValue2 *= -1;
		}
		//返却
		return inputValue2;
	}
	/*	
	 *  関数名 　        :absolute	
	 *  メソッドの説明 　:int型の実数の絶対値を求めて返却
	 *  パラメータの説明 :整数
	 *  返り値 　        :inputValue1の絶対値
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.27
	 */
	private static int absolute(int inputValue1) {
		//整数がマイナスの値の時
		if(inputValue1 < 0) {
			//整数に*-1をする
			inputValue1 *= -1;
		}
		//返却
		return inputValue1;
	}
}
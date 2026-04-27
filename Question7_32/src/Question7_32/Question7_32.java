package Question7_32;

import java.util.Scanner;
/* 
 * クラス名 :Question7_32
 * 概要 :入力された整数のビットをそれぞれに適したprintBitsメソッドを経由し表示する
 * 作成者 　:中西輝 
 * 作成日 :2026.4.27
 */
public class Question7_32 {	

	/*	
	 *  関数名 　        :main	
	 *  メソッドの説明 　:整数を読み込み、それぞれに適したprintBitsメソッドを経由し表示する
	 *  パラメータの説明 :なし	 
	 *  返り値 　        :なし	 
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.27
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示して改行
		System.out.println("整数を入力してください。");
		//byteValueを初期化
		byte byteValue = 0;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("byte整数x  :");
			//整数を入力
			byteValue = standardInput.nextByte();
			//byteValueが0未満の場合繰り返す
		}while(byteValue < 0);
		//shortValueを初期化
		short shortValue = 0;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("short整数x :");
			//整数を入力
			shortValue = standardInput.nextShort();
			//shortValueが0未満の場合繰り返す
		}while(shortValue < 0);
		//intValueを初期化
		int intValue = 0;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("int整数x   :");
			//整数を入力
			intValue = standardInput.nextInt();
			//intValueが0未満の場合繰り返す
		}while(intValue < 0);
		//longValueを初期化
		long longValue = 0;
		//繰り返し
		do {
			//""の中の文字を表示
			System.out.print("long整数x  :");
			//整数を入力
			longValue = standardInput.nextLong();
			//longValueが0未満の場合繰り返す
		}while(longValue < 0);
		//改行
		System.out.println();
		//""の中の文字を表示
		System.out.print( "byteValue    = ");
		//printBitsの処理を表示
		printBits(byteValue);
		//""の中の文字を表示
		System.out.print( "\nshortValue   = ");
		//printBitsの処理を表示
		printBits(shortValue);
		//""の中の文字を表示
		System.out.print( "\nintValue     = ");
		//printBitsの処理を表示
		printBits(intValue);
		//""の中の文字を表示
		System.out.print( "\nlongValue    = ");
		//printBitsの処理を表示
		printBits(longValue);

	}
	/*	
	 *  関数名 　        :printBits	
	 *  メソッドの説明 　:入力した整数longValueのビットを表示
	 *  パラメータの説明 :整数	 
	 *  返り値 　        :なし	 
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.27
	 */
	private static void printBits(long longValue) {
		//変数iを63から始めて1ずつ減らしていき0になるまで繰り返す
		for(int i = 63; i >= 0; i--) {
			//第iビットが1であるとき1を0であるとき0を表示
			System.out.print(((longValue >>> i & 1) == 1) ? '1' : '0');
		}

	}
	/*	
	 *  関数名 　        :printBits	
	 *  メソッドの説明 　:入力した整数intValueのビットを表示
	 *  パラメータの説明 :整数	 
	 *  返り値 　        :なし	 
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.27
	 */
	private static void printBits(int intValue) {
		//変数iを31から始めて1ずつ減らしていき0になるまで繰り返す
		for(int i = 31; i >= 0; i--) {
			//第iビットが1であるとき1を0であるとき0を表示
			System.out.print(((intValue >>> i & 1) == 1) ? '1' : '0');
		}

	}
	/*	
	 *  関数名 　        :printBits	
	 *  メソッドの説明 　:入力した整数shortValueのビットを表示
	 *  パラメータの説明 :整数	 
	 *  返り値 　        :なし	 
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.27
	 */
	private static void printBits(short shortValue) {
		//変数iを15から始めて1ずつ減らしていき0になるまで繰り返す
		for(int i = 15; i >= 0; i--) {
			//第iビットが1であるとき1を0であるとき0を表示
			System.out.print(((shortValue >>> i & 1) == 1) ? '1' : '0');
		}
	}
	/*	
	 *  関数名 　        :printBits	
	 *  メソッドの説明 　:入力した整数byteValueのビットを表示
	 *  パラメータの説明 :整数	 
	 *  返り値 　        :なし	 
	 *  作成者 　        :中西輝	 
	 *  作成日 　        :2026.4.27
	 */
	private static void printBits(byte byteValue) {
		//変数iを7から始めて1ずつ減らしていき0になるまで繰り返す
		for(int i = 7; i >= 0; i--) {
			//第iビットが1であるとき1を0であるとき0を表示
			System.out.print(((byteValue >>> i & 1) == 1) ? '1' : '0');
		}
	}
}

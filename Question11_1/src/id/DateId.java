package id;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;
/*
 * クラス名            :DateId
 * 概要                :a,b,cの識別番号を表示する
 * 作成者              :中西輝
 * 作成日              :2026.5.11
 */
public class DateId {
	//何番までの識別番号を与えたかをカウントする
	private static int counter;
	//識別番号の生成
	private int id;

	static {
		//プログラムを実行した日の情報のインスタンスを生成する
		GregorianCalendar todayInfomation = new GregorianCalendar();
		//年を設定する
		int yearNumber = todayInfomation.get(YEAR);
		//月を設定する
		int monthNumber = todayInfomation.get(MONTH) + 1;
		//日を設定する
		int dateNumber = todayInfomation.get(DATE);
		//""の中の文字とプログラム実行日の日付を表示して改行
		System.out.printf("今日は%04d年%02d月%02d日です。\n", yearNumber, monthNumber, dateNumber);
		//識別番号の初期値を計算し代入する
		counter = yearNumber * 1000000 + monthNumber * 10000 + dateNumber * 100;
	}
	/*
	 * 関数名　　：DateId
	 * メソッド　：カウントした識別番号をidに代入するメソッド
	 * パラメータ：なし
	 * 返り値　　：なし
	 * 作成者　　：中西輝
	 * 作成日　　：2026.5.11
	 */
	public DateId() {
		//カウントした識別番号をidに代入
		id = ++counter;
	}/*
	 * 関数名　　：getId
	 * メソッド　：idを取得するメソッド
	 * パラメータ：なし
	 * 返り値　　：id
	 * 作成者　　：中西輝
	 * 作成日　　：2026.5.11
	 */
	public int getId() {
		return id;
	}
}
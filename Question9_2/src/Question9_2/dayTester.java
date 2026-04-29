package Question9_2;

import java.util.Scanner;
/*
 * クラス名            :dayTester
 * 概要                :値を入力し誕生日が同じかどうか確かめる
 * 						コンストラクタの動きを確認する
 * 						全要素を１年１月１日にする
 * 作成者              :中西輝
 * 作成日              :2026.4.29
 */
public class dayTester {
	/*
	 * 関数名           :main
	 * メソッドの説明   :値を入力し誕生日が同じかどうか確かめ表示
	 * 						コンストラクタの動きを表示する
	 * 						全要素を１年１月１日にし表示
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :中西輝
	 * 作成日           :2026.4.29
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//""の中の文字を表示して改行
		System.out.println("Aさんの誕生日を入力して");
		//""の中の文字を表示
		System.out.print("年 :");
		//birthdayYearの値を入力
		int birthdayYear = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("月 :");
		//birthdayMonthの値を入力
		int birthdayMonth = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("日 :");
		//birthdayDateの値を入力
		int birthdayDate = standardInput.nextInt();
		//入力した値をもとにクラスDay型のday1を作成
		Day day1 = new Day(birthdayYear, birthdayMonth, birthdayDate);
		//""の中の文字とday1のAさんの生年月日を表示
		System.out.println("day1 = " + day1);
		//""の中の文字を表示して改行
		System.out.println("Bさんの誕生日を入力して");
		//""の中の文字を表示
		System.out.print("年 :");
		//birthdayYear2の値を入力
		int birthdayYear2 = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("月 :");
		//birthdayMonth2の値を入力
		int birthdayMonth2 = standardInput.nextInt();
		//""の中の文字を表示
		System.out.print("日 :");
		//birthdayDate2の値を入力
		int birthdayDate2 = standardInput.nextInt();
		//入力した値をもとにクラスDay型のday2を作成
		Day day2 = new Day(birthdayYear2, birthdayMonth2, birthdayDate2);
		//""の中の文字とday2のBさんの生年月日を表示
		System.out.println("day2 = " + day2);
		//二人の生年月日が同じ場合
		if(day1.equalTo(day2)) {
			//""の中の文字を表示し改行
			System.out.println("二人の誕生日は同じです");
		}
		//それ以外
		else {
			//""の中の文字を表示して改行
			System.out.println("二人の誕生日は違います");
		}
		//d1を1,1,1でインスタンス化
		Day d1 = new Day();
		//d2を2026,1,1でインスタンス化
		Day d2 = new Day(2026);
		//d3を2026,4,1でインスタンス化
		Day d3 = new Day(2026, 4);
		//d4を2026,4,29でインスタンス化
		Day d4 = new Day(2026, 4, 29);
		//""の中の文字とインスタンス化した結果を表示
		System.out.println("d1  = " + d1);
		//""の中の文字とインスタンス化した結果を表示
		System.out.println("d2  = " + d2);
		//""の中の文字とインスタンス化した結果を表示
		System.out.println("d3  = " + d3);
		//""の中の文字とインスタンス化した結果を表示
		System.out.println("d4  = " + d4);
		//要素が3のDay型配列の作成
		Day[] dayArray = new Day[3];
		//変数iを0から始めて1ずつ増やしていきdayArrayの要素数になるまで繰り返す
		for(int i = 0; i < dayArray.length; i++) {
			//全要素を１年１月１日にする
			dayArray[i] = new Day();
		}
		//変数iを0から始めて1ずつ増やしていきdayArrayの要素数になるまで繰り返す
		for(int i = 0; i < dayArray.length; i++) {
			//""の中の文字とi、dayArray[i]の値を表示して改行
			System.out.println("a[" + i + "] = " + dayArray[i]);
		}
	}
}



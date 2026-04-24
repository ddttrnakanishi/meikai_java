package 添削用;

import java.util.Scanner;

public class 添削用 {

	
	public static int sum0f(int[] a) {
		//aの値がnullの場合は以下の処理を行う
		if(a == null) {
			//noAcceptに-1を代入する。
			int noAccept = -1;
			//その値を返却する。
			return noAccept;
		}
		//合計値を格納するsumScoreを0で初期化する
		int sumScore = 0;
		//iの値がaの構成要素数未満の間、iの値を増加させながら繰り返し実行する。
		for(int i = 0; i < a.length; i++) {
			//iの値に応じたインデックスにある要素の値をsumScoreに加算する
			sumScore += a[i];
		}
		//最後に値を返却する。
		return sumScore;

	}

	/**
	 * 関数名           :main
	 * メソッドの説明   :最初に処理を行い、他の関数の処理の結果の受け渡しを行う。
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :川野晟慶
	 * 作成日           :2026/4/22
	 */
	public static void main(String[] args) {
		//新しい標準入力ストリームを作成する。
		Scanner standardInput = new Scanner(System.in);
		//scoreRangeを0で初期化する。
		int scoreRange = 0;
		//以下の文を実行する。
		do{
			//配列の範囲の入力を促す文を表示する。
			System.out.print("配列の範囲:");	
			//読み込んだ値でscoreRangeを初期化する。
			scoreRange = standardInput.nextInt();
		}
		//0未満のあいだはdo文の中をループする。
		while(scoreRange < 0); 
		//allRangeは、scoreRangeの範囲の配列を参照する配列変数となる。
		int[] allRange = new int[scoreRange];
		//iの値が配列本体の要素数未満のあいだは、値を増加させながら繰り返し実行する。
		for(int i = 0; i < allRange.length; i++) {
			//何番目の要素を記入するか示す文を表示する。
			System.out.print(i + "番目の要素：");
			//iの値に応じたインデックスに、読み込んだ値を入れて構成要素にする。
			allRange[i] = standardInput.nextInt();
		}
		//全要素を合計した値を表示する
		System.out.println("全要素の合計は" + sum0f(allRange));

		//nullの処理。
		sum0f(null);


	}


}
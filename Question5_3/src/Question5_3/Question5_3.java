package Question5_3;

/*
 * クラス名            :Question5_
 * 概要                :trueやfalseを代入して値を表示する
 * 作成者             :中西輝
 * 作成日              :2026.4.15
 */
public class Question5_3 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理で実施する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者             :中西輝
	 * 作成日              :2026.4.15
	 */
	public static void main(String[] args) {
	//論理値にtrueを代入
	boolean logicalValue = true;
	//""内の文字と論理値に代入された値を表示
	System.out.println("logicalValue = true" + logicalValue );
	//論理値にfalseを代入
	logicalValue = false;
	//""内の文字と論理値に代入された値を表示
	System.out.print("logicalValue = false" + logicalValue);
	}
}

package Question16_2;
/*
 * クラス名            :ParseException
 * 概要                :引数に文字列を受け取り、整数値に変換し返却する
 * 					　 :整数値以外が入力された場合は出来ないことを表示する
 * @author             :中西輝
 * 作成日              :2026.5.18
 */
public class ParseException extends Exception{
	/*
	 * コンストラクタ   	　:ParseException
	 * コンストラクタの説明   :エラーメッセージを受け取れるようにする		　
	 * @param           	　:文字
	 * @author            　　:中西輝
	 * 作成日             　　:2026.5.18
	 */
    public ParseException(String message) {
    	//スーパークラスの参照
        super(message);
    }
}


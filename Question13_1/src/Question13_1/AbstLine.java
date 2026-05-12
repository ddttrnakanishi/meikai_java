package Question13_1;
/*
 * クラス名      :AbstLine
 * 概要          :直線を表す抽象クラス
 * 作成者        :中西輝
 * 作成日        :2026.5.12
 */
public abstract class AbstLine extends Shape{
	
	private int length;
	
	public AbstLine(int length) {
		setLength(length);
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public String toString() {
		return "AbstLine(length:" + length + ")";
	}
}

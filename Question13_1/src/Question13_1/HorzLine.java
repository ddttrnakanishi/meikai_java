package Question13_1;

public class HorzLine extends AbstLine{
	
	public HorzLine(int length) {super(length);}
	
	@Override
	public String toStoring() {
		return "HorzLine(length:" + getLength() + ")";
	}
	
	public void draw() {
		for(int i = 1; i <= getLength(); i++) {
			System.out.print('-');
		}
		System.out.println();
	}
}

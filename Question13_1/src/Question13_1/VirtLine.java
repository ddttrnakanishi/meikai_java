package Question13_1;

public class VirtLine extends AbstLine{

	public VirtLine(int length) {super(length);}
	
	@Override
	public String toStoring() {
		return "VirtLine(length:" + getLength() + ")";
	}
	public void draw() {
		for(int i = 1; i <= getLength(); i++) {
			System.out.println('|');
		}
	}
}

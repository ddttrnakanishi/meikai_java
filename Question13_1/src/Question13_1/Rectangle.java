package Question13_1;

public class Rectangle extends Shape{

	private int width;
	
	private int heigth;
	
	public Rectangle(int width, int heigth) {
		this.width = width;
		this.heigth = heigth;
	}
	
	@Override
	public String toStoring() {
		return "Rectangle(width:" + width + ", heigth:" + heigth + ")";
	}
	
	public void draw() {
		for(int i = 1; i <= heigth; i++) {
			for(int j = 1; j <= width; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}

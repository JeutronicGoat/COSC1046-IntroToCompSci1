
public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle rec1 = new Rectangle(4, 40);
		
		Rectangle rec2 = new Rectangle(3.5, 35.9);
		
		System.out.printf("Rectangle1 has a width of %.2f, height of %.2f, area of %.2f, and perimeter of %.2f.\n"
				, rec1.width, rec1.height, rec1.getArea(), rec1.getPerimeter());
		
		System.out.printf("Rectangle2 has a width of %.2f, height of %.2f, area of %.2f, and perimeter of %.2f.\n"
				, rec2.width, rec2.height, rec2.getArea(), rec2.getPerimeter());
		
	}
}

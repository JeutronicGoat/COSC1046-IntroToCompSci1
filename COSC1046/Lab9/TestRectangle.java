
public class TestRectangle {

	public static void main(String[] args) {
	
		Rectangle[] array = new Rectangle[10];
		
		array[0] = new Rectangle();
		
		for(int i = 1; i < array.length; i++) {
			array[i] = new Rectangle(randomNum(4, 15), randomNum(2, 8));
		}
		
		int totalArea = 0;
		
		for(int i = 0; i < array.length; i++) {
			totalArea += array[i].getArea();
		}
		
		System.out.println("The total area of the rectangles is " + totalArea + ".");
		
		int largestP = Integer.MIN_VALUE;
		int smallestP = Integer.MAX_VALUE;
		
		for(int i = 0; i < array.length; i++) {
			if(largestP < array[i].getPerimeter()) {
				largestP = array[i].getPerimeter();
			}
			if(smallestP > array[i].getPerimeter()) {
				smallestP = array[i].getPerimeter();
			}
		}
		
		System.out.println("The largest perimeter is " + largestP + " and the smallest is " + smallestP + ".");
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
		}
		
	}
	
	public static int randomNum(int low, int high) {
		
		if(low > high) {
			int temp = low;
			low = high;
			high = low;
		}
		
		int randomNum = low + ((int)(Math.random() * (high - low + 1)));
		
		return randomNum;
	}
}

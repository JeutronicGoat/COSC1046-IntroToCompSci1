
public class Rectangle {

	private int width = 1;
	
	private int height = 1;
	
	
	public Rectangle(){
	}
	
	public Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	} 
	
	public int getArea() {
		return width * height;
	}
	
	public int getPerimeter() {
		return (width + height) * 2;
	}
	
	@Override
	public String toString() {
		return "Rectangle[" + width + " x " + height + "], area = " + getArea() + ", perimeter = " + getPerimeter() + ".";
	}
}

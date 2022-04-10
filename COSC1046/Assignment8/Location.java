import java.util.*;

public class Location {

	public int row = 0;
	
	public int column = 0;
	
	public double maxValue;
	
	Location(){
	}
	
	Location(int row, int column){
		this.row = row;
		this.column = column;
	}
	
	public String toString() {
		return "(" + row + ", " + column + ")";
	}
}

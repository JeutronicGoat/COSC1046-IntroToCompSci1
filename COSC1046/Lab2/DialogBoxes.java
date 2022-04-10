import javax.swing.JOptionPane;

public class DialogBoxes {
	public static void main(String[] agrs) {
		
		String name = JOptionPane.showInputDialog("Please enter your name: ");
		
		String tempNum = JOptionPane.showInputDialog("Please enter your favourite integer number: ");
		int integerNumber = Integer.parseInt(tempNum);
		
		String colour = JOptionPane.showInputDialog("Please enter your favourite colour: ");
		
		tempNum = JOptionPane.showInputDialog("Please enter the answer to the expression {17 + 3 x 4.6}: ");
		double answer = Double.parseDouble(tempNum);
		
		JOptionPane.showMessageDialog(null, "\nYour name is " + name + ", your favourite integer number is " + integerNumber + 
				", and your favourite colour is " + colour + "\nYour answer to the expression is " + answer + 
				". The correct answer is 30.8.");
	}
}
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter matrix1: ");
		double[][] matrix1 = new double[3][3];
		for(int i = 0; i < matrix1.length; i++) {
			for(int j = 0; j < matrix1[i].length; j++) {
				matrix1[i][j] = in.nextDouble();
			}
		}
		
		System.out.print("Enter matrix2: ");
		double[][] matrix2 = new double[3][3];
		for(int i = 0; i < matrix2.length; i++) {
			for(int j = 0; j < matrix2[i].length; j++) {
				matrix2[i][j] = in.nextDouble();
			}
		}
		
		double[][] addedMatrix = addMatrix(matrix1, matrix2);
		double[][] multipliedMatrix = multiplyMatrix(matrix1, matrix2);
		
		//print addition
		System.out.println("The matrices are added as follows:");
		for(int i = 0; i < addedMatrix.length; i++) {
			for(int j = 0; j < matrix1[i].length; j++) {
				System.out.printf("%4.1f ", matrix1[i][j]);
			}
			
			if(i != 1) {
				System.out.print("     ");
			}
			else {
				System.out.print("  +  ");
			}
			
			for(int j = 0; j < matrix2[i].length; j++) {
				System.out.printf("%4.1f ", matrix2[i][j]);
			}
			
			if(i != 1) {
				System.out.print("     ");
			}
			else {
				System.out.print("  =  ");
			}
			
			for(int j = 0; j < addedMatrix[i].length; j++) {
				System.out.printf("%4.1f ", addedMatrix[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		//print multiplication
		System.out.println("The matrices are multiplied as follows:");
		for(int i = 0; i < multipliedMatrix.length; i++) {
			for(int j = 0; j < matrix1[i].length; j++) {
				System.out.printf("%4.1f ", matrix1[i][j]);
			}
			
			if(i != 1) {
				System.out.print("     ");
			}
			else {
				System.out.print("  X  ");
			}
			
			for(int j = 0; j < matrix2[i].length; j++) {
				System.out.printf("%4.1f ", matrix2[i][j]);
			}
			
			if(i != 1) {
				System.out.print("     ");
			}
			else {
				System.out.print("  =  ");
			}
			
			for(int j = 0; j < multipliedMatrix[i].length; j++) {
				System.out.printf("%4.1f ", multipliedMatrix[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
	public static double[][] addMatrix(double[][] a, double[][] b){
	
		double[][] answerMatrix = new double[3][3];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				answerMatrix[i][j] = a[i][j] + b[i][j];
			}
		}
		return answerMatrix;
	}
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		
		double[][] answerMatrix = new double[3][3];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				for(int k = 0; k < a[i].length; k++) {
					answerMatrix[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return answerMatrix;
	}
}

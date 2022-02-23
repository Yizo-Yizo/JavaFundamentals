import java.util.Scanner;

public class Chapter08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		double[][] m = new double[3][4];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		input.close();
		
		sumColumn(m);

	}
	
	public static void sumColumn(double[][] m) {
		
		
		int column;
		for (column = 0; column < m[0].length; column++) {
			double total = 0;
			for (int row = 0; row < m.length; row++) {
				total += m[row][column];
			}
			System.out.println("Sum for column " + column + " is " + total);
			
		}
	}

}

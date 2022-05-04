import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Chapter08 {

	public static void main(String[] args) {
		
		//8.1
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Enter a 3-by-4 matrix row by row: ");
//		double[][] m = new double[3][4];
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m[i].length; j++) {
//				m[i][j] = input.nextDouble();
//			}
//		}
//		input.close();
//		
//		sumColumn(m);
		
		// 8.2
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Enter a 4-by-4 matrix row by row: ");
//		double[][] m = new double[4][4];
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m[i].length; j++) {
//				m[i][j] = input.nextDouble();
//			}
//		}
//		input.close();
//		
//		var diagonalSum = sumMajorDiagonal(m);
//		System.out.println("Sum of the elements in the major diagonal is " + diagonalSum);
		
		// 8.3
		// Students answers to the questions
//		char[][] answers = {
//				 {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
//				 {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
//				 {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
//				 {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
//				 {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
//				 {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
//				 {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
//				 {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
		
		// Key to the questions
//		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
//		
//		double[] studentsAnswers = new double[answers.length];
		
		// Grade all answers
//		for (int i = 0; i < answers.length; i++) {
			//Grade one student
//			int correctCount = 0;
//			for (int j = 0; j < answers[i].length; j++) {
//				if (answers[i][j] == keys[j])
//					correctCount++;
				//studentsAndAnswers[i][j] = correctCount;
//			}
//			studentsAnswers[i] = correctCount;
//		}
//		
//		sortArray(studentsAnswers);
//		
//		for (int i = 0; i < studentsAnswers.length; i++) {
//			
//			System.out.println("Studetn " + i + "'s correct count is " + studentsAnswers[i]);
//		}
		
		//8.4
//		int[][] employeeWorkingHours = {
//				{2, 4, 3, 4, 5, 8, 8},
//				{7, 3, 4, 3, 3, 4, 4},
//				{3, 3, 4, 3, 3, 2, 2},
//				{9, 3, 4, 7, 3, 4, 1},
//				{3, 5, 4, 3, 6, 3, 8},
//				{3, 4, 4, 6, 3, 4, 4},
//				{3, 7, 4, 8, 3, 8, 4},
//				{6, 3, 5, 9, 2, 7, 9},
//		};
//		
//		int[][] sumOfHours = new int[employeeWorkingHours.length][2];
//		
//		for (int i = 0; i < employeeWorkingHours.length; i++) {
//			sumOfHours[i][0] = i;
//			sumOfHours[i][1] = sumRow(employeeWorkingHours, i);
//		}
//		
//		sort(sumOfHours);
//		
//		for (int i = sumOfHours.length-1; i > 0; i--) {
//			
//			System.out.println("Employee " + sumOfHours[i][0] + " worked " + sumOfHours[i][1] + " hours.");
//		}
		
		//8.5
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("Enter matrix1: ");
//		for (int i = 0; i < )
		
		// 8.6
		// Initialize two 3 x 3 matrices
//		double[][] matrix1 = getmatrix(1);
//		double[][] matrix2 = getmatrix(2);
//		
//		// Initialize matrix3 with the multiplication of matrix1 and matrix2
//		double[][] matrix3 = multiplyMatrix(matrix1, matrix2);
//		
//		// Display matrix1, matrix2 and matrix3
//		print(matrix1, matrix2, matrix3);
		
		// 8.7
		
//		double[][] points = {
//				{-1, 0, 3},
//				{-1, -1, -1},
//				{4, 1, 1},
//				{2, 0.5, 9},
//				{3.5, 2, -1},
//				{3, 1.5, 3},
//				{-1.5, 4, 2},
//				{5.5, 4, -0.5}
//		};
//		
//		int p1 = 0, p2 = 1;
//		double shortestDistance = distance(points[p1][0], points[p1][1], points[p1][2], 
//				points[p2][0], points[p2][1], points[p2][2]);
//		
//		for (int i = 0; i < points.length; i++) {
//			for (int j = i + 1; j < points.length; j++) {
//				double distance = distance(points[i][0], points[i][1], points[i][2],
//						points[j][0], points[j][1], points[j][2]);
//				
//				if (shortestDistance > distance) {
//					p1 = i;
//					p2 = j;
//					shortestDistance = distance;
//				}
//			}
//		}
//		
//		System.out.println("The closest two points are "+
//				"(" + points[p1][0] + ", " + points[p1][1] + ", " + points[p1][2] + ") and (" +
//				points[p2][0] + ", " + points[p2][1] + ", " + points[p2][2] + ")");
		
		// 8.8
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("Enter the number of points: ");
//		int numberOfPoints = input.nextInt();
//		
//		System.out.print("Enter " + numberOfPoints + " points: ");
//		double[][] points = new double[numberOfPoints][2];
//		for (int i = 0; i < points.length; i++) {
//			for (int j = 0; j < points[i].length; j++) {
//				points[i][j] = input.nextDouble();
//			}
//		}
//		
//		int p1 = 0, p2 = 1;
//		double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], 
//				points[p2][1]);
//		
//		for (int i = 0; i < points.length; i++) {
//			for (int j = i + 1; j < points.length; j++) {
//				double distance = distance(points[i][0], points[i][1], points[j][0],
//						points[j][1]);
//				
//				if (shortestDistance > distance) {
//					p1 = i;
//					p2 = j;
//					shortestDistance = distance;
//				}
//			}
//		}
//		
//		
//		for (int i = 0; i < points.length; i++) {
//			for (int j = i + 1; j < points.length; j++) {
//				double distance = distance(points[i][0], points[i][1], points[j][0],
//						points[j][1]);
//				
//				if (distance == shortestDistance) {
//					System.out.println("The closest two points are "+
//							"(" + points[i][0] + ", " + points[i][1] + ") and (" +
//							points[j][0] + ", " + points[j][1] + ")");
//				}
//			}
//		}
//		input.close();
//		System.out.println("Their distance is: " + shortestDistance);
		
		// 8.9
		Scanner input = new Scanner(System.in);
		
		String[][] grid = new String[3][3];
		
		boolean turns = false;
		boolean status = true;
		
		String player1 = "X", player2 = "O";
		
		while(status) {
			var result = turns ? player1 : player2;
			System.out.print("Enter a row (0, 1, or 2) for player " + result + " : ");
			int row = input.nextInt();
			System.out.print("Enter a column (0, 1, or 2) for player " + result + " : ");
			int column = input.nextInt();
			grid[row][column] = result;
			
			// Change players turns
			if (turns == true) {
				
				turns = false;
			}
			else{
				
				turns = true;
			}
			
			// Determining a win
			if (grid[0][0] == result && grid[1][1] == result && grid[2][2] == result) {
				
				System.out.println(result + " player won");
				status = false;
			}
			else if (grid[0][2] == result && grid[1][1] == result && grid[2][0] == result) {
				
				System.out.println(result + " player won");
				status = false;
			}
			else if (grid[0][0] == result && grid[0][1] == result && grid[0][2] == result) {
				
				System.out.println(result + " player won");
				status = false;
			}
			else if (grid[1][0] == result && grid[1][1] == result && grid[1][2] == result) {
				
				System.out.println(result + " player won");
				status = false;
			}
			else if (grid[2][0] == result && grid[2][1] == result && grid[2][2] == result) {
				
				System.out.println(result + " player won");
				status = false;
			}
			else if (isFull(grid)) { // Determining a draw
				
				System.out.println("It's a draw");
				status = false;
			}
			else {
				status = true;
			}
		}
		
	}
	
	// 8.9
	
	public static boolean isFull(String[][] grid) {
		
		for (int i = 0; i < grid.length; i++)
			for (int j = 0; j < grid[i].length; j++) {
				
				if (grid[i][j] == null)
					return false;
			}
		return true;
	}
	
	// 8.8
	
//		public static double distance(double x1, double y1, double x2, double y2) {
//			
//			return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//		}
	
	//8.7
//	public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
//		
//		return Math.sqrt((x2 - x1) * (y2 - y1) * (z2 - z1));
//	}
	
	// 8.6
//	public static double[][] getmatrix(int n ){
//		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("Enter matrix" + n + ": ");
//		
//		double[][] m = new double[3][3];
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				m[i][j] = input.nextDouble();
//			}
//		}
//		
//		return m;
//	}
//	
//	public static double[][] multiplyMatrix(double[][] a, double[][] b){
//		
//		double[][] c = new double[3][3];
//		int count = 0;
//		
//		for (int i = 0; i < c.length; i++) {
//			for (int j = 0; j < c[i].length; j++) {
//				for (int h = 0; h < c.length; h++) {
//					c[i][j] += a[i][h] * b[h][j];
//				}
//			}
//		}
//		return c;
//	}
//	
//	// print displays all the elements in row r
//	public static void print(double[][] m, int r) {
//		for (int j = 0; j < m[r].length; j++) {
//			System.out.print(m[r][j] + " ");
//		}
//	}
//	
//	// print displays results
//	public static void print(double[][] m1, double[][] m2, double[][] m3) {
//		
//		System.out.println("The matrices are added as follows");
//		
//		for (int i = 0; i < 3; i++) {
//			print(m1, i);
//			System.out.print((i == 1 ? " * " : "   "));
//			print(m2, i);
//			System.out.print((i == 1 ? " = " : "   "));
//			print(m3, i);
//			System.out.println();
//		}
//	}
	
	//8.5
//	public static double[][] addmatrix(double[][] a, double[][] b){
//		
//		double[][] c = new double[a.length][a.length];
//		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				
//				c[i][j] = a[i][j] + b[i][j];
//			}
//		}
//		
//		return c;
//	}
	
	//8.4
	// Sort by column 1 in ascending order
//	public static void sort(int[][] m) {
//		
//		for (int i = 0; i < m.length; i++) {
//			//find the min in the column 1
//			int minCol1 = m[i][1];
//			int minCol0 = m[i][0];
//			int minIndex = i;
//			
//			for (int j = i + 1; j < m.length; j++) {
//				
//				if (minCol1 > m[j][1]) {
//					minCol1 = m[j][1];
//					minCol0 = m[j][0];
//					minIndex = j;
//				}
//			}
//			
//			// Swap
//			if (minIndex != i) {
//				
//				m[minIndex][1] = m[i][1];
//				m[minIndex][0] = m[i][0];
//				
//				m[i][1] = minCol1;
//				m[i][0] = minCol0;
//			}
//			
//		}
//	}
//	
//	public static int sumRow(int[][] m, int rowIndex) {
//		
//		int sum = 0;
//		for (int column = 0; column < m[0].length; column++) {
//			sum += m[rowIndex][column];
//		}
//		
//		return sum;
//	}
	
//	public static void sortArray(double[] array) {
//		
//		for (int i = 0; i < array.length; i++) {
//			
//			double min = array[i];
//			int minIndex = i;
//			
//			for (int j = i+1; j < array.length; j++) {
//				
//				if (array[j] < min) {
//					min = array[j];
//					minIndex = j;
//				}
//			}
//			
//			if (minIndex != i) {
//				array[minIndex] = array[i];
//				array[i] = min;
//			}
//		}
//		
//		
//	}
	
//	public static double sumMajorDiagonal(double[][] m) {
//		
//		double total = 0;
//		for (int i = 0; i < m.length; i ++) {
//			total += m[i][i];
//		}
//		
//		return total;
//	}
//	public static void sumColumn(double[][] m) {
//		
//		
//		int column;
//		for (column = 0; column < m[0].length; column++) {
//			double total = 0;
//			for (int row = 0; row < m.length; row++) {
//				total += m[row][column];
//			}
//			System.out.println("Sum for column " + column + " is " + total);
//			
//		}
//	}

}

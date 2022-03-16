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
	}
	
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

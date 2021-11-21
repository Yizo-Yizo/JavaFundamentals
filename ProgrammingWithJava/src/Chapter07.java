import java.util.Scanner;

public class Chapter07 {
	
	public static void main(String[] args) {
	
			
			/*
			 * double[] list = new double[] {3.4, 5, 3, 3.5, 2.2, 1.9, 2};
			 * SelectionSort.selectionSort(list); for (var i = 0; i < list.length; i++) {
			 * System.out.print(list[i]+" "); }
			 */
			 
			//SelectionSort.selectionSort(list);
			/*
			 * int[] grades = { 1, 2, 3, 72, 5 }; Arrays.parallelSort(grades);
			 * System.out.println(grades);
			 */
			
			// 7.1
			
	//		 Scanner scanner = new Scanner(System.in);
	//		 
	//		 System.out.println("Enter the number of students: "); 
	//		 int numberOfStudents = scanner.nextInt();
	//		 
	//		 AssignGrades assignGrades = new AssignGrades();
	//		 assignGrades.Score(numberOfStudents);
	//		 
	//		 scanner.close();
			 
			
			// 7.2
			/*
			 * Scanner scanner = new Scanner(System.in); int[] numbers = new int[10];
			 * 
			 * System.out.println("Enter ten integers: ");
			 * 
			 * for (int i = 0; i < 10; i++) { numbers[i] = scanner.nextInt(); }
			 * 
			 * for (int i = 9; i >= 0; i--) { System.out.println(numbers[i]); }
			 * 
			 * scanner.close();
			 */
			
			// 7.3 my solution
	//		Scanner scanner = new Scanner(System.in);
	//		int[] numbers = new int[99];
	//		
	//		System.out.println("Enter the integers between 1 and 100: ");
	//		for (int i = 0; i < 100; i++) {
	//			numbers[i] = scanner.nextInt();
	//		}
	//		scanner.close();
	//		
	//		int count = 1;
	//		for (int i = 0; i < numbers.length; i++) {
	//			for (int j = 0; j < numbers.length; j++) {
	//				if (numbers[i] == numbers[j])
	//					count++;
	//			}
	//			 System.out.println(numbers[i] + " occurs " + count + " times");
	//		}
			
	//		// 7.3 textbook solution
	//		int counts[] = new int[100]; // Counts the occurrences of numbers
	//		
	//		// Prompt the user to enter integers between 1 and 100
	//		System.out.print("Enter the integers between 1 and 100s: ");
	//		
	//		// Count occurrence of numbers
	//		count(counts);
	//		
	//		// Display results
	//		for (int i = 0; i < counts.length; i++) {
	//			if (counts[i] > 0)
	//				System.out.println((i + 1) + "occurs" + counts[i] + "time" + (counts[i] > 1 ? "s" : ""));
	//		}
			
			// 7.4 
	//		int counts[] = new int[100];
	//		// Prompt the user to enter integers between 1 and 100
	//		System.out.print("Enter the integers between 1 and 100: ");
			
			// Count occurence of numbers
			
			//7.5
			
	//		int tenNumbers[] = new int[10];
	//		int noDuplicate[] = new int[10];
	//		int num;
	//		Scanner input = new Scanner(System.in);
	//		
	//		System.out.print("Enter ten numbers: ");
	//		for (int i = 0; i < 10; i++) {
	//			num = input.nextInt();
	//			tenNumbers[i] = num;
	//		}
	//		
	//		for (int number : tenNumbers){
	//			for (int i = 0; i < 10; i++) {
	//				if (!(number == tenNumbers[i])) {
	//					noDuplicate[i] = number;
	//				}
	//					
	//			}
	//		}
	//		
	//		System.out.println("The number of distinct numbers is "+noDuplicate.length);
	//		for (int i = 0; i < noDuplicate.length; i++) {
	//			System.out.print(noDuplicate[i]);
	//		}
	//		
	//		input.close();
			
			// 7.6
	//		final int numberOfPrimes = 50;
	//		final int numberOfPrimesPerLine = 10;
	//		int count = 0;
	//		int number = 2;
	//		
	//		System.out.println("The first 50 prime numbers are \n");
	//		
	//		while (count < numberOfPrimes) {
	//			 
	//			boolean isPrime = true;
	//			
	//			for (int divisor = )
	//		}
			
			// 7.7
	//		int[]counts = new int[100];
	//		count(counts);
	//		
	//		for (int i = 0; i < counts.length; i++) {
	//			if (counts[i] >= 0) {
	//				System.out.println((i+1) + " occurs " + counts[i] + "times");
	//			}
	//		}
			// 7.7 textbook
	//		int[] counts = new int[10];
	//		
	//		for (int i = 1; i <= 100; i++) {
	//			counts[(int)(Math.random() * 10)]++;
	//		}
	//		
	//		System.out.println("Count for each number between 0 and 9");
	//		for (int i = 0; i < counts.length; i++) {
	//			System.out.println(i + "s: " + counts[i]);
	//		}
			
			// 7.8
	//		int[] array = new int[10];
	//		
	//		System.out.println("Enter ten doubles: ");
	//		
	//		average(array);
	//		
	//		System.out.println("The evarage is "+ average(array));
			
			// 7.9
	//		Scanner input = new Scanner(System.in);
	//		double[] numbers = new double[10];
	//		
	//		System.out.print("Enter ten numbers: ");
	//		for (int i = 0; i < numbers.length; i++) {
	//			numbers[i] = input.nextDouble();
	//		}
	//		input.close();
	//		
	//		System.out.println("The minimum number is: "+ min(numbers));
			
			//7.10
	//		Scanner input = new Scanner(System.in);
	//		int[] numbers = new int[10];
	//		
	//		System.out.print("Enter ten numbers: ");
	//		for (int i = 0; i < numbers.length; i++) {
	//			numbers[i] = input.nextInt();
	//		}
	//		input.close();
	//		
	//		System.out.println("The index of a minimum number is: "+ indexOfSmallestElement(numbers));
			
			// 7.11
	//		Scanner input = new Scanner(System.in);
	//		double[] numbers = new double[10];
	//		
	//		System.out.print("Enter 10 numbers: ");
	//		for (int i = 0; i < numbers.length; i++) {
	//			numbers[i] = input.nextDouble();
	//		}
	//		input.close();
	//		
	//		System.out.println("The mean is: "+ mean(numbers));
	//		System.out.println("The standard deviation is: "+ deviation(numbers));
			
			// 7.12
	//		Scanner input = new Scanner(System.in);
	//		double[] numbers = new double[10];
	//		
	//		System.out.print("Enter ten numbers: ");
	//		for (int i = 0; i < numbers.length; i++) {
	//			numbers[i] = input.nextDouble();
	//		}
	//		input.close();
	//		
	//		System.out.println("The reverse array is: "+ reverseArray(numbers));
			
			// 7.13
	//		Scanner input = new Scanner(System.in);
	//		
	//		System.out.println("Enter a number:");
	//		var num = input.nextInt();
	//		
	//		System.out.print(getRandom(num));
			
			// 7.15
	//		Scanner input = new Scanner(System.in);
	//		int[] numbers = new int[10];
	//		
	// 		System.out.print("Enter ten numbers: ");
	//		for (int i = 0; i < 10; i++) {
	//			numbers[i] = input.nextInt();
	//		}
	//		
	//		 
	//		for(int e : eliminateDuplicates(numbers)) {
	//			System.out.print(e+" ");
	//		}
			
			// 7.16
	//		Random rad = new Random();
	//		
	//		int[] array = new int[1000];
	//		
	//		for (int i = 0; i < array.length; i++) {
	//			
	//			array[i] = rad.nextInt(1000);
	//		}
	//		
	//		long startTime = System.currentTimeMillis();
	//		linearSearch(array, rad.nextInt(10));
	//		long endTime = System.currentTimeMillis();
	//		long linearSearchExecutionTime = endTime - startTime;
	//		
	//		long startTime1 = System.currentTimeMillis();
	//		binarySearch(array,rad.nextInt(10));
	//		long endTime1 = System.currentTimeMillis();
	//		long binarySearchExecutionTime = endTime1 - startTime1;
	//		
	//		System.out.println(rad.nextInt());
	//		System.out.println("Execution time for linear search is "+ linearSearchExecutionTime + " and execution time for binary search is " + binarySearchExecutionTime);
			
			// 7.17
	//		Scanner input = new Scanner(System.in);
	//		Map<String, String> studentScore = new HashMap<String, String>();
	//		
	//		System.out.print("Enter the number of the students: ");
	//		int numberOfStudents = input.nextInt();
	//		String[] names = new String[numberOfStudents];
	//		String[] scores = new String[numberOfStudents];
	//		
	//		System.out.print("Enter the names of the students: ");
	//		for (int i = 0; i < names.length; i++) {
	//			names[i] = input.next();
	//		}
	//		
	//		System.out.print("Enter the scores of the students: ");
	//		for (int i = 0; i < scores.length; i++) {
	//			scores[i] = input.next();
	//		}
	//		input.close();
	//		
	//		for (String name : studentScore.keySet()) {
	//			System.out.println("Name: "+ name);
	//		}
	//		
	//		for (String score : studentScore.values()) {
	//			System.out.println("Score: "+ score);
	//		}
			
			// 7.18
	//		Scanner input = new Scanner(System.in);
	//		int[] numbers = new int[10];
	//		
	//		System.out.print("Enter ten numbers: ");
	//		for (int i = 0; i < numbers.length; i++) {
	//			numbers[i] = input.nextInt();
	//		}
	//		input.close();
	//		
	//		bubbleSort(numbers);
	//		
	//		System.out.println(Arrays.toString(numbers));
			
			// 7.18 textbook
	//		Scanner input = new Scanner(System.in);
	//		double[] numbers = new double[10];
	//		
	//		System.out.print("Enter ten numbers: ");
	//		for (int i = 0; i < numbers.length; i++) {
	//			numbers[i] = input.nextDouble();
	//		}
	//		
	//		bubbleSort(numbers);
	//		
	//		for (double e: numbers) {
	//			System.out.print(e + " ");
	//		}
	//		System.out.println();
			
			// 7.19
	//		Scanner input = new Scanner(System.in);
	//		
	//		System.out.print("Enter list: ");
	//		int[] numbers = {input.nextInt()};
	//		input.close();
	//		if(isSorted(numbers)) {
	//			System.out.println("The list is sorted.");
	//		}else {
	//			System.out.println("The list is not sorted.");
	//		}
			
			// 7.20
			Scanner input = new Scanner(System.in);
			double[] numbers = new double[10];
			
			// Prompt the user to enter ten numbers
			System.out.print("Enter ten numbers ");
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = input.nextInt();
			}
			input.close();
			selectionSort(numbers);
			
			for (double number : numbers) {
				System.out.print(number + " ");
			}
		}
		
		// 7.20
		public static void selectionSort(double[] list) {
			
			for (int i = 0; i < list.length-1; i++) {
				double currentMax = list[i];
				int currentMaxIndex = i;
				
				for (int j = i+1; j < list.length; j++) {
					if (currentMax < list[j]) {
						currentMax = list[j];
						currentMaxIndex = j;
					}
				}
				
				if (currentMaxIndex != i) {
					list[currentMaxIndex] = list[i];
					list[i] = currentMax;
				}
			}
		}
		// 7.19
	//		public static boolean isSorted(int[] list) {
	//			
	//			for (int i = 0; i < list.length - 1; i++) {
	//				if (list[i] > list[i+1]) {
	//					return false;
	//				}
	//			}return true;
	//		}
		
		// 7.18 textbook
	//	public static void bubbleSort(double[] list) {
	//		double temp;
	//		boolean swapped;
	//		
	//		do {
	//			swapped = false;
	//			
	//			for (int i = 0; i < list.length - 1; i++) {
	//				if (list[i] > list[i+1]) {
	//					temp = list[i];
	//					list[i] = list[1+i];
	//					list[i+1] = temp;
	//					swapped = true;
	//				}
	//			}
	//		}while (swapped);
	//	}
			
		// 7.18
	//	public static void bubbleSort(int[] array) {
	//		
	//		for (int i = 0; i < array.length; i++) {
	//			
	//			int min = array[i];
	//			int minIndex = i;
	//			
	//			for (int j = 0; j < array.length; j++) {
	//				
	//				if (array[j] < min) {
	//					min = array[j];
	//					minIndex = j;
	//					
	//				}
	//			}
	//			
	//			if (minIndex != i) {
	//				array[minIndex] = array[i];
	//				array[i] = min;
	//			}
	//		}
	//	}
		// 7.16
	//	public static int linearSearch(int[] list, int key) {
	//		for (int i = 0; i < list.length; i++) {
	//			if(key == list[i])
	//				return i;
	//		}
	//		return -1;
	//	}
	//	
	//	public static int binarySearch(int[] list, int key) {
	//		int low = 0;
	//		int high = list.length -1;
	//		
	//		while (high >= low) {
	//			int mid = (low + high) / 2;
	//			if (key < list[mid])
	//				high = mid -1;
	//			else if (key == list[mid])
	//				return mid;
	//			else 
	//				low = mid + 1;
	//		}
	//		return -low - 1;
	//	}
		
		// 7.15
	//	public static int[] eliminateDuplicates(int[] list) {
	//		int[] temp = new int[10];
	//		temp[0] = list[0];
	//			for (int i = 1; i < list.length; i++) {
	//				for (int j = i; j < list.length; j++) {
	//					
	//					if (!(list[i] == list[j])) {
	//						temp[i] = list[j];
	//						break;
	//					}
	//					
	//				}
	//			}
	//			return temp;
	//	}
		
		//7.13
	//	public static int getRandom(int numbers) {
	//		Random rand = new Random();
	//		var num = rand.nextInt(54);
	//		num += 1;
	//		
	//		if (numbers == num) {
	//			return num += 2;
	//		}
	//		else
	//			return num;
	//	}
		
		// 7.12
	//	public static double[] reverseArray(double[] array) {
	//		double[] rev = new double[10];
	//		
	//		for (int i = 0; i < array.length; i++) {
	//			rev[i] = array[array.length-(i+1)];
	//		}
	//		return rev;
	//	}
		
	//	public static double mean(double[] x) {
	//		double num = 0;
	//		
	//		for (int i = 0; i < x.length; i++) {
	//			num += x[i];
	//		}
	//		
	//		var average = num / x.length;
	//		
	//		return average;
	//	}
	//	
	//	public static double deviation(double[] x) {
	//		double num = 0;
	//		double mean = mean(x);
	//		
	//		for (int i = 0; i < x.length; i++) {
	//			num =+ Math.pow((x[i] - mean), 2);
	//		}
	//		
	//		var deviation = Math.sqrt((num/(x.length-1)));
	//		
	//		return deviation;
	//	}
		
		
		// 7.10
	//	public static int indexOfSmallestElement(int[] array) {
	//		int min = array[0];
	//		int index = 0;
	//		for (int i = 0; i < array.length; i++) {
	//			if (array[i] < min) {
	//				min = array[i];
	//				index = i;
	//			}
	//		}
	//		return index;
	//	}
			// 7.9
	//		public static double min(double[] array) {
	//			double min = array[0];
	//			
	//			for (double i: array) {
	//				if (i < min) {
	//					min = i;
	//				}
	//			}
	//			return min;
	//		}
		// 7.8
	//	public static int average(int[] array) {
	//		Scanner input = new Scanner(System.in);
	//		int count = 0;
	//		int avr = 0;
	//		
	//		for (int i = 0; i < array.length; i++) {
	//			int num = input.nextInt();
	//			array[i] = num;
	//		}
	//		input.close();
	//		for (int i = 0; i < array.length; i++) {
	//			avr = (count + array[i]) / array.length;
	//		}
	//		return avr;
	//	}
		
		
		//7.7
	//		public static void count(int[] counts) {
	//			Random rand = new Random();
	//			int num;
	//			do {
	//				num = rand.nextInt(10);
	//				if (num >= 1 && num <= 9) {
	//					counts[num - 1]++;
	//				}
	//			}while (!(num < 0));
	//		}
		
		// 7.3
		// Method count reads integers between 1 and 100, and counts the occurrences of each
	//	public static void count(int[] counts) {
	//		Scanner input = new Scanner(System.in);
	//		int num; // Holds user input
	//		
	//		do {
	//			num = input.nextInt();
	//			if (num >= 1 && num <= 100)
	//				counts[num - 1]++;
	//		}while (num != 0);
	//		input.close();
	//		
	//	}
		
		//7.4
	//	public static void count(int[] counts) {
	//		Scanner input = new Scanner(System.in);
	//		int num;
	//		int total = 0;
	//		
	//		do {
	//			num = input.nextInt();
	//			for(int i = 0; i < counts.length; i++) {
	//				total = total + counts[i];
	//			}
	//			var average = total / counts.length;
	//			if (num <= average)
	//				counts[num - 1]++;
	//			else if (num > average)
	//				counts[num - 1]++;
	//		}while (num >= 0);
	//		input.close();
//	}
}

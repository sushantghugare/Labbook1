package assignment2;

	import java.util.Arrays;
	import java.util.Scanner;

	public class Question3 {
		public static void main(String[] args) {            
			Question3.getSorted();
			
		}
		public static void getSorted() {
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);
			// Declare array size
			int n;
			System.out.print("Enter number of elements : ");
			// Initialize array size
			n = sc.nextInt();

			int arr[] = new int[n]; 
			System.out.println("Enter the numbers : ");
			for (int i = 0; i < n; i++) 
			{
				arr[i] = sc1.nextInt();
			}

			Arrays.sort(arr); // Sort 

			System.out.println(Arrays.toString(arr)); // Display the array
			sc.close();
			sc1.close();
		}

}

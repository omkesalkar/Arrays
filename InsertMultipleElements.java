package Arrays_Logical_Questions.Day_08_Insertion_Deletion;

/*Insert Multiple Elements
 Write a program to insert the elements {7, 8, 9} at the end of the array {1, 2, 3, 4, 5} 
 Output: {1, 2, 3, 4, 5, 7, 8, 9}
*/

import java.util.Arrays;
import java.util.Scanner;

public class InsertMultipleElements
{
	public static void insertMultipleElements(int[] arr, int[] ele)
	{
		int[] newArray = new int[arr.length + ele.length];
		
		for(int i=0; i<arr.length; i++) {
			newArray[i] = arr[i];
		}
		
		for(int i=0; i<ele.length; i++) {
			newArray[arr.length + i] = ele[i];
		}
		
		System.out.println("Old array: "+ Arrays.toString(arr));
		System.out.println("Old array: "+ Arrays.toString(newArray));
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How many element to add in array: ");
		int n = sc.nextInt();
		
		int[] elements = new int[n];
		System.out.print("Enter elements to add in array: ");
		for(int i=0; i<n; i++)
		{
			elements[i] = sc.nextInt();
		}

		insertMultipleElements(arr, elements);
		sc.close();
	}
}

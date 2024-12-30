package Arrays_Logical_Questions.Day_07_ArrayInterviewQuestion;

/* Implement a java program to find the 2nd smallest element 
   in an array and print it.
*/

import java.util.Arrays;
public class FindSecondSmallestElement 
{
	public static int secondSmallest(int[] arr)
	{
		System.out.println("Original array: "+ Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("Sorted array: "+ Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < arr[i+1])
			{
				return arr[i+1];
			}
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {10, 3, 7, 5, 2, 8};
		int result = secondSmallest(arr);
		
		if(result > 0)
		{
			System.out.println("Second smallest element: "+ result);
		}
		else
		{
			System.err.println("Second smallest element not found");
		}
	}

}

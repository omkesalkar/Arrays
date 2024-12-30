package Arrays_Logical_Questions.Day_07_ArrayInterviewQuestion;

/* Implement a java program to find the 2nd largest
   element in an array and print it. */

import java.util.Arrays;
public class FindSecondLargestElementInArray
{
	public static int secondLargest(int[] arr)
	{
		System.out.println("Original array: "+ Arrays.toString(arr));
		
		Arrays.sort(arr);
		for(int i=arr.length-2; i>=0; i--)
		{
			if(arr[i] < arr[arr.length-1])
			{
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		int[] arr = {12, 10, 7, 1};
		int result = secondLargest(arr);
		
		if(result > 0)
		{
			System.out.println("Second largest element: "+ result);
		}
		else
		{
			System.err.println("Second largest element not found.");
		}
	}
}

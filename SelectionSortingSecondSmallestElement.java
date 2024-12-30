package Arrays_Logical_Questions.Day_07_Sorting;

import java.util.Arrays;

/*Find the Second Smallest Element
  Using Selection Sort, find the second smallest element 
  in an array {12, 4, 7, 1, 9}.
  Output: 4
*/

public class SelectionSortingSecondSmallestElement
{
	public static int secondSmallest(int[] arr)
	{
		System.out.println("Original array : "+Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > arr[i+1])
			{
				return arr[i+1];
			}
		}
		return -1;		
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,5,4,6};
		int index = secondSmallest(arr);
		
		if(index > 0)
		{
			System.out.println("Second smallest element: "+ index);
		}
		else
		{
			System.err.println("Element Not found");
		}
	}
}

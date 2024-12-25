package Arrays_Logical_Questions.Day_03_ArrayBInarySearch;

/* Implement a Java program to find the index number of an element 
   in an int array by using binary searching and display the results. */

import java.util.Arrays;

public class FindIndexNumber 
{
	public static int findIndexNumber(int[] arr, int ele)
	{
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end)
		{
			int mid = (start + end) / 2;			
			
			//check if the ele is at mid
			if(ele == arr[mid])
			{
				return mid;
			}
			
			 // If ele is smaller than mid, search the left half
			if(ele < arr[mid])
			{
				end = mid + 1;
			}
			else if(ele > arr[mid])
			{
				start = mid - 1;
			}
			else return mid;
		}
		return -1;
		
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int target = 8;
		
		int index = findIndexNumber(arr, target);
		if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

	}

}

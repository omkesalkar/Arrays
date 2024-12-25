package Arrays_Logical_Questions.Day_03_ArrayBInarySearch;

/* Write java method named binarySearch() that recieves an int num and an array,
   it searches the given elements is present or not by using binary search algorithm 
   in the given array and if the element is present then it returns the index
   number or if the element not found then it returns -1. */

import java.util.Arrays;

public class FindIndexNumberBinarySearch 
{
	public static int binarySearch(int[] arr, int ele)
	{
		Arrays.sort(arr);
		System.out.print("Array elements are: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int start = 0;
		int end = arr.length-1;
		
		while (start <= end) 
		{
			int mid = (start + end) / 2;
			if (ele == arr[mid]) 
			{
				return mid;
			}
			
			if (ele > arr[mid]) 
			{
				start = mid - 1;
			} 
			else if(ele < arr[mid])
			{
				end = mid + 1;
			}
			else return mid;
		}
		return -1;	
		
	}

	public static void main(String[] args) 
	{
		 int[] arr = {1,2,3,2,4,3,5,4,6,5};
		 int ele = 2;
		 
		 int index =  binarySearch(arr, ele);
		 if(index != -1)
		 {
			 System.out.println(ele +" present at index "+ index);
		 }
		 else
		 {
			 System.out.println(ele +" are not found in an array.");
		 }
	}

}

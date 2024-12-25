package Arrays_Logical_Questions.Day_03_ArrayBInarySearch;

import java.util.Arrays;

public class BinarySearchArray 
{

	public static int binarySearch(int[] arr, int ele)
	{
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end)
		{
			int mid = (start + end) / 2;
			
			if(ele < arr[mid])
			{
				end = mid - 1;
			} 
			else if(ele > arr[mid])
			{
				start = mid+1;
			}
			else 
			{
				return mid;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7};
		int ele = 4;
		
		int index = binarySearch(arr, ele);
		
		if(index != -1)
		{
			System.out.println("Element "+ ele +" found at index : "+ index);
		}
		else
		{
			System.err.println("Element not fount in an array.");
		}

	}

}

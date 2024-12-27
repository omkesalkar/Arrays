package Arrays_Logical_Questions.Day_05_MergingArray;

import java.util.Arrays;

/* Merge Two Sorted Arrays.
   Write a program to merge two sorted arrays {1, 3, 5}  and {2, 4, 6} into a single sorted array.
   Example: Resulting array should be {1, 2, 3, 4, 5, 6}.*/

public class MergeTwoArrays 
{
	public static void mergeArray(int[] arr1, int[] arr2)
	{
		int[] arr = new int[arr1.length + arr2.length];
		int index = 0;
		
		for(int x : arr1)
		{
			arr[index] = x;
			index++;
		}
		for(int y : arr2)
		{
			arr[index] = y;
			index++;
		}
		Arrays.sort(arr);
		
		System.out.print("After merging array: ");
		for(int z : arr)
		{
			System.out.print(z +" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr1 = {1, 3, 5};
		int[] arr2 = {2, 4, 6};
		mergeArray(arr1, arr2);
	}

}

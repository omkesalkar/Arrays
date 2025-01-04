package Arrays_Logical_Questions.Day_08_Insertion_Deletion;

import java.util.Arrays;

public class DeleteFirstElement
{
	public static void deleteFirstElement(int[] arr)
	{
		int[] newArray = new int[arr.length - 1];
		
		for(int i=1; i<arr.length; i++)
		{
			newArray[i-1] = arr[i];
		}
		
		System.out.println("Old array: "+ Arrays.toString(arr));
		System.out.println("After deleted first element of an array: "+ Arrays.toString(newArray));
	}

	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3, 4, 5};
		deleteFirstElement(arr);
	}
}

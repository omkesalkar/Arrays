package Arrays_Logical_Questions.Day_08_Insertion_Deletion;

import java.util.Arrays;

/*Insert an Element at the End
  Write a program to insert an element 6 at the end of the array
  {1, 2, 3, 4, 5}.
  Output: {1, 2, 3, 4, 5, 6}
*/

public class InsertElementAtEnd 
{
	public static void insertAtEnd(int[] arr, int ele)
	{
		int[] newArray = new int[arr.length + 1];
		
		for(int i=0; i<arr.length; i++)
		{
			newArray[i] = arr[i];
		}
		
		newArray[newArray.length - 1] = ele;
		
		System.out.println("Old array: "+ Arrays.toString(arr));
		System.out.println("New array: "+ Arrays.toString(newArray));
	}

	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3, 4, 5};
		int ele = 6;
		insertAtEnd(arr, ele);
	}
}

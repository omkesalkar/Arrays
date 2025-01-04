package Arrays_Logical_Questions.Day_08_Insertion_Deletion;

import java.util.Arrays;

/*Insert an Element at the Beginning
  Write a program to insert an element 7 at the beginning of
  the array {1, 2, 3, 4, 5}.
  Output: {7, 1, 2, 3, 4, 5} */

public class InsertElementAtBeginning
{
	public static void insertAtBegining(int[] arr, int ele)
	{
		int[] newArray = new int[arr.length + 1];
		
		for(int i=0; i<arr.length; i++)
		{
			newArray[i+1] = arr[i];
		}
		newArray[0] = ele;		
		
		System.out.println("Old Array: "+ Arrays.toString(arr));
		System.out.println("New Array: "+ Arrays.toString(newArray));
	}

	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3, 4, 5};
		int ele = 7;
		
		insertAtBegining(arr, ele);
	}
}

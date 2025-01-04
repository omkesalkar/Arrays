package Arrays_Logical_Questions.Day_08_Insertion_Deletion;

/*Delete All Occurrences of an Element
 Write a program to delete all occurrences of the element 
 2 from the array 
 {1, 2, 3, 2, 4, 2, 5}.
 Output: {1, 3, 4, 5}
*/

import java.util.Arrays;

public class DeleteAllOccurencesElement 
{
	public static void deleteAllSameElements(int[] arr, int ele)
	{
		int count = 0;  //count give how many same element presents in array
		for(int x : arr)
		{
			if(x == ele)
				count++;
		}
		
		int[] newArray = new int[arr.length - count];  //new array 
		
		for(int i=0, j=0; i<arr.length; i++)
		{
			if(arr[i] != ele)
			{
				newArray[j++] = arr[i];
			}
		}
		
		System.out.println("Old array: "+ Arrays.toString(arr));
		System.out.println("After deleting occurence element '"+ ele +"' from array: "+ Arrays.toString(newArray));
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3, 2, 4, 2, 5};
		int ele = 2;
		
		deleteAllSameElements(arr, ele);	
	}
}

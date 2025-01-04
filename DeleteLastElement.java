package Arrays_Logical_Questions.Day_08_Insertion_Deletion;

/* Delete the Last Element
   Write a program to delete the last element of the 
   array {1, 2, 3, 4, 5}.
   Output: {1, 2, 3, 4}
*/
import java.util.Arrays;

public class DeleteLastElement 
{
	public static void deleteLastElement(int[] arr)
	{
		int[] newArray = new int[arr.length-1];
		
		for(int i=0; i<newArray.length; i++)
		{
			newArray[i] = arr[i];
		}
		
		System.out.println("Old array: "+ Arrays.toString(arr));
		System.out.println("After deleted last element of an array: "+ Arrays.toString(newArray));
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};
		deleteLastElement(arr);
	}
}

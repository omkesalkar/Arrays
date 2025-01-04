package Arrays_Logical_Questions.Day_08_Insertion_Deletion;

/*Delete an Element at a Specific Index
  Write a program to delete the element at the 2nd index of the 
  array {1, 2, 3, 4, 5}.
  Output: {1, 2, 4, 5}
*/
import java.util.Arrays;

public class DeleteElementAtSpecificIndex
{
	public static void deleteSpecificIndexElement(int[] arr, int index)
	{
		int[] newArray = new int[arr.length - 1];
		
		for(int i=0, j=0; i<arr.length; i++)
		{
			if(i != index)
			{
				newArray[j++] = arr[i];
			}
		}
		
		System.out.println("Old array: "+ Arrays.toString(arr));
		System.out.println("After deleting index no."+ index +" array is: "+ Arrays.toString(newArray));
		
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		int index = 2;
		
		deleteSpecificIndexElement(arr, index);
	}

}

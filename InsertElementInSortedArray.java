package Arrays_Logical_Questions.Day_08_Insertion_Deletion;

/*Insert in Sorted Array
 Write a program to insert an element 3 into a sorted 
 array {1, 2, 4, 5, 6} while maintaining the sorted order.
 Output: {1, 2, 3, 4, 5, 6}
*/
import java.util.Arrays;

public class InsertElementInSortedArray
{
	public static void insertElement(int[] arr, int ele)
	{
		 int[] newArray = new int[arr.length + 1];
	        
	     // Insert the element while maintaining sorted order
	        int i = 0, j = 0;
	        while (i < arr.length) 
	        {
	            if (arr[i] < ele)
	            {
	                newArray[j++] = arr[i++];
	            } 
	            else 
	            {
	                break;
	            }
	        }
	        
	        // Insert the new element
	        newArray[j++] = ele;
	        
	        // Copy the remaining elements
	        while (i < arr.length)
	        {
	            newArray[j++] = arr[i++];
	        }
		
		
		System.out.println("Old Array: "+ Arrays.toString(arr));
		System.out.println("New Array: "+ Arrays.toString(newArray));
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 4, 5, 6};
		int element = 3;
		
		insertElement(arr, element);
	}
}

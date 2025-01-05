package Arrays_Logical_Questions.Day_09_Splitting_ResizingArray;

/*Resize Array by Decreasing the Size
 Write a program to resize an array {1, 2, 3, 4, 5} to a 
 smaller size and remove the last element.
 Output:
 Resized array: {1, 2, 3, 4}
*/

import java.util.Arrays;
public class ResizeArrayByDecreasingSize
{
	public static void resizeArray(int[] arr)
	{
		int[] newArray = new int[arr.length - 1];
		
		for(int i=0 ; i<newArray.length; i++)
		{
			newArray[i] = arr[i];
		}
				
		System.out.println("Old array: "+ Arrays.toString(arr));
		System.out.println("Array after delete last element/ Resized array: "+ Arrays.toString(newArray));
	}

	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3, 4, 5};
		resizeArray(arr);
	}

}

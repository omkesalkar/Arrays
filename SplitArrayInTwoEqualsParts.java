package Arrays_Logical_Questions.Day_09_Splitting_ResizingArray;

/*Split and Resize Array
 Write a program that first splits the array {1, 2, 3, 4, 5, 6, 7, 8} 
 into two equal parts and then resizes each part to size 5. 
 The extra space should be filled with 0s. 
 Output: First part: {1, 2, 3, 4, 5}
         Second part: {6, 7, 8, 0, 0}
*/

import java.util.Arrays;

public class SplitArrayInTwoEqualsParts 
{
	public static void splitInTwoParts(int[] arr)
	{
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		
		int mid = arr.length / 2;
		
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i] = arr[i];
		}
		
		for(int i=mid+1, j=0; i<arr.length; i++)
		{
			arr2[j] = arr[i];
			j++;
		}
		
		System.out.println("Original array: "+ Arrays.toString(arr));
		System.out.println("First array: "+ Arrays.toString(arr1));
		System.out.println("Second array: "+ Arrays.toString(arr2));
	}

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8} ;
		splitInTwoParts(arr);
	}

}

package Arrays_Logical_Questions.Day_09_Splitting_ResizingArray;

import java.util.Arrays;

/*Split Array into N Equal Parts
 Write a program to split an array {1, 2, 3, 4, 5, 6, 7, 8, 9} into 3 equal parts.
 Output:
 Part 1: {1, 2, 3}
 Part 2: {4, 5, 6}
 Part 3: {7, 8, 9}
*/

public class SplitArrayIntoNEqualParts 
{
	public static void splitInNParts(int[] arr, int n)
	{
		int[] arr1 = new int[arr.length / n];
		int[] arr2 = new int[arr.length / n];
		int[] arr3 = new int[arr.length / n];
		
		int count = 0;
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i] = arr[i];
			count++;
		}
		
		for(int i=0; i<arr2.length; i++)
		{
			arr2[i] = arr[count];
			count++;
		}
		
		for(int i=0; i<arr3.length; i++)
		{
			arr3[i] = arr[count];
			count++;
		}
		
		System.out.println("Original array : "+ Arrays.toString(arr));
		System.out.println("Part 1: "+ Arrays.toString(arr1));   //[1,2,3]
		System.out.println("Part 2: "+ Arrays.toString(arr2));   //[4,5,6]
		System.out.println("Part 3: "+ Arrays.toString(arr3));   //[7,8,9]
	}

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int n = 3;
		splitInNParts(arr, n);
	}

}

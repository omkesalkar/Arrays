package Arrays_Logical_Questions.Day_05_ReplacingSwappingArray;

/* Swap Maximum and Minimum Elements
 Write a program to swap the maximum and minimum elements in an array {3, 1, 4, 5, 2}.
 Example: Resulting array should be {3, 5, 4, 1, 2}. */

public class SwapMaxAndMinElement
{
	public static void swapMaxAndMin(int[] arr)
	{
		int maxIndex = 0;
		int minIndex = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > arr[maxIndex])
			{
				maxIndex = i;
			}
			if(arr[i] < arr[minIndex])
			{
				minIndex = i;
			}
		}
		
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = temp;
		
		System.out.print("After swapping: ");
		for(int x: arr)
		{
			System.out.print(x +" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr =  {3, 1, 4, 5, 2};
		swapMaxAndMin(arr);
	}
}

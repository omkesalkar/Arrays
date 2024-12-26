package Arrays_Logical_Questions.Day_05_ReplacingSwappingArray;

/* Swap Elements in Pairs
   Write a program to swap elements of the array {1, 2, 3, 4, 5} in pairs. 
   If the array has an odd length, leave the last element as is.
   Example: Resulting array should be {2, 1, 4, 3, 5}.
*/

public class SwapElementsInPairs 
{
	public static void swapElements(int[] arr)
	{
		for(int i=0; i<arr.length-1; i+=2)
		{
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;	
		}
		
		System.out.print("Sorted array: ");
		for(int x : arr)
		{
			System.out.print(x+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6};
		swapElements(arr);
	}
}

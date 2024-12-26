package Arrays_Logical_Questions.Day_05_ReplacingSwappingArray;

/*Write a program to swap the 1st and last elements of the 
 array {1, 2, 3, 4, 5}.
 Example: Resulting array should be {5, 2, 3, 4, 1}. */

public class SwapFirstAndLast 
{
	public static int[] swapFirstAndLast(int[] arr)
	{
		int last = arr.length - 1;
		
		int temp = arr[0];
		arr[0] = arr[last];
		arr[last] = temp;
		return arr;
	}
	
	public static void printArray(int[] arr)
	{
		System.out.print("After swapping: ");
		for(int x : arr)
		{
			System.out.print(x +" ");
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};
		int[] result = swapFirstAndLast(arr);
		printArray(result);
	}
}

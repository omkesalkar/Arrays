package Arrays_Logical_Questions.Day_07_Sorting;

/*  Bubble Sort in Descending Order
    Write a program to sort an array {1, 4, 2, 8, 5} 
    in descending order using Bubble Sort.
    Output: {8, 5, 4, 2, 1}
 */

public class BubbleSortInDescendingOrder 
{
	public static void descendingBubbleSort(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(arr[j] < arr[j+1])
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.print("Array after sorting in descending order: ");
		for(int x : arr)
		{
			System.out.print(x + " ");
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1, 4, 2, 8, 5} ;
		descendingBubbleSort(arr);
	}
}

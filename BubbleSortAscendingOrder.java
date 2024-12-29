package Arrays_Logical_Questions.Day_07_Sorting;

/* Bubble Sort Questions
   a. Basic Bubble Sort
   Write a program to sort an array {5, 3, 8, 6, 2} in ascending order using Bubble Sort.
   Output: {2, 3, 5, 6, 8}
*/

public class BubbleSortAscendingOrder 
{
	public static void ascendingBubbleSort(int[] arr)
	{
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.print("Array after sorting in ascending order: ");
		for(int x : arr)
		{
			System.out.print(x +" ");
		}
	}

	public static void main(String[] args) 
	{
		int[] arr = {5, 3, 8, 6, 2};
		ascendingBubbleSort(arr);
	}

}

package Arrays_Logical_Questions.Day_07_Sorting;

/* Insertion Sort Questions
   a. Basic Insertion Sort
   Write a program to sort an array {6, 3, 9, 5, 2} 
   in ascending order using Insertion Sort.
   Output: {2, 3, 5, 6, 9}
*/
public class InsertionSortAscendingOrder 
{
	public static void ascendingInsertionSort(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			int key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j = j - 1;
			}
			arr[j+1] = key;
		}
		
		System.out.print("Insertion sorted array in ascending order: ");
		for(int x : arr)
		{
			System.out.print(x +" ");
		}
	}

	public static void main(String[] args)
	{
		int[] arr = {6, 3, 9, 5, 2};
		ascendingInsertionSort(arr);
	}

}

package Arrays_Logical_Questions.Day_07_Sorting;

/* Sort Only Part of the Array
   Sort only the first 4 elements of the array
   {10, 3, 7, 5, 2, 8} using Insertion Sort.
   Output: {3, 5, 7, 10, 2, 8}
*/
public class InsertionSortFirstFourElement
{
	public static void firstFourElement(int[] arr)
	{
		for(int i=1; i<arr.length-2; i++)
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
		
		System.out.print("After first 4 element sorted: ");
		for(int x : arr)
		{
			System.out.print(x +" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {10, 3, 7, 5, 2, 8};
		firstFourElement(arr);
	}
}
